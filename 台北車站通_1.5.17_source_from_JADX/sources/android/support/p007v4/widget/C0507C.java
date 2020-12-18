package android.support.p007v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.C */
class C0507C extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1822a;

    C0507C(SwipeRefreshLayout swipeRefreshLayout) {
        this.f1822a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f1822a;
        float f2 = swipeRefreshLayout.f1977z;
        swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
        this.f1822a.mo2226a(f);
    }
}
