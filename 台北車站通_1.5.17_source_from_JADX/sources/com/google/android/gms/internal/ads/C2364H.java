package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.H */
final class C2364H implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2334G f7115a;

    C2364H(C2334G g) {
        this.f7115a = g;
    }

    public final void run() {
        if (this.f7115a.f7039h.get()) {
            C2227Cf.m9529a("Timed out waiting for WebView to finish loading.");
            this.f7115a.cancel();
        }
    }
}
