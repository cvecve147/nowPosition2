package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Tb */
final class C3791Tb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3839ec f11313a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f11314b;

    C3791Tb(C3780Qb qb, C3839ec ecVar, Runnable runnable) {
        this.f11313a = ecVar;
        this.f11314b = runnable;
    }

    public final void run() {
        this.f11313a.mo10716p();
        this.f11313a.mo10701a(this.f11314b);
        this.f11313a.mo10715o();
    }
}
