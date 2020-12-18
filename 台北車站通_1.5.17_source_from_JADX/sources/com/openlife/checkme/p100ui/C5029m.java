package com.openlife.checkme.p100ui;

import android.animation.Animator;

/* renamed from: com.openlife.checkme.ui.m */
class C5029m implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ LoadingView f14295a;

    C5029m(LoadingView loadingView) {
        this.f14295a = loadingView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        LoadingView.m19800b(this.f14295a);
        this.f14295a.m19805f();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
