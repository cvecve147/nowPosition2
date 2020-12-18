package com.google.android.gms.common;

import com.google.android.gms.common.C1994g;
import com.google.android.gms.common.util.C2075a;
import com.google.android.gms.common.util.C2089k;

/* renamed from: com.google.android.gms.common.w */
final class C2100w extends C2074u {

    /* renamed from: e */
    private final String f6564e;

    /* renamed from: f */
    private final C1994g.C1995a f6565f;

    /* renamed from: g */
    private final boolean f6566g;

    /* renamed from: h */
    private final boolean f6567h;

    private C2100w(String str, C1994g.C1995a aVar, boolean z, boolean z2) {
        super(false, (String) null, (Throwable) null);
        this.f6564e = str;
        this.f6565f = aVar;
        this.f6566g = z;
        this.f6567h = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo7719a() {
        String str = this.f6567h ? "debug cert rejected" : "not whitelisted";
        String str2 = this.f6564e;
        String a = C2089k.m9154a(C2075a.m9103a("SHA-1").digest(this.f6565f.mo7547Xa()));
        boolean z = this.f6566g;
        StringBuilder sb = new StringBuilder(str.length() + 44 + String.valueOf(str2).length() + String.valueOf(a).length());
        sb.append(str);
        sb.append(": pkg=");
        sb.append(str2);
        sb.append(", sha1=");
        sb.append(a);
        sb.append(", atk=");
        sb.append(z);
        sb.append(", ver=12451009.false");
        return sb.toString();
    }
}
