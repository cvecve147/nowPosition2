package android.support.design.widget;

import android.animation.ValueAnimator;

/* renamed from: android.support.design.widget.o */
class C0159o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f876a;

    C0159o(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f876a = collapsingToolbarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f876a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
