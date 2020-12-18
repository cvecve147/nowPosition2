package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bb */
final class C2195Bb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2282Ed f6735a;

    /* renamed from: b */
    private final /* synthetic */ C2166Ab f6736b;

    C2195Bb(C2166Ab ab, C2282Ed ed) {
        this.f6736b = ab;
        this.f6735a = ed;
    }

    public final void run() {
        this.f6736b.f6666k.mo6860a(this.f6735a);
        if (this.f6736b.f6670o != null) {
            this.f6736b.f6670o.mo8770c();
            C2653Qy unused = this.f6736b.f6670o = null;
        }
    }
}
