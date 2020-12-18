package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.xh */
final class C3606xh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f10509a;

    /* renamed from: b */
    private final /* synthetic */ C3345od f10510b;

    /* renamed from: c */
    private final /* synthetic */ int f10511c;

    /* renamed from: d */
    private final /* synthetic */ C3550vh f10512d;

    C3606xh(C3550vh vhVar, View view, C3345od odVar, int i) {
        this.f10512d = vhVar;
        this.f10509a = view;
        this.f10510b = odVar;
        this.f10511c = i;
    }

    public final void run() {
        this.f10512d.m14239a(this.f10509a, this.f10510b, this.f10511c - 1);
    }
}
