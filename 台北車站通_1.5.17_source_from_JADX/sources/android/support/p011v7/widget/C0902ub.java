package android.support.p011v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ub */
public class C0902ub {

    /* renamed from: a */
    private static Method f3699a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f3699a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f3699a.isAccessible()) {
                    f3699a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m5140a(View view, Rect rect, Rect rect2) {
        Method method = f3699a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m5141a(View view) {
        return C0487v.m2293i(view) == 1;
    }

    /* renamed from: b */
    public static void m5142b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            }
        }
    }
}
