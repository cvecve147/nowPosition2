package p267i.p268a.p269a.p270a;

import android.content.Context;
import android.content.SharedPreferences;
import p299tw.navin.navinmap.util.C7157a;

/* renamed from: i.a.a.a.g */
public class C6667g {
    /* renamed from: a */
    public static String m25352a(Context context) {
        return m25382s(context).getString("APP_ID", (String) null);
    }

    /* renamed from: a */
    public static void m25353a(Context context, String str) {
        m25354a(context, "API_TOKEN", (Object) str);
    }

    /* renamed from: a */
    private static void m25354a(Context context, String str, Object obj) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("NavinMapPrefersBase", 0).edit();
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

    /* renamed from: a */
    public static void m25355a(Context context, String str, String str2) {
        m25354a(context, "APP_ID", (Object) str);
        m25354a(context, "API_KEY", (Object) str2);
    }

    /* renamed from: b */
    public static String m25356b(Context context) {
        return m25382s(context).getString("API_KEY", (String) null);
    }

    /* renamed from: b */
    public static void m25357b(Context context, String str) {
        m25354a(context, "DATA_LAST_UPDATED_AT", (Object) str);
    }

    /* renamed from: c */
    public static String m25358c(Context context) {
        return m25382s(context).getString("API_TOKEN", (String) null);
    }

    /* renamed from: c */
    public static void m25359c(Context context, String str) {
        m25354a(context, "MAP_LAST_UPDATED_AT", (Object) str);
    }

    /* renamed from: d */
    public static void m25360d(Context context) {
        m25373j(context, "API_TOKEN");
    }

    /* renamed from: d */
    public static void m25361d(Context context, String str) {
        m25354a(context, "BEACON_LAST_UPDATED_AT", (Object) str);
    }

    /* renamed from: e */
    public static void m25362e(Context context) {
        m25354a(context, "API_DATA_INITIALED", (Object) "API_DATA_INITIALED");
    }

    /* renamed from: e */
    public static void m25363e(Context context, String str) {
        m25354a(context, "NODE_LAST_UPDATED_AT", (Object) str);
    }

    /* renamed from: f */
    public static void m25364f(Context context) {
        m25373j(context, "API_DATA_INITIALED");
    }

    /* renamed from: f */
    public static void m25365f(Context context, String str) {
        m25354a(context, "NODE_LINK_LAST_UPDATED_AT", (Object) str);
    }

    /* renamed from: g */
    public static void m25366g(Context context, String str) {
        m25354a(context, "STORE_LAST_UPDATED_AT", (Object) str);
    }

    /* renamed from: g */
    public static boolean m25367g(Context context) {
        return m25382s(context).getString("API_DATA_INITIALED", (String) null) != null;
    }

    /* renamed from: h */
    public static String m25368h(Context context) {
        return m25382s(context).getString("DATA_LAST_UPDATED_AT", (String) null);
    }

    /* renamed from: h */
    public static void m25369h(Context context, String str) {
        m25354a(context, "FACILITY_LAST_UPDATED_AT", (Object) str);
    }

    /* renamed from: i */
    public static void m25370i(Context context) {
        m25373j(context, "DATA_LAST_UPDATED_AT");
        m25373j(context, "MAP_LAST_UPDATED_AT");
        m25373j(context, "BEACON_LAST_UPDATED_AT");
        m25373j(context, "NODE_LAST_UPDATED_AT");
        m25373j(context, "NODE_LINK_LAST_UPDATED_AT");
        m25373j(context, "STORE_LAST_UPDATED_AT");
        m25373j(context, "FACILITY_LAST_UPDATED_AT");
    }

    /* renamed from: i */
    public static void m25371i(Context context, String str) {
        m25354a(context, "USER_TRACE_LAST_UPDATED_AT", (Object) str);
    }

    /* renamed from: j */
    public static String m25372j(Context context) {
        return m25382s(context).getString("MAP_LAST_UPDATED_AT", (String) null);
    }

    /* renamed from: j */
    private static void m25373j(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("NavinMapPrefersBase", 0).edit();
        edit.remove(str);
        edit.commit();
    }

    /* renamed from: k */
    public static String m25374k(Context context) {
        return m25382s(context).getString("BEACON_LAST_UPDATED_AT", (String) null);
    }

    /* renamed from: l */
    public static String m25375l(Context context) {
        return m25382s(context).getString("NODE_LAST_UPDATED_AT", (String) null);
    }

    /* renamed from: m */
    public static String m25376m(Context context) {
        return m25382s(context).getString("NODE_LINK_LAST_UPDATED_AT", (String) null);
    }

    /* renamed from: n */
    public static String m25377n(Context context) {
        return m25382s(context).getString("STORE_LAST_UPDATED_AT", (String) null);
    }

    /* renamed from: o */
    public static String m25378o(Context context) {
        return m25382s(context).getString("FACILITY_LAST_UPDATED_AT", (String) null);
    }

    /* renamed from: p */
    public static String m25379p(Context context) {
        return m25382s(context).getString("USER_TRACE_LAST_UPDATED_AT", (String) null);
    }

    /* renamed from: q */
    public static void m25380q(Context context) {
        m25354a(context, "MAP_FUNCTION_HINT", (Object) true);
    }

    /* renamed from: r */
    public static boolean m25381r(Context context) {
        return m25382s(context).getBoolean("MAP_FUNCTION_HINT", false);
    }

    /* renamed from: s */
    private static SharedPreferences m25382s(Context context) {
        try {
            return context.getSharedPreferences("NavinMapPrefersBase", 0);
        } catch (NullPointerException e) {
            C7157a.m26965a("Error caused at  TelaSketchUtin loadPreferences method>======>" + e);
            return null;
        }
    }
}
