package com.openlife.checkme.p100ui;

import android.animation.ValueAnimator;

/* renamed from: com.openlife.checkme.ui.l */
class C5028l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ LoadingView f14294a;

    C5028l(LoadingView loadingView) {
        this.f14294a = loadingView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float unused = this.f14294a.f14246r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
