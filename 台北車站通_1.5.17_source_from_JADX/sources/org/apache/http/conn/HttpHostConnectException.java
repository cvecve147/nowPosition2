package org.apache.http.conn;

import java.net.ConnectException;
import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Immutable;

@Immutable
public class HttpHostConnectException extends ConnectException {
    private static final long serialVersionUID = -3194482710275220224L;
    private final HttpHost host;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpHostConnectException(java.io.IOException r4, org.apache.http.HttpHost r5, java.net.InetAddress... r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Connect to "
            r0.append(r1)
            if (r5 == 0) goto L_0x0011
            java.lang.String r1 = r5.toHostString()
            goto L_0x0013
        L_0x0011:
            java.lang.String r1 = "remote host"
        L_0x0013:
            r0.append(r1)
            if (r6 == 0) goto L_0x0031
            int r1 = r6.length
            if (r1 <= 0) goto L_0x0031
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " "
            r1.append(r2)
            java.util.List r6 = java.util.Arrays.asList(r6)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            goto L_0x0033
        L_0x0031:
            java.lang.String r6 = ""
        L_0x0033:
            r0.append(r6)
            if (r4 == 0) goto L_0x0054
            java.lang.String r6 = r4.getMessage()
            if (r6 == 0) goto L_0x0054
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = " failed: "
            r6.append(r1)
            java.lang.String r1 = r4.getMessage()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            goto L_0x0056
        L_0x0054:
            java.lang.String r6 = " refused"
        L_0x0056:
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r3.<init>(r6)
            r3.host = r5
            r3.initCause(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.HttpHostConnectException.<init>(java.io.IOException, org.apache.http.HttpHost, java.net.InetAddress[]):void");
    }

    @Deprecated
    public HttpHostConnectException(HttpHost httpHost, ConnectException connectException) {
        this(connectException, httpHost, (InetAddress[]) null);
    }

    public HttpHost getHost() {
        return this.host;
    }
}
