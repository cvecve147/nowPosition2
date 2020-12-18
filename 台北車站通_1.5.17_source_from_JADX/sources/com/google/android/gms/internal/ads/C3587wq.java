package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wq */
public final class C3587wq extends C2239Cq {

    /* renamed from: i */
    private final C2983bq f10466i;

    /* renamed from: j */
    private long f10467j;

    public C3587wq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2, C2983bq bqVar) {
        super(sp, str, str2, _lVar, i, 53);
        this.f10466i = bqVar;
        if (bqVar != null) {
            this.f10467j = bqVar.mo9257a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        if (this.f10466i != null) {
            this.f6817e.f8801U = (Long) this.f6818f.invoke((Object) null, new Object[]{Long.valueOf(this.f10467j)});
        }
    }
}
