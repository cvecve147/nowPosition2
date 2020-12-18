package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.om */
class C3354om extends C3326nm {

    /* renamed from: d */
    protected final byte[] f9962d;

    C3354om(byte[] bArr) {
        this.f9962d = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo9500a(int i, int i2, int i3) {
        return C2641Qm.m10983a(i, this.f9962d, mo9641f(), i3);
    }

    /* renamed from: a */
    public final C3150hm mo9501a(int i, int i2) {
        int b = C3150hm.m12539b(0, i2, size());
        return b == 0 ? C3150hm.f9434a : new C3240km(this.f9962d, mo9641f(), b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo9502a(Charset charset) {
        return new String(this.f9962d, mo9641f(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9503a(C3122gm gmVar) {
        gmVar.mo9476a(this.f9962d, mo9641f(), size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9504a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9962d, 0, bArr, 0, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo9826a(C3150hm hmVar, int i, int i2) {
        if (i2 > hmVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > hmVar.size()) {
            int size2 = hmVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(hmVar instanceof C3354om)) {
            return hmVar.mo9501a(0, i2).equals(mo9501a(0, i2));
        } else {
            C3354om omVar = (C3354om) hmVar;
            byte[] bArr = this.f9962d;
            byte[] bArr2 = omVar.f9962d;
            int f = mo9641f() + i2;
            int f2 = mo9641f();
            int f3 = omVar.mo9641f();
            while (f2 < f) {
                if (bArr[f2] != bArr2[f3]) {
                    return false;
                }
                f2++;
                f3++;
            }
            return true;
        }
    }

    /* renamed from: c */
    public byte mo9507c(int i) {
        return this.f9962d[i];
    }

    /* renamed from: c */
    public final boolean mo9508c() {
        int f = mo9641f();
        return C3271lo.m12994a(this.f9962d, f, size() + f);
    }

    /* renamed from: d */
    public final C3411qm mo9509d() {
        return C3411qm.m13539a(this.f9962d, mo9641f(), size(), true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3150hm) || size() != ((C3150hm) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C3354om)) {
            return obj.equals(this);
        }
        C3354om omVar = (C3354om) obj;
        int e = mo9510e();
        int e2 = omVar.mo9510e();
        if (e == 0 || e2 == 0 || e == e2) {
            return mo9826a((C3150hm) omVar, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo9641f() {
        return 0;
    }

    public int size() {
        return this.f9962d.length;
    }
}
