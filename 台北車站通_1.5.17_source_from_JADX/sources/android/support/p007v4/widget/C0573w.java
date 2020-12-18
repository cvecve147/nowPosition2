package android.support.p007v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.w */
class C0573w extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2079a;

    C0573w(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2079a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f2079a.setAnimationProgress(f);
    }
}
