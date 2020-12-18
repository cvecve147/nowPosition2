package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Ot */
public final class C2589Ot {

    /* renamed from: a */
    private final String f8077a;

    /* renamed from: b */
    private final String f8078b;

    public C2589Ot(String str, String str2) {
        this.f8077a = str;
        this.f8078b = str2;
    }

    /* renamed from: a */
    public final String mo8649a() {
        return this.f8077a;
    }

    /* renamed from: b */
    public final String mo8650b() {
        return this.f8078b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2589Ot.class == obj.getClass()) {
            C2589Ot ot = (C2589Ot) obj;
            return TextUtils.equals(this.f8077a, ot.f8077a) && TextUtils.equals(this.f8078b, ot.f8078b);
        }
    }

    public final int hashCode() {
        return (this.f8077a.hashCode() * 31) + this.f8078b.hashCode();
    }

    public final String toString() {
        String str = this.f8077a;
        String str2 = this.f8078b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
