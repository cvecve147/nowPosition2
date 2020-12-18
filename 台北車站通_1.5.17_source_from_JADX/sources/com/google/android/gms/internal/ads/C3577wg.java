package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wg */
final class C3577wg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f10435a;

    /* renamed from: b */
    private final /* synthetic */ String f10436b;

    /* renamed from: c */
    private final /* synthetic */ C3462sg f10437c;

    C3577wg(C3462sg sgVar, String str, String str2) {
        this.f10437c = sgVar;
        this.f10435a = str;
        this.f10436b = str2;
    }

    public final void run() {
        if (this.f10437c.f10199r != null) {
            this.f10437c.f10199r.mo7983a(this.f10435a, this.f10436b);
        }
    }
}
