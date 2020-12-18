package android.support.p007v4.view.p010b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.d */
abstract class C0456d implements Interpolator {

    /* renamed from: a */
    private final float[] f1779a;

    /* renamed from: b */
    private final float f1780b = (1.0f / ((float) (this.f1779a.length - 1)));

    protected C0456d(float[] fArr) {
        this.f1779a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1779a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f1780b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f1779a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
