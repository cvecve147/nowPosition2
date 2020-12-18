package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.bb */
final class C3826bb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11398a;

    /* renamed from: b */
    private final /* synthetic */ boolean f11399b;

    /* renamed from: c */
    private final /* synthetic */ C3814Za f11400c;

    C3826bb(C3814Za za, AtomicReference atomicReference, boolean z) {
        this.f11400c = za;
        this.f11398a = atomicReference;
        this.f11399b = z;
    }

    public final void run() {
        this.f11400c.mo10569k().mo11038a((AtomicReference<List<zzjx>>) this.f11398a, this.f11399b);
    }
}
