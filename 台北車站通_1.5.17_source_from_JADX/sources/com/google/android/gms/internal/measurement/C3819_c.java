package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement._c */
public final class C3819_c {

    /* renamed from: a */
    private final String f11371a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Uri f11372b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f11373c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f11374d;

    /* renamed from: e */
    private final boolean f11375e;

    /* renamed from: f */
    private final boolean f11376f;

    public C3819_c(Uri uri) {
        this((String) null, uri, "", "", false, false);
    }

    private C3819_c(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.f11371a = null;
        this.f11372b = uri;
        this.f11373c = str2;
        this.f11374d = str3;
        this.f11375e = false;
        this.f11376f = false;
    }

    /* renamed from: a */
    public final C3781Qc<Double> mo10633a(String str, double d) {
        return C3781Qc.m15053b(this, str, d);
    }

    /* renamed from: a */
    public final C3781Qc<Integer> mo10634a(String str, int i) {
        return C3781Qc.m15054b(this, str, i);
    }

    /* renamed from: a */
    public final C3781Qc<Long> mo10635a(String str, long j) {
        return C3781Qc.m15055b(this, str, j);
    }

    /* renamed from: a */
    public final C3781Qc<String> mo10636a(String str, String str2) {
        return C3781Qc.m15056b(this, str, str2);
    }

    /* renamed from: a */
    public final C3781Qc<Boolean> mo10637a(String str, boolean z) {
        return C3781Qc.m15057b(this, str, z);
    }
}
