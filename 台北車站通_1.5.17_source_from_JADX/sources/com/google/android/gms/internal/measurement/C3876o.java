package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o */
final class C3876o implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11568a;

    /* renamed from: b */
    private final /* synthetic */ long f11569b;

    /* renamed from: c */
    private final /* synthetic */ C3872n f11570c;

    C3876o(C3872n nVar, String str, long j) {
        this.f11570c = nVar;
        this.f11568a = str;
        this.f11569b = j;
    }

    public final void run() {
        this.f11570c.m15580a(this.f11568a, this.f11569b);
    }
}
