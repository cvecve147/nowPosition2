package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.x */
class C0264x implements C0266z {
    C0264x() {
    }

    /* renamed from: a */
    public <T> ObjectAnimator mo1112a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofFloat(t, new C0184B(property, path), new float[]{0.0f, 1.0f});
    }
}
