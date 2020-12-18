package p013b.p018b.p028h.p038g;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: b.b.h.g.a */
public final class C1069a {

    /* renamed from: a */
    private static Method f4014a;

    /* renamed from: b */
    private static Method f4015b;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f4015b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f4014a = cls.getMethod("getScript", new Class[]{String.class});
                    f4015b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception e2) {
                f4014a = null;
                f4015b = null;
                Log.w("ICUCompat", e2);
            }
        }
    }

    /* renamed from: a */
    private static String m5585a(String str) {
        try {
            if (f4014a != null) {
                return (String) f4014a.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    /* renamed from: a */
    public static String m5586a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f4015b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            }
        } else {
            String b = m5587b(locale);
            if (b != null) {
                return m5585a(b);
            }
            return null;
        }
    }

    /* renamed from: b */
    private static String m5587b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f4015b != null) {
                return (String) f4015b.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }
}
