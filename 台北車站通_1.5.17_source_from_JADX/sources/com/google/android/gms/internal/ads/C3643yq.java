package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yq */
public final class C3643yq extends C2239Cq {
    public C3643yq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        C2921_l _lVar;
        int i;
        this.f6817e.f8797Q = 2;
        boolean booleanValue = ((Boolean) this.f6818f.invoke((Object) null, new Object[]{this.f6814b.mo8832a()})).booleanValue();
        synchronized (this.f6817e) {
            if (booleanValue) {
                _lVar = this.f6817e;
                i = 1;
            } else {
                _lVar = this.f6817e;
                i = 0;
            }
            _lVar.f8797Q = i;
        }
    }
}
