package android.support.p007v4.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: android.support.v4.view.G */
class C0428G implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0433K f1651a;

    /* renamed from: b */
    final /* synthetic */ View f1652b;

    /* renamed from: c */
    final /* synthetic */ C0429H f1653c;

    C0428G(C0429H h, C0433K k, View view) {
        this.f1653c = h;
        this.f1651a = k;
        this.f1652b = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1651a.mo1766a(this.f1652b);
    }
}
