package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.Ja */
final class C3751Ja implements Callable<List<C3867lc>> {

    /* renamed from: a */
    private final /* synthetic */ String f11152a;

    /* renamed from: b */
    private final /* synthetic */ String f11153b;

    /* renamed from: c */
    private final /* synthetic */ String f11154c;

    /* renamed from: d */
    private final /* synthetic */ C3723Ca f11155d;

    C3751Ja(C3723Ca ca, String str, String str2, String str3) {
        this.f11155d = ca;
        this.f11152a = str;
        this.f11153b = str2;
        this.f11154c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f11155d.f11025a.mo10716p();
        return this.f11155d.f11025a.mo10712l().mo11067a(this.f11152a, this.f11153b, this.f11154c);
    }
}
