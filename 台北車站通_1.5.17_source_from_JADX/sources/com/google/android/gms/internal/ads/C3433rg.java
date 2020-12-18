package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.rg */
abstract class C3433rg {

    /* renamed from: a */
    private final WeakReference<View> f10117a;

    public C3433rg(View view) {
        this.f10117a = new WeakReference<>(view);
    }

    /* renamed from: c */
    private final ViewTreeObserver m13621c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f10117a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: a */
    public final void mo9968a() {
        ViewTreeObserver c = m13621c();
        if (c != null) {
            mo9876a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9876a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    public final void mo9969b() {
        ViewTreeObserver c = m13621c();
        if (c != null) {
            mo9877b(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9877b(ViewTreeObserver viewTreeObserver);
}
