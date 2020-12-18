package android.support.p007v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.p008os.C0412a;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.D */
public final class C0508D {

    /* renamed from: a */
    static final C0515g f1823a;

    /* renamed from: android.support.v4.widget.D$a */
    static class C0509a extends C0515g {
        C0509a() {
        }

        /* renamed from: b */
        public int mo2052b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: android.support.v4.widget.D$b */
    static class C0510b extends C0509a {
        C0510b() {
        }

        /* renamed from: a */
        public void mo2053a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }

        /* renamed from: a */
        public Drawable[] mo2054a(TextView textView) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
    }

    /* renamed from: android.support.v4.widget.D$c */
    static class C0511c extends C0510b {
        C0511c() {
        }

        /* renamed from: a */
        public void mo2053a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: a */
        public Drawable[] mo2054a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    /* renamed from: android.support.v4.widget.D$d */
    static class C0512d extends C0511c {
        C0512d() {
        }

        /* renamed from: a */
        public void mo2055a(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    /* renamed from: android.support.v4.widget.D$e */
    static class C0513e extends C0512d {
        C0513e() {
        }
    }

    /* renamed from: android.support.v4.widget.D$f */
    static class C0514f extends C0513e {
        C0514f() {
        }
    }

    /* renamed from: android.support.v4.widget.D$g */
    static class C0515g {

        /* renamed from: a */
        private static Field f1824a;

        /* renamed from: b */
        private static boolean f1825b;

        /* renamed from: c */
        private static Field f1826c;

        /* renamed from: d */
        private static boolean f1827d;

        C0515g() {
        }

        /* renamed from: a */
        private static int m2431a(Field field, TextView textView) {
            try {
                return field.getInt(textView);
            } catch (IllegalAccessException unused) {
                Log.d("TextViewCompatBase", "Could not retrieve value of " + field.getName() + " field.");
                return -1;
            }
        }

        /* renamed from: a */
        private static Field m2432a(String str) {
            Field field = null;
            try {
                field = TextView.class.getDeclaredField(str);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException unused) {
                Log.e("TextViewCompatBase", "Could not retrieve " + str + " field.");
                return field;
            }
        }

        /* renamed from: a */
        public void mo2055a(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        /* renamed from: a */
        public void mo2053a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: a */
        public Drawable[] mo2054a(TextView textView) {
            return textView.getCompoundDrawables();
        }

        /* renamed from: b */
        public int mo2052b(TextView textView) {
            if (!f1827d) {
                f1826c = m2432a("mMaxMode");
                f1827d = true;
            }
            Field field = f1826c;
            if (field == null || m2431a(field, textView) != 1) {
                return -1;
            }
            if (!f1825b) {
                f1824a = m2432a("mMaximum");
                f1825b = true;
            }
            Field field2 = f1824a;
            if (field2 != null) {
                return m2431a(field2, textView);
            }
            return -1;
        }
    }

    static {
        C0515g eVar;
        if (C0412a.m1968a()) {
            eVar = new C0514f();
        } else {
            int i = Build.VERSION.SDK_INT;
            eVar = i >= 26 ? new C0513e() : i >= 23 ? new C0512d() : i >= 18 ? new C0511c() : i >= 17 ? new C0510b() : i >= 16 ? new C0509a() : new C0515g();
        }
        f1823a = eVar;
    }

    /* renamed from: a */
    public static void m2421a(TextView textView, int i) {
        f1823a.mo2055a(textView, i);
    }

    /* renamed from: a */
    public static void m2422a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f1823a.mo2053a(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static Drawable[] m2423a(TextView textView) {
        return f1823a.mo2054a(textView);
    }

    /* renamed from: b */
    public static int m2424b(TextView textView) {
        return f1823a.mo2052b(textView);
    }
}
