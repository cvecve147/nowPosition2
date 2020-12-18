package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jq */
public final class C3216jq extends C2239Cq {

    /* renamed from: i */
    private static volatile Long f9638i;

    /* renamed from: j */
    private static final Object f9639j = new Object();

    public C3216jq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        if (f9638i == null) {
            synchronized (f9639j) {
                if (f9638i == null) {
                    f9638i = (Long) this.f6818f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f6817e) {
            this.f6817e.f8793M = f9638i;
        }
    }
}
