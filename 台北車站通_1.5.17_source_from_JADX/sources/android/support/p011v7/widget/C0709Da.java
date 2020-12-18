package android.support.p011v7.widget;

import android.view.animation.Interpolator;

/* renamed from: android.support.v7.widget.Da */
class C0709Da implements Interpolator {
    C0709Da() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
