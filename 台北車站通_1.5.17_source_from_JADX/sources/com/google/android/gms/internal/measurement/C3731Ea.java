package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Ea */
final class C3731Ea implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzed f11079a;

    /* renamed from: b */
    private final /* synthetic */ zzdz f11080b;

    /* renamed from: c */
    private final /* synthetic */ C3723Ca f11081c;

    C3731Ea(C3723Ca ca, zzed zzed, zzdz zzdz) {
        this.f11081c = ca;
        this.f11079a = zzed;
        this.f11080b = zzdz;
    }

    public final void run() {
        this.f11081c.f11025a.mo10716p();
        this.f11081c.f11025a.mo10706b(this.f11079a, this.f11080b);
    }
}
