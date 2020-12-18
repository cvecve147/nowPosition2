package android.support.p007v4.view.p010b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.e */
class C0457e implements Interpolator {

    /* renamed from: a */
    private final float[] f1781a;

    /* renamed from: b */
    private final float[] f1782b;

    C0457e(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f1781a = new float[i];
        this.f1782b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, (float[]) null);
            this.f1781a[i2] = fArr[0];
            this.f1782b[i2] = fArr[1];
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f1781a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f1781a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f1781a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f1782b[i];
        }
        float[] fArr2 = this.f1782b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
