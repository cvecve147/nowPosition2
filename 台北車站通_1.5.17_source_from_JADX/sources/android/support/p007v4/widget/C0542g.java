package android.support.p007v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.g */
public final class C0542g {

    /* renamed from: a */
    private static final C0545c f2048a;

    /* renamed from: android.support.v4.widget.g$a */
    static class C0543a extends C0545c {
        C0543a() {
        }

        /* renamed from: a */
        public void mo2346a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo2347a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: android.support.v4.widget.g$b */
    static class C0544b extends C0543a {
        C0544b() {
        }

        /* renamed from: a */
        public Drawable mo2348a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: android.support.v4.widget.g$c */
    static class C0545c {

        /* renamed from: a */
        private static Field f2049a;

        /* renamed from: b */
        private static boolean f2050b;

        C0545c() {
        }

        /* renamed from: a */
        public Drawable mo2348a(CompoundButton compoundButton) {
            if (!f2050b) {
                try {
                    f2049a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f2049a.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f2050b = true;
            }
            Field field = f2049a;
            if (field != null) {
                try {
                    return (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    f2049a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo2346a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof C0521E) {
                ((C0521E) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2347a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            if (compoundButton instanceof C0521E) {
                ((C0521E) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f2048a = i >= 23 ? new C0544b() : i >= 21 ? new C0543a() : new C0545c();
    }

    /* renamed from: a */
    public static Drawable m2708a(CompoundButton compoundButton) {
        return f2048a.mo2348a(compoundButton);
    }

    /* renamed from: a */
    public static void m2709a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f2048a.mo2346a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m2710a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        f2048a.mo2347a(compoundButton, mode);
    }
}
