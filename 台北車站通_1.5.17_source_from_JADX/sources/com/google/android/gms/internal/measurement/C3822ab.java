package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ab */
final class C3822ab implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11389a;

    /* renamed from: b */
    private final /* synthetic */ String f11390b;

    /* renamed from: c */
    private final /* synthetic */ Object f11391c;

    /* renamed from: d */
    private final /* synthetic */ long f11392d;

    /* renamed from: e */
    private final /* synthetic */ C3814Za f11393e;

    C3822ab(C3814Za za, String str, String str2, Object obj, long j) {
        this.f11393e = za;
        this.f11389a = str;
        this.f11390b = str2;
        this.f11391c = obj;
        this.f11392d = j;
    }

    public final void run() {
        this.f11393e.m15217a(this.f11389a, this.f11390b, this.f11391c, this.f11392d);
    }
}
