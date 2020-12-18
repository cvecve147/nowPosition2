package com.google.android.gms.internal.ads;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Wg */
final class C2805Wg implements Runnable {

    /* renamed from: a */
    private C2342Gg f8530a;

    /* renamed from: b */
    private boolean f8531b = false;

    C2805Wg(C2342Gg gg) {
        this.f8530a = gg;
    }

    /* renamed from: c */
    private final void m11497c() {
        C3114ge.f9351a.removeCallbacks(this);
        C3114ge.f9351a.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo8994a() {
        this.f8531b = true;
    }

    /* renamed from: b */
    public final void mo8995b() {
        this.f8531b = false;
        m11497c();
    }

    public final void run() {
        if (!this.f8531b) {
            this.f8530a.mo8131o();
            m11497c();
        }
    }
}
