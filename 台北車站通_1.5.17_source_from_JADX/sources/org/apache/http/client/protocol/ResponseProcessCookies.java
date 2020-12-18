package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Immutable
public class ResponseProcessCookies implements HttpResponseInterceptor {
    private final Log log = LogFactory.getLog(ResponseProcessCookies.class);

    private static String formatCooke(Cookie cookie) {
        StringBuilder sb = new StringBuilder();
        sb.append(cookie.getName());
        sb.append("=\"");
        String value = cookie.getValue();
        if (value != null) {
            if (value.length() > 100) {
                value = value.substring(0, 100) + "...";
            }
            sb.append(value);
        }
        sb.append("\"");
        sb.append(", version:");
        sb.append(Integer.toString(cookie.getVersion()));
        sb.append(", domain:");
        sb.append(cookie.getDomain());
        sb.append(", path:");
        sb.append(cookie.getPath());
        sb.append(", expiry:");
        sb.append(cookie.getExpiryDate());
        return sb.toString();
    }

    private void processCookies(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        while (headerIterator.hasNext()) {
            Header nextHeader = headerIterator.nextHeader();
            try {
                for (Cookie next : cookieSpec.parse(nextHeader, cookieOrigin)) {
                    try {
                        cookieSpec.validate(next, cookieOrigin);
                        cookieStore.addCookie(next);
                        if (this.log.isDebugEnabled()) {
                            Log log2 = this.log;
                            log2.debug("Cookie accepted [" + formatCooke(next) + "]");
                        }
                    } catch (MalformedCookieException e) {
                        if (this.log.isWarnEnabled()) {
                            Log log3 = this.log;
                            log3.warn("Cookie rejected [" + formatCooke(next) + "] " + e.getMessage());
                        }
                    }
                }
            } catch (MalformedCookieException e2) {
                if (this.log.isWarnEnabled()) {
                    Log log4 = this.log;
                    log4.warn("Invalid cookie header: \"" + nextHeader + "\". " + e2.getMessage());
                }
            }
        }
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Log log2;
        String str;
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        CookieSpec cookieSpec = adapt.getCookieSpec();
        if (cookieSpec == null) {
            log2 = this.log;
            str = "Cookie spec not specified in HTTP context";
        } else {
            CookieStore cookieStore = adapt.getCookieStore();
            if (cookieStore == null) {
                log2 = this.log;
                str = "Cookie store not specified in HTTP context";
            } else {
                CookieOrigin cookieOrigin = adapt.getCookieOrigin();
                if (cookieOrigin == null) {
                    log2 = this.log;
                    str = "Cookie origin not specified in HTTP context";
                } else {
                    processCookies(httpResponse.headerIterator(C6999SM.SET_COOKIE), cookieSpec, cookieOrigin, cookieStore);
                    if (cookieSpec.getVersion() > 0) {
                        processCookies(httpResponse.headerIterator(C6999SM.SET_COOKIE2), cookieSpec, cookieOrigin, cookieStore);
                        return;
                    }
                    return;
                }
            }
        }
        log2.debug(str);
    }
}
