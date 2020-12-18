package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.annotation.Obsolete;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePathComparator;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Obsolete
@ThreadSafe
public class RFC2109Spec extends CookieSpecBase {
    static final String[] DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private final boolean oneHeader;

    public RFC2109Spec() {
        this((String[]) null, false);
    }

    protected RFC2109Spec(boolean z, CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        super(commonCookieAttributeHandlerArr);
        this.oneHeader = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RFC2109Spec(java.lang.String[] r4, boolean r5) {
        /*
            r3 = this;
            r0 = 7
            org.apache.http.cookie.CommonCookieAttributeHandler[] r0 = new org.apache.http.cookie.CommonCookieAttributeHandler[r0]
            org.apache.http.impl.cookie.RFC2109VersionHandler r1 = new org.apache.http.impl.cookie.RFC2109VersionHandler
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicPathHandler r1 = new org.apache.http.impl.cookie.BasicPathHandler
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            org.apache.http.impl.cookie.RFC2109DomainHandler r1 = new org.apache.http.impl.cookie.RFC2109DomainHandler
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicMaxAgeHandler r1 = new org.apache.http.impl.cookie.BasicMaxAgeHandler
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicSecureHandler r1 = new org.apache.http.impl.cookie.BasicSecureHandler
            r1.<init>()
            r2 = 4
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicCommentHandler r1 = new org.apache.http.impl.cookie.BasicCommentHandler
            r1.<init>()
            r2 = 5
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicExpiresHandler r1 = new org.apache.http.impl.cookie.BasicExpiresHandler
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x0040
        L_0x003e:
            java.lang.String[] r4 = DATE_PATTERNS
        L_0x0040:
            r1.<init>(r4)
            r4 = 6
            r0[r4] = r1
            r3.<init>((org.apache.http.cookie.CommonCookieAttributeHandler[]) r0)
            r3.oneHeader = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.RFC2109Spec.<init>(java.lang.String[], boolean):void");
    }

    private List<Header> doFormatManyHeaders(List<Cookie> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Cookie next : list) {
            int version = next.getVersion();
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
            charArrayBuffer.append("Cookie: ");
            charArrayBuffer.append("$Version=");
            charArrayBuffer.append(Integer.toString(version));
            charArrayBuffer.append("; ");
            formatCookieAsVer(charArrayBuffer, next, version);
            arrayList.add(new BufferedHeader(charArrayBuffer));
        }
        return arrayList;
    }

    private List<Header> doFormatOneHeader(List<Cookie> list) {
        int i = Integer.MAX_VALUE;
        for (Cookie next : list) {
            if (next.getVersion() < i) {
                i = next.getVersion();
            }
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 40);
        charArrayBuffer.append(C6999SM.COOKIE);
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(i));
        for (Cookie formatCookieAsVer : list) {
            charArrayBuffer.append("; ");
            formatCookieAsVer(charArrayBuffer, formatCookieAsVer, i);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void formatCookieAsVer(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        formatParamAsVer(charArrayBuffer, cookie.getName(), cookie.getValue(), i);
        if (cookie.getPath() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.PATH_ATTR)) {
            charArrayBuffer.append("; ");
            formatParamAsVer(charArrayBuffer, "$Path", cookie.getPath(), i);
        }
        if (cookie.getDomain() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.DOMAIN_ATTR)) {
            charArrayBuffer.append("; ");
            formatParamAsVer(charArrayBuffer, "$Domain", cookie.getDomain(), i);
        }
    }

    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, CookiePathComparator.INSTANCE);
            list = arrayList;
        }
        return this.oneHeader ? doFormatOneHeader(list) : doFormatManyHeaders(list);
    }

    /* access modifiers changed from: protected */
    public void formatParamAsVer(CharArrayBuffer charArrayBuffer, String str, String str2, int i) {
        charArrayBuffer.append(str);
        charArrayBuffer.append("=");
        if (str2 == null) {
            return;
        }
        if (i > 0) {
            charArrayBuffer.append((char) TokenParser.DQUOTE);
            charArrayBuffer.append(str2);
            charArrayBuffer.append((char) TokenParser.DQUOTE);
            return;
        }
        charArrayBuffer.append(str2);
    }

    public int getVersion() {
        return 1;
    }

    public Header getVersionHeader() {
        return null;
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase(C6999SM.SET_COOKIE)) {
            return parse(header.getElements(), cookieOrigin);
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
    }

    public String toString() {
        return CookiePolicy.RFC_2109;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C6999SM.COOKIE);
        String name = cookie.getName();
        if (name.indexOf(32) != -1) {
            throw new CookieRestrictionViolationException("Cookie name may not contain blanks");
        } else if (!name.startsWith("$")) {
            super.validate(cookie, cookieOrigin);
        } else {
            throw new CookieRestrictionViolationException("Cookie name may not start with $");
        }
    }
}
