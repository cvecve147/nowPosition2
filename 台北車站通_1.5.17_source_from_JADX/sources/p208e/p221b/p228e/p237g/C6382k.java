package p208e.p221b.p228e.p237g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.g.k */
public final class C6382k {

    /* renamed from: a */
    public static final boolean f17710a;

    /* renamed from: b */
    public static final int f17711b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f17712c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f17713d = new ConcurrentHashMap();

    /* renamed from: e.b.e.g.k$a */
    static final class C6383a implements Runnable {
        C6383a() {
        }

        public void run() {
            try {
                Iterator it = new ArrayList(C6382k.f17713d.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        C6382k.f17713d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
            } catch (Throwable th) {
                C6416a.m23988b(th);
            }
        }
    }

    static {
        boolean z;
        Properties properties = System.getProperties();
        int i = 1;
        if (properties.containsKey("rx2.purge-enabled")) {
            z = Boolean.getBoolean("rx2.purge-enabled");
            if (z && properties.containsKey("rx2.purge-period-seconds")) {
                i = Integer.getInteger("rx2.purge-period-seconds", 1).intValue();
            }
        } else {
            z = true;
        }
        f17710a = z;
        f17711b = i;
        m23884a();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m23883a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            f17713d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }

    /* renamed from: a */
    public static void m23884a() {
        while (true) {
            ScheduledExecutorService scheduledExecutorService = f17712c.get();
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C6377g("RxSchedulerPurge"));
                if (f17712c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                    C6383a aVar = new C6383a();
                    int i = f17711b;
                    newScheduledThreadPool.scheduleAtFixedRate(aVar, (long) i, (long) i, TimeUnit.SECONDS);
                    return;
                }
                newScheduledThreadPool.shutdownNow();
            } else {
                return;
            }
        }
    }
}
