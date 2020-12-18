package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.eb */
final class C3838eb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f11423a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11424b;

    C3838eb(C3814Za za, long j) {
        this.f11424b = za;
        this.f11423a = j;
    }

    public final void run() {
        C3814Za za = this.f11424b;
        long j = this.f11423a;
        za.mo10451d();
        za.mo10588t();
        za.mo10385b().mo10579E().mo10592a("Resetting analytics data (FE)");
        za.mo10572p().mo10574y();
        if (za.mo10456r().mo11011j(za.mo10568i().mo10520z())) {
            za.mo10455q().f11477k.mo10764a(j);
        }
        boolean s = za.f11325a.mo10395s();
        if (!za.mo10456r().mo11013t()) {
            za.mo10455q().mo10751d(!s);
        }
        za.mo10569k().mo11024A();
        za.f11364h = !s;
    }
}
