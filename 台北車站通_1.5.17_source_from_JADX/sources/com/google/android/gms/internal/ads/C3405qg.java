package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.qg */
final class C3405qg extends C3433rg implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b */
    private final WeakReference<ViewTreeObserver.OnScrollChangedListener> f10077b;

    public C3405qg(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f10077b = new WeakReference<>(onScrollChangedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9876a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9877b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f10077b.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            mo9969b();
        }
    }
}
