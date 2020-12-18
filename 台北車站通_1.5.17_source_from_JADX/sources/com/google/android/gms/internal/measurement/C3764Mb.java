package com.google.android.gms.internal.measurement;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.internal.measurement.Mb */
final class C3764Mb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f11243a;

    /* renamed from: b */
    private final /* synthetic */ C3756Kb f11244b;

    C3764Mb(C3756Kb kb, ComponentName componentName) {
        this.f11244b = kb;
        this.f11243a = componentName;
    }

    public final void run() {
        this.f11244b.f11166c.m15826a(this.f11243a);
    }
}
