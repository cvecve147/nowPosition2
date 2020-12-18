package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xq */
public final class C3615xq extends C2239Cq {

    /* renamed from: i */
    private static volatile Long f10536i;

    /* renamed from: j */
    private static final Object f10537j = new Object();

    public C3615xq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        if (f10536i == null) {
            synchronized (f10537j) {
                if (f10536i == null) {
                    f10536i = (Long) this.f6818f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f6817e) {
            this.f6817e.f8783C = f10536i;
        }
    }
}
