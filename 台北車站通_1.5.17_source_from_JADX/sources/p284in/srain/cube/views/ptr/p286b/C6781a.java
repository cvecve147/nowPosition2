package p284in.srain.cube.views.ptr.p286b;

import android.util.Log;

/* renamed from: in.srain.cube.views.ptr.b.a */
public class C6781a {

    /* renamed from: a */
    private static int f18836a;

    /* renamed from: a */
    public static void m25689a(String str, String str2) {
        if (f18836a <= 1) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m25690a(String str, String str2, Object... objArr) {
        if (f18836a <= 1) {
            if (objArr.length > 0) {
                str2 = String.format(str2, objArr);
            }
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m25691b(String str, String str2) {
        if (f18836a <= 4) {
            Log.e(str, str2);
        }
    }

    /* renamed from: b */
    public static void m25692b(String str, String str2, Object... objArr) {
        if (f18836a <= 2) {
            if (objArr.length > 0) {
                str2 = String.format(str2, objArr);
            }
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m25693c(String str, String str2) {
        if (f18836a <= 2) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m25694c(String str, String str2, Object... objArr) {
        if (f18836a <= 0) {
            if (objArr.length > 0) {
                str2 = String.format(str2, objArr);
            }
            Log.v(str, str2);
        }
    }
}
