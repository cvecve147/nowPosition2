package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.zh */
final class C3663zh implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C3345od f10649a;

    /* renamed from: b */
    private final /* synthetic */ C3550vh f10650b;

    C3663zh(C3550vh vhVar, C3345od odVar) {
        this.f10650b = vhVar;
        this.f10649a = odVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f10650b.m14239a(view, this.f10649a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
