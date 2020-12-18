package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.My */
final class C2532My implements C3262lg<C3452ry> {

    /* renamed from: a */
    private final /* synthetic */ C2767Uy f7628a;

    /* renamed from: b */
    private final /* synthetic */ C2275Dy f7629b;

    C2532My(C2275Dy dy, C2767Uy uy) {
        this.f7629b = dy;
        this.f7628a = uy;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo7969a(Object obj) {
        synchronized (this.f7629b.f6926a) {
            int unused = this.f7629b.f6933h = 0;
            if (!(this.f7629b.f6932g == null || this.f7628a == this.f7629b.f6932g)) {
                C2857Yd.m11615f("New JS engine is loaded, marking previous one as destroyable.");
                this.f7629b.f6932g.mo8943e();
            }
            C2767Uy unused2 = this.f7629b.f6932g = this.f7628a;
        }
    }
}
