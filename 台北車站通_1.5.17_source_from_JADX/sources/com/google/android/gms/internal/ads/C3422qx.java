package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qx */
final class C3422qx extends C3590wt {

    /* renamed from: a */
    private final /* synthetic */ C3394px f10096a;

    C3422qx(C3394px pxVar) {
        this.f10096a = pxVar;
    }

    /* renamed from: M */
    public final void mo8798M() {
        this.f10096a.f10052a.add(new C3566vx(this));
    }

    /* renamed from: N */
    public final void mo8799N() {
        this.f10096a.f10052a.add(new C3508tx(this));
    }

    /* renamed from: P */
    public final void mo8800P() {
        this.f10096a.f10052a.add(new C3538ux(this));
        C2857Yd.m11615f("Pooled interstitial loaded.");
    }

    /* renamed from: S */
    public final void mo8801S() {
        this.f10096a.f10052a.add(new C3622xx(this));
    }

    /* renamed from: U */
    public final void mo8802U() {
        this.f10096a.f10052a.add(new C3451rx(this));
    }

    /* renamed from: c */
    public final void mo8803c(int i) {
        this.f10096a.f10052a.add(new C3479sx(this, i));
        C2857Yd.m11615f("Pooled interstitial failed to load.");
    }

    /* renamed from: f */
    public final void mo8804f() {
        this.f10096a.f10052a.add(new C3650yx(this));
    }
}
