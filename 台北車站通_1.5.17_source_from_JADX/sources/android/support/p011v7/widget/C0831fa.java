package android.support.p011v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p028h.p031b.p032a.C1028c;
import p013b.p018b.p040i.p045d.p046a.C1121a;

/* renamed from: android.support.v7.widget.fa */
public class C0831fa {

    /* renamed from: a */
    public static final Rect f3431a = new Rect();

    /* renamed from: b */
    private static Class<?> f3432b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f3432b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static PorterDuff.Mode m4812a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static boolean m4813a(Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m4813a(a)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof C1028c) {
            drawable2 = ((C1028c) drawable).mo5022a();
        } else if (drawable instanceof C1121a) {
            drawable2 = ((C1121a) drawable).mo5263a();
        } else if (!(drawable instanceof ScaleDrawable)) {
            return true;
        } else {
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return m4813a(drawable2);
    }

    /* renamed from: b */
    static void m4814b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m4816d(drawable);
        }
    }

    /* renamed from: c */
    public static Rect m4815c(Drawable drawable) {
        if (f3432b != null) {
            try {
                Drawable h = C1026a.m5461h(drawable);
                Object invoke = h.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(h, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f3432b.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f3431a;
    }

    /* renamed from: d */
    private static void m4816d(Drawable drawable) {
        int[] state = drawable.getState();
        drawable.setState((state == null || state.length == 0) ? C0810_a.f3357f : C0810_a.f3360i);
        drawable.setState(state);
    }
}
