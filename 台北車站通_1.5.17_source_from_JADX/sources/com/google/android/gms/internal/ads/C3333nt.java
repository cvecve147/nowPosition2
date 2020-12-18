package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nt */
final class C3333nt implements Runnable {

    /* renamed from: a */
    private final C2216Bw f9914a;

    /* renamed from: b */
    private final C3652yz f9915b;

    /* renamed from: c */
    private final Runnable f9916c;

    public C3333nt(C3474ss ssVar, C2216Bw bw, C3652yz yzVar, Runnable runnable) {
        this.f9914a = bw;
        this.f9915b = yzVar;
        this.f9916c = runnable;
    }

    public final void run() {
        this.f9914a.mo7911k();
        if (this.f9915b.f10634c == null) {
            this.f9914a.mo7905a(this.f9915b.f10632a);
        } else {
            this.f9914a.mo7902a(this.f9915b.f10634c);
        }
        if (this.f9915b.f10635d) {
            this.f9914a.mo7906a("intermediate-response");
        } else {
            this.f9914a.mo7908b("done");
        }
        Runnable runnable = this.f9916c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
