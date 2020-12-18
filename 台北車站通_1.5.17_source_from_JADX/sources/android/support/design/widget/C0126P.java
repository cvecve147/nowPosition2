package android.support.design.widget;

import android.animation.ValueAnimator;

/* renamed from: android.support.design.widget.P */
class C0126P implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f684a;

    C0126P(TextInputLayout textInputLayout) {
        this.f684a = textInputLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f684a.f774J.mo870b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
