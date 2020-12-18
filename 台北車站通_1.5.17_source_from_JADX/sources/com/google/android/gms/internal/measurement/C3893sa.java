package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.sa */
final class C3893sa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3715Aa f11637a;

    /* renamed from: b */
    private final /* synthetic */ C3801W f11638b;

    C3893sa(C3889ra raVar, C3715Aa aa, C3801W w) {
        this.f11637a = aa;
        this.f11638b = w;
    }

    public final void run() {
        if (this.f11637a.mo10375C() == null) {
            this.f11638b.mo10585y().mo10592a("Install Referrer Reporter is null");
        } else {
            this.f11637a.mo10375C().mo10809a();
        }
    }
}
