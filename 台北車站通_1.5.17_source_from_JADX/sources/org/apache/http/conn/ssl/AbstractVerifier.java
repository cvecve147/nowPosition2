package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.util.Args;

@Deprecated
public abstract class AbstractVerifier implements X509HostnameVerifier {
    static final String[] BAD_COUNTRY_2LDS = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
    private final Log log = LogFactory.getLog((Class) getClass());

    static {
        Arrays.sort(BAD_COUNTRY_2LDS);
    }

    public static boolean acceptableCountryWildcard(String str) {
        return validCountryWildcard(str.split("\\."));
    }

    public static int countDots(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static String[] getCNs(X509Certificate x509Certificate) {
        try {
            String extractCN = DefaultHostnameVerifier.extractCN(x509Certificate.getSubjectX500Principal().toString());
            if (extractCN == null) {
                return null;
            }
            return new String[]{extractCN};
        } catch (SSLException unused) {
            return null;
        }
    }

    public static String[] getDNSSubjectAlts(X509Certificate x509Certificate) {
        List<String> extractSubjectAlts = DefaultHostnameVerifier.extractSubjectAlts(x509Certificate, 2);
        if (extractSubjectAlts == null || extractSubjectAlts.isEmpty()) {
            return null;
        }
        return (String[]) extractSubjectAlts.toArray(new String[extractSubjectAlts.size()]);
    }

    private static boolean matchIdentity(String str, String str2, boolean z) {
        boolean z2;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        String[] split = lowerCase2.split("\\.");
        if (!(split.length >= 3 && split[0].endsWith("*") && (!z || validCountryWildcard(split)))) {
            return lowerCase.equals(lowerCase2);
        }
        String str3 = split[0];
        if (str3.length() > 1) {
            String substring = str3.substring(0, str3.length() - 1);
            z2 = lowerCase.startsWith(substring) && lowerCase.substring(substring.length()).endsWith(lowerCase2.substring(str3.length()));
        } else {
            z2 = lowerCase.endsWith(lowerCase2.substring(1));
        }
        if (z2) {
            return !z || countDots(lowerCase) == countDots(lowerCase2);
        }
        return false;
    }

    private static boolean validCountryWildcard(String[] strArr) {
        return (strArr.length == 3 && strArr[2].length() == 2 && Arrays.binarySearch(BAD_COUNTRY_2LDS, strArr[1]) >= 0) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void verify(java.lang.String r5, java.security.cert.X509Certificate r6) {
        /*
            r4 = this;
            boolean r0 = org.apache.http.conn.util.InetAddressUtils.isIPv4Address(r5)
            boolean r1 = org.apache.http.conn.util.InetAddressUtils.isIPv6Address(r5)
            if (r0 != 0) goto L_0x000f
            if (r1 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 2
            goto L_0x0010
        L_0x000f:
            r0 = 7
        L_0x0010:
            java.util.List r0 = org.apache.http.conn.ssl.DefaultHostnameVerifier.extractSubjectAlts(r6, r0)
            javax.security.auth.x500.X500Principal r6 = r6.getSubjectX500Principal()
            java.lang.String r1 = "RFC2253"
            java.lang.String r6 = r6.getName(r1)
            java.lang.String r6 = org.apache.http.conn.ssl.DefaultHostnameVerifier.extractCN(r6)
            r1 = 0
            if (r6 == 0) goto L_0x002c
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r6
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            if (r0 == 0) goto L_0x0042
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L_0x0042
            int r6 = r0.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            r1 = r6
            java.lang.String[] r1 = (java.lang.String[]) r1
        L_0x0042:
            r4.verify(r5, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.AbstractVerifier.verify(java.lang.String, java.security.cert.X509Certificate):void");
    }

    public final void verify(String str, SSLSocket sSLSocket) {
        Args.notNull(str, "Host");
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        verify(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    public final void verify(String str, String[] strArr, String[] strArr2, boolean z) {
        List<String> list = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            list = Arrays.asList(strArr2);
        }
        String normaliseAddress = InetAddressUtils.isIPv6Address(str) ? DefaultHostnameVerifier.normaliseAddress(str.toLowerCase(Locale.ROOT)) : str;
        if (list != null) {
            for (String str3 : list) {
                if (InetAddressUtils.isIPv6Address(str3)) {
                    str3 = DefaultHostnameVerifier.normaliseAddress(str3);
                }
                if (matchIdentity(normaliseAddress, str3, z)) {
                    return;
                }
            }
            throw new SSLException("Certificate for <" + str + "> doesn't match any " + "of the subject alternative names: " + list);
        } else if (str2 != null) {
            if (!matchIdentity(normaliseAddress, InetAddressUtils.isIPv6Address(str2) ? DefaultHostnameVerifier.normaliseAddress(str2) : str2, z)) {
                throw new SSLException("Certificate for <" + str + "> doesn't match " + "common name of the certificate subject: " + str2);
            }
        } else {
            throw new SSLException("Certificate subject for <" + str + "> doesn't contain " + "a common name and does not have alternative names");
        }
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(e.getMessage(), e);
            }
            return false;
        }
    }
}
