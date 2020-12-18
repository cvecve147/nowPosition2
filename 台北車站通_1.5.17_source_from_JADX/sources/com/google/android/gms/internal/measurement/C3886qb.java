package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.qb */
final class C3886qb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11587a;

    /* renamed from: b */
    private final /* synthetic */ String f11588b;

    /* renamed from: c */
    private final /* synthetic */ long f11589c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f11590d;

    /* renamed from: e */
    private final /* synthetic */ boolean f11591e;

    /* renamed from: f */
    private final /* synthetic */ boolean f11592f;

    /* renamed from: g */
    private final /* synthetic */ boolean f11593g;

    /* renamed from: h */
    private final /* synthetic */ String f11594h;

    /* renamed from: i */
    private final /* synthetic */ C3814Za f11595i;

    C3886qb(C3814Za za, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f11595i = za;
        this.f11587a = str;
        this.f11588b = str2;
        this.f11589c = j;
        this.f11590d = bundle;
        this.f11591e = z;
        this.f11592f = z2;
        this.f11593g = z3;
        this.f11594h = str3;
    }

    public final void run() {
        this.f11595i.m15221b(this.f11587a, this.f11588b, this.f11589c, this.f11590d, this.f11591e, this.f11592f, this.f11593g, this.f11594h);
    }
}
