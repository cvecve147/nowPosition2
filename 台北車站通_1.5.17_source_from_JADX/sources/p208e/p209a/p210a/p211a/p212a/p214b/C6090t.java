package p208e.p209a.p210a.p211a.p212a.p214b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: e.a.a.a.a.b.t */
public final class C6090t {
    /* renamed from: a */
    public static ExecutorService m23075a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(m23079c(str));
        m23076a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: a */
    private static final void m23076a(String str, ExecutorService executorService) {
        m23077a(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public static final void m23077a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C6089s sVar = new C6089s(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(sVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: b */
    public static ScheduledExecutorService m23078b(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(m23079c(str));
        m23076a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: c */
    public static final ThreadFactory m23079c(String str) {
        return new C6088r(str, new AtomicLong(1));
    }
}
