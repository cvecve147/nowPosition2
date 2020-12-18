package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ee */
public final class C3057ee {

    /* renamed from: a */
    public static final C2944ag f9097a = C2972bg.m11985a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), m12271a("Default")));

    /* renamed from: b */
    private static final C2944ag f9098b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m12271a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f9098b = C2972bg.m11985a(threadPoolExecutor);
    }

    /* renamed from: a */
    public static C2804Wf<?> m12269a(Runnable runnable) {
        return f9097a.mo8076a(runnable);
    }

    /* renamed from: a */
    public static <T> C2804Wf<T> m12270a(Callable<T> callable) {
        return f9097a.mo8077a(callable);
    }

    /* renamed from: a */
    private static ThreadFactory m12271a(String str) {
        return new C3085fe(str);
    }

    /* renamed from: b */
    public static C2804Wf<?> m12272b(Runnable runnable) {
        return f9098b.mo8076a(runnable);
    }
}
