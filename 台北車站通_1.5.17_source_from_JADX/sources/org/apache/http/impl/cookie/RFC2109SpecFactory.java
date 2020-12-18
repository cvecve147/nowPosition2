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
public class RFC2109SpecFactory implements CookieSpecFactory, CookieSpecProvider {
    private final CookieSpec cookieSpec;

    public RFC2109SpecFactory() {
        this((String[]) null, false);
    }

    public RFC2109SpecFactory(String[] strArr, boolean z) {
        this.cookieSpec = new RFC2109Spec(strArr, z);
    }

    public CookieSpec create(HttpContext httpContext) {
        return this.cookieSpec;
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams == null) {
            return new RFC2109Spec();
        }
        String[] strArr = null;
        Collection collection = (Collection) httpParams.getParameter(CookieSpecPNames.DATE_PATTERNS);
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new RFC2109Spec(strArr, httpParams.getBooleanParameter(CookieSpecPNames.SINGLE_COOKIE_HEADER, false));
    }
}
