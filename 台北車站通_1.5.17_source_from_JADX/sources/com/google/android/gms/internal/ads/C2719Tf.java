package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.Tf */
final /* synthetic */ class C2719Tf implements Runnable {

    /* renamed from: a */
    private final C2804Wf f8336a;

    /* renamed from: b */
    private final Future f8337b;

    C2719Tf(C2804Wf wf, Future future) {
        this.f8336a = wf;
        this.f8337b = future;
    }

    public final void run() {
        C2804Wf wf = this.f8336a;
        Future future = this.f8337b;
        if (wf.isCancelled()) {
            future.cancel(true);
        }
    }
}
