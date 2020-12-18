package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.na */
class C0242na extends C0240ma {

    /* renamed from: a */
    private static Method f1060a;

    /* renamed from: b */
    private static boolean f1061b;

    /* renamed from: c */
    private static Method f1062c;

    /* renamed from: d */
    private static boolean f1063d;

    C0242na() {
    }

    /* renamed from: a */
    private void m1137a() {
        if (!f1063d) {
            try {
                f1062c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f1062c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f1063d = true;
        }
    }

    /* renamed from: b */
    private void m1138b() {
        if (!f1061b) {
            Class<View> cls = View.class;
            try {
                f1060a = cls.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f1060a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f1061b = true;
        }
    }

    /* renamed from: a */
    public void mo1083a(View view) {
    }

    /* renamed from: a */
    public void mo1084a(View view, float f) {
        m1138b();
        Method method = f1060a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public void mo1087b(View view) {
    }

    /* renamed from: c */
    public float mo1089c(View view) {
        m1137a();
        Method method = f1062c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo1089c(view);
    }
}
