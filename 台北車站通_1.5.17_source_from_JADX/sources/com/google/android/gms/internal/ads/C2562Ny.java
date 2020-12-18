package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ny */
final class C2562Ny implements C3201jg {

    /* renamed from: a */
    private final /* synthetic */ C2767Uy f8015a;

    /* renamed from: b */
    private final /* synthetic */ C2275Dy f8016b;

    C2562Ny(C2275Dy dy, C2767Uy uy) {
        this.f8016b = dy;
        this.f8015a = uy;
    }

    public final void run() {
        synchronized (this.f8016b.f6926a) {
            int unused = this.f8016b.f6933h = 1;
            C2857Yd.m11615f("Failed loading new engine. Marking new engine destroyable.");
            this.f8015a.mo8943e();
        }
    }
}
