package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Immutable
public class BasicExpiresHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    private final String[] datepatterns;

    public BasicExpiresHandler(String[] strArr) {
        Args.notNull(strArr, "Array of date patterns");
        this.datepatterns = strArr;
    }

    public String getAttributeName() {
        return ClientCookie.EXPIRES_ATTR;
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C6999SM.COOKIE);
        if (str != null) {
            Date parseDate = DateUtils.parseDate(str, this.datepatterns);
            if (parseDate != null) {
                setCookie.setExpiryDate(parseDate);
                return;
            }
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        throw new MalformedCookieException("Missing value for 'expires' attribute");
    }
}
