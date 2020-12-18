package org.apache.http.impl.cookie;

import java.util.Date;
import java.util.regex.Pattern;
import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Immutable
public class LaxMaxAgeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    private static final Pattern MAX_AGE_PATTERN = Pattern.compile("^\\-?[0-9]+$");

    public String getAttributeName() {
        return ClientCookie.MAX_AGE_ATTR;
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C6999SM.COOKIE);
        if (!TextUtils.isBlank(str) && MAX_AGE_PATTERN.matcher(str).matches()) {
            try {
                int parseInt = Integer.parseInt(str);
                setCookie.setExpiryDate(parseInt >= 0 ? new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)) : new Date(Long.MIN_VALUE));
            } catch (NumberFormatException unused) {
            }
        }
    }
}
