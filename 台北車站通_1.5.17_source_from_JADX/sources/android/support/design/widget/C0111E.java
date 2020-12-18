package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.design.widget.E */
class C0111E extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0112F f634a;

    C0111E(C0112F f) {
        this.f634a = f;
    }

    public void onAnimationEnd(Animator animator) {
        C0112F f = this.f634a;
        if (f.f637c == animator) {
            f.f637c = null;
        }
    }
}
