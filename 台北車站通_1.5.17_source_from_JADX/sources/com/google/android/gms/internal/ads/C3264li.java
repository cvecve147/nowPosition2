package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.li */
final class C3264li implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C3345od f9746a;

    /* renamed from: b */
    private final /* synthetic */ C3174ii f9747b;

    C3264li(C3174ii iiVar, C3345od odVar) {
        this.f9747b = iiVar;
        this.f9746a = odVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f9747b.m12587a(view, this.f9746a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
