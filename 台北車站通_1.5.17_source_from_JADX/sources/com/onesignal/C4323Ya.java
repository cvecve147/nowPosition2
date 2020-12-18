package com.onesignal;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.onesignal.Ya */
class C4323Ya implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f12819a;

    C4323Ya(View view) {
        this.f12819a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f12819a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
