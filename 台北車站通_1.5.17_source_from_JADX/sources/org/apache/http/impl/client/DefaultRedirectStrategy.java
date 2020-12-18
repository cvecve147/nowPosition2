package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.TextUtils;

@Immutable
public class DefaultRedirectStrategy implements RedirectStrategy {
    public static final DefaultRedirectStrategy INSTANCE = new DefaultRedirectStrategy();
    @Deprecated
    public static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    private static final String[] REDIRECT_METHODS = {HttpGet.METHOD_NAME, HttpHead.METHOD_NAME};
    private final Log log = LogFactory.getLog((Class) getClass());

    /* access modifiers changed from: protected */
    public URI createLocationURI(String str) {
        try {
            URIBuilder uRIBuilder = new URIBuilder(new URI(str).normalize());
            String host = uRIBuilder.getHost();
            if (host != null) {
                uRIBuilder.setHost(host.toLowerCase(Locale.ROOT));
            }
            if (TextUtils.isEmpty(uRIBuilder.getPath())) {
                uRIBuilder.setPath("/");
            }
            return uRIBuilder.build();
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid redirect URI: " + str, e);
        }
    }

    public URI getLocationURI(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                log2.debug("Redirect requested to location '" + value + "'");
            }
            RequestConfig requestConfig = adapt.getRequestConfig();
            URI createLocationURI = createLocationURI(value);
            try {
                if (!createLocationURI.isAbsolute()) {
                    if (requestConfig.isRelativeRedirectsAllowed()) {
                        HttpHost targetHost = adapt.getTargetHost();
                        Asserts.notNull(targetHost, "Target host");
                        createLocationURI = URIUtils.resolve(URIUtils.rewriteURI(new URI(httpRequest.getRequestLine().getUri()), targetHost, false), createLocationURI);
                    } else {
                        throw new ProtocolException("Relative redirect location '" + createLocationURI + "' not allowed");
                    }
                }
                RedirectLocations redirectLocations = (RedirectLocations) adapt.getAttribute("http.protocol.redirect-locations");
                if (redirectLocations == null) {
                    redirectLocations = new RedirectLocations();
                    httpContext.setAttribute("http.protocol.redirect-locations", redirectLocations);
                }
                if (requestConfig.isCircularRedirectsAllowed() || !redirectLocations.contains(createLocationURI)) {
                    redirectLocations.add(createLocationURI);
                    return createLocationURI;
                }
                throw new CircularRedirectException("Circular redirect to '" + createLocationURI + "'");
            } catch (URISyntaxException e) {
                throw new ProtocolException(e.getMessage(), e);
            }
        } else {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
    }

    public HttpUriRequest getRedirect(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        URI locationURI = getLocationURI(httpRequest, httpResponse, httpContext);
        String method = httpRequest.getRequestLine().getMethod();
        return method.equalsIgnoreCase(HttpHead.METHOD_NAME) ? new HttpHead(locationURI) : method.equalsIgnoreCase(HttpGet.METHOD_NAME) ? new HttpGet(locationURI) : httpResponse.getStatusLine().getStatusCode() == 307 ? RequestBuilder.copy(httpRequest).setUri(locationURI).build() : new HttpGet(locationURI);
    }

    /* access modifiers changed from: protected */
    public boolean isRedirectable(String str) {
        for (String equalsIgnoreCase : REDIRECT_METHODS) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isRedirected(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String method = httpRequest.getRequestLine().getMethod();
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (statusCode != 307) {
            switch (statusCode) {
                case HttpStatus.SC_MOVED_PERMANENTLY:
                    break;
                case HttpStatus.SC_MOVED_TEMPORARILY:
                    return isRedirectable(method) && firstHeader != null;
                case HttpStatus.SC_SEE_OTHER:
                    return true;
                default:
                    return false;
            }
        }
        return isRedirectable(method);
    }
}
