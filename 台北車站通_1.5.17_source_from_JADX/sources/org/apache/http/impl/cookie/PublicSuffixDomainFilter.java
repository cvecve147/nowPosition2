package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.conn.util.PublicSuffixList;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Immutable
public class PublicSuffixDomainFilter implements CommonCookieAttributeHandler {
    private final CommonCookieAttributeHandler handler;
    private final PublicSuffixMatcher publicSuffixMatcher;

    public PublicSuffixDomainFilter(CommonCookieAttributeHandler commonCookieAttributeHandler, PublicSuffixList publicSuffixList) {
        Args.notNull(commonCookieAttributeHandler, "Cookie handler");
        Args.notNull(publicSuffixList, "Public suffix list");
        this.handler = commonCookieAttributeHandler;
        this.publicSuffixMatcher = new PublicSuffixMatcher(publicSuffixList.getRules(), publicSuffixList.getExceptions());
    }

    public PublicSuffixDomainFilter(CommonCookieAttributeHandler commonCookieAttributeHandler, PublicSuffixMatcher publicSuffixMatcher2) {
        Args.notNull(commonCookieAttributeHandler, "Cookie handler");
        this.handler = commonCookieAttributeHandler;
        Args.notNull(publicSuffixMatcher2, "Public suffix matcher");
        this.publicSuffixMatcher = publicSuffixMatcher2;
    }

    public static CommonCookieAttributeHandler decorate(CommonCookieAttributeHandler commonCookieAttributeHandler, PublicSuffixMatcher publicSuffixMatcher2) {
        Args.notNull(commonCookieAttributeHandler, "Cookie attribute handler");
        return publicSuffixMatcher2 != null ? new PublicSuffixDomainFilter(commonCookieAttributeHandler, publicSuffixMatcher2) : commonCookieAttributeHandler;
    }

    public String getAttributeName() {
        return this.handler.getAttributeName();
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        String domain = cookie.getDomain();
        if (domain.equalsIgnoreCase("localhost") || !this.publicSuffixMatcher.matches(domain)) {
            return this.handler.match(cookie, cookieOrigin);
        }
        return false;
    }

    public void parse(SetCookie setCookie, String str) {
        this.handler.parse(setCookie, str);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        this.handler.validate(cookie, cookieOrigin);
    }
}
