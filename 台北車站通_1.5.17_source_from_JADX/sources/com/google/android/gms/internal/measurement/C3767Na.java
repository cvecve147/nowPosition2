package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Na */
final class C3767Na implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzeu f11245a;

    /* renamed from: b */
    private final /* synthetic */ zzdz f11246b;

    /* renamed from: c */
    private final /* synthetic */ C3723Ca f11247c;

    C3767Na(C3723Ca ca, zzeu zzeu, zzdz zzdz) {
        this.f11247c = ca;
        this.f11245a = zzeu;
        this.f11246b = zzdz;
    }

    public final void run() {
        this.f11247c.f11025a.mo10716p();
        this.f11247c.f11025a.mo10699a(this.f11245a, this.f11246b);
    }
}
