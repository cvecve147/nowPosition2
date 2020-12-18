package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.M */
public final class C3762M<V> {

    /* renamed from: a */
    private final C3781Qc<V> f11239a;

    /* renamed from: b */
    private final String f11240b;

    private C3762M(String str, C3781Qc<V> qc) {
        C2061y.m9067a(qc);
        this.f11239a = qc;
        this.f11240b = str;
    }

    /* renamed from: a */
    static C3762M<Double> m14968a(String str, double d, double d2) {
        return new C3762M<>(str, C3758L.f11193a.mo10633a(str, -3.0d));
    }

    /* renamed from: a */
    static C3762M<Integer> m14969a(String str, int i, int i2) {
        return new C3762M<>(str, C3758L.f11193a.mo10634a(str, i));
    }

    /* renamed from: a */
    static C3762M<Long> m14970a(String str, long j, long j2) {
        return new C3762M<>(str, C3758L.f11193a.mo10635a(str, j));
    }

    /* renamed from: a */
    static C3762M<String> m14971a(String str, String str2, String str3) {
        return new C3762M<>(str, C3758L.f11193a.mo10636a(str, str2));
    }

    /* renamed from: a */
    static C3762M<Boolean> m14972a(String str, boolean z, boolean z2) {
        return new C3762M<>(str, C3758L.f11193a.mo10637a(str, z));
    }

    /* renamed from: a */
    public final V mo10498a() {
        return this.f11239a.mo10531a();
    }

    /* renamed from: a */
    public final V mo10499a(V v) {
        return v != null ? v : this.f11239a.mo10531a();
    }

    /* renamed from: b */
    public final String mo10500b() {
        return this.f11240b;
    }
}
