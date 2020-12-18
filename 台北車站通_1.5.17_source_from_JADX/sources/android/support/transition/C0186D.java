package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.D */
class C0186D implements C0188F {
    C0186D() {
    }

    /* renamed from: a */
    public PropertyValuesHolder mo949a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new C0184B(property, path), new float[]{0.0f, 1.0f});
    }
}
