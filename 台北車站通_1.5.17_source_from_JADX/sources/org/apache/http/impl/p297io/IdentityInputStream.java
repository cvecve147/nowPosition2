package org.apache.http.impl.p297io;

import java.io.InputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.p298io.BufferInfo;
import org.apache.http.p298io.SessionInputBuffer;
import org.apache.http.util.Args;

@NotThreadSafe
/* renamed from: org.apache.http.impl.io.IdentityInputStream */
public class IdentityInputStream extends InputStream {
    private boolean closed = false;

    /* renamed from: in */
    private final SessionInputBuffer f19311in;

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        Args.notNull(sessionInputBuffer, "Session input buffer");
        this.f19311in = sessionInputBuffer;
    }

    public int available() {
        SessionInputBuffer sessionInputBuffer = this.f19311in;
        if (sessionInputBuffer instanceof BufferInfo) {
            return ((BufferInfo) sessionInputBuffer).length();
        }
        return 0;
    }

    public void close() {
        this.closed = true;
    }

    public int read() {
        if (this.closed) {
            return -1;
        }
        return this.f19311in.read();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.closed) {
            return -1;
        }
        return this.f19311in.read(bArr, i, i2);
    }
}
