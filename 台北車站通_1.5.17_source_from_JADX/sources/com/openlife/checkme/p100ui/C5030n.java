package com.openlife.checkme.p100ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.openlife.checkme.ui.n */
class C5030n extends AnimatorListenerAdapter {

    /* renamed from: a */
    boolean f14296a = false;

    /* renamed from: b */
    final /* synthetic */ LoadingView f14297b;

    C5030n(LoadingView loadingView) {
        this.f14297b = loadingView;
    }

    public void onAnimationCancel(Animator animator) {
        this.f14296a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f14296a) {
            this.f14297b.mo14064b();
        }
    }
}
