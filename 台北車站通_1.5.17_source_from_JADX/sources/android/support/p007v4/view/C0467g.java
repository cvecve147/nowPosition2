package android.support.p007v4.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.g */
public final class C0467g {

    /* renamed from: a */
    private static Field f1791a;

    /* renamed from: b */
    private static boolean f1792b;

    /* renamed from: c */
    static final C0469b f1793c = (Build.VERSION.SDK_INT >= 21 ? new C0468a() : new C0469b());

    /* renamed from: android.support.v4.view.g$a */
    static class C0468a extends C0469b {
        C0468a() {
        }

        /* renamed from: a */
        public void mo1944a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* renamed from: android.support.v4.view.g$b */
    static class C0469b {
        C0469b() {
        }

        /* renamed from: a */
        public void mo1944a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                C0467g.m2172a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                C0467g.m2172a(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: a */
    static void m2172a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f1792b) {
            try {
                f1791a = LayoutInflater.class.getDeclaredField("mFactory2");
                f1791a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f1792b = true;
        }
        Field field = f1791a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m2173b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        f1793c.mo1944a(layoutInflater, factory2);
    }
}
