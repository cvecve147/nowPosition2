package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.hc */
final class C3851hc implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzdz f11497a;

    /* renamed from: b */
    private final /* synthetic */ C3839ec f11498b;

    C3851hc(C3839ec ecVar, zzdz zzdz) {
        this.f11498b = ecVar;
        this.f11497a = zzdz;
    }

    public final /* synthetic */ Object call() {
        C3888r a = this.f11498b.mo10394j().mo11010i(this.f11497a.f11752a) ? this.f11498b.m15394e(this.f11497a) : this.f11498b.mo10712l().mo11079b(this.f11497a.f11752a);
        if (a != null) {
            return a.mo10897a();
        }
        this.f11498b.mo10385b().mo10576B().mo10592a("App info was null when attempting to get app instance id");
        return null;
    }
}
