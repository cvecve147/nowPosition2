package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads._p */
public final class C2925_p {

    /* renamed from: a */
    private static final char[] f8856a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static long m11867a(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / ((double) displayMetrics.density));
    }

    /* renamed from: a */
    public static Activity m11868a(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        int i = 0;
        while ((context instanceof ContextWrapper) && i < 10) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i++;
        }
        return null;
    }

    /* renamed from: a */
    public static String m11869a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return C2953ap.m11934a(bArr, true);
    }

    /* renamed from: a */
    public static String m11870a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C2639Ql.m10981a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static boolean m11871a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static boolean m11872a(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    /* renamed from: b */
    public static boolean m11873b(String str) {
        return str == null || str.isEmpty();
    }
}
