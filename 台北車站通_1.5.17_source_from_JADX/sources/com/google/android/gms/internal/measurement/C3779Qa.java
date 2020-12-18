package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Qa */
final class C3779Qa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzjx f11277a;

    /* renamed from: b */
    private final /* synthetic */ zzdz f11278b;

    /* renamed from: c */
    private final /* synthetic */ C3723Ca f11279c;

    C3779Qa(C3723Ca ca, zzjx zzjx, zzdz zzdz) {
        this.f11279c = ca;
        this.f11277a = zzjx;
        this.f11278b = zzdz;
    }

    public final void run() {
        this.f11279c.f11025a.mo10716p();
        this.f11279c.f11025a.mo10708b(this.f11277a, this.f11278b);
    }
}
