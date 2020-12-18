package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.hb */
final class C3850hb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11492a;

    /* renamed from: b */
    private final /* synthetic */ String f11493b;

    /* renamed from: c */
    private final /* synthetic */ String f11494c;

    /* renamed from: d */
    private final /* synthetic */ String f11495d;

    /* renamed from: e */
    private final /* synthetic */ C3814Za f11496e;

    C3850hb(C3814Za za, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f11496e = za;
        this.f11492a = atomicReference;
        this.f11493b = str;
        this.f11494c = str2;
        this.f11495d = str3;
    }

    public final void run() {
        this.f11496e.f11325a.mo10399x().mo11036a(this.f11492a, this.f11493b, this.f11494c, this.f11495d);
    }
}
