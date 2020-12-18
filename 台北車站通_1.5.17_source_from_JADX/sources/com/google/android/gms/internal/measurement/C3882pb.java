package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pb */
final class C3882pb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f11578a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11579b;

    C3882pb(C3814Za za, long j) {
        this.f11579b = za;
        this.f11578a = j;
    }

    public final void run() {
        this.f11579b.mo10455q().f11487u.mo10764a(this.f11578a);
        this.f11579b.mo10385b().mo10579E().mo10593a("Session timeout duration set", Long.valueOf(this.f11578a));
    }
}
