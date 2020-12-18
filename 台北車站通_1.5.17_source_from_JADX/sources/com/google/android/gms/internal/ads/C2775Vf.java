package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Vf */
final class C2775Vf<T> implements C2804Wf<T> {

    /* renamed from: a */
    private final T f8436a;

    /* renamed from: b */
    private final C2859Yf f8437b = new C2859Yf();

    C2775Vf(T t) {
        this.f8436a = t;
        this.f8437b.mo9066a();
    }

    /* renamed from: a */
    public final void mo8923a(Runnable runnable, Executor executor) {
        this.f8437b.mo9067a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.f8436a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f8436a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
