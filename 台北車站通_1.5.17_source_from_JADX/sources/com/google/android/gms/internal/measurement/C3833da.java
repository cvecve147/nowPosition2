package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.da */
final class C3833da implements Runnable {

    /* renamed from: a */
    private final C3829ca f11406a;

    /* renamed from: b */
    private final int f11407b;

    /* renamed from: c */
    private final Throwable f11408c;

    /* renamed from: d */
    private final byte[] f11409d;

    /* renamed from: e */
    private final String f11410e;

    /* renamed from: f */
    private final Map<String, List<String>> f11411f;

    private C3833da(String str, C3829ca caVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C2061y.m9067a(caVar);
        this.f11406a = caVar;
        this.f11407b = i;
        this.f11408c = th;
        this.f11409d = bArr;
        this.f11410e = str;
        this.f11411f = map;
    }

    public final void run() {
        this.f11406a.mo10676a(this.f11410e, this.f11407b, this.f11408c, this.f11409d, this.f11411f);
    }
}
