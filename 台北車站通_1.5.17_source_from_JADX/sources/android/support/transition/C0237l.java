package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: android.support.transition.l */
class C0237l extends Property<View, PointF> {
    C0237l(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public PointF get(View view) {
        return null;
    }

    /* renamed from: a */
    public void set(View view, PointF pointF) {
        int round = Math.round(pointF.x);
        int round2 = Math.round(pointF.y);
        C0236ka.m1117a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}
