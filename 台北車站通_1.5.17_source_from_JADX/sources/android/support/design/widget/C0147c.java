package android.support.design.widget;

import android.animation.ValueAnimator;
import android.support.design.widget.AppBarLayout;

/* renamed from: android.support.design.widget.c */
class C0147c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f822a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f823b;

    /* renamed from: c */
    final /* synthetic */ AppBarLayout.Behavior f824c;

    C0147c(AppBarLayout.Behavior behavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f824c = behavior;
        this.f822a = coordinatorLayout;
        this.f823b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f824c.mo925c(this.f822a, this.f823b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
