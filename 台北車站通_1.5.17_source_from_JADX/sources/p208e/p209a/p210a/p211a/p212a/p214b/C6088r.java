package p208e.p209a.p210a.p211a.p212a.p214b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: e.a.a.a.a.b.r */
class C6088r implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f17023a;

    /* renamed from: b */
    final /* synthetic */ AtomicLong f17024b;

    C6088r(String str, AtomicLong atomicLong) {
        this.f17023a = str;
        this.f17024b = atomicLong;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new C6087q(this, runnable));
        newThread.setName(this.f17023a + this.f17024b.getAndIncrement());
        return newThread;
    }
}
