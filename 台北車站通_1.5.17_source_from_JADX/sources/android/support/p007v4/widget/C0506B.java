package android.support.p007v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.B */
class C0506B extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1821a;

    C0506B(SwipeRefreshLayout swipeRefreshLayout) {
        this.f1821a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f1821a.mo2226a(f);
    }
}
