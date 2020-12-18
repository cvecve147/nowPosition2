package android.support.transition;

import android.graphics.Rect;
import android.support.p007v4.view.C0487v;
import android.util.Property;
import android.view.View;

/* renamed from: android.support.transition.ja */
class C0234ja extends Property<View, Rect> {
    C0234ja(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Rect get(View view) {
        return C0487v.m2287d(view);
    }

    /* renamed from: a */
    public void set(View view, Rect rect) {
        C0487v.m2272a(view, rect);
    }
}
