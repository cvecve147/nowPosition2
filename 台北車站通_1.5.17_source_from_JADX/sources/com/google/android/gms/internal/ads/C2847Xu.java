package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Xu */
final class C2847Xu extends C2763Uu {
    C2847Xu() {
    }

    /* renamed from: a */
    private static String m11593a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    /* renamed from: a */
    public final String mo8937a(String str, String str2) {
        String a = m11593a(str);
        String a2 = m11593a(str2);
        if (TextUtils.isEmpty(a)) {
            return a2;
        }
        if (TextUtils.isEmpty(a2)) {
            return a;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(a2).length());
        sb.append(a);
        sb.append(",");
        sb.append(a2);
        return sb.toString();
    }
}
