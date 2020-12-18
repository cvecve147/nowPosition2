package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Zf */
final /* synthetic */ class C2887Zf implements Runnable {

    /* renamed from: a */
    private final Executor f8685a;

    /* renamed from: b */
    private final Runnable f8686b;

    C2887Zf(Executor executor, Runnable runnable) {
        this.f8685a = executor;
        this.f8686b = runnable;
    }

    public final void run() {
        this.f8685a.execute(this.f8686b);
    }
}
