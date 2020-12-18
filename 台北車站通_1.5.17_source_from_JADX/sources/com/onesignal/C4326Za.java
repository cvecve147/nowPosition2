package com.onesignal;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/* renamed from: com.onesignal.Za */
class C4326Za {
    /* renamed from: a */
    static ValueAnimator m17234a(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) i);
        valueAnimator.setIntValues(new int[]{i2, i3});
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new C4323Ya(view));
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    /* renamed from: a */
    static Animation m17235a(View view, float f, float f2, int i, Interpolator interpolator, Animation.AnimationListener animationListener) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration((long) i);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    /* renamed from: a */
    static Animation m17236a(View view, int i, Interpolator interpolator, Animation.AnimationListener animationListener) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration((long) i);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
