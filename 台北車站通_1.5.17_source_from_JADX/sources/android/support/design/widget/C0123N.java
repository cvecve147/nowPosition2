package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.design.widget.N */
class C0123N extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ CharSequence f673a;

    /* renamed from: b */
    final /* synthetic */ TextInputLayout f674b;

    C0123N(TextInputLayout textInputLayout, CharSequence charSequence) {
        this.f674b = textInputLayout;
        this.f673a = charSequence;
    }

    public void onAnimationEnd(Animator animator) {
        this.f674b.f791l.setText(this.f673a);
        this.f674b.f791l.setVisibility(4);
    }
}
