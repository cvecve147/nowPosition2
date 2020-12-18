package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wa */
final class C2799Wa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2565Oa f8482a;

    C2799Wa(C2565Oa oa) {
        this.f8482a = oa;
    }

    public final void run() {
        synchronized (this.f8482a.f8019f) {
            if (this.f8482a.f8025l != null) {
                this.f8482a.mo7015c();
                this.f8482a.m10783a(2, "Timed out waiting for ad response.");
            }
        }
    }
}
