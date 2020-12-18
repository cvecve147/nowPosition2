package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Obsolete;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Obsolete
@ThreadSafe
public class RFC2965Spec extends RFC2109Spec {
    public RFC2965Spec() {
        this((String[]) null, false);
    }

    RFC2965Spec(boolean z, CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        super(z, commonCookieAttributeHandlerArr);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RFC2965Spec(java.lang.String[] r4, boolean r5) {
        /*
            r3 = this;
            r0 = 10
            org.apache.http.cookie.CommonCookieAttributeHandler[] r0 = new org.apache.http.cookie.CommonCookieAttributeHandler[r0]
            org.apache.http.impl.cookie.RFC2965VersionAttributeHandler r1 = new org.apache.http.impl.cookie.RFC2965VersionAttributeHandler
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicPathHandler r1 = new org.apache.http.impl.cookie.BasicPathHandler
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            org.apache.http.impl.cookie.RFC2965DomainAttributeHandler r1 = new org.apache.http.impl.cookie.RFC2965DomainAttributeHandler
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            org.apache.http.impl.cookie.RFC2965PortAttributeHandler r1 = new org.apache.http.impl.cookie.RFC2965PortAttributeHandler
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicMaxAgeHandler r1 = new org.apache.http.impl.cookie.BasicMaxAgeHandler
            r1.<init>()
            r2 = 4
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicSecureHandler r1 = new org.apache.http.impl.cookie.BasicSecureHandler
            r1.<init>()
            r2 = 5
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicCommentHandler r1 = new org.apache.http.impl.cookie.BasicCommentHandler
            r1.<init>()
            r2 = 6
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicExpiresHandler r1 = new org.apache.http.impl.cookie.BasicExpiresHandler
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x0049
        L_0x0047:
            java.lang.String[] r4 = org.apache.http.impl.cookie.RFC2109Spec.DATE_PATTERNS
        L_0x0049:
            r1.<init>(r4)
            r4 = 7
            r0[r4] = r1
            r4 = 8
            org.apache.http.impl.cookie.RFC2965CommentUrlAttributeHandler r1 = new org.apache.http.impl.cookie.RFC2965CommentUrlAttributeHandler
            r1.<init>()
            r0[r4] = r1
            r4 = 9
            org.apache.http.impl.cookie.RFC2965DiscardAttributeHandler r1 = new org.apache.http.impl.cookie.RFC2965DiscardAttributeHandler
            r1.<init>()
            r0[r4] = r1
            r3.<init>((boolean) r5, (org.apache.http.cookie.CommonCookieAttributeHandler[]) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.RFC2965Spec.<init>(java.lang.String[], boolean):void");
    }

    private static CookieOrigin adjustEffectiveHost(CookieOrigin cookieOrigin) {
        String host = cookieOrigin.getHost();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= host.length()) {
                z = true;
                break;
            }
            char charAt = host.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
            i++;
        }
        if (!z) {
            return cookieOrigin;
        }
        return new CookieOrigin(host + ".local", cookieOrigin.getPort(), cookieOrigin.getPath(), cookieOrigin.isSecure());
    }

    private List<Cookie> createCookies(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        ArrayList arrayList = new ArrayList(headerElementArr.length);
        for (HeaderElement headerElement : headerElementArr) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name == null || name.isEmpty()) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            BasicClientCookie2 basicClientCookie2 = new BasicClientCookie2(name, value);
            basicClientCookie2.setPath(CookieSpecBase.getDefaultPath(cookieOrigin));
            basicClientCookie2.setDomain(CookieSpecBase.getDefaultDomain(cookieOrigin));
            basicClientCookie2.setPorts(new int[]{cookieOrigin.getPort()});
            NameValuePair[] parameters = headerElement.getParameters();
            HashMap hashMap = new HashMap(parameters.length);
            for (int length = parameters.length - 1; length >= 0; length--) {
                NameValuePair nameValuePair = parameters[length];
                hashMap.put(nameValuePair.getName().toLowerCase(Locale.ROOT), nameValuePair);
            }
            for (Map.Entry value2 : hashMap.entrySet()) {
                NameValuePair nameValuePair2 = (NameValuePair) value2.getValue();
                String lowerCase = nameValuePair2.getName().toLowerCase(Locale.ROOT);
                basicClientCookie2.setAttribute(lowerCase, nameValuePair2.getValue());
                CookieAttributeHandler findAttribHandler = findAttribHandler(lowerCase);
                if (findAttribHandler != null) {
                    findAttribHandler.parse(basicClientCookie2, nameValuePair2.getValue());
                }
            }
            arrayList.add(basicClientCookie2);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void formatCookieAsVer(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        String attribute;
        int[] ports;
        super.formatCookieAsVer(charArrayBuffer, cookie, i);
        if ((cookie instanceof ClientCookie) && (attribute = ((ClientCookie) cookie).getAttribute(ClientCookie.PORT_ATTR)) != null) {
            charArrayBuffer.append("; $Port");
            charArrayBuffer.append("=\"");
            if (!attribute.trim().isEmpty() && (ports = cookie.getPorts()) != null) {
                int length = ports.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        charArrayBuffer.append(",");
                    }
                    charArrayBuffer.append(Integer.toString(ports[i2]));
                }
            }
            charArrayBuffer.append("\"");
        }
    }

    public int getVersion() {
        return 1;
    }

    public Header getVersionHeader() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
        charArrayBuffer.append(C6999SM.COOKIE2);
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(getVersion()));
        return new BufferedHeader(charArrayBuffer);
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C6999SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        return super.match(cookie, adjustEffectiveHost(cookieOrigin));
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase(C6999SM.SET_COOKIE2)) {
            return createCookies(header.getElements(), adjustEffectiveHost(cookieOrigin));
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
    }

    /* access modifiers changed from: protected */
    public List<Cookie> parse(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        return createCookies(headerElementArr, adjustEffectiveHost(cookieOrigin));
    }

    public String toString() {
        return CookiePolicy.RFC_2965;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C6999SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        super.validate(cookie, adjustEffectiveHost(cookieOrigin));
    }
}
