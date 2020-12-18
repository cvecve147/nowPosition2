package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gl */
public final class C2349Gl {

    /* renamed from: a */
    private final byte[] f7080a;

    private C2349Gl(byte[] bArr, int i, int i2) {
        this.f7080a = new byte[i2];
        System.arraycopy(bArr, 0, this.f7080a, 0, i2);
    }

    /* renamed from: a */
    public static C2349Gl m9971a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new C2349Gl(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] mo8219a() {
        byte[] bArr = this.f7080a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
