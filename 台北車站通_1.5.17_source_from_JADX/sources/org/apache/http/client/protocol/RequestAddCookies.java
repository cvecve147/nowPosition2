package org.apache.http.client.protocol;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Lookup;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Immutable
public class RequestAddCookies implements HttpRequestInterceptor {
    private final Log log = LogFactory.getLog(RequestAddCookies.class);

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        URI uri;
        Header versionHeader;
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            HttpClientContext adapt = HttpClientContext.adapt(httpContext);
            CookieStore cookieStore = adapt.getCookieStore();
            if (cookieStore == null) {
                this.log.debug("Cookie store not specified in HTTP context");
                return;
            }
            Lookup<CookieSpecProvider> cookieSpecRegistry = adapt.getCookieSpecRegistry();
            if (cookieSpecRegistry == null) {
                this.log.debug("CookieSpec registry not specified in HTTP context");
                return;
            }
            HttpHost targetHost = adapt.getTargetHost();
            if (targetHost == null) {
                this.log.debug("Target host not set in the context");
                return;
            }
            RouteInfo httpRoute = adapt.getHttpRoute();
            if (httpRoute == null) {
                this.log.debug("Connection route not set in the context");
                return;
            }
            String cookieSpec = adapt.getRequestConfig().getCookieSpec();
            if (cookieSpec == null) {
                cookieSpec = CookieSpecs.DEFAULT;
            }
            if (this.log.isDebugEnabled()) {
                this.log.debug("CookieSpec selected: " + cookieSpec);
            }
            String str = null;
            if (httpRequest instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) httpRequest).getURI();
            } else {
                try {
                    uri = new URI(httpRequest.getRequestLine().getUri());
                } catch (URISyntaxException unused) {
                    uri = null;
                }
            }
            if (uri != null) {
                str = uri.getPath();
            }
            String hostName = targetHost.getHostName();
            int port = targetHost.getPort();
            if (port < 0) {
                port = httpRoute.getTargetHost().getPort();
            }
            boolean z = false;
            if (port < 0) {
                port = 0;
            }
            if (TextUtils.isEmpty(str)) {
                str = "/";
            }
            CookieOrigin cookieOrigin = new CookieOrigin(hostName, port, str, httpRoute.isSecure());
            CookieSpecProvider lookup = cookieSpecRegistry.lookup(cookieSpec);
            if (lookup != null) {
                CookieSpec create = lookup.create(adapt);
                List<Cookie> cookies = cookieStore.getCookies();
                ArrayList arrayList = new ArrayList();
                Date date = new Date();
                for (Cookie next : cookies) {
                    if (next.isExpired(date)) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Cookie " + next + " expired");
                        }
                        z = true;
                    } else if (create.match(next, cookieOrigin)) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Cookie " + next + " match " + cookieOrigin);
                        }
                        arrayList.add(next);
                    }
                }
                if (z) {
                    cookieStore.clearExpired(date);
                }
                if (!arrayList.isEmpty()) {
                    for (Header addHeader : create.formatCookies(arrayList)) {
                        httpRequest.addHeader(addHeader);
                    }
                }
                if (create.getVersion() > 0 && (versionHeader = create.getVersionHeader()) != null) {
                    httpRequest.addHeader(versionHeader);
                }
                httpContext.setAttribute("http.cookie-spec", create);
                httpContext.setAttribute("http.cookie-origin", cookieOrigin);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("Unsupported cookie policy: " + cookieSpec);
            }
        }
    }
}
