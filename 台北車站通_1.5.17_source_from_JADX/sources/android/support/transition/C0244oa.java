package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.oa */
class C0244oa extends C0242na {

    /* renamed from: e */
    private static Method f1067e;

    /* renamed from: f */
    private static boolean f1068f;

    /* renamed from: g */
    private static Method f1069g;

    /* renamed from: h */
    private static boolean f1070h;

    C0244oa() {
    }

    /* renamed from: c */
    private void m1146c() {
        if (!f1068f) {
            try {
                f1067e = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f1067e.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f1068f = true;
        }
    }

    /* renamed from: d */
    private void m1147d() {
        if (!f1070h) {
            try {
                f1069g = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f1069g.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f1070h = true;
        }
    }

    /* renamed from: a */
    public void mo1086a(View view, Matrix matrix) {
        m1146c();
        Method method = f1067e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public void mo1088b(View view, Matrix matrix) {
        m1147d();
        Method method = f1069g;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
