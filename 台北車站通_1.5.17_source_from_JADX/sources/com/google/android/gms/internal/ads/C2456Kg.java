package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kg */
final class C2456Kg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f7443a;

    /* renamed from: b */
    private final /* synthetic */ C2342Gg f7444b;

    C2456Kg(C2342Gg gg, boolean z) {
        this.f7444b = gg;
        this.f7443a = z;
    }

    public final void run() {
        this.f7444b.m9862a("windowVisibilityChanged", "isVisible", String.valueOf(this.f7443a));
    }
}
