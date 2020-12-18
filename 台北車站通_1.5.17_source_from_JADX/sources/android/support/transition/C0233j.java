package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: android.support.transition.j */
class C0233j extends Property<View, PointF> {
    C0233j(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public PointF get(View view) {
        return null;
    }

    /* renamed from: a */
    public void set(View view, PointF pointF) {
        C0236ka.m1117a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }
}
