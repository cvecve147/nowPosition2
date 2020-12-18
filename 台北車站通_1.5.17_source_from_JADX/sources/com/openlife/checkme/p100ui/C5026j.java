package com.openlife.checkme.p100ui;

import android.animation.ValueAnimator;

/* renamed from: com.openlife.checkme.ui.j */
class C5026j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ LoadingView f14290a;

    C5026j(LoadingView loadingView) {
        this.f14290a = loadingView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float unused = this.f14290a.f14246r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
