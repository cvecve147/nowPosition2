package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.cookie.C6999SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@ThreadSafe
public class BrowserCompatSpec extends CookieSpecBase {
    private static final String[] DEFAULT_DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    public BrowserCompatSpec() {
        this((String[]) null, BrowserCompatSpecFactory.SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public BrowserCompatSpec(String[] strArr) {
        this(strArr, BrowserCompatSpecFactory.SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BrowserCompatSpec(java.lang.String[] r4, org.apache.http.impl.cookie.BrowserCompatSpecFactory.SecurityLevel r5) {
        /*
            r3 = this;
            r0 = 7
            org.apache.http.cookie.CommonCookieAttributeHandler[] r0 = new org.apache.http.cookie.CommonCookieAttributeHandler[r0]
            org.apache.http.impl.cookie.BrowserCompatVersionAttributeHandler r1 = new org.apache.http.impl.cookie.BrowserCompatVersionAttributeHandler
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.apache.http.impl.cookie.BasicDomainHandler r1 = new org.apache.http.impl.cookie.BasicDomainHandler
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            org.apache.http.impl.cookie.BrowserCompatSpecFactory$SecurityLevel r1 = org.apache.http.impl.cookie.BrowserCompatSpecFactory.SecurityLevel.SECURITYLEVEL_IE_MEDIUM
            if (r5 != r1) goto L_0x001d
            org.apache.http.impl.cookie.BrowserCompatSpec$1 r5 = new org.apache.http.impl.cookie.BrowserCompatSpec$1
            r5.<init>()
            goto L_0x0022
        L_0x001d:
            org.apache.http.impl.cookie.BasicPathHandler r5 = new org.apache.http.impl.cookie.BasicPathHandler
            r5.<init>()
        L_0x0022:
            r1 = 2
            r0[r1] = r5
            r5 = 3
            org.apache.http.impl.cookie.BasicMaxAgeHandler r1 = new org.apache.http.impl.cookie.BasicMaxAgeHandler
            r1.<init>()
            r0[r5] = r1
            r5 = 4
            org.apache.http.impl.cookie.BasicSecureHandler r1 = new org.apache.http.impl.cookie.BasicSecureHandler
            r1.<init>()
            r0[r5] = r1
            r5 = 5
            org.apache.http.impl.cookie.BasicCommentHandler r1 = new org.apache.http.impl.cookie.BasicCommentHandler
            r1.<init>()
            r0[r5] = r1
            r5 = 6
            org.apache.http.impl.cookie.BasicExpiresHandler r1 = new org.apache.http.impl.cookie.BasicExpiresHandler
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x004b
        L_0x0049:
            java.lang.String[] r4 = DEFAULT_DATE_PATTERNS
        L_0x004b:
            r1.<init>(r4)
            r0[r5] = r1
            r3.<init>((org.apache.http.cookie.CommonCookieAttributeHandler[]) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.BrowserCompatSpec.<init>(java.lang.String[], org.apache.http.impl.cookie.BrowserCompatSpecFactory$SecurityLevel):void");
    }

    private static boolean isQuoteEnclosed(String str) {
        return str != null && str.startsWith("\"") && str.endsWith("\"");
    }

    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append(C6999SM.COOKIE);
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            Cookie cookie = list.get(i);
            if (i > 0) {
                charArrayBuffer.append("; ");
            }
            String name = cookie.getName();
            String value = cookie.getValue();
            if (cookie.getVersion() <= 0 || isQuoteEnclosed(value)) {
                charArrayBuffer.append(name);
                charArrayBuffer.append("=");
                if (value != null) {
                    charArrayBuffer.append(value);
                }
            } else {
                BasicHeaderValueFormatter.INSTANCE.formatHeaderElement(charArrayBuffer, (HeaderElement) new BasicHeaderElement(name, value), false);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    public int getVersion() {
        return 0;
    }

    public Header getVersionHeader() {
        return null;
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        ParserCursor parserCursor;
        CharArrayBuffer charArrayBuffer;
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase(C6999SM.SET_COOKIE)) {
            HeaderElement[] elements = header.getElements();
            boolean z = false;
            boolean z2 = false;
            for (HeaderElement headerElement : elements) {
                if (headerElement.getParameterByName(ClientCookie.VERSION_ATTR) != null) {
                    z2 = true;
                }
                if (headerElement.getParameterByName(ClientCookie.EXPIRES_ATTR) != null) {
                    z = true;
                }
            }
            if (!z && z2) {
                return parse(elements, cookieOrigin);
            }
            NetscapeDraftHeaderParser netscapeDraftHeaderParser = NetscapeDraftHeaderParser.DEFAULT;
            if (header instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) header;
                charArrayBuffer = formattedHeader.getBuffer();
                parserCursor = new ParserCursor(formattedHeader.getValuePos(), charArrayBuffer.length());
            } else {
                String value = header.getValue();
                if (value != null) {
                    charArrayBuffer = new CharArrayBuffer(value.length());
                    charArrayBuffer.append(value);
                    parserCursor = new ParserCursor(0, charArrayBuffer.length());
                } else {
                    throw new MalformedCookieException("Header value is null");
                }
            }
            HeaderElement parseHeader = netscapeDraftHeaderParser.parseHeader(charArrayBuffer, parserCursor);
            String name = parseHeader.getName();
            String value2 = parseHeader.getValue();
            if (name == null || name.isEmpty()) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            BasicClientCookie basicClientCookie = new BasicClientCookie(name, value2);
            basicClientCookie.setPath(CookieSpecBase.getDefaultPath(cookieOrigin));
            basicClientCookie.setDomain(CookieSpecBase.getDefaultDomain(cookieOrigin));
            NameValuePair[] parameters = parseHeader.getParameters();
            for (int length = parameters.length - 1; length >= 0; length--) {
                NameValuePair nameValuePair = parameters[length];
                String lowerCase = nameValuePair.getName().toLowerCase(Locale.ROOT);
                basicClientCookie.setAttribute(lowerCase, nameValuePair.getValue());
                CookieAttributeHandler findAttribHandler = findAttribHandler(lowerCase);
                if (findAttribHandler != null) {
                    findAttribHandler.parse(basicClientCookie, nameValuePair.getValue());
                }
            }
            if (z) {
                basicClientCookie.setVersion(0);
            }
            return Collections.singletonList(basicClientCookie);
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
    }

    public String toString() {
        return "compatibility";
    }
}
