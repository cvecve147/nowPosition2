package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ly */
final /* synthetic */ class C2504Ly implements Runnable {

    /* renamed from: a */
    private final C3452ry f7547a;

    private C2504Ly(C3452ry ryVar) {
        this.f7547a = ryVar;
    }

    /* renamed from: a */
    static Runnable m10569a(C3452ry ryVar) {
        return new C2504Ly(ryVar);
    }

    public final void run() {
        this.f7547a.destroy();
    }
}
