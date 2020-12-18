package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.K */
final class C2448K implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2254Dd f7410a;

    /* renamed from: b */
    private final /* synthetic */ C2392I f7411b;

    C2448K(C2392I i, C2254Dd dd) {
        this.f7411b = i;
        this.f7410a = dd;
    }

    public final void run() {
        synchronized (this.f7411b.f7225f) {
            C2392I i = this.f7411b;
            i.f7223d.mo6859a(this.f7410a);
        }
    }
}
