package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement._a */
final class C3817_a implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11367a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11368b;

    C3817_a(C3814Za za, AtomicReference atomicReference) {
        this.f11368b = za;
        this.f11367a = atomicReference;
    }

    public final void run() {
        synchronized (this.f11367a) {
            try {
                this.f11367a.set(Boolean.valueOf(this.f11368b.mo10456r().mo11015y()));
                this.f11367a.notify();
            } catch (Throwable th) {
                this.f11367a.notify();
                throw th;
            }
        }
    }
}
