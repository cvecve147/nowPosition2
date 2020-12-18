package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wl */
public final class C2810Wl {

    /* renamed from: a */
    private final byte[] f8537a = new byte[256];

    /* renamed from: b */
    private int f8538b;

    /* renamed from: c */
    private int f8539c;

    public C2810Wl(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f8537a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.f8537a;
            b = (b + bArr2[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = bArr2[i2];
            bArr2[i2] = bArr2[b];
            bArr2[b] = b2;
        }
        this.f8538b = 0;
        this.f8539c = 0;
    }

    /* renamed from: a */
    public final void mo9001a(byte[] bArr) {
        int i = this.f8538b;
        int i2 = this.f8539c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f8537a;
            i2 = (i2 + bArr2[i]) & 255;
            byte b = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.f8538b = i;
        this.f8539c = i2;
    }
}
