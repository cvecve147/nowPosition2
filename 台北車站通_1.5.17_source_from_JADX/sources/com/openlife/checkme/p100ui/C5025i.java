package com.openlife.checkme.p100ui;

import android.animation.ValueAnimator;

/* renamed from: com.openlife.checkme.ui.i */
class C5025i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ LoadingView f14289a;

    C5025i(LoadingView loadingView) {
        this.f14289a = loadingView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float unused = this.f14289a.f14245q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f14289a.invalidate();
    }
}
