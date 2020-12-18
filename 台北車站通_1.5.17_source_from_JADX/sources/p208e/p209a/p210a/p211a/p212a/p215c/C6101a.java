package p208e.p209a.p210a.p211a.p212a.p215c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.a.a.a.a.c.a */
class C6101a implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f17070a = new AtomicInteger(1);

    C6101a() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AsyncTask #" + this.f17070a.getAndIncrement());
    }
}
