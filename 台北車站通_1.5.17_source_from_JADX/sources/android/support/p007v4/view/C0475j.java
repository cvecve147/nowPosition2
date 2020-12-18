package android.support.p007v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.j */
public final class C0475j {
    @Deprecated
    /* renamed from: a */
    public static int m2206a(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: a */
    public static int m2207a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m2208b(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* renamed from: b */
    public static int m2209b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: c */
    public static float m2210c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    /* renamed from: d */
    public static float m2211d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: e */
    public static boolean m2212e(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
