package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dr */
final class C2268Dr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2240Cr f6913a;

    C2268Dr(C2240Cr cr) {
        this.f6913a = cr;
    }

    public final void run() {
        synchronized (this.f6913a.f6823c) {
            if (!this.f6913a.f6824d || !this.f6913a.f6825e) {
                C2227Cf.m9532b("App is still foreground");
            } else {
                boolean unused = this.f6913a.f6824d = false;
                C2227Cf.m9532b("App went background");
                for (C2297Er a : this.f6913a.f6826f) {
                    try {
                        a.mo8053a(false);
                    } catch (Exception e) {
                        C2227Cf.m9533b("", e);
                    }
                }
            }
        }
    }
}
