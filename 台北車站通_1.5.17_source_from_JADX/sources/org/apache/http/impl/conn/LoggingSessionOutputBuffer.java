package org.apache.http.impl.conn;

import org.apache.http.Consts;
import org.apache.http.annotation.Immutable;
import org.apache.http.p298io.HttpTransportMetrics;
import org.apache.http.p298io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Immutable
@Deprecated
public class LoggingSessionOutputBuffer implements SessionOutputBuffer {
    private final String charset;
    private final SessionOutputBuffer out;
    private final Wire wire;

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire2) {
        this(sessionOutputBuffer, wire2, (String) null);
    }

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire2, String str) {
        this.out = sessionOutputBuffer;
        this.wire = wire2;
        this.charset = str == null ? Consts.ASCII.name() : str;
    }

    public void flush() {
        this.out.flush();
    }

    public HttpTransportMetrics getMetrics() {
        return this.out.getMetrics();
    }

    public void write(int i) {
        this.out.write(i);
        if (this.wire.enabled()) {
            this.wire.output(i);
        }
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
        if (this.wire.enabled()) {
            this.wire.output(bArr);
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        if (this.wire.enabled()) {
            this.wire.output(bArr, i, i2);
        }
    }

    public void writeLine(String str) {
        this.out.writeLine(str);
        if (this.wire.enabled()) {
            this.wire.output((str + "\r\n").getBytes(this.charset));
        }
    }

    public void writeLine(CharArrayBuffer charArrayBuffer) {
        this.out.writeLine(charArrayBuffer);
        if (this.wire.enabled()) {
            String str = new String(charArrayBuffer.buffer(), 0, charArrayBuffer.length());
            this.wire.output((str + "\r\n").getBytes(this.charset));
        }
    }
}
