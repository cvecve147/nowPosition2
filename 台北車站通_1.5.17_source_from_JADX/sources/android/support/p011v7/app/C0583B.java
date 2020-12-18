package android.support.p011v7.app;

import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0432J;
import android.support.p007v4.view.C0487v;
import android.view.View;

/* renamed from: android.support.v7.app.B */
class C0583B extends C0432J {

    /* renamed from: a */
    final /* synthetic */ C0584C f2185a;

    C0583B(C0584C c) {
        this.f2185a = c;
    }

    /* renamed from: b */
    public void mo1764b(View view) {
        this.f2185a.f2211z.setAlpha(1.0f);
        this.f2185a.f2189C.mo1755a((C0431I) null);
        this.f2185a.f2189C = null;
    }

    /* renamed from: c */
    public void mo1765c(View view) {
        this.f2185a.f2211z.setVisibility(0);
        this.f2185a.f2211z.sendAccessibilityEvent(32);
        if (this.f2185a.f2211z.getParent() instanceof View) {
            C0487v.m2262C((View) this.f2185a.f2211z.getParent());
        }
    }
}
