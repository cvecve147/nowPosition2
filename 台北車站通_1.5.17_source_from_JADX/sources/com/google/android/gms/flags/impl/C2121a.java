package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.flags.impl.p074a.C2126a;

/* renamed from: com.google.android.gms.flags.impl.a */
public abstract class C2121a<T> {

    /* renamed from: com.google.android.gms.flags.impl.a$a */
    public static class C2122a extends C2121a<Boolean> {
        /* renamed from: a */
        public static Boolean m9219a(SharedPreferences sharedPreferences, String str, Boolean bool) {
            try {
                return (Boolean) C2126a.m9223a(new C2128c(sharedPreferences, str, bool));
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
                return bool;
            }
        }
    }

    /* renamed from: com.google.android.gms.flags.impl.a$b */
    public static class C2123b extends C2121a<Integer> {
        /* renamed from: a */
        public static Integer m9220a(SharedPreferences sharedPreferences, String str, Integer num) {
            try {
                return (Integer) C2126a.m9223a(new C2129d(sharedPreferences, str, num));
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
                return num;
            }
        }
    }

    /* renamed from: com.google.android.gms.flags.impl.a$c */
    public static class C2124c extends C2121a<Long> {
        /* renamed from: a */
        public static Long m9221a(SharedPreferences sharedPreferences, String str, Long l) {
            try {
                return (Long) C2126a.m9223a(new C2130e(sharedPreferences, str, l));
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
                return l;
            }
        }
    }

    /* renamed from: com.google.android.gms.flags.impl.a$d */
    public static class C2125d extends C2121a<String> {
        /* renamed from: a */
        public static String m9222a(SharedPreferences sharedPreferences, String str, String str2) {
            try {
                return (String) C2126a.m9223a(new C2131f(sharedPreferences, str, str2));
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
                return str2;
            }
        }
    }
}
