package android.support.p011v7.widget;

import android.util.Property;

/* renamed from: android.support.v7.widget.Za */
class C0809Za extends Property<SwitchCompat, Float> {
    C0809Za(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Float get(SwitchCompat switchCompat) {
        return Float.valueOf(switchCompat.f3261z);
    }

    /* renamed from: a */
    public void set(SwitchCompat switchCompat, Float f) {
        switchCompat.setThumbPosition(f.floatValue());
    }
}
