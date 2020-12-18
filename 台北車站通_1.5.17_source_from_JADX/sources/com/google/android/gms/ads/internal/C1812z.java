package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C2972bg;

/* renamed from: com.google.android.gms.ads.internal.z */
final /* synthetic */ class C1812z implements Runnable {

    /* renamed from: a */
    private final C1811y f5921a;

    /* renamed from: b */
    private final Runnable f5922b;

    C1812z(C1811y yVar, Runnable runnable) {
        this.f5921a = yVar;
        this.f5922b = runnable;
    }

    public final void run() {
        C2972bg.f8938a.execute(new C1676B(this.f5921a, this.f5922b));
    }
}
