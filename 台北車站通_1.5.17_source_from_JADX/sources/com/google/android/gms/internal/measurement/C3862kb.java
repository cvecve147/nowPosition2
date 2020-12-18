package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.kb */
final class C3862kb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11523a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11524b;

    C3862kb(C3814Za za, AtomicReference atomicReference) {
        this.f11524b = za;
        this.f11523a = atomicReference;
    }

    public final void run() {
        synchronized (this.f11523a) {
            try {
                AtomicReference atomicReference = this.f11523a;
                C3908w r = this.f11524b.mo10456r();
                atomicReference.set(Long.valueOf(r.mo10998a(r.mo10568i().mo10520z(), C3758L.f11182P)));
                this.f11523a.notify();
            } catch (Throwable th) {
                this.f11523a.notify();
                throw th;
            }
        }
    }
}
