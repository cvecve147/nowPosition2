package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.oa */
final class C3342oa implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f9942a;

    /* renamed from: b */
    private final /* synthetic */ C3138ha f9943b;

    C3342oa(C3138ha haVar, WeakReference weakReference) {
        this.f9943b = haVar;
        this.f9942a = weakReference;
    }

    public final void onScrollChanged() {
        this.f9943b.m12510a((WeakReference<C3520uh>) this.f9942a, true);
    }
}
