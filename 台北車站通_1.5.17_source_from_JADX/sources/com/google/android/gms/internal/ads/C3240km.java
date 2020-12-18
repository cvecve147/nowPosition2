package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.km */
final class C3240km extends C3354om {

    /* renamed from: e */
    private final int f9698e;

    /* renamed from: f */
    private final int f9699f;

    C3240km(byte[] bArr, int i, int i2) {
        super(bArr);
        C3150hm.m12539b(i, i + i2, bArr.length);
        this.f9698e = i;
        this.f9699f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9504a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9962d, mo9641f(), bArr, 0, i3);
    }

    /* renamed from: c */
    public final byte mo9507c(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f9962d[this.f9698e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo9641f() {
        return this.f9698e;
    }

    public final int size() {
        return this.f9699f;
    }
}
