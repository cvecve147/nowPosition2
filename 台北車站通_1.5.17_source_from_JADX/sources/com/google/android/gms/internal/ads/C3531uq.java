package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uq */
public final class C3531uq extends C2239Cq {

    /* renamed from: i */
    private final StackTraceElement[] f10313i;

    public C3531uq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(sp, str, str2, _lVar, i, 45);
        this.f10313i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        Object obj = this.f10313i;
        if (obj != null) {
            int i = 1;
            C2644Qp qp = new C2644Qp((String) this.f6818f.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f6817e) {
                this.f6817e.f8794N = qp.f8156b;
                if (qp.f8157c.booleanValue()) {
                    C2921_l _lVar = this.f6817e;
                    if (qp.f8158d.booleanValue()) {
                        i = 0;
                    }
                    _lVar.f8804X = Integer.valueOf(i);
                }
            }
        }
    }
}
