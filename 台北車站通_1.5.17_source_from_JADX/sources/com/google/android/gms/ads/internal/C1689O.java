package com.google.android.gms.ads.internal;

import android.os.Handler;

/* renamed from: com.google.android.gms.ads.internal.O */
public final class C1689O {

    /* renamed from: a */
    private final Handler f5543a;

    public C1689O(Handler handler) {
        this.f5543a = handler;
    }

    /* renamed from: a */
    public final void mo6790a(Runnable runnable) {
        this.f5543a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public final boolean mo6791a(Runnable runnable, long j) {
        return this.f5543a.postDelayed(runnable, j);
    }
}
