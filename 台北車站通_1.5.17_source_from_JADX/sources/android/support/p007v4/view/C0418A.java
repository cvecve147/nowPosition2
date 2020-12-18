package android.support.p007v4.view;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.A */
class C0418A implements Interpolator {
    C0418A() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
