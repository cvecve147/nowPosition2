package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: android.support.transition.b */
class C0215b implements C0220d {

    /* renamed from: android.support.transition.b$a */
    interface C0216a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    C0215b() {
    }

    /* renamed from: a */
    public void mo1031a(Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof C0216a) {
                    ((C0216a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1032a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    /* renamed from: b */
    public void mo1033b(Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof C0216a) {
                    ((C0216a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }
}
