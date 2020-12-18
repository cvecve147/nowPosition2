package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ts */
final class C2734Ts implements Executor {

    /* renamed from: a */
    private final /* synthetic */ Handler f8363a;

    C2734Ts(C3474ss ssVar, Handler handler) {
        this.f8363a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f8363a.post(runnable);
    }
}
