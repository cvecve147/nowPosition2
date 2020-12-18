package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fb */
final class C2309Fb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2166Ab f6977a;

    C2309Fb(C2166Ab ab) {
        this.f6977a = ab;
    }

    public final void run() {
        if (this.f6977a.f6670o != null) {
            this.f6977a.f6670o.mo8770c();
            C2653Qy unused = this.f6977a.f6670o = null;
        }
    }
}
