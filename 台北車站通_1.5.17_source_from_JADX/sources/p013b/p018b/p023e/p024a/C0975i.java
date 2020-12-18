package p013b.p018b.p023e.p024a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.apache.http.protocol.HttpRequestExecutor;
import org.xmlpull.v1.XmlPullParser;
import p013b.p018b.p028h.p029a.p030a.C1016e;
import p013b.p018b.p028h.p031b.C1036b;

/* renamed from: b.b.e.a.i */
public class C0975i implements Interpolator {

    /* renamed from: a */
    private float[] f3806a;

    /* renamed from: b */
    private float[] f3807b;

    public C0975i(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C0975i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C1016e.m5420a(resources, theme, attributeSet, C0964a.f3790l);
        m5291a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m5289a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m5292a(path);
    }

    /* renamed from: a */
    private void m5290a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m5292a(path);
    }

    /* renamed from: a */
    private void m5291a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C1016e.m5423a(xmlPullParser, "pathData")) {
            String a = C1016e.m5421a(typedArray, xmlPullParser, "pathData", 4);
            Path b = C1036b.m5483b(a);
            if (b != null) {
                m5292a(b);
                return;
            }
            throw new InflateException("The path is null, which is created from " + a);
        } else if (!C1016e.m5423a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C1016e.m5423a(xmlPullParser, "controlY1")) {
            float a2 = C1016e.m5418a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a3 = C1016e.m5418a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a4 = C1016e.m5423a(xmlPullParser, "controlX2");
            if (a4 != C1016e.m5423a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a4) {
                m5289a(a2, a3);
            } else {
                m5290a(a2, a3, C1016e.m5418a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C1016e.m5418a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    /* renamed from: a */
    private void m5292a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f3806a = new float[min];
            this.f3807b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f3806a[i2] = fArr[0];
                this.f3807b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f3806a[0])) <= 1.0E-5d && ((double) Math.abs(this.f3807b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f3806a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f3807b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f3806a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f3806a[0]);
            sb.append(",");
            sb.append(this.f3807b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f3806a[i6]);
            sb.append(",");
            sb.append(this.f3807b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f3806a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f3806a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f3806a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f3807b[i];
        }
        float[] fArr2 = this.f3807b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
