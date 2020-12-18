package com.onesignal;

import android.view.animation.Interpolator;

/* renamed from: com.onesignal._a */
class C4330_a implements Interpolator {

    /* renamed from: a */
    private double f12841a = 1.0d;

    /* renamed from: b */
    private double f12842b = 10.0d;

    C4330_a(double d, double d2) {
        this.f12841a = d;
        this.f12842b = d2;
    }

    public float getInterpolation(float f) {
        return (float) ((Math.pow(2.718281828459045d, ((double) (-f)) / this.f12841a) * -1.0d * Math.cos(this.f12842b * ((double) f))) + 1.0d);
    }
}
