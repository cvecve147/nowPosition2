package org.apache.http.impl.p297io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.p298io.SessionOutputBuffer;
import org.apache.http.util.Args;

@NotThreadSafe
/* renamed from: org.apache.http.impl.io.ContentLengthOutputStream */
public class ContentLengthOutputStream extends OutputStream {
    private boolean closed = false;
    private final long contentLength;
    private final SessionOutputBuffer out;
    private long total = 0;

    public ContentLengthOutputStream(SessionOutputBuffer sessionOutputBuffer, long j) {
        Args.notNull(sessionOutputBuffer, "Session output buffer");
        this.out = sessionOutputBuffer;
        Args.notNegative(j, "Content length");
        this.contentLength = j;
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
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.total < this.contentLength) {
            this.out.write(i);
            this.total++;
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (!this.closed) {
            long j = this.total;
            long j2 = this.contentLength;
            if (j < j2) {
                long j3 = j2 - j;
                if (((long) i2) > j3) {
                    i2 = (int) j3;
                }
                this.out.write(bArr, i, i2);
                this.total += (long) i2;
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
