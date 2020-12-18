package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Immutable
@Deprecated
public class ResponseAuthCache implements HttpResponseInterceptor {
    private final Log log = LogFactory.getLog(ResponseAuthCache.class);

    /* renamed from: org.apache.http.client.protocol.ResponseAuthCache$1 */
    static /* synthetic */ class C69931 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$http$auth$AuthProtocolState = new int[AuthProtocolState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.apache.http.auth.AuthProtocolState[] r0 = org.apache.http.auth.AuthProtocolState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$apache$http$auth$AuthProtocolState = r0
                int[] r0 = $SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.CHALLENGED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch:{ NoSuchFieldError -> 0x001f }
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.FAILURE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.client.protocol.ResponseAuthCache.C69931.<clinit>():void");
        }
    }

    private void cache(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            log2.debug("Caching '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.put(httpHost, authScheme);
    }

    private boolean isCachable(AuthState authState) {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null || !authScheme.isComplete()) {
            return false;
        }
        String schemeName = authScheme.getSchemeName();
        return schemeName.equalsIgnoreCase("Basic") || schemeName.equalsIgnoreCase("Digest");
    }

    private void uncache(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            log2.debug("Removing from cache '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.remove(httpHost);
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        AuthCache authCache = (AuthCache) httpContext.getAttribute("http.auth.auth-cache");
        HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        if (!(httpHost == null || authState == null)) {
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                log2.debug("Target auth state: " + authState.getState());
            }
            if (isCachable(authState)) {
                SchemeRegistry schemeRegistry = (SchemeRegistry) httpContext.getAttribute(ClientContext.SCHEME_REGISTRY);
                if (httpHost.getPort() < 0) {
                    httpHost = new HttpHost(httpHost.getHostName(), schemeRegistry.getScheme(httpHost).resolvePort(httpHost.getPort()), httpHost.getSchemeName());
                }
                if (authCache == null) {
                    authCache = new BasicAuthCache();
                    httpContext.setAttribute("http.auth.auth-cache", authCache);
                }
                int i = C69931.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()];
                if (i == 1) {
                    cache(authCache, httpHost, authState.getAuthScheme());
                } else if (i == 2) {
                    uncache(authCache, httpHost, authState.getAuthScheme());
                }
            }
        }
        HttpHost httpHost2 = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_PROXY_HOST);
        AuthState authState2 = (AuthState) httpContext.getAttribute("http.auth.proxy-scope");
        if (httpHost2 != null && authState2 != null) {
            if (this.log.isDebugEnabled()) {
                Log log3 = this.log;
                log3.debug("Proxy auth state: " + authState2.getState());
            }
            if (isCachable(authState2)) {
                if (authCache == null) {
                    authCache = new BasicAuthCache();
                    httpContext.setAttribute("http.auth.auth-cache", authCache);
                }
                int i2 = C69931.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState2.getState().ordinal()];
                if (i2 == 1) {
                    cache(authCache, httpHost2, authState2.getAuthScheme());
                } else if (i2 == 2) {
                    uncache(authCache, httpHost2, authState2.getAuthScheme());
                }
            }
        }
    }
}
