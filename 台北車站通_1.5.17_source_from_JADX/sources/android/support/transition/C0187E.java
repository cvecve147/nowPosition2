package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.E */
class C0187E implements C0188F {
    C0187E() {
    }

    /* renamed from: a */
    public PropertyValuesHolder mo949a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
