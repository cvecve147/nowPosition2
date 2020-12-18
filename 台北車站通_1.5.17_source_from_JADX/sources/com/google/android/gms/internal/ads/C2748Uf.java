package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Uf */
final class C2748Uf<T> implements C2804Wf<T> {

    /* renamed from: a */
    private final Throwable f8385a;

    /* renamed from: b */
    private final C2859Yf f8386b = new C2859Yf();

    C2748Uf(Throwable th) {
        this.f8385a = th;
        this.f8386b.mo9066a();
    }

    /* renamed from: a */
    public final void mo8923a(Runnable runnable, Executor executor) {
        this.f8386b.mo9067a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        throw new ExecutionException(this.f8385a);
    }

    public final T get(long j, TimeUnit timeUnit) {
        throw new ExecutionException(this.f8385a);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
