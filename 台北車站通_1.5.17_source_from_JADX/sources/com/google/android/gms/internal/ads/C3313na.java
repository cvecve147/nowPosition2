package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.na */
final class C3313na implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f9852a;

    /* renamed from: b */
    private final /* synthetic */ C3138ha f9853b;

    C3313na(C3138ha haVar, WeakReference weakReference) {
        this.f9853b = haVar;
        this.f9852a = weakReference;
    }

    public final void onGlobalLayout() {
        this.f9853b.m12510a((WeakReference<C3520uh>) this.f9852a, false);
    }
}
