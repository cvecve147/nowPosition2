package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.Pb */
final class C2598Pb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Future f8090a;

    C2598Pb(C2509Mb mb, Future future) {
        this.f8090a = future;
    }

    public final void run() {
        if (!this.f8090a.isDone()) {
            this.f8090a.cancel(true);
        }
    }
}
