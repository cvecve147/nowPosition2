package android.support.p007v4.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: android.support.v4.view.f */
public final class C0466f {
    /* renamed from: a */
    public static int m2170a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }

    /* renamed from: a */
    public static void m2171a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }
}
