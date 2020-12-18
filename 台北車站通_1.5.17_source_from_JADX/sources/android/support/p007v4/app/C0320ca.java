package android.support.p007v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v4.app.ca */
class C0320ca implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f1342a;

    /* renamed from: b */
    private ViewTreeObserver f1343b;

    /* renamed from: c */
    private final Runnable f1344c;

    private C0320ca(View view, Runnable runnable) {
        this.f1342a = view;
        this.f1343b = view.getViewTreeObserver();
        this.f1344c = runnable;
    }

    /* renamed from: a */
    public static C0320ca m1419a(View view, Runnable runnable) {
        C0320ca caVar = new C0320ca(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(caVar);
        view.addOnAttachStateChangeListener(caVar);
        return caVar;
    }

    /* renamed from: a */
    public void mo1250a() {
        (this.f1343b.isAlive() ? this.f1343b : this.f1342a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1342a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo1250a();
        this.f1344c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f1343b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo1250a();
    }
}
