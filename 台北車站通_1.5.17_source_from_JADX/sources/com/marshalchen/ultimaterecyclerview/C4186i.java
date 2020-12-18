package com.marshalchen.ultimaterecyclerview;

import android.util.Log;

/* renamed from: com.marshalchen.ultimaterecyclerview.i */
public final class C4186i {

    /* renamed from: a */
    private static boolean f12462a = true;

    /* renamed from: b */
    private static String f12463b = "Chen";

    /* renamed from: a */
    private static StackTraceElement m16668a() {
        return Thread.currentThread().getStackTrace()[4];
    }

    /* renamed from: a */
    private static String m16669a(StackTraceElement stackTraceElement) {
        return String.format("%s:%s.%s:%d", new Object[]{f12463b, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
    }

    /* renamed from: a */
    public static void m16670a(Exception exc, String str) {
        if (f12462a) {
            String str2 = f12463b;
            Log.e(str2, m16669a(m16668a()) + "\n>" + exc.getMessage() + "\n>" + exc.getStackTrace() + "   " + str);
            exc.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m16671a(String str) {
        if (f12462a) {
            String str2 = f12463b;
            Log.d(str2, m16672b(m16668a()) + ">" + str);
        }
    }

    /* renamed from: b */
    private static String m16672b(StackTraceElement stackTraceElement) {
        return String.format("%s:%s:%d", new Object[]{f12463b, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
    }
}
