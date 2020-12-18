package android.support.p011v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.A */
class C0642A implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0646C f2388a;

    C0642A(C0646C c) {
        this.f2388a = c;
    }

    public void onGlobalLayout() {
        if (this.f2388a.mo2706w() && !this.f2388a.f2409i.mo4761h()) {
            View view = this.f2388a.f2414n;
            if (view == null || !view.isShown()) {
                this.f2388a.dismiss();
            } else {
                this.f2388a.f2409i.mo2705v();
            }
        }
    }
}
