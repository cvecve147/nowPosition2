package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.Wi */
public final class C2807Wi extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C2802Wd f8534a;

    public C2807Wi(C2802Wd wd, int i) {
        this.f8534a = wd;
        this.buf = this.f8534a.mo8993a(Math.max(i, 256));
    }

    /* renamed from: a */
    private final void m11502a(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            byte[] a = this.f8534a.mo8993a((i2 + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f8534a.mo8992a(this.buf);
            this.buf = a;
        }
    }

    public final void close() {
        this.f8534a.mo8992a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f8534a.mo8992a(this.buf);
    }

    public final synchronized void write(int i) {
        m11502a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m11502a(i2);
        super.write(bArr, i, i2);
    }
}
