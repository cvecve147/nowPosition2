package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.internal.measurement.fb */
final class C3842fb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AppMeasurement.ConditionalUserProperty f11454a;

    /* renamed from: b */
    private final /* synthetic */ C3814Za f11455b;

    C3842fb(C3814Za za, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.f11455b = za;
        this.f11454a = conditionalUserProperty;
    }

    public final void run() {
        this.f11455b.m15225d(this.f11454a);
    }
}
