package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.Qf */
final /* synthetic */ class C2633Qf implements Runnable {

    /* renamed from: a */
    private final Future f8140a;

    C2633Qf(Future future) {
        this.f8140a = future;
    }

    public final void run() {
        Future future = this.f8140a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
