package org.apache.http.impl.p297io;

import java.net.Socket;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.p298io.EofSensor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@NotThreadSafe
@Deprecated
/* renamed from: org.apache.http.impl.io.SocketInputBuffer */
public class SocketInputBuffer extends AbstractSessionInputBuffer implements EofSensor {
    private boolean eof = false;
    private final Socket socket;

    public SocketInputBuffer(Socket socket2, int i, HttpParams httpParams) {
        Args.notNull(socket2, "Socket");
        this.socket = socket2;
        i = i < 0 ? socket2.getReceiveBufferSize() : i;
        init(socket2.getInputStream(), i < 1024 ? 1024 : i, httpParams);
    }

    /* access modifiers changed from: protected */
    public int fillBuffer() {
        int fillBuffer = super.fillBuffer();
        this.eof = fillBuffer == -1;
        return fillBuffer;
    }

    /* JADX INFO: finally extract failed */
    public boolean isDataAvailable(int i) {
        boolean hasBufferedData = hasBufferedData();
        if (hasBufferedData) {
            return hasBufferedData;
        }
        int soTimeout = this.socket.getSoTimeout();
        try {
            this.socket.setSoTimeout(i);
            fillBuffer();
            boolean hasBufferedData2 = hasBufferedData();
            this.socket.setSoTimeout(soTimeout);
            return hasBufferedData2;
        } catch (Throwable th) {
            this.socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public boolean isEof() {
        return this.eof;
    }
}
