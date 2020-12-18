package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.jb */
final class C3858jb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11516a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11517b;

    C3858jb(C3814Za za, AtomicReference atomicReference) {
        this.f11517b = za;
        this.f11516a = atomicReference;
    }

    public final void run() {
        synchronized (this.f11516a) {
            try {
                this.f11516a.set(this.f11517b.mo10456r().mo11016z());
                this.f11516a.notify();
            } catch (Throwable th) {
                this.f11516a.notify();
                throw th;
            }
        }
    }
}
