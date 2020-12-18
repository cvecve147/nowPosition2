package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2083e;

/* renamed from: com.google.android.gms.internal.measurement._b */
final class C3818_b {

    /* renamed from: a */
    private final C2083e f11369a;

    /* renamed from: b */
    private long f11370b;

    public C3818_b(C2083e eVar) {
        C2061y.m9067a(eVar);
        this.f11369a = eVar;
    }

    /* renamed from: a */
    public final void mo10630a() {
        this.f11370b = 0;
    }

    /* renamed from: a */
    public final boolean mo10631a(long j) {
        return this.f11370b == 0 || this.f11369a.mo7726b() - this.f11370b >= 3600000;
    }

    /* renamed from: b */
    public final void mo10632b() {
        this.f11370b = this.f11369a.mo7726b();
    }
}
