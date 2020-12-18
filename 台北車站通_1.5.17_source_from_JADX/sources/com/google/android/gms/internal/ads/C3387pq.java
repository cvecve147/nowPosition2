package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pq */
public final class C3387pq extends C2239Cq {

    /* renamed from: i */
    private static volatile String f10035i;

    /* renamed from: j */
    private static final Object f10036j = new Object();

    public C3387pq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        this.f6817e.f8809c = "E";
        if (f10035i == null) {
            synchronized (f10036j) {
                if (f10035i == null) {
                    f10035i = (String) this.f6818f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f6817e) {
            this.f6817e.f8809c = f10035i;
        }
    }
}
