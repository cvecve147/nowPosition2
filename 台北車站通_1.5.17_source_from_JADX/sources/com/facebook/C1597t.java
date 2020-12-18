package com.facebook;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.t */
class C1597t implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f5389a = new AtomicInteger(0);

    C1597t() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "FacebookSdk #" + this.f5389a.incrementAndGet());
    }
}
