package android.support.p011v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.v7.widget.e */
class C0825e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f3403a;

    C0825e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3403a = actionBarOverlayLayout;
    }

    public void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3403a;
        actionBarOverlayLayout.f2673y = null;
        actionBarOverlayLayout.f2660l = false;
    }

    public void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3403a;
        actionBarOverlayLayout.f2673y = null;
        actionBarOverlayLayout.f2660l = false;
    }
}
