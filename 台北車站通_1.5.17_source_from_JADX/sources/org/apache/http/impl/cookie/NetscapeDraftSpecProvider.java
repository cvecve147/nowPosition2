package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.annotation.Obsolete;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Immutable
@Obsolete
public class NetscapeDraftSpecProvider implements CookieSpecProvider {
    private volatile CookieSpec cookieSpec;
    private final String[] datepatterns;

    public NetscapeDraftSpecProvider() {
        this((String[]) null);
    }

    public NetscapeDraftSpecProvider(String[] strArr) {
        this.datepatterns = strArr;
    }

    public CookieSpec create(HttpContext httpContext) {
        if (this.cookieSpec == null) {
            synchronized (this) {
                if (this.cookieSpec == null) {
                    this.cookieSpec = new NetscapeDraftSpec(this.datepatterns);
                }
            }
        }
        return this.cookieSpec;
    }
}
