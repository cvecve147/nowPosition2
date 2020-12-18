package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.Xf */
final class C2831Xf extends FilterInputStream {

    /* renamed from: a */
    private final long f8606a;

    /* renamed from: b */
    private long f8607b;

    C2831Xf(InputStream inputStream, long j) {
        super(inputStream);
        this.f8606a = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo9026a() {
        return this.f8606a - this.f8607b;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f8607b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f8607b += (long) read;
        }
        return read;
    }
}
