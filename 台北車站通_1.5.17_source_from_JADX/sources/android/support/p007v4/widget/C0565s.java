package android.support.p007v4.widget;

import android.os.Build;
import android.support.p007v4.view.C0466f;
import android.support.p007v4.view.C0487v;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.s */
public final class C0565s {

    /* renamed from: a */
    static final C0569d f2071a;

    /* renamed from: android.support.v4.widget.s$a */
    static class C0566a extends C0569d {
        C0566a() {
        }

        /* renamed from: a */
        public void mo2392a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.s$b */
    static class C0567b extends C0566a {

        /* renamed from: c */
        private static Field f2072c;

        static {
            try {
                f2072c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2072c.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        C0567b() {
        }

        /* renamed from: a */
        public void mo2393a(PopupWindow popupWindow, boolean z) {
            Field field = f2072c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }
    }

    /* renamed from: android.support.v4.widget.s$c */
    static class C0568c extends C0567b {
        C0568c() {
        }

        /* renamed from: a */
        public void mo2394a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        /* renamed from: a */
        public void mo2393a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }
    }

    /* renamed from: android.support.v4.widget.s$d */
    static class C0569d {

        /* renamed from: a */
        private static Method f2073a;

        /* renamed from: b */
        private static boolean f2074b;

        C0569d() {
        }

        /* renamed from: a */
        public void mo2394a(PopupWindow popupWindow, int i) {
            if (!f2074b) {
                try {
                    f2073a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                    f2073a.setAccessible(true);
                } catch (Exception unused) {
                }
                f2074b = true;
            }
            Method method = f2073a;
            if (method != null) {
                try {
                    method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
                } catch (Exception unused2) {
                }
            }
        }

        /* renamed from: a */
        public void mo2392a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0466f.m2170a(i3, C0487v.m2293i(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* renamed from: a */
        public void mo2393a(PopupWindow popupWindow, boolean z) {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f2071a = i >= 23 ? new C0568c() : i >= 21 ? new C0567b() : i >= 19 ? new C0566a() : new C0569d();
    }

    /* renamed from: a */
    public static void m2763a(PopupWindow popupWindow, int i) {
        f2071a.mo2394a(popupWindow, i);
    }

    /* renamed from: a */
    public static void m2764a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f2071a.mo2392a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m2765a(PopupWindow popupWindow, boolean z) {
        f2071a.mo2393a(popupWindow, z);
    }
}
