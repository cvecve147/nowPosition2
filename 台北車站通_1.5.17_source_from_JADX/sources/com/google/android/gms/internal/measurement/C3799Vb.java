package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.C2083e;

/* renamed from: com.google.android.gms.internal.measurement.Vb */
public final class C3799Vb extends C3802Wa {

    /* renamed from: c */
    private Handler f11326c;

    /* renamed from: d */
    private long f11327d = mo10382a().mo7726b();

    /* renamed from: e */
    private final C3726D f11328e = new C3803Wb(this, this.f11325a);

    /* renamed from: f */
    private final C3726D f11329f = new C3807Xb(this, this.f11325a);

    C3799Vb(C3715Aa aa) {
        super(aa);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m15138A() {
        mo10451d();
        mo10573a(false);
        mo10566g().mo10806a(mo10382a().mo7726b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15139a(long j) {
        C3726D d;
        long j2;
        mo10451d();
        m15144z();
        this.f11328e.mo10438a();
        this.f11329f.mo10438a();
        mo10385b().mo10580F().mo10593a("Activity resumed, time", Long.valueOf(j));
        this.f11327d = j;
        if (mo10382a().mo7725a() - mo10455q().f11487u.mo10763a() > mo10455q().f11489w.mo10763a()) {
            mo10455q().f11488v.mo10760a(true);
            mo10455q().f11490x.mo10764a(0);
        }
        if (mo10455q().f11488v.mo10761a()) {
            d = this.f11328e;
            j2 = mo10455q().f11486t.mo10763a();
        } else {
            d = this.f11329f;
            j2 = 3600000;
        }
        d.mo10439a(Math.max(0, j2 - mo10455q().f11490x.mo10763a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15142b(long j) {
        mo10451d();
        m15144z();
        this.f11328e.mo10438a();
        this.f11329f.mo10438a();
        mo10385b().mo10580F().mo10593a("Activity paused, time", Long.valueOf(j));
        if (this.f11327d != 0) {
            mo10455q().f11490x.mo10764a(mo10455q().f11490x.mo10763a() + (j - this.f11327d));
        }
    }

    /* renamed from: z */
    private final void m15144z() {
        synchronized (this) {
            if (this.f11326c == null) {
                this.f11326c = new Handler(Looper.getMainLooper());
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* renamed from: a */
    public final boolean mo10573a(boolean z) {
        mo10451d();
        mo10588t();
        long b = mo10382a().mo7726b();
        mo10455q().f11489w.mo10764a(mo10382a().mo7725a());
        long j = b - this.f11327d;
        if (z || j >= 1000) {
            mo10455q().f11490x.mo10764a(j);
            mo10385b().mo10580F().mo10593a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            C3898tb.m15689a(mo10570l().mo10972y(), bundle, true);
            mo10567h().mo10623b("auto", "_e", bundle);
            this.f11327d = b;
            this.f11329f.mo10438a();
            this.f11329f.mo10439a(Math.max(0, 3600000 - mo10455q().f11490x.mo10763a()));
            return true;
        }
        mo10385b().mo10580F().mo10593a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C3872n mo10566g() {
        return super.mo10566g();
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

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo10457u() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo10574y() {
        this.f11328e.mo10438a();
        this.f11329f.mo10438a();
        this.f11327d = 0;
    }
}
