package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.lb */
final class C3866lb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11532a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11533b;

    C3866lb(C3814Za za, AtomicReference atomicReference) {
        this.f11533b = za;
        this.f11532a = atomicReference;
    }

    public final void run() {
        synchronized (this.f11532a) {
            try {
                AtomicReference atomicReference = this.f11532a;
                C3908w r = this.f11533b.mo10456r();
                atomicReference.set(Integer.valueOf(r.mo11000b(r.mo10568i().mo10520z(), C3758L.f11183Q)));
                this.f11532a.notify();
            } catch (Throwable th) {
                this.f11532a.notify();
                throw th;
            }
        }
    }
}
