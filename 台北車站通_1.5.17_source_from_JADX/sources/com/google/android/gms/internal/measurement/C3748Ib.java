package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Ib */
final class C3748Ib implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f11148a;

    /* renamed from: b */
    private final /* synthetic */ zzjx f11149b;

    /* renamed from: c */
    private final /* synthetic */ zzdz f11150c;

    /* renamed from: d */
    private final /* synthetic */ C3910wb f11151d;

    C3748Ib(C3910wb wbVar, boolean z, zzjx zzjx, zzdz zzdz) {
        this.f11151d = wbVar;
        this.f11148a = z;
        this.f11149b = zzjx;
        this.f11150c = zzdz;
    }

    public final void run() {
        C3766N d = this.f11151d.f11702d;
        if (d == null) {
            this.f11151d.mo10385b().mo10585y().mo10592a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f11151d.mo11030a(d, this.f11148a ? null : this.f11149b, this.f11150c);
        this.f11151d.m15820F();
    }
}
