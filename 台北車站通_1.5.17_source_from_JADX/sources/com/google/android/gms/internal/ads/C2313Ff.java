package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ff */
public abstract class C2313Ff extends AbstractExecutorService implements C2944ag {
    /* renamed from: a */
    public final C2804Wf<?> submit(Runnable runnable) {
        return (C2804Wf) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> C2804Wf<T> submit(Callable<T> callable) {
        return (C2804Wf) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C2913_f(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C2913_f(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (C2804Wf) super.submit(runnable, obj);
    }
}
