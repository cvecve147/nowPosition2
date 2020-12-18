package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2083e;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: com.google.android.gms.internal.measurement.n */
public final class C3872n extends C3798Va {

    /* renamed from: b */
    private final Map<String, Long> f11559b = new C1080b();

    /* renamed from: c */
    private final Map<String, Integer> f11560c = new C1080b();

    /* renamed from: d */
    private long f11561d;

    public C3872n(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: a */
    private final void m15577a(long j, C3894sb sbVar) {
        if (sbVar == null) {
            mo10385b().mo10580F().mo10592a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo10385b().mo10580F().mo10593a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C3898tb.m15689a(sbVar, bundle, true);
            mo10567h().mo10623b("am", "_xa", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15580a(String str, long j) {
        mo10451d();
        C2061y.m9076b(str);
        if (this.f11560c.isEmpty()) {
            this.f11561d = j;
        }
        Integer num = this.f11560c.get(str);
        if (num != null) {
            this.f11560c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f11560c.size() >= 100) {
            mo10385b().mo10576B().mo10592a("Too many ads visible");
        } else {
            this.f11560c.put(str, 1);
            this.f11559b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    private final void m15581a(String str, long j, C3894sb sbVar) {
        if (sbVar == null) {
            mo10385b().mo10580F().mo10592a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo10385b().mo10580F().mo10593a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C3898tb.m15689a(sbVar, bundle, true);
            mo10567h().mo10623b("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15582b(long j) {
        for (String put : this.f11559b.keySet()) {
            this.f11559b.put(put, Long.valueOf(j));
        }
        if (!this.f11559b.isEmpty()) {
            this.f11561d = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15584b(String str, long j) {
        mo10451d();
        C2061y.m9076b(str);
        Integer num = this.f11560c.get(str);
        if (num != null) {
            C3894sb y = mo10570l().mo10972y();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f11560c.remove(str);
                Long l = this.f11559b.get(str);
                if (l == null) {
                    mo10385b().mo10585y().mo10592a("First ad unit exposure time was never set");
                } else {
                    this.f11559b.remove(str);
                    m15581a(str, j - l.longValue(), y);
                }
                if (this.f11560c.isEmpty()) {
                    long j2 = this.f11561d;
                    if (j2 == 0) {
                        mo10385b().mo10585y().mo10592a("First ad exposure time was never set");
                        return;
                    }
                    m15577a(j - j2, y);
                    this.f11561d = 0;
                    return;
                }
                return;
            }
            this.f11560c.put(str, Integer.valueOf(intValue));
            return;
        }
        mo10385b().mo10585y().mo10593a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* renamed from: a */
    public final void mo10806a(long j) {
        C3894sb y = mo10570l().mo10972y();
        for (String next : this.f11559b.keySet()) {
            m15581a(next, j - this.f11559b.get(next).longValue(), y);
        }
        if (!this.f11559b.isEmpty()) {
            m15577a(j - this.f11561d, y);
        }
        m15582b(j);
    }

    /* renamed from: a */
    public final void mo10807a(String str) {
        if (str == null || str.length() == 0) {
            mo10385b().mo10585y().mo10592a("Ad unit id must be a non-empty string");
            return;
        }
        mo10386c().mo11020a((Runnable) new C3876o(this, str, mo10382a().mo7726b()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: b */
    public final void mo10808b(String str) {
        if (str == null || str.length() == 0) {
            mo10385b().mo10585y().mo10592a("Ad unit id must be a non-empty string");
            return;
        }
        mo10386c().mo11020a((Runnable) new C3880p(this, str, mo10382a().mo7726b()));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3814Za mo10567h() {
        return super.mo10567h();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C3898tb mo10570l() {
        return super.mo10570l();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C3849ha mo10455q() {
        return super.mo10455q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C3908w mo10456r() {
        return super.mo10456r();
    }
}
