package android.support.design.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.design.widget.r */
class C0162r {

    /* renamed from: a */
    private static Method f878a;

    /* renamed from: b */
    private static boolean f879b;

    /* renamed from: a */
    static boolean m844a(DrawableContainer drawableContainer, Drawable.ConstantState constantState) {
        return m845b(drawableContainer, constantState);
    }

    /* renamed from: b */
    private static boolean m845b(DrawableContainer drawableContainer, Drawable.ConstantState constantState) {
        if (!f879b) {
            try {
                f878a = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainer.DrawableContainerState.class});
                f878a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
            }
            f879b = true;
        }
        Method method = f878a;
        if (method != null) {
            try {
                method.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception unused2) {
                Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }
}
