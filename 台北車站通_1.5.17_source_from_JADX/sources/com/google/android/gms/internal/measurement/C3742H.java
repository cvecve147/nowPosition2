package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.H */
final class C3742H {

    /* renamed from: a */
    final String f11123a;

    /* renamed from: b */
    final String f11124b;

    /* renamed from: c */
    final long f11125c;

    /* renamed from: d */
    final long f11126d;

    /* renamed from: e */
    final long f11127e;

    /* renamed from: f */
    final long f11128f;

    /* renamed from: g */
    final Long f11129g;

    /* renamed from: h */
    final Long f11130h;

    /* renamed from: i */
    final Boolean f11131i;

    C3742H(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Boolean bool) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        C2061y.m9076b(str);
        C2061y.m9076b(str2);
        boolean z = true;
        C2061y.m9073a(j5 >= 0);
        C2061y.m9073a(j6 >= 0);
        C2061y.m9073a(j7 < 0 ? false : z);
        this.f11123a = str;
        this.f11124b = str2;
        this.f11125c = j5;
        this.f11126d = j6;
        this.f11127e = j3;
        this.f11128f = j7;
        this.f11129g = l;
        this.f11130h = l2;
        this.f11131i = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3742H mo10473a() {
        return new C3742H(this.f11123a, this.f11124b, this.f11125c + 1, 1 + this.f11126d, this.f11127e, this.f11128f, this.f11129g, this.f11130h, this.f11131i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3742H mo10474a(long j) {
        return new C3742H(this.f11123a, this.f11124b, this.f11125c, this.f11126d, j, this.f11128f, this.f11129g, this.f11130h, this.f11131i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3742H mo10475a(Long l, Long l2, Boolean bool) {
        return new C3742H(this.f11123a, this.f11124b, this.f11125c, this.f11126d, this.f11127e, this.f11128f, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C3742H mo10476b(long j) {
        return new C3742H(this.f11123a, this.f11124b, this.f11125c, this.f11126d, this.f11127e, j, this.f11129g, this.f11130h, this.f11131i);
    }
}
