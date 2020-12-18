package com.google.android.gms.common.util.p073a;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.a.d */
final class C2079d implements Runnable {

    /* renamed from: a */
    private final Runnable f6545a;

    /* renamed from: b */
    private final int f6546b;

    public C2079d(Runnable runnable, int i) {
        this.f6545a = runnable;
        this.f6546b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f6546b);
        this.f6545a.run();
    }
}
