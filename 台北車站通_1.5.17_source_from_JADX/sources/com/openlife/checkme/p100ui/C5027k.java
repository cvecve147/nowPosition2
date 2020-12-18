package com.openlife.checkme.p100ui;

import android.animation.ValueAnimator;

/* renamed from: com.openlife.checkme.ui.k */
class C5027k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ float f14291a;

    /* renamed from: b */
    final /* synthetic */ float f14292b;

    /* renamed from: c */
    final /* synthetic */ LoadingView f14293c;

    C5027k(LoadingView loadingView, float f, float f2) {
        this.f14293c = loadingView;
        this.f14291a = f;
        this.f14292b = f2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float unused = this.f14293c.f14247s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LoadingView loadingView = this.f14293c;
        float unused2 = loadingView.f14245q = (this.f14291a - loadingView.f14247s) + this.f14292b;
        this.f14293c.invalidate();
    }
}
