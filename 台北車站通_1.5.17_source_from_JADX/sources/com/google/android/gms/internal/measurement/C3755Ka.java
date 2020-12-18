package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.Ka */
final class C3755Ka implements Callable<List<zzed>> {

    /* renamed from: a */
    private final /* synthetic */ zzdz f11160a;

    /* renamed from: b */
    private final /* synthetic */ String f11161b;

    /* renamed from: c */
    private final /* synthetic */ String f11162c;

    /* renamed from: d */
    private final /* synthetic */ C3723Ca f11163d;

    C3755Ka(C3723Ca ca, zzdz zzdz, String str, String str2) {
        this.f11163d = ca;
        this.f11160a = zzdz;
        this.f11161b = str;
        this.f11162c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f11163d.f11025a.mo10716p();
        return this.f11163d.f11025a.mo10712l().mo11080b(this.f11160a.f11752a, this.f11161b, this.f11162c);
    }
}
