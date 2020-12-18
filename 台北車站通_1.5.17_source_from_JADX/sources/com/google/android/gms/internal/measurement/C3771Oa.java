package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Oa */
final class C3771Oa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzeu f11259a;

    /* renamed from: b */
    private final /* synthetic */ String f11260b;

    /* renamed from: c */
    private final /* synthetic */ C3723Ca f11261c;

    C3771Oa(C3723Ca ca, zzeu zzeu, String str) {
        this.f11261c = ca;
        this.f11259a = zzeu;
        this.f11260b = str;
    }

    public final void run() {
        this.f11261c.f11025a.mo10716p();
        this.f11261c.f11025a.mo10707b(this.f11259a, this.f11260b);
    }
}
