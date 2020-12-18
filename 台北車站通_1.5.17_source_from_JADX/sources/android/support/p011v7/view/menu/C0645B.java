package android.support.p011v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.B */
class C0645B implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0646C f2401a;

    C0645B(C0646C c) {
        this.f2401a = c;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.f2401a.f2416p != null) {
            if (!this.f2401a.f2416p.isAlive()) {
                ViewTreeObserver unused = this.f2401a.f2416p = view.getViewTreeObserver();
            }
            this.f2401a.f2416p.removeGlobalOnLayoutListener(this.f2401a.f2410j);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
