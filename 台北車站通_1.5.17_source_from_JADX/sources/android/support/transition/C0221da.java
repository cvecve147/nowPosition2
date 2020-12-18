package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.da */
class C0221da extends C0219ca {

    /* renamed from: f */
    private static Method f1030f;

    /* renamed from: g */
    private static boolean f1031g;

    C0221da() {
    }

    /* renamed from: a */
    private void m1079a() {
        if (!f1031g) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                f1030f = cls.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f1030f.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f1031g = true;
        }
    }

    /* renamed from: a */
    public C0212Z mo1037a(ViewGroup viewGroup) {
        return new C0211Y(viewGroup);
    }

    /* renamed from: a */
    public void mo1038a(ViewGroup viewGroup, boolean z) {
        String str;
        m1079a();
        Method method = f1030f;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
                return;
            } catch (IllegalAccessException e) {
                e = e;
                str = "Failed to invoke suppressLayout method";
            } catch (InvocationTargetException e2) {
                e = e2;
                str = "Error invoking suppressLayout method";
            }
        } else {
            return;
        }
        Log.i("ViewUtilsApi18", str, e);
    }
}
