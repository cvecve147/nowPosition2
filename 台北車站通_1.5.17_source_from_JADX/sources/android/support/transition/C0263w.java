package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: android.support.transition.w */
class C0263w {

    /* renamed from: a */
    private static final C0266z f1128a = (Build.VERSION.SDK_INT >= 21 ? new C0265y() : new C0264x());

    /* renamed from: a */
    static <T> ObjectAnimator m1202a(T t, Property<T, PointF> property, Path path) {
        return f1128a.mo1112a(t, property, path);
    }
}
