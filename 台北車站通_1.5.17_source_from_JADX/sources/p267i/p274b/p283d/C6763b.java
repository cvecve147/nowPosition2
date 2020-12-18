package p267i.p274b.p283d;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: i.b.d.b */
public class C6763b {
    /* renamed from: a */
    public static SharedPreferences m25589a(Context context) {
        try {
            return context.getSharedPreferences("SangoUtilPrefersBase", 0);
        } catch (NullPointerException e) {
            C6762a.m25588a("Error caused at  TelaSketchUtin loadPreferences method>======>" + e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m25590a(Context context, String str) {
        try {
            String string = context.getSharedPreferences("SangoUtilPrefersBase", 0).getString(str, "@empty@");
            if (string.equals("@empty@")) {
                return null;
            }
            return string;
        } catch (NullPointerException e) {
            C6762a.m25588a("Error caused at  TelaSketchUtin loadPreferences method>======>" + e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m25591a(Context context, String str, Object obj) {
        if (context == null || str == null || obj == null) {
            C6762a.m25588a("PreferenceHelper err - savePreferences params null");
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("SangoUtilPrefersBase", 0).edit();
        if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            edit.putString(str, (String) obj);
        }
        edit.commit();
    }

    /* renamed from: b */
    public static void m25592b(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SangoUtilPrefersBase", 0).edit();
        edit.remove(str);
        edit.commit();
    }
}
