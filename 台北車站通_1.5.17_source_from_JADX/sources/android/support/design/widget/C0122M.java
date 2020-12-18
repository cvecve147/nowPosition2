package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.design.widget.M */
class C0122M extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f672a;

    C0122M(TextInputLayout textInputLayout) {
        this.f672a = textInputLayout;
    }

    public void onAnimationStart(Animator animator) {
        this.f672a.f791l.setVisibility(0);
    }
}
