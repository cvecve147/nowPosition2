package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: android.support.transition.k */
class C0235k extends Property<View, PointF> {
    C0235k(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public PointF get(View view) {
        return null;
    }

    /* renamed from: a */
    public void set(View view, PointF pointF) {
        C0236ka.m1117a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }
}
