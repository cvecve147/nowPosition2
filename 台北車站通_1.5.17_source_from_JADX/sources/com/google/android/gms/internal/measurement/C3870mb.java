package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.mb */
final class C3870mb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11552a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11553b;

    C3870mb(C3814Za za, AtomicReference atomicReference) {
        this.f11553b = za;
        this.f11552a = atomicReference;
    }

    public final void run() {
        synchronized (this.f11552a) {
            try {
                AtomicReference atomicReference = this.f11552a;
                C3908w r = this.f11553b.mo10456r();
                atomicReference.set(Double.valueOf(r.mo11002c(r.mo10568i().mo10520z(), C3758L.f11184R)));
                this.f11552a.notify();
            } catch (Throwable th) {
                this.f11552a.notify();
                throw th;
            }
        }
    }
}
