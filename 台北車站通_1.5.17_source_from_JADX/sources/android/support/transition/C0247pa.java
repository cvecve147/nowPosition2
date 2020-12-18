package android.support.transition;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.pa */
class C0247pa extends C0244oa {

    /* renamed from: i */
    private static Method f1089i;

    /* renamed from: j */
    private static boolean f1090j;

    C0247pa() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: e */
    private void m1159e() {
        if (!f1090j) {
            Class<View> cls = View.class;
            try {
                f1089i = cls.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f1089i.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f1090j = true;
        }
    }

    /* renamed from: a */
    public void mo1085a(View view, int i, int i2, int i3, int i4) {
        m1159e();
        Method method = f1089i;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
