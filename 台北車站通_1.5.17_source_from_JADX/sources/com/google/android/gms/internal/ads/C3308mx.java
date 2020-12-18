package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.mx */
final /* synthetic */ class C3308mx implements Runnable {

    /* renamed from: a */
    private final C3116gg f9838a;

    /* renamed from: b */
    private final Future f9839b;

    C3308mx(C3116gg ggVar, Future future) {
        this.f9838a = ggVar;
        this.f9839b = future;
    }

    public final void run() {
        C3116gg ggVar = this.f9838a;
        Future future = this.f9839b;
        if (ggVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
