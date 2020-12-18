package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tq */
final class C3501tq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2216Bw f10270a;

    /* renamed from: b */
    private final /* synthetic */ C2731Tp f10271b;

    C3501tq(C2731Tp tp, C2216Bw bw) {
        this.f10271b = tp;
        this.f10270a = bw;
    }

    public final void run() {
        try {
            this.f10271b.f8353c.put(this.f10270a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
