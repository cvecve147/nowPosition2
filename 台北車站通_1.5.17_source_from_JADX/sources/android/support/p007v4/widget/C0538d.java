package android.support.p007v4.widget;

import android.animation.ValueAnimator;
import android.support.p007v4.widget.C0540f;

/* renamed from: android.support.v4.widget.d */
class C0538d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0540f.C0541a f2014a;

    /* renamed from: b */
    final /* synthetic */ C0540f f2015b;

    C0538d(C0540f fVar, C0540f.C0541a aVar) {
        this.f2015b = fVar;
        this.f2014a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f2015b.m2671b(floatValue, this.f2014a);
        this.f2015b.m2667a(floatValue, this.f2014a, false);
        this.f2015b.invalidateSelf();
    }
}
