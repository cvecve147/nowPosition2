package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@C2478La
/* renamed from: com.google.android.gms.internal.ads._f */
final class C2913_f<V> extends FutureTask<V> implements C2804Wf<V> {

    /* renamed from: a */
    private final C2859Yf f8779a = new C2859Yf();

    C2913_f(Runnable runnable, V v) {
        super(runnable, v);
    }

    C2913_f(Callable<V> callable) {
        super(callable);
    }

    /* renamed from: a */
    public final void mo8923a(Runnable runnable, Executor executor) {
        this.f8779a.mo9067a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f8779a.mo9066a();
    }
}
