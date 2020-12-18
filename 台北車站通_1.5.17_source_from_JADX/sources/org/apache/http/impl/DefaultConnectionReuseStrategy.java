package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.TokenIterator;
import org.apache.http.annotation.Immutable;
import org.apache.http.message.BasicTokenIterator;

@Immutable
public class DefaultConnectionReuseStrategy implements ConnectionReuseStrategy {
    public static final DefaultConnectionReuseStrategy INSTANCE = new DefaultConnectionReuseStrategy();

    private boolean canResponseHaveBody(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        return (statusCode < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    /* access modifiers changed from: protected */
    public TokenIterator createTokenIterator(HeaderIterator headerIterator) {
        return new BasicTokenIterator(headerIterator);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (java.lang.Integer.parseInt(r0[0].getValue()) < 0) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean keepAlive(org.apache.http.HttpResponse r6, org.apache.http.protocol.HttpContext r7) {
        /*
            r5 = this;
            java.lang.String r0 = "HTTP response"
            org.apache.http.util.Args.notNull(r6, r0)
            java.lang.String r0 = "HTTP context"
            org.apache.http.util.Args.notNull(r7, r0)
            org.apache.http.StatusLine r7 = r6.getStatusLine()
            org.apache.http.ProtocolVersion r7 = r7.getProtocolVersion()
            java.lang.String r0 = "Transfer-Encoding"
            org.apache.http.Header r0 = r6.getFirstHeader(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r0.getValue()
            java.lang.String r3 = "chunked"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0045
            return r2
        L_0x0029:
            boolean r0 = r5.canResponseHaveBody(r6)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "Content-Length"
            org.apache.http.Header[] r0 = r6.getHeaders(r0)
            int r3 = r0.length
            if (r3 != r1) goto L_0x0044
            r0 = r0[r2]
            java.lang.String r0 = r0.getValue()     // Catch:{ NumberFormatException -> 0x0044 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0044 }
            if (r0 >= 0) goto L_0x0045
        L_0x0044:
            return r2
        L_0x0045:
            java.lang.String r0 = "Connection"
            org.apache.http.HeaderIterator r0 = r6.headerIterator(r0)
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x0057
            java.lang.String r0 = "Proxy-Connection"
            org.apache.http.HeaderIterator r0 = r6.headerIterator(r0)
        L_0x0057:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0083
            org.apache.http.TokenIterator r6 = r5.createTokenIterator(r0)     // Catch:{ ParseException -> 0x0082 }
            r0 = r2
        L_0x0062:
            boolean r3 = r6.hasNext()     // Catch:{ ParseException -> 0x0082 }
            if (r3 == 0) goto L_0x007f
            java.lang.String r3 = r6.nextToken()     // Catch:{ ParseException -> 0x0082 }
            java.lang.String r4 = "Close"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch:{ ParseException -> 0x0082 }
            if (r4 == 0) goto L_0x0075
            return r2
        L_0x0075:
            java.lang.String r4 = "Keep-Alive"
            boolean r3 = r4.equalsIgnoreCase(r3)     // Catch:{ ParseException -> 0x0082 }
            if (r3 == 0) goto L_0x0062
            r0 = r1
            goto L_0x0062
        L_0x007f:
            if (r0 == 0) goto L_0x0083
            return r1
        L_0x0082:
            return r2
        L_0x0083:
            org.apache.http.HttpVersion r6 = org.apache.http.HttpVersion.HTTP_1_0
            boolean r6 = r7.lessEquals(r6)
            r6 = r6 ^ r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.DefaultConnectionReuseStrategy.keepAlive(org.apache.http.HttpResponse, org.apache.http.protocol.HttpContext):boolean");
    }
}
