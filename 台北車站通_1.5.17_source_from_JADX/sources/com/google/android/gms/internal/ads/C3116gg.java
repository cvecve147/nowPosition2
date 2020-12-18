package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.gg */
public class C3116gg<T> implements C2804Wf<T> {

    /* renamed from: a */
    private final Object f9362a = new Object();

    /* renamed from: b */
    private T f9363b;

    /* renamed from: c */
    private Throwable f9364c;

    /* renamed from: d */
    private boolean f9365d;

    /* renamed from: e */
    private boolean f9366e;

    /* renamed from: f */
    private final C2859Yf f9367f = new C2859Yf();

    /* renamed from: a */
    private final boolean mo9420a() {
        return this.f9364c != null || this.f9365d;
    }

    /* renamed from: a */
    public final void mo8923a(Runnable runnable, Executor executor) {
        this.f9367f.mo9067a(runnable, executor);
    }

    /* renamed from: a */
    public final void mo9463a(Throwable th) {
        synchronized (this.f9362a) {
            if (!this.f9366e) {
                if (mo9420a()) {
                    C1697X.m7702i().mo8322b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.f9364c = th;
                this.f9362a.notifyAll();
                this.f9367f.mo9066a();
            }
        }
    }

    /* renamed from: b */
    public final void mo9464b(T t) {
        synchronized (this.f9362a) {
            if (!this.f9366e) {
                if (mo9420a()) {
                    C1697X.m7702i().mo8322b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.f9365d = true;
                this.f9363b = t;
                this.f9362a.notifyAll();
                this.f9367f.mo9066a();
            }
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f9362a) {
            if (mo9420a()) {
                return false;
            }
            this.f9366e = true;
            this.f9365d = true;
            this.f9362a.notifyAll();
            this.f9367f.mo9066a();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.f9362a) {
            if (!mo9420a()) {
                try {
                    this.f9362a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f9364c != null) {
                throw new ExecutionException(this.f9364c);
            } else if (!this.f9366e) {
                t = this.f9363b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f9362a) {
            if (!mo9420a()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.f9362a.wait(millis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f9364c != null) {
                throw new ExecutionException(this.f9364c);
            } else if (!this.f9365d) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (!this.f9366e) {
                t = this.f9363b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f9362a) {
            z = this.f9366e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f9362a) {
            a = mo9420a();
        }
        return a;
    }
}
