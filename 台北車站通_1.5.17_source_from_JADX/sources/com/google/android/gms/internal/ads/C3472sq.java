package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sq */
public final class C3472sq extends C2239Cq {

    /* renamed from: i */
    private final boolean f10226i;

    public C3472sq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 61);
        this.f10226i = sp.mo8845j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        long longValue = ((Long) this.f6818f.invoke((Object) null, new Object[]{this.f6814b.mo8832a(), Boolean.valueOf(this.f10226i)})).longValue();
        synchronized (this.f6817e) {
            this.f6817e.f8814ea = Long.valueOf(longValue);
        }
    }
}
