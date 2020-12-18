package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.C1697X;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.cg */
final class C3001cg implements Executor {

    /* renamed from: a */
    private final Handler f8992a = new C2885Zd(Looper.getMainLooper());

    C3001cg() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C1697X.m7698e();
                C3114ge.m12411a(C1697X.m7702i().mo8314a(), th);
                throw th;
            }
        } else {
            this.f8992a.post(runnable);
        }
    }
}
