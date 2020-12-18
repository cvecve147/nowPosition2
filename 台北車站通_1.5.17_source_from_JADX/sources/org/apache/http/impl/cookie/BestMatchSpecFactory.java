package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.cookie.params.CookieSpecPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Immutable
@Deprecated
public class BestMatchSpecFactory implements CookieSpecFactory, CookieSpecProvider {
    private final CookieSpec cookieSpec;

    public BestMatchSpecFactory() {
        this((String[]) null, false);
    }

    public BestMatchSpecFactory(String[] strArr, boolean z) {
        this.cookieSpec = new BestMatchSpec(strArr, z);
    }

    public CookieSpec create(HttpContext httpContext) {
        return this.cookieSpec;
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams == null) {
            return new BestMatchSpec();
        }
        String[] strArr = null;
        Collection collection = (Collection) httpParams.getParameter(CookieSpecPNames.DATE_PATTERNS);
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new BestMatchSpec(strArr, httpParams.getBooleanParameter(CookieSpecPNames.SINGLE_COOKIE_HEADER, false));
    }
}
