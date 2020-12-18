package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ki */
final class C3236ki implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f9689a;

    /* renamed from: b */
    private final /* synthetic */ C3345od f9690b;

    /* renamed from: c */
    private final /* synthetic */ int f9691c;

    /* renamed from: d */
    private final /* synthetic */ C3174ii f9692d;

    C3236ki(C3174ii iiVar, View view, C3345od odVar, int i) {
        this.f9692d = iiVar;
        this.f9689a = view;
        this.f9690b = odVar;
        this.f9691c = i;
    }

    public final void run() {
        this.f9692d.m12587a(this.f9689a, this.f9690b, this.f9691c - 1);
    }
}
