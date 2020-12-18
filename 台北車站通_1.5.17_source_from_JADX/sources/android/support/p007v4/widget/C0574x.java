package android.support.p007v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.x */
class C0574x extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2080a;

    C0574x(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2080a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f2080a.setAnimationProgress(1.0f - f);
    }
}
