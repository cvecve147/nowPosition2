package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.wd */
final class C3574wd implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f10430a = new AtomicInteger(1);

    C3574wd(C3487td tdVar) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f10430a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
