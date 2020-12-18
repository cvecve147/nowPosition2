package android.support.design.widget;

import android.animation.ValueAnimator;

/* renamed from: android.support.design.widget.I */
class C0118I implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TabLayout f663a;

    C0118I(TabLayout tabLayout) {
        this.f663a = tabLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f663a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
