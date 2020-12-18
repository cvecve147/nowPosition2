package org.apache.http.p298io;

import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.io.SessionInputBuffer */
public interface SessionInputBuffer {
    HttpTransportMetrics getMetrics();

    @Deprecated
    boolean isDataAvailable(int i);

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i, int i2);

    int readLine(CharArrayBuffer charArrayBuffer);

    String readLine();
}
