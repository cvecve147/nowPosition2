package android.support.design.widget;

import android.animation.ValueAnimator;
import android.support.design.widget.TabLayout;

/* renamed from: android.support.design.widget.J */
class C0119J implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ int f664a;

    /* renamed from: b */
    final /* synthetic */ int f665b;

    /* renamed from: c */
    final /* synthetic */ int f666c;

    /* renamed from: d */
    final /* synthetic */ int f667d;

    /* renamed from: e */
    final /* synthetic */ TabLayout.C0135d f668e;

    C0119J(TabLayout.C0135d dVar, int i, int i2, int i3, int i4) {
        this.f668e = dVar;
        this.f664a = i;
        this.f665b = i2;
        this.f666c = i3;
        this.f667d = i4;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f668e.mo759b(C0145a.m782a(this.f664a, this.f665b, animatedFraction), C0145a.m782a(this.f666c, this.f667d, animatedFraction));
    }
}
