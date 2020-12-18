package android.support.p011v7.app;

import android.support.p007v4.view.C0432J;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* renamed from: android.support.v7.app.L */
class C0602L extends C0432J {

    /* renamed from: a */
    final /* synthetic */ C0605O f2274a;

    C0602L(C0605O o) {
        this.f2274a = o;
    }

    /* renamed from: b */
    public void mo1764b(View view) {
        View view2;
        C0605O o = this.f2274a;
        if (o.f2306w && (view2 = o.f2294k) != null) {
            view2.setTranslationY(0.0f);
            this.f2274a.f2291h.setTranslationY(0.0f);
        }
        this.f2274a.f2291h.setVisibility(8);
        this.f2274a.f2291h.setTransitioning(false);
        C0605O o2 = this.f2274a;
        o2.f2280B = null;
        o2.mo2556n();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2274a.f2290g;
        if (actionBarOverlayLayout != null) {
            C0487v.m2262C(actionBarOverlayLayout);
        }
    }
}
