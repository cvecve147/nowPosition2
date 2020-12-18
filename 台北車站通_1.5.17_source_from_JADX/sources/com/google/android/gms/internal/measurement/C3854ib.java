package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.ib */
final class C3854ib implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11499a;

    /* renamed from: b */
    private final /* synthetic */ String f11500b;

    /* renamed from: c */
    private final /* synthetic */ String f11501c;

    /* renamed from: d */
    private final /* synthetic */ String f11502d;

    /* renamed from: e */
    private final /* synthetic */ boolean f11503e;

    /* renamed from: f */
    private final /* synthetic */ C3814Za f11504f;

    C3854ib(C3814Za za, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f11504f = za;
        this.f11499a = atomicReference;
        this.f11500b = str;
        this.f11501c = str2;
        this.f11502d = str3;
        this.f11503e = z;
    }

    public final void run() {
        this.f11504f.f11325a.mo10399x().mo11037a(this.f11499a, this.f11500b, this.f11501c, this.f11502d, this.f11503e);
    }
}
