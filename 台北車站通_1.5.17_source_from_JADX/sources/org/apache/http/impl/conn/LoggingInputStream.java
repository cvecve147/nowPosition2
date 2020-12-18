package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
class LoggingInputStream extends InputStream {

    /* renamed from: in */
    private final InputStream f19305in;
    private final Wire wire;

    public LoggingInputStream(InputStream inputStream, Wire wire2) {
        this.f19305in = inputStream;
        this.wire = wire2;
    }

    public int available() {
        try {
            return this.f19305in.available();
        } catch (IOException e) {
            Wire wire2 = this.wire;
            wire2.input("[available] I/O error : " + e.getMessage());
            throw e;
        }
    }

    public void close() {
        try {
            this.f19305in.close();
        } catch (IOException e) {
            Wire wire2 = this.wire;
            wire2.input("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void mark(int i) {
        super.mark(i);
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        try {
            int read = this.f19305in.read();
            if (read == -1) {
                this.wire.input("end of stream");
            } else {
                this.wire.input(read);
            }
            return read;
        } catch (IOException e) {
            Wire wire2 = this.wire;
            wire2.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public int read(byte[] bArr) {
        try {
            int read = this.f19305in.read(bArr);
            if (read == -1) {
                this.wire.input("end of stream");
            } else if (read > 0) {
                this.wire.input(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            Wire wire2 = this.wire;
            wire2.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f19305in.read(bArr, i, i2);
            if (read == -1) {
                this.wire.input("end of stream");
            } else if (read > 0) {
                this.wire.input(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            Wire wire2 = this.wire;
            wire2.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void reset() {
        super.reset();
    }

    public long skip(long j) {
        try {
            return super.skip(j);
        } catch (IOException e) {
            Wire wire2 = this.wire;
            wire2.input("[skip] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
