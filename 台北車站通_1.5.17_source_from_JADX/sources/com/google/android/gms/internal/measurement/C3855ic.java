package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ic */
final class C3855ic implements C3718B {

    /* renamed from: a */
    C3725Cc f11505a;

    /* renamed from: b */
    List<Long> f11506b;

    /* renamed from: c */
    List<C3923zc> f11507c;

    /* renamed from: d */
    private long f11508d;

    /* renamed from: e */
    private final /* synthetic */ C3839ec f11509e;

    private C3855ic(C3839ec ecVar) {
        this.f11509e = ecVar;
    }

    /* synthetic */ C3855ic(C3839ec ecVar, C3843fc fcVar) {
        this(ecVar);
    }

    /* renamed from: a */
    private static long m15485a(C3923zc zcVar) {
        return ((zcVar.f11749f.longValue() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final void mo10408a(C3725Cc cc) {
        C2061y.m9067a(cc);
        this.f11505a = cc;
    }

    /* renamed from: a */
    public final boolean mo10409a(long j, C3923zc zcVar) {
        C2061y.m9067a(zcVar);
        if (this.f11507c == null) {
            this.f11507c = new ArrayList();
        }
        if (this.f11506b == null) {
            this.f11506b = new ArrayList();
        }
        if (this.f11507c.size() > 0 && m15485a(this.f11507c.get(0)) != m15485a(zcVar)) {
            return false;
        }
        long d = this.f11508d + ((long) zcVar.mo10758d());
        if (d >= ((long) Math.max(0, C3758L.f11208o.mo10498a().intValue()))) {
            return false;
        }
        this.f11508d = d;
        this.f11507c.add(zcVar);
        this.f11506b.add(Long.valueOf(j));
        return this.f11507c.size() < Math.max(1, C3758L.f11209p.mo10498a().intValue());
    }
}
