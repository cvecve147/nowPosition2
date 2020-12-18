package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ay */
final class C2190Ay implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f6711a;

    /* renamed from: b */
    private final /* synthetic */ C3509ty f6712b;

    C2190Ay(C3509ty tyVar, String str) {
        this.f6712b = tyVar;
        this.f6711a = str;
    }

    public final void run() {
        this.f6712b.f10288a.loadUrl(this.f6711a);
    }
}
