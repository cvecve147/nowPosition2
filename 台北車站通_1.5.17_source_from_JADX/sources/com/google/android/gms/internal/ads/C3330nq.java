package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nq */
public final class C3330nq extends C2239Cq {

    /* renamed from: i */
    private static volatile Long f9880i;

    /* renamed from: j */
    private static final Object f9881j = new Object();

    public C3330nq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        if (f9880i == null) {
            synchronized (f9881j) {
                if (f9880i == null) {
                    f9880i = (Long) this.f6818f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f6817e) {
            this.f6817e.f8846w = f9880i;
        }
    }
}
