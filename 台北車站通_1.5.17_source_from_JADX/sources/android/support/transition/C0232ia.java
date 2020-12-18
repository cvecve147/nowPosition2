package android.support.transition;

import android.util.Property;
import android.view.View;

/* renamed from: android.support.transition.ia */
class C0232ia extends Property<View, Float> {
    C0232ia(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Float get(View view) {
        return Float.valueOf(C0236ka.m1121c(view));
    }

    /* renamed from: a */
    public void set(View view, Float f) {
        C0236ka.m1115a(view, f.floatValue());
    }
}
