package org.apache.http.impl.cookie;

import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Immutable
public class NetscapeDomainHandler extends BasicDomainHandler {
    private static boolean isSpecialDomain(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
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
        return host.endsWith(domain);
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C6999SM.COOKIE);
        if (!TextUtils.isBlank(str)) {
            setCookie.setDomain(str);
            return;
        }
        throw new MalformedCookieException("Blank or null value for domain attribute");
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (!host.equals(domain) && !BasicDomainHandler.domainMatch(domain, host)) {
            throw new CookieRestrictionViolationException("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
        } else if (host.contains(".")) {
            int countTokens = new StringTokenizer(domain, ".").countTokens();
            if (isSpecialDomain(domain)) {
                if (countTokens < 2) {
                    throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates the Netscape cookie specification for " + "special domains");
                }
            } else if (countTokens < 3) {
                throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates the Netscape cookie specification");
            }
        }
    }
}
