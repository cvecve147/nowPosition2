package com.google.android.gms.internal.ads;

import android.util.Log;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Cf */
public class C2227Cf {
    /* renamed from: a */
    public static void m9529a(String str) {
        if (m9531a(6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: a */
    public static void m9530a(String str, Throwable th) {
        if (m9531a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: a */
    public static boolean m9531a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    /* renamed from: b */
    public static void m9532b(String str) {
        if (m9531a(3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: b */
    public static void m9533b(String str, Throwable th) {
        if (m9531a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m9534c(String str) {
        if (m9531a(4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: c */
    public static void m9535c(String str, Throwable th) {
        if (m9531a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m9536d(String str) {
        if (m9531a(5)) {
            Log.w("Ads", str);
        }
    }

    /* renamed from: d */
    public static void m9537d(String str, Throwable th) {
        if (!m9531a(5)) {
            return;
        }
        if (th != null) {
            m9535c(m9539f(str), th);
        } else {
            m9536d(m9539f(str));
        }
    }

    /* renamed from: e */
    public static void m9538e(String str) {
        m9537d(str, (Throwable) null);
    }

    /* renamed from: f */
    private static String m9539f(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }
}
