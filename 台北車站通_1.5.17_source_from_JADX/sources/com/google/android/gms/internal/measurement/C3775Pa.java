package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.Pa */
final class C3775Pa implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ zzeu f11264a;

    /* renamed from: b */
    private final /* synthetic */ String f11265b;

    /* renamed from: c */
    private final /* synthetic */ C3723Ca f11266c;

    C3775Pa(C3723Ca ca, zzeu zzeu, String str) {
        this.f11266c = ca;
        this.f11264a = zzeu;
        this.f11265b = str;
    }

    public final /* synthetic */ Object call() {
        this.f11266c.f11025a.mo10716p();
        this.f11266c.f11025a.mo10704a(this.f11264a, this.f11265b);
        throw null;
    }
}
