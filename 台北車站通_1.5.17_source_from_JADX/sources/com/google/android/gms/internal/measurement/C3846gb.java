package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.internal.measurement.gb */
final class C3846gb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AppMeasurement.ConditionalUserProperty f11463a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11464b;

    C3846gb(C3814Za za, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.f11464b = za;
        this.f11463a = conditionalUserProperty;
    }

    public final void run() {
        this.f11464b.m15226e(this.f11463a);
    }
}
