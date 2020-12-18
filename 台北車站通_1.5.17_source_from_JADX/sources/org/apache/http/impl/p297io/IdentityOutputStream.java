package org.apache.http.impl.p297io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.p298io.SessionOutputBuffer;
import org.apache.http.util.Args;

@NotThreadSafe
/* renamed from: org.apache.http.impl.io.IdentityOutputStream */
public class IdentityOutputStream extends OutputStream {
    private boolean closed = false;
    private final SessionOutputBuffer out;

    public IdentityOutputStream(SessionOutputBuffer sessionOutputBuffer) {
        Args.notNull(sessionOutputBuffer, "Session output buffer");
        this.out = sessionOutputBuffer;
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            this.out.flush();
        }
    }

    public void flush() {
        this.out.flush();
    }

    public void write(int i) {
        if (!this.closed) {
            this.out.write(i);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (!this.closed) {
            this.out.write(bArr, i, i2);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
