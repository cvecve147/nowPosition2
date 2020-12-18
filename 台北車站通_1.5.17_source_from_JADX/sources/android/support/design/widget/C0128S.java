package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import p013b.p018b.p040i.p041a.C1103a;

/* renamed from: android.support.design.widget.S */
class C0128S {

    /* renamed from: a */
    private static final int[] f685a = {C1103a.colorPrimary};

    /* renamed from: a */
    static void m655a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f685a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
