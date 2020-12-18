package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.Ia */
final class C3747Ia implements Callable<List<C3867lc>> {

    /* renamed from: a */
    private final /* synthetic */ zzdz f11144a;

    /* renamed from: b */
    private final /* synthetic */ String f11145b;

    /* renamed from: c */
    private final /* synthetic */ String f11146c;

    /* renamed from: d */
    private final /* synthetic */ C3723Ca f11147d;

    C3747Ia(C3723Ca ca, zzdz zzdz, String str, String str2) {
        this.f11147d = ca;
        this.f11144a = zzdz;
        this.f11145b = str;
        this.f11146c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f11147d.f11025a.mo10716p();
        return this.f11147d.f11025a.mo10712l().mo11067a(this.f11144a.f11752a, this.f11145b, this.f11146c);
    }
}
