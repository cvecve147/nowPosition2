package android.support.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.y */
class C0265y implements C0266z {
    C0265y() {
    }

    /* renamed from: a */
    public <T> ObjectAnimator mo1112a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
