package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Immutable
public class BrowserCompatVersionAttributeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    public String getAttributeName() {
        return ClientCookie.VERSION_ATTR;
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C6999SM.COOKIE);
        if (str != null) {
            int i = 0;
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
            setCookie.setVersion(i);
            return;
        }
        throw new MalformedCookieException("Missing value for version attribute");
    }
}
