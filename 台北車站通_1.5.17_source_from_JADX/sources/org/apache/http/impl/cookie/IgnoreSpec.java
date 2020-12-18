package org.apache.http.impl.cookie;

import java.util.Collections;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;

@ThreadSafe
public class IgnoreSpec extends CookieSpecBase {
    public List<Header> formatCookies(List<Cookie> list) {
        return Collections.emptyList();
    }

    public int getVersion() {
        return 0;
    }

    public Header getVersionHeader() {
        return null;
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        return Collections.emptyList();
    }
}
