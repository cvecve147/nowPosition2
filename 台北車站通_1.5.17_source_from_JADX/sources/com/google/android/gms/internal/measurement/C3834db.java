package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.db */
final class C3834db implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11412a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11413b;

    C3834db(C3814Za za, AtomicReference atomicReference) {
        this.f11413b = za;
        this.f11412a = atomicReference;
    }

    public final void run() {
        this.f11413b.mo10569k().mo11035a((AtomicReference<String>) this.f11412a);
    }
}
