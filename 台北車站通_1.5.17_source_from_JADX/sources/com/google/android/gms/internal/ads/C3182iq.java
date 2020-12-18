package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iq */
public final class C3182iq extends C2239Cq {
    public C3182iq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        this.f6817e.f8817g = -1L;
        this.f6817e.f8819h = -1L;
        int[] iArr = (int[]) this.f6818f.invoke((Object) null, new Object[]{this.f6814b.mo8832a()});
        synchronized (this.f6817e) {
            this.f6817e.f8817g = Long.valueOf((long) iArr[0]);
            this.f6817e.f8819h = Long.valueOf((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f6817e.f8810ca = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
