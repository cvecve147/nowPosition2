package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Immutable
public class BasicPathHandler implements CommonCookieAttributeHandler {
    static boolean pathMatch(String str, String str2) {
        if (str2 == null) {
            str2 = "/";
        }
        if (str2.length() > 1 && str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        return str.startsWith(str2) && (str2.equals("/") || str.length() == str2.length() || str.charAt(str2.length()) == '/');
    }

    public String getAttributeName() {
        return ClientCookie.PATH_ATTR;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C6999SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        return pathMatch(cookieOrigin.getPath(), cookie.getPath());
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C6999SM.COOKIE);
        if (TextUtils.isBlank(str)) {
            str = "/";
        }
        setCookie.setPath(str);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        if (!match(cookie, cookieOrigin)) {
            throw new CookieRestrictionViolationException("Illegal 'path' attribute \"" + cookie.getPath() + "\". Path of origin: \"" + cookieOrigin.getPath() + "\"");
        }
    }
}
