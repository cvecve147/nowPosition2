package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2083e;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: com.google.android.gms.internal.measurement.tb */
public final class C3898tb extends C3802Wa {

    /* renamed from: c */
    protected C3894sb f11654c;

    /* renamed from: d */
    private volatile C3894sb f11655d;

    /* renamed from: e */
    private C3894sb f11656e;

    /* renamed from: f */
    private long f11657f;

    /* renamed from: g */
    private final Map<Activity, C3894sb> f11658g = new C1080b();

    /* renamed from: h */
    private C3894sb f11659h;

    /* renamed from: i */
    private String f11660i;

    public C3898tb(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: a */
    private static String m15686a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: a */
    private final void m15687a(Activity activity, C3894sb sbVar, boolean z) {
        C3894sb sbVar2 = this.f11655d == null ? this.f11656e : this.f11655d;
        if (sbVar.f11640b == null) {
            sbVar = new C3894sb(sbVar.f11639a, m15686a(activity.getClass().getCanonicalName()), sbVar.f11641c);
        }
        this.f11656e = this.f11655d;
        this.f11657f = mo10382a().mo7726b();
        this.f11655d = sbVar;
        mo10386c().mo11020a((Runnable) new C3902ub(this, z, sbVar2, sbVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15688a(C3894sb sbVar) {
        mo10566g().mo10806a(mo10382a().mo7726b());
        if (mo10572p().mo10573a(sbVar.f11642d)) {
            sbVar.f11642d = false;
        }
    }

    /* renamed from: a */
    public static void m15689a(C3894sb sbVar, Bundle bundle, boolean z) {
        if (bundle != null && sbVar != null && (!bundle.containsKey("_sc") || z)) {
            String str = sbVar.f11639a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", sbVar.f11640b);
            bundle.putLong("_si", sbVar.f11641c);
        } else if (bundle != null && sbVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: d */
    private final C3894sb m15691d(Activity activity) {
        C2061y.m9067a(activity);
        C3894sb sbVar = this.f11658g.get(activity);
        if (sbVar != null) {
            return sbVar;
        }
        C3894sb sbVar2 = new C3894sb((String) null, m15686a(activity.getClass().getCanonicalName()), mo10454o().mo10804y());
        this.f11658g.put(activity, sbVar2);
        return sbVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* renamed from: a */
    public final void mo10965a(Activity activity) {
        this.f11658g.remove(activity);
    }

    /* renamed from: a */
    public final void mo10966a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle("com.google.firebase.analytics.screen_service")) != null) {
            this.f11658g.put(activity, new C3894sb(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* renamed from: a */
    public final void mo10967a(Activity activity, String str, String str2) {
        mo10386c();
        if (!C3909wa.m15801y()) {
            mo10385b().mo10576B().mo10592a("setCurrentScreen must be called from the main thread");
        } else if (this.f11655d == null) {
            mo10385b().mo10576B().mo10592a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f11658g.get(activity) == null) {
            mo10385b().mo10576B().mo10592a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m15686a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f11655d.f11640b.equals(str2);
            boolean c = C3871mc.m15529c(this.f11655d.f11639a, str);
            if (equals && c) {
                mo10385b().mo10577C().mo10592a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo10385b().mo10576B().mo10593a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo10385b().mo10580F().mo10594a("Setting current screen to name, class", str == null ? "null" : str, str2);
                C3894sb sbVar = new C3894sb(str, str2, mo10454o().mo10804y());
                this.f11658g.put(activity, sbVar);
                m15687a(activity, sbVar, true);
            } else {
                mo10385b().mo10576B().mo10593a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: a */
    public final void mo10968a(String str, C3894sb sbVar) {
        mo10451d();
        synchronized (this) {
            if (this.f11660i == null || this.f11660i.equals(str) || sbVar != null) {
                this.f11660i = str;
                this.f11659h = sbVar;
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: b */
    public final void mo10969b(Activity activity) {
        C3894sb d = m15691d(activity);
        this.f11656e = this.f11655d;
        this.f11657f = mo10382a().mo7726b();
        this.f11655d = null;
        mo10386c().mo11020a((Runnable) new C3906vb(this, d));
    }

    /* renamed from: b */
    public final void mo10970b(Activity activity, Bundle bundle) {
        C3894sb sbVar;
        if (bundle != null && (sbVar = this.f11658g.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", sbVar.f11641c);
            bundle2.putString("name", sbVar.f11639a);
            bundle2.putString("referrer_name", sbVar.f11640b);
            bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: c */
    public final void mo10971c(Activity activity) {
        m15687a(activity, m15691d(activity), false);
        C3872n g = mo10566g();
        g.mo10386c().mo11020a((Runnable) new C3884q(g, g.mo10382a().mo7726b()));
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

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C3910wb mo10569k() {
        return super.mo10569k();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C3799Vb mo10572p() {
        return super.mo10572p();
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

    /* renamed from: y */
    public final C3894sb mo10972y() {
        mo10588t();
        mo10451d();
        return this.f11654c;
    }

    /* renamed from: z */
    public final C3894sb mo10973z() {
        return this.f11655d;
    }
}
