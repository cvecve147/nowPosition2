package android.support.p007v4.widget;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.G */
class C0523G implements Interpolator {
    C0523G() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
