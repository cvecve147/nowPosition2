package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rq */
public final class C3444rq extends C2239Cq {

    /* renamed from: i */
    private List<Long> f10147i = null;

    public C3444rq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        this.f6817e.f8781A = -1L;
        this.f6817e.f8782B = -1L;
        if (this.f10147i == null) {
            this.f10147i = (List) this.f6818f.invoke((Object) null, new Object[]{this.f6814b.mo8832a()});
        }
        List<Long> list = this.f10147i;
        if (list != null && list.size() == 2) {
            synchronized (this.f6817e) {
                this.f6817e.f8781A = Long.valueOf(this.f10147i.get(0).longValue());
                this.f6817e.f8782B = Long.valueOf(this.f10147i.get(1).longValue());
            }
        }
    }
}
