package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hy */
final /* synthetic */ class C2390Hy implements Runnable {

    /* renamed from: a */
    private final C3452ry f7220a;

    private C2390Hy(C3452ry ryVar) {
        this.f7220a = ryVar;
    }

    /* renamed from: a */
    static Runnable m10228a(C3452ry ryVar) {
        return new C2390Hy(ryVar);
    }

    public final void run() {
        this.f7220a.destroy();
    }
}
