package org.apache.http.impl.conn;

import org.apache.http.Consts;
import org.apache.http.annotation.Immutable;
import org.apache.http.p298io.EofSensor;
import org.apache.http.p298io.HttpTransportMetrics;
import org.apache.http.p298io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Immutable
@Deprecated
public class LoggingSessionInputBuffer implements SessionInputBuffer, EofSensor {
    private final String charset;
    private final EofSensor eofSensor;

    /* renamed from: in */
    private final SessionInputBuffer f19306in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2) {
        this(sessionInputBuffer, wire2, (String) null);
    }

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2, String str) {
        this.f19306in = sessionInputBuffer;
        this.eofSensor = sessionInputBuffer instanceof EofSensor ? (EofSensor) sessionInputBuffer : null;
        this.wire = wire2;
        this.charset = str == null ? Consts.ASCII.name() : str;
    }

    public HttpTransportMetrics getMetrics() {
        return this.f19306in.getMetrics();
    }

    public boolean isDataAvailable(int i) {
        return this.f19306in.isDataAvailable(i);
    }

    public boolean isEof() {
        EofSensor eofSensor2 = this.eofSensor;
        if (eofSensor2 != null) {
            return eofSensor2.isEof();
        }
        return false;
    }

    public int read() {
        int read = this.f19306in.read();
        if (this.wire.enabled() && read != -1) {
            this.wire.input(read);
        }
        return read;
    }

    public int read(byte[] bArr) {
        int read = this.f19306in.read(bArr);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, 0, read);
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.f19306in.read(bArr, i, i2);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, i, read);
        }
        return read;
    }

    public int readLine(CharArrayBuffer charArrayBuffer) {
        int readLine = this.f19306in.readLine(charArrayBuffer);
        if (this.wire.enabled() && readLine >= 0) {
            String str = new String(charArrayBuffer.buffer(), charArrayBuffer.length() - readLine, readLine);
            this.wire.input((str + "\r\n").getBytes(this.charset));
        }
        return readLine;
    }

    public String readLine() {
        String readLine = this.f19306in.readLine();
        if (this.wire.enabled() && readLine != null) {
            this.wire.input((readLine + "\r\n").getBytes(this.charset));
        }
        return readLine;
    }
}
