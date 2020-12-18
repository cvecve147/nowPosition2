package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: android.support.transition.C */
class C0185C {

    /* renamed from: a */
    private static final C0188F f952a = (Build.VERSION.SDK_INT >= 21 ? new C0187E() : new C0186D());

    /* renamed from: a */
    static PropertyValuesHolder m926a(Property<?, PointF> property, Path path) {
        return f952a.mo949a(property, path);
    }
}
