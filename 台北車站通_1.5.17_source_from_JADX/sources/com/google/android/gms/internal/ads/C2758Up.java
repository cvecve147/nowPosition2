package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.Up */
final class C2758Up implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f8401a = Executors.defaultThreadFactory();

    C2758Up() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8401a.newThread(runnable);
        newThread.setName(String.valueOf(newThread.getName()).concat(":"));
        return newThread;
    }
}
