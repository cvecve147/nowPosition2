package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.C2064k;

/* renamed from: com.google.android.gms.common.util.i */
public final class C2087i {

    /* renamed from: a */
    private static Boolean f6556a;

    /* renamed from: b */
    private static Boolean f6557b;

    /* renamed from: c */
    private static Boolean f6558c;

    /* renamed from: a */
    public static boolean m9148a() {
        return C2064k.sIsTestMode ? C2064k.sTestIsUserBuild : "user".equals(Build.TYPE);
    }

    /* renamed from: a */
    public static boolean m9149a(Context context) {
        if (f6558c == null) {
            f6558c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f6558c.booleanValue();
    }

    @TargetApi(21)
    /* renamed from: b */
    public static boolean m9150b(Context context) {
        if (f6557b == null) {
            f6557b = Boolean.valueOf(C2092n.m9168i() && context.getPackageManager().hasSystemFeature(C2064k.FEATURE_SIDEWINDER));
        }
        return f6557b.booleanValue();
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m9151c(Context context) {
        if (f6556a == null) {
            f6556a = Boolean.valueOf(C2092n.m9167h() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f6556a.booleanValue();
    }

    @TargetApi(24)
    /* renamed from: d */
    public static boolean m9152d(Context context) {
        return (!C2092n.m9170k() || m9150b(context)) && m9151c(context);
    }
}
