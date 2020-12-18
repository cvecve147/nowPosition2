package android.support.p011v7.view.menu;

import android.support.p011v7.view.menu.C0657i;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.e */
class C0653e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0657i f2478a;

    C0653e(C0657i iVar) {
        this.f2478a = iVar;
    }

    public void onGlobalLayout() {
        if (this.f2478a.mo2706w() && this.f2478a.f2493i.size() > 0 && !this.f2478a.f2493i.get(0).f2511a.mo4761h()) {
            View view = this.f2478a.f2500p;
            if (view == null || !view.isShown()) {
                this.f2478a.dismiss();
                return;
            }
            for (C0657i.C0658a aVar : this.f2478a.f2493i) {
                aVar.f2511a.mo2705v();
            }
        }
    }
}
