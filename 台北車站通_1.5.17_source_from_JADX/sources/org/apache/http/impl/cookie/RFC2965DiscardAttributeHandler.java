package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;

@Immutable
public class RFC2965DiscardAttributeHandler implements CommonCookieAttributeHandler {
    public String getAttributeName() {
        return ClientCookie.DISCARD_ATTR;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void parse(SetCookie setCookie, String str) {
        if (setCookie instanceof SetCookie2) {
            ((SetCookie2) setCookie).setDiscard(true);
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
    }
}
