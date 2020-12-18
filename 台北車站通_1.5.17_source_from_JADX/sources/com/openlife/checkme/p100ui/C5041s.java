package com.openlife.checkme.p100ui;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.openlife.checkme.ui.s */
public class C5041s extends Animation {

    /* renamed from: a */
    private PointCircleView f14316a;

    /* renamed from: b */
    private float f14317b;

    /* renamed from: c */
    private float f14318c;

    public C5041s(PointCircleView pointCircleView, int i) {
        this.f14317b = pointCircleView.getAngle();
        this.f14318c = (float) i;
        this.f14316a = pointCircleView;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f14317b;
        this.f14316a.setAngle(f2 + ((this.f14318c - f2) * f));
        this.f14316a.requestLayout();
    }
}
