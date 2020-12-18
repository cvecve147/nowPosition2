package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kq */
public final class C3244kq extends C2239Cq {

    /* renamed from: i */
    private long f9701i;

    public C3244kq(C2701Sp sp, String str, String str2, C2921_l _lVar, long j, int i, int i2) {
        super(sp, str, str2, _lVar, i, 25);
        this.f9701i = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        long longValue = ((Long) this.f6818f.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f6817e) {
            this.f6817e.f8840ra = Long.valueOf(longValue);
            if (this.f9701i != 0) {
                this.f6817e.f8841s = Long.valueOf(longValue - this.f9701i);
                this.f6817e.f8847x = Long.valueOf(this.f9701i);
            }
        }
    }
}
