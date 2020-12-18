package org.apache.http.impl.cookie;

import java.util.Locale;
import org.apache.http.annotation.Immutable;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Immutable
public class BasicDomainHandler implements CommonCookieAttributeHandler {
    static boolean domainMatch(String str, String str2) {
        if (!InetAddressUtils.isIPv4Address(str2) && !InetAddressUtils.isIPv6Address(str2)) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            if (str2.endsWith(str)) {
                int length = str2.length() - str.length();
                if (length == 0) {
                    return true;
                }
                return length > 1 && str2.charAt(length - 1) == '.';
            }
        }
    }

    public String getAttributeName() {
        return ClientCookie.DOMAIN_ATTR;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C6999SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            return false;
        }
        if (domain.startsWith(".")) {
            domain = domain.substring(1);
        }
        String lowerCase = domain.toLowerCase(Locale.ROOT);
        if (host.equals(lowerCase)) {
            return true;
        }
        if (!(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute(ClientCookie.DOMAIN_ATTR)) {
            return false;
        }
        return domainMatch(lowerCase, host);
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C6999SM.COOKIE);
        if (TextUtils.isBlank(str)) {
            throw new MalformedCookieException("Blank or null value for domain attribute");
        } else if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            setCookie.setDomain(str.toLowerCase(Locale.ROOT));
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C6999SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            throw new CookieRestrictionViolationException("Cookie 'domain' may not be null");
        } else if (!host.equals(domain) && !domainMatch(domain, host)) {
            throw new CookieRestrictionViolationException("Illegal 'domain' attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
        }
    }
}
