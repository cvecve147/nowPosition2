package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.La */
final class C3759La implements Callable<List<zzed>> {

    /* renamed from: a */
    private final /* synthetic */ String f11220a;

    /* renamed from: b */
    private final /* synthetic */ String f11221b;

    /* renamed from: c */
    private final /* synthetic */ String f11222c;

    /* renamed from: d */
    private final /* synthetic */ C3723Ca f11223d;

    C3759La(C3723Ca ca, String str, String str2, String str3) {
        this.f11223d = ca;
        this.f11220a = str;
        this.f11221b = str2;
        this.f11222c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f11223d.f11025a.mo10716p();
        return this.f11223d.f11025a.mo10712l().mo11080b(this.f11220a, this.f11221b, this.f11222c);
    }
}
