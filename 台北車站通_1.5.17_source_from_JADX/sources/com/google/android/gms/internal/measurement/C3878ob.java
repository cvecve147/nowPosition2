package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ob */
final class C3878ob implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f11571a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11572b;

    C3878ob(C3814Za za, long j) {
        this.f11572b = za;
        this.f11571a = j;
    }

    public final void run() {
        this.f11572b.mo10455q().f11486t.mo10764a(this.f11571a);
        this.f11572b.mo10385b().mo10579E().mo10593a("Minimum session duration set", Long.valueOf(this.f11571a));
    }
}
