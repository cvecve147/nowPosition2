package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.E */
final class C3730E implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3806Xa f11077a;

    /* renamed from: b */
    private final /* synthetic */ C3726D f11078b;

    C3730E(C3726D d, C3806Xa xa) {
        this.f11078b = d;
        this.f11077a = xa;
    }

    public final void run() {
        this.f11077a.mo10386c();
        if (C3909wa.m15801y()) {
            this.f11077a.mo10386c().mo11020a((Runnable) this);
            return;
        }
        boolean c = this.f11078b.mo10440c();
        long unused = this.f11078b.f11070d = 0;
        if (c) {
            this.f11078b.mo10435b();
        }
    }
}
