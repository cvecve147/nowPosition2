package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.transition.c */
class C0218c implements C0220d {
    C0218c() {
    }

    /* renamed from: a */
    public void mo1031a(Animator animator) {
        animator.resume();
    }

    /* renamed from: a */
    public void mo1032a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public void mo1033b(Animator animator) {
        animator.pause();
    }
}
