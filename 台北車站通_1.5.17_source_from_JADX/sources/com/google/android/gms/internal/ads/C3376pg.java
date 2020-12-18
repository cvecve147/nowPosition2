package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C1697X;
import java.lang.ref.WeakReference;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.pg */
final class C3376pg extends C3433rg implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f9996b;

    public C3376pg(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f9996b = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9876a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9877b(ViewTreeObserver viewTreeObserver) {
        C1697X.m7700g().mo9720a(viewTreeObserver, (ViewTreeObserver.OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f9996b.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            mo9969b();
        }
    }
}
