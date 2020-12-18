package p299tw.navin.navinmap.util;

import android.graphics.PointF;

/* renamed from: tw.navin.navinmap.util.MathUtils */
public class MathUtils {
    /* renamed from: a */
    public static float m26961a(float f, float f2, float f3, float f4) {
        return calDistance(f, f2, f3, f4);
    }

    /* renamed from: a */
    public static float m26962a(PointF pointF, PointF pointF2) {
        return calDistance(pointF.x, pointF.y, pointF2.x, pointF2.y);
    }

    /* renamed from: a */
    public static PointF m26963a(PointF pointF, PointF pointF2, PointF pointF3) {
        PointF calProjectionPoint = calProjectionPoint(pointF, pointF2, pointF3);
        float a = m26962a(pointF, calProjectionPoint);
        float a2 = m26962a(pointF2, calProjectionPoint);
        float a3 = m26962a(pointF, pointF2);
        return a > a3 ? pointF2 : a2 > a3 ? pointF : calProjectionPoint;
    }

    /* renamed from: b */
    public static float m26964b(PointF pointF, PointF pointF2, PointF pointF3) {
        return m26962a(pointF3, m26963a(pointF, pointF2, pointF3));
    }

    public static native float calDistance(float f, float f2, float f3, float f4);

    public static native PointF calProjectionPoint(PointF pointF, PointF pointF2, PointF pointF3);

    public static native void init();
}
