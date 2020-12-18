package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: android.support.transition.ka */
class C0236ka {

    /* renamed from: a */
    private static final C0249qa f1045a;

    /* renamed from: b */
    private static Field f1046b;

    /* renamed from: c */
    private static boolean f1047c;

    /* renamed from: d */
    static final Property<View, Float> f1048d = new C0232ia(Float.class, "translationAlpha");

    /* renamed from: e */
    static final Property<View, Rect> f1049e = new C0234ja(Rect.class, "clipBounds");

    static {
        int i = Build.VERSION.SDK_INT;
        f1045a = i >= 22 ? new C0247pa() : i >= 21 ? new C0244oa() : i >= 19 ? new C0242na() : i >= 18 ? new C0240ma() : new C0238la();
    }

    /* renamed from: a */
    private static void m1113a() {
        if (!f1047c) {
            try {
                f1046b = View.class.getDeclaredField("mViewFlags");
                f1046b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f1047c = true;
        }
    }

    /* renamed from: a */
    static void m1114a(View view) {
        f1045a.mo1083a(view);
    }

    /* renamed from: a */
    static void m1115a(View view, float f) {
        f1045a.mo1084a(view, f);
    }

    /* renamed from: a */
    static void m1116a(View view, int i) {
        m1113a();
        Field field = f1046b;
        if (field != null) {
            try {
                f1046b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* renamed from: a */
    static void m1117a(View view, int i, int i2, int i3, int i4) {
        f1045a.mo1085a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    static void m1118a(View view, Matrix matrix) {
        f1045a.mo1086a(view, matrix);
    }

    /* renamed from: b */
    static C0230ha m1119b(View view) {
        return f1045a.mo1091e(view);
    }

    /* renamed from: b */
    static void m1120b(View view, Matrix matrix) {
        f1045a.mo1088b(view, matrix);
    }

    /* renamed from: c */
    static float m1121c(View view) {
        return f1045a.mo1089c(view);
    }

    /* renamed from: d */
    static C0262va m1122d(View view) {
        return f1045a.mo1090d(view);
    }

    /* renamed from: e */
    static void m1123e(View view) {
        f1045a.mo1087b(view);
    }
}
