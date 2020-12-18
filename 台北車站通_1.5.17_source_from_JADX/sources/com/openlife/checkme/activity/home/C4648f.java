package com.openlife.checkme.activity.home;

import android.animation.Animator;

/* renamed from: com.openlife.checkme.activity.home.f */
class C4648f implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ MainFragment f13506a;

    C4648f(MainFragment mainFragment) {
        this.f13506a = mainFragment;
    }

    public void onAnimationCancel(Animator animator) {
        this.f13506a.f13477c = false;
    }

    public void onAnimationEnd(Animator animator) {
        MainFragment mainFragment = this.f13506a;
        if (mainFragment.f13477c) {
            mainFragment.toolbar.setVisibility(4);
            this.f13506a.f13477c = false;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f13506a.f13477c = true;
    }
}
