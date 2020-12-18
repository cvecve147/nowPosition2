package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Immutable
public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    public String getAttributeName() {
        return ClientCookie.MAX_AGE_ATTR;
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C6999SM.COOKIE);
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    setCookie.setExpiryDate(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
                    return;
                }
                throw new MalformedCookieException("Negative 'max-age' attribute: " + str);
            } catch (NumberFormatException unused) {
                throw new MalformedCookieException("Invalid 'max-age' attribute: " + str);
            }
        } else {
            throw new MalformedCookieException("Missing value for 'max-age' attribute");
        }
    }
}
