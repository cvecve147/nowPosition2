package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xa */
final class C2826Xa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3172ig f8599a;

    /* renamed from: b */
    private final /* synthetic */ C2565Oa f8600b;

    C2826Xa(C2565Oa oa, C3172ig igVar) {
        this.f8600b = oa;
        this.f8599a = igVar;
    }

    public final void run() {
        synchronized (this.f8600b.f8019f) {
            this.f8600b.f8025l = this.f8600b.mo8602a(this.f8600b.f8018e.f9582j, (C3172ig<zzaef>) this.f8599a);
            if (this.f8600b.f8025l == null) {
                this.f8600b.m10783a(0, "Could not start the ad request service.");
                C3114ge.f9351a.removeCallbacks(this.f8600b.f8024k);
            }
        }
    }
}
