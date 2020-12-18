package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Ra */
final class C3782Ra implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzjx f11293a;

    /* renamed from: b */
    private final /* synthetic */ zzdz f11294b;

    /* renamed from: c */
    private final /* synthetic */ C3723Ca f11295c;

    C3782Ra(C3723Ca ca, zzjx zzjx, zzdz zzdz) {
        this.f11295c = ca;
        this.f11293a = zzjx;
        this.f11294b = zzdz;
    }

    public final void run() {
        this.f11295c.f11025a.mo10716p();
        this.f11295c.f11025a.mo10700a(this.f11293a, this.f11294b);
    }
}
