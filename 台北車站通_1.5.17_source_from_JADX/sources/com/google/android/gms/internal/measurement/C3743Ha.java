package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Ha */
final class C3743Ha implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzed f11132a;

    /* renamed from: b */
    private final /* synthetic */ C3723Ca f11133b;

    C3743Ha(C3723Ca ca, zzed zzed) {
        this.f11133b = ca;
        this.f11132a = zzed;
    }

    public final void run() {
        this.f11133b.f11025a.mo10716p();
        C3839ec a = this.f11133b.f11025a;
        zzed zzed = this.f11132a;
        zzdz a2 = a.mo10692a(zzed.f11769a);
        if (a2 != null) {
            a.mo10698a(zzed, a2);
        }
    }
}
