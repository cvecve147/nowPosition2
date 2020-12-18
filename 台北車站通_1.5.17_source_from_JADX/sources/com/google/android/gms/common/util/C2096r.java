package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.r */
public class C2096r {

    /* renamed from: a */
    private static final Pattern f6563a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static boolean m9177a(String str) {
        return str == null || str.trim().isEmpty();
    }

    /* renamed from: b */
    public static String m9178b(String str) {
        return str == null ? "" : str;
    }
}
