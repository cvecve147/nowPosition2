package com.askey.taipeinavi.p058d;

import android.content.Context;
import p267i.p274b.p283d.C6763b;

/* renamed from: com.askey.taipeinavi.d.g */
public class C1213g extends C6763b {
    /* renamed from: a */
    public static int m6045a(Context context, int i) {
        return C6763b.m25589a(context).getInt("EvaluationHintLimits", i);
    }

    /* renamed from: a */
    public static void m6046a(Context context, String str, String str2) {
        C6763b.m25591a(context, "APP_ID", str);
        C6763b.m25591a(context, "API_KEY", str2);
    }

    /* renamed from: a */
    public static void m6047a(Context context, boolean z) {
        C6763b.m25591a(context, "AutomaticTtsHint", Boolean.valueOf(z));
    }

    /* renamed from: b */
    public static String m6048b(Context context) {
        return C6763b.m25589a(context).getString("API_KEY", (String) null);
    }

    /* renamed from: b */
    public static void m6049b(Context context, int i) {
        C6763b.m25591a(context, "EvaluationHintCounts", Integer.valueOf(i));
    }

    /* renamed from: b */
    public static void m6050b(Context context, boolean z) {
        C6763b.m25591a(context, "BarrierFreeEnabled", Boolean.valueOf(z));
    }

    /* renamed from: c */
    public static String m6051c(Context context) {
        return C6763b.m25589a(context).getString("API_TOKEN", (String) null);
    }

    /* renamed from: c */
    public static void m6052c(Context context, int i) {
        C6763b.m25591a(context, "EvaluationHintLimits", Integer.valueOf(i));
    }

    /* renamed from: c */
    public static void m6053c(Context context, String str) {
        C6763b.m25591a(context, "API_TOKEN", str);
    }

    /* renamed from: c */
    public static void m6054c(Context context, boolean z) {
        C6763b.m25591a(context, "EvaluationHintEnabled", Boolean.valueOf(z));
    }

    /* renamed from: d */
    public static String m6055d(Context context) {
        return C6763b.m25589a(context).getString("APP_ID", (String) null);
    }

    /* renamed from: d */
    public static void m6056d(Context context, String str) {
        C6763b.m25591a(context, "EvaluationHintDeniedAt", str);
    }

    /* renamed from: d */
    public static void m6057d(Context context, boolean z) {
        C6763b.m25591a(context, "PushEnabled", Boolean.valueOf(z));
    }

    /* renamed from: e */
    public static void m6058e(Context context, String str) {
        C6763b.m25591a(context, "UserId", str);
    }

    /* renamed from: e */
    public static void m6059e(Context context, boolean z) {
        C6763b.m25591a(context, "TtsEnabled", Boolean.valueOf(z));
    }

    /* renamed from: e */
    public static boolean m6060e(Context context) {
        return C6763b.m25589a(context).getBoolean("AutomaticTtsHint", true);
    }

    /* renamed from: f */
    public static void m6061f(Context context, String str) {
        C6763b.m25591a(context, "UUPON_BINDING_CODE", str);
    }

    /* renamed from: f */
    public static boolean m6062f(Context context) {
        return C6763b.m25589a(context).getBoolean("BarrierFreeEnabled", false);
    }

    /* renamed from: g */
    public static int m6063g(Context context) {
        return C6763b.m25589a(context).getInt("EvaluationHintCounts", 0);
    }

    /* renamed from: g */
    public static void m6064g(Context context, String str) {
        C6763b.m25591a(context, "UUPON_POINT", str);
    }

    /* renamed from: h */
    public static String m6065h(Context context) {
        return C6763b.m25589a(context).getString("EvaluationHintDeniedAt", (String) null);
    }

    /* renamed from: i */
    public static boolean m6066i(Context context) {
        return C6763b.m25589a(context).getBoolean("EvaluationHintEnabled", true);
    }

    /* renamed from: j */
    public static boolean m6067j(Context context) {
        return C6763b.m25589a(context).getBoolean("FirstRouteFinished", false);
    }

    /* renamed from: k */
    public static boolean m6068k(Context context) {
        return C6763b.m25589a(context).getBoolean("PushEnabled", true);
    }

    /* renamed from: l */
    public static boolean m6069l(Context context) {
        return C6763b.m25589a(context).getBoolean("TutorialShowed", false);
    }

    /* renamed from: m */
    public static String m6070m(Context context) {
        return C6763b.m25590a(context, "UserId");
    }

    /* renamed from: n */
    public static String m6071n(Context context) {
        return C6763b.m25589a(context).getString("UUPON_BINDING_CODE", (String) null);
    }

    /* renamed from: o */
    public static String m6072o(Context context) {
        return C6763b.m25589a(context).getString("UUPON_POINT", "0");
    }

    /* renamed from: p */
    public static boolean m6073p(Context context) {
        return C6763b.m25589a(context).getBoolean("TtsEnabled", false);
    }

    /* renamed from: q */
    public static boolean m6074q(Context context) {
        return m6071n(context) != null;
    }

    /* renamed from: r */
    public static boolean m6075r(Context context) {
        return C6763b.m25589a(context).getString("UUPON_TOTURIAL", (String) null) == null;
    }

    /* renamed from: s */
    public static void m6076s(Context context) {
        C6763b.m25592b(context, "API_TOKEN");
    }

    /* renamed from: t */
    public static void m6077t(Context context) {
        C6763b.m25592b(context, "UUPON_BINDING_CODE");
    }

    /* renamed from: u */
    public static void m6078u(Context context) {
        C6763b.m25592b(context, "UUPON_POINT");
    }

    /* renamed from: v */
    public static void m6079v(Context context) {
        C6763b.m25591a(context, "FirstRouteFinished", true);
    }

    /* renamed from: w */
    public static void m6080w(Context context) {
        C6763b.m25591a(context, "TutorialShowed", true);
    }

    /* renamed from: x */
    public static void m6081x(Context context) {
        C6763b.m25591a(context, "UUPON_TOTURIAL", "UUPON_TOTURIAL");
    }
}
