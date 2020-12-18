package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p */
final class C3880p implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11574a;

    /* renamed from: b */
    private final /* synthetic */ long f11575b;

    /* renamed from: c */
    private final /* synthetic */ C3872n f11576c;

    C3880p(C3872n nVar, String str, long j) {
        this.f11576c = nVar;
        this.f11574a = str;
        this.f11575b = j;
    }

    public final void run() {
        this.f11576c.m15584b(this.f11574a, this.f11575b);
    }
}
