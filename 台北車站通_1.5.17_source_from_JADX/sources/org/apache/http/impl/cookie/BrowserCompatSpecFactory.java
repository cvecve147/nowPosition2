package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Immutable
@Deprecated
public class BrowserCompatSpecFactory implements CookieSpecFactory, CookieSpecProvider {
    private final CookieSpec cookieSpec;
    private final SecurityLevel securityLevel;

    public enum SecurityLevel {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    public BrowserCompatSpecFactory() {
        this((String[]) null, SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public BrowserCompatSpecFactory(String[] strArr) {
        this((String[]) null, SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public BrowserCompatSpecFactory(String[] strArr, SecurityLevel securityLevel2) {
        this.securityLevel = securityLevel2;
        this.cookieSpec = new BrowserCompatSpec(strArr, securityLevel2);
    }

    public CookieSpec create(HttpContext httpContext) {
        return this.cookieSpec;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.cookie.CookieSpec newInstance(org.apache.http.params.HttpParams r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0022
            java.lang.String r1 = "http.protocol.cookie-datepatterns"
            java.lang.Object r3 = r3.getParameter(r1)
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x001a
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            r0 = r3
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x001a:
            org.apache.http.impl.cookie.BrowserCompatSpec r3 = new org.apache.http.impl.cookie.BrowserCompatSpec
            org.apache.http.impl.cookie.BrowserCompatSpecFactory$SecurityLevel r1 = r2.securityLevel
            r3.<init>(r0, r1)
            return r3
        L_0x0022:
            org.apache.http.impl.cookie.BrowserCompatSpec r3 = new org.apache.http.impl.cookie.BrowserCompatSpec
            org.apache.http.impl.cookie.BrowserCompatSpecFactory$SecurityLevel r1 = r2.securityLevel
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.BrowserCompatSpecFactory.newInstance(org.apache.http.params.HttpParams):org.apache.http.cookie.CookieSpec");
    }
}
