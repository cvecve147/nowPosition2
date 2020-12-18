package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;

/* renamed from: android.support.transition.a */
class C0213a {

    /* renamed from: a */
    private static final C0220d f1022a = (Build.VERSION.SDK_INT >= 19 ? new C0218c() : new C0215b());

    /* renamed from: a */
    static void m1062a(Animator animator) {
        f1022a.mo1033b(animator);
    }

    /* renamed from: a */
    static void m1063a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        f1022a.mo1032a(animator, animatorListenerAdapter);
    }

    /* renamed from: b */
    static void m1064b(Animator animator) {
        f1022a.mo1031a(animator);
    }
}
