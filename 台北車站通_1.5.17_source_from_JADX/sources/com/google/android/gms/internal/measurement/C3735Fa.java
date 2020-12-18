package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Fa */
final class C3735Fa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzed f11098a;

    /* renamed from: b */
    private final /* synthetic */ zzdz f11099b;

    /* renamed from: c */
    private final /* synthetic */ C3723Ca f11100c;

    C3735Fa(C3723Ca ca, zzed zzed, zzdz zzdz) {
        this.f11100c = ca;
        this.f11098a = zzed;
        this.f11099b = zzdz;
    }

    public final void run() {
        this.f11100c.f11025a.mo10716p();
        this.f11100c.f11025a.mo10698a(this.f11098a, this.f11099b);
    }
}
