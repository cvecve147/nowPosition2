package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.transition.L */
class C0194L extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0195M f958a;

    C0194L(C0195M m) {
        this.f958a = m;
    }

    public void onAnimationEnd(Animator animator) {
        this.f958a.mo995d();
        animator.removeListener(this);
    }
}
