package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthCache;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Immutable
abstract class AuthenticationStrategyImpl implements AuthenticationStrategy {
    private static final List<String> DEFAULT_SCHEME_PRIORITY = Collections.unmodifiableList(Arrays.asList(new String[]{"Negotiate", "Kerberos", "NTLM", "Digest", "Basic"}));
    private final int challengeCode;
    private final String headerName;
    private final Log log = LogFactory.getLog((Class) getClass());

    AuthenticationStrategyImpl(int i, String str) {
        this.challengeCode = i;
        this.headerName = str;
    }

    public void authFailed(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        Args.notNull(httpHost, "Host");
        Args.notNull(httpContext, "HTTP context");
        AuthCache authCache = HttpClientContext.adapt(httpContext).getAuthCache();
        if (authCache != null) {
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                log2.debug("Clearing cached auth scheme for " + httpHost);
            }
            authCache.remove(httpHost);
        }
    }

    public void authSucceeded(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        Args.notNull(httpHost, "Host");
        Args.notNull(authScheme, "Auth scheme");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        if (isCachable(authScheme)) {
            AuthCache authCache = adapt.getAuthCache();
            if (authCache == null) {
                authCache = new BasicAuthCache();
                adapt.setAuthCache(authCache);
            }
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                log2.debug("Caching '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
            }
            authCache.put(httpHost, authScheme);
        }
    }

    public Map<String, Header> getChallenges(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        CharArrayBuffer charArrayBuffer;
        int i;
        Args.notNull(httpResponse, "HTTP response");
        Header[] headers = httpResponse.getHeaders(this.headerName);
        HashMap hashMap = new HashMap(headers.length);
        for (Header header : headers) {
            if (header instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) header;
                charArrayBuffer = formattedHeader.getBuffer();
                i = formattedHeader.getValuePos();
            } else {
                String value = header.getValue();
                if (value != null) {
                    charArrayBuffer = new CharArrayBuffer(value.length());
                    charArrayBuffer.append(value);
                    i = 0;
                } else {
                    throw new MalformedChallengeException("Header value is null");
                }
            }
            while (i < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i2))) {
                i2++;
            }
            hashMap.put(charArrayBuffer.substring(i, i2).toLowerCase(Locale.ROOT), header);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<String> getPreferredAuthSchemes(RequestConfig requestConfig);

    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        return httpResponse.getStatusLine().getStatusCode() == this.challengeCode;
    }

    /* access modifiers changed from: protected */
    public boolean isCachable(AuthScheme authScheme) {
        if (authScheme == null || !authScheme.isComplete()) {
            return false;
        }
        String schemeName = authScheme.getSchemeName();
        return schemeName.equalsIgnoreCase("Basic") || schemeName.equalsIgnoreCase("Digest");
    }

    public Queue<AuthOption> select(Map<String, Header> map, HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        Log log2;
        String str;
        Args.notNull(map, "Map of auth challenges");
        Args.notNull(httpHost, "Host");
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        LinkedList linkedList = new LinkedList();
        Lookup<AuthSchemeProvider> authSchemeRegistry = adapt.getAuthSchemeRegistry();
        if (authSchemeRegistry == null) {
            log2 = this.log;
            str = "Auth scheme registry not set in the context";
        } else {
            CredentialsProvider credentialsProvider = adapt.getCredentialsProvider();
            if (credentialsProvider == null) {
                log2 = this.log;
                str = "Credentials provider not set in the context";
            } else {
                Collection<String> preferredAuthSchemes = getPreferredAuthSchemes(adapt.getRequestConfig());
                if (preferredAuthSchemes == null) {
                    preferredAuthSchemes = DEFAULT_SCHEME_PRIORITY;
                }
                if (this.log.isDebugEnabled()) {
                    Log log3 = this.log;
                    log3.debug("Authentication schemes in the order of preference: " + preferredAuthSchemes);
                }
                for (String str2 : preferredAuthSchemes) {
                    Header header = map.get(str2.toLowerCase(Locale.ROOT));
                    if (header != null) {
                        AuthSchemeProvider lookup = authSchemeRegistry.lookup(str2);
                        if (lookup != null) {
                            AuthScheme create = lookup.create(httpContext);
                            create.processChallenge(header);
                            Credentials credentials = credentialsProvider.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort(), create.getRealm(), create.getSchemeName()));
                            if (credentials != null) {
                                linkedList.add(new AuthOption(create, credentials));
                            }
                        } else if (this.log.isWarnEnabled()) {
                            Log log4 = this.log;
                            log4.warn("Authentication scheme " + str2 + " not supported");
                        }
                    } else if (this.log.isDebugEnabled()) {
                        Log log5 = this.log;
                        log5.debug("Challenge for " + str2 + " authentication scheme not available");
                    }
                }
                return linkedList;
            }
        }
        log2.debug(str);
        return linkedList;
    }
}
