package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gq */
public final class C3126gq extends C2239Cq {

    /* renamed from: i */
    private static volatile String f9384i;

    /* renamed from: j */
    private static final Object f9385j = new Object();

    public C3126gq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 29);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        this.f6817e.f8849z = "E";
        if (f9384i == null) {
            synchronized (f9385j) {
                if (f9384i == null) {
                    f9384i = (String) this.f6818f.invoke((Object) null, new Object[]{this.f6814b.mo8832a()});
                }
            }
        }
        synchronized (this.f6817e) {
            this.f6817e.f8849z = C2953ap.m11934a(f9384i.getBytes(), true);
        }
    }
}
