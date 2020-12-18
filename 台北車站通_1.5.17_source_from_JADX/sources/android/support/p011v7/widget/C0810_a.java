package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p013b.p018b.p028h.p031b.C1025a;

/* renamed from: android.support.v7.widget._a */
class C0810_a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3352a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f3353b = {-16842910};

    /* renamed from: c */
    static final int[] f3354c = {16842908};

    /* renamed from: d */
    static final int[] f3355d = {16843518};

    /* renamed from: e */
    static final int[] f3356e = {16842919};

    /* renamed from: f */
    static final int[] f3357f = {16842912};

    /* renamed from: g */
    static final int[] f3358g = {16842913};

    /* renamed from: h */
    static final int[] f3359h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f3360i = new int[0];

    /* renamed from: j */
    private static final int[] f3361j = new int[1];

    /* renamed from: a */
    public static int m4754a(Context context, int i) {
        ColorStateList c = m4758c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f3353b, c.getDefaultColor());
        }
        TypedValue a = m4756a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m4755a(context, i, a.getFloat());
    }

    /* renamed from: a */
    static int m4755a(Context context, int i, float f) {
        int b = m4757b(context, i);
        return C1025a.m5443b(b, Math.round(((float) Color.alpha(b)) * f));
    }

    /* renamed from: a */
    private static TypedValue m4756a() {
        TypedValue typedValue = f3352a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f3352a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static int m4757b(Context context, int i) {
        int[] iArr = f3361j;
        iArr[0] = i;
        C0829eb a = C0829eb.m4792a(context, (AttributeSet) null, iArr);
        try {
            return a.mo4471a(0, 0);
        } finally {
            a.mo4474a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m4758c(Context context, int i) {
        int[] iArr = f3361j;
        iArr[0] = i;
        C0829eb a = C0829eb.m4792a(context, (AttributeSet) null, iArr);
        try {
            return a.mo4472a(0);
        } finally {
            a.mo4474a();
        }
    }
}
