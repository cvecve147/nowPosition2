package com.google.android.gms.internal.measurement;

import android.content.Intent;

/* renamed from: com.google.android.gms.internal.measurement.Rb */
final /* synthetic */ class C3783Rb implements Runnable {

    /* renamed from: a */
    private final C3780Qb f11296a;

    /* renamed from: b */
    private final int f11297b;

    /* renamed from: c */
    private final C3801W f11298c;

    /* renamed from: d */
    private final Intent f11299d;

    C3783Rb(C3780Qb qb, int i, C3801W w, Intent intent) {
        this.f11296a = qb;
        this.f11297b = i;
        this.f11298c = w;
        this.f11299d = intent;
    }

    public final void run() {
        this.f11296a.mo10525a(this.f11297b, this.f11298c, this.f11299d);
    }
}
