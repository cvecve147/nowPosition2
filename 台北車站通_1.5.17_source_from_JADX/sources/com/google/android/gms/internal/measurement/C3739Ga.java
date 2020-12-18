package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Ga */
final class C3739Ga implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzed f11115a;

    /* renamed from: b */
    private final /* synthetic */ C3723Ca f11116b;

    C3739Ga(C3723Ca ca, zzed zzed) {
        this.f11116b = ca;
        this.f11115a = zzed;
    }

    public final void run() {
        this.f11116b.f11025a.mo10716p();
        C3839ec a = this.f11116b.f11025a;
        zzed zzed = this.f11115a;
        zzdz a2 = a.mo10692a(zzed.f11769a);
        if (a2 != null) {
            a.mo10706b(zzed, a2);
        }
    }
}
