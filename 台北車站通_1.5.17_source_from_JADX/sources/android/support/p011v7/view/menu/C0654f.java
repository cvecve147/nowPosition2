package android.support.p011v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.f */
class C0654f implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0657i f2479a;

    C0654f(C0657i iVar) {
        this.f2479a = iVar;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.f2479a.f2509y != null) {
            if (!this.f2479a.f2509y.isAlive()) {
                ViewTreeObserver unused = this.f2479a.f2509y = view.getViewTreeObserver();
            }
            this.f2479a.f2509y.removeGlobalOnLayoutListener(this.f2479a.f2494j);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
