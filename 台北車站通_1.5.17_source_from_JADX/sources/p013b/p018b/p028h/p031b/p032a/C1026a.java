package p013b.p018b.p028h.p031b.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: b.b.h.b.a.a */
public final class C1026a {

    /* renamed from: a */
    private static Method f3931a;

    /* renamed from: b */
    private static boolean f3932b;

    /* renamed from: c */
    private static Method f3933c;

    /* renamed from: d */
    private static boolean f3934d;

    /* renamed from: a */
    public static void m5445a(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m5446a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m5447a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C1027b) {
            ((C1027b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m5448a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m5449a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: a */
    public static void m5450a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C1027b) {
            ((C1027b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m5451a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: a */
    public static boolean m5452a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5453a(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f3932b) {
                try {
                    f3931a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f3931a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f3932b = true;
            }
            Method method = f3931a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f3931a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m5454b(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable a;
        int i = Build.VERSION.SDK_INT;
        if (i < 23 && i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                a = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof C1028c) {
                a = ((C1028c) drawable).mo5022a();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        m5454b(child);
                    }
                }
                return;
            } else {
                return;
            }
            m5454b(a);
            return;
        }
        drawable.clearColorFilter();
    }

    /* renamed from: b */
    public static void m5455b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C1027b) {
            ((C1027b) drawable).setTint(i);
        }
    }

    /* renamed from: c */
    public static int m5456c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static ColorFilter m5457d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: e */
    public static int m5458e(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f3934d) {
                try {
                    f3933c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f3933c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f3934d = true;
            }
            Method method = f3933c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f3933c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static boolean m5459f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    /* renamed from: g */
    public static void m5460g(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: h */
    public static <T extends Drawable> T m5461h(Drawable drawable) {
        return drawable instanceof C1028c ? ((C1028c) drawable).mo5022a() : drawable;
    }

    /* renamed from: i */
    public static Drawable m5462i(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof C1027b) ? new C1034f(drawable) : drawable : i >= 19 ? !(drawable instanceof C1027b) ? new C1032e(drawable) : drawable : !(drawable instanceof C1027b) ? new C1029d(drawable) : drawable;
    }
}
