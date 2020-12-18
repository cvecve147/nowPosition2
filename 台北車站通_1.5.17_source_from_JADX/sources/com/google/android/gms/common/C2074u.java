package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.C1994g;

/* renamed from: com.google.android.gms.common.u */
class C2074u {

    /* renamed from: a */
    private static final C2074u f6533a = new C2074u(true, (String) null, (Throwable) null);

    /* renamed from: b */
    final boolean f6534b;

    /* renamed from: c */
    private final String f6535c;

    /* renamed from: d */
    private final Throwable f6536d;

    C2074u(boolean z, String str, Throwable th) {
        this.f6534b = z;
        this.f6535c = str;
        this.f6536d = th;
    }

    /* renamed from: a */
    static C2074u m9097a(String str) {
        return new C2074u(false, str, (Throwable) null);
    }

    /* renamed from: a */
    static C2074u m9098a(String str, C1994g.C1995a aVar, boolean z, boolean z2) {
        return new C2100w(str, aVar, z, z2);
    }

    /* renamed from: a */
    static C2074u m9099a(String str, Throwable th) {
        return new C2074u(false, str, th);
    }

    /* renamed from: b */
    static C2074u m9100b() {
        return f6533a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7719a() {
        return this.f6535c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7720c() {
        if (this.f6534b) {
            return;
        }
        if (this.f6536d != null) {
            Log.d("GoogleCertificatesRslt", mo7719a(), this.f6536d);
        } else {
            Log.d("GoogleCertificatesRslt", mo7719a());
        }
    }
}
