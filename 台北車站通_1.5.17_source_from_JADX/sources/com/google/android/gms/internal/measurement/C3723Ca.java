package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.C2065l;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2098t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.measurement.Ca */
public final class C3723Ca extends C3770O {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3839ec f11025a;

    /* renamed from: b */
    private Boolean f11026b;

    /* renamed from: c */
    private String f11027c;

    public C3723Ca(C3839ec ecVar) {
        this(ecVar, (String) null);
    }

    private C3723Ca(C3839ec ecVar, String str) {
        C2061y.m9067a(ecVar);
        this.f11025a = ecVar;
        this.f11027c = null;
    }

    /* renamed from: a */
    private final void m14887a(Runnable runnable) {
        C2061y.m9067a(runnable);
        if (!C3758L.f11191Y.mo10498a().booleanValue() || !this.f11025a.mo10386c().mo11023z()) {
            this.f11025a.mo10386c().mo11020a(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    private final void m14888a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f11026b == null) {
                        if (!"com.google.android.gms".equals(this.f11027c) && !C2098t.m9180a(this.f11025a.getContext(), Binder.getCallingUid())) {
                            if (!C2065l.m9082a(this.f11025a.getContext()).mo7715a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f11026b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f11026b = Boolean.valueOf(z2);
                    }
                    if (this.f11026b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f11025a.mo10385b().mo10585y().mo10593a("Measurement Service called with invalid calling package. appId", C3801W.m15166a(str));
                    throw e;
                }
            }
            if (this.f11027c == null && C2064k.uidHasPackageName(this.f11025a.getContext(), Binder.getCallingUid(), str)) {
                this.f11027c = str;
            }
            if (!str.equals(this.f11027c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f11025a.mo10385b().mo10585y().mo10592a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: b */
    private final void m14889b(zzdz zzdz, boolean z) {
        C2061y.m9067a(zzdz);
        m14888a(zzdz.f11752a, false);
        this.f11025a.mo10392h().mo10801f(zzdz.f11753b);
    }

    /* renamed from: a */
    public final List<zzjx> mo10419a(zzdz zzdz, boolean z) {
        m14889b(zzdz, false);
        try {
            List<C3867lc> list = (List) this.f11025a.mo10386c().mo11019a(new C3786Sa(this, zzdz)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3867lc lcVar : list) {
                if (z || !C3871mc.m15531g(lcVar.f11536c)) {
                    arrayList.add(new zzjx(lcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f11025a.mo10385b().mo10585y().mo10594a("Failed to get user attributes. appId", C3801W.m15166a(zzdz.f11752a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final List<zzed> mo10420a(String str, String str2, zzdz zzdz) {
        m14889b(zzdz, false);
        try {
            return (List) this.f11025a.mo10386c().mo11019a(new C3755Ka(this, zzdz, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f11025a.mo10385b().mo10585y().mo10593a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzed> mo10421a(String str, String str2, String str3) {
        m14888a(str, true);
        try {
            return (List) this.f11025a.mo10386c().mo11019a(new C3759La(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f11025a.mo10385b().mo10585y().mo10593a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzjx> mo10422a(String str, String str2, String str3, boolean z) {
        m14888a(str, true);
        try {
            List<C3867lc> list = (List) this.f11025a.mo10386c().mo11019a(new C3751Ja(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3867lc lcVar : list) {
                if (z || !C3871mc.m15531g(lcVar.f11536c)) {
                    arrayList.add(new zzjx(lcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f11025a.mo10385b().mo10585y().mo10594a("Failed to get user attributes. appId", C3801W.m15166a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzjx> mo10423a(String str, String str2, boolean z, zzdz zzdz) {
        m14889b(zzdz, false);
        try {
            List<C3867lc> list = (List) this.f11025a.mo10386c().mo11019a(new C3747Ia(this, zzdz, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3867lc lcVar : list) {
                if (z || !C3871mc.m15531g(lcVar.f11536c)) {
                    arrayList.add(new zzjx(lcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f11025a.mo10385b().mo10585y().mo10594a("Failed to get user attributes. appId", C3801W.m15166a(zzdz.f11752a), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final void mo10424a(long j, String str, String str2, String str3) {
        m14887a((Runnable) new C3794Ua(this, str2, str3, str, j));
    }

    /* renamed from: a */
    public final void mo10425a(zzdz zzdz) {
        m14889b(zzdz, false);
        m14887a((Runnable) new C3727Da(this, zzdz));
    }

    /* renamed from: a */
    public final void mo10426a(zzed zzed) {
        C2061y.m9067a(zzed);
        C2061y.m9067a(zzed.f11771c);
        m14888a(zzed.f11769a, true);
        zzed zzed2 = new zzed(zzed);
        m14887a(zzed.f11771c.mo11112b() == null ? new C3739Ga(this, zzed2) : new C3743Ha(this, zzed2));
    }

    /* renamed from: a */
    public final void mo10427a(zzed zzed, zzdz zzdz) {
        C2061y.m9067a(zzed);
        C2061y.m9067a(zzed.f11771c);
        m14889b(zzdz, false);
        zzed zzed2 = new zzed(zzed);
        zzed2.f11769a = zzdz.f11752a;
        m14887a(zzed.f11771c.mo11112b() == null ? new C3731Ea(this, zzed2, zzdz) : new C3735Fa(this, zzed2, zzdz));
    }

    /* renamed from: a */
    public final void mo10428a(zzeu zzeu, zzdz zzdz) {
        C2061y.m9067a(zzeu);
        m14889b(zzdz, false);
        m14887a((Runnable) new C3767Na(this, zzeu, zzdz));
    }

    /* renamed from: a */
    public final void mo10429a(zzeu zzeu, String str, String str2) {
        C2061y.m9067a(zzeu);
        C2061y.m9076b(str);
        m14888a(str, true);
        m14887a((Runnable) new C3771Oa(this, zzeu, str));
    }

    /* renamed from: a */
    public final void mo10430a(zzjx zzjx, zzdz zzdz) {
        C2061y.m9067a(zzjx);
        m14889b(zzdz, false);
        m14887a(zzjx.mo11112b() == null ? new C3779Qa(this, zzjx, zzdz) : new C3782Ra(this, zzjx, zzdz));
    }

    /* renamed from: a */
    public final byte[] mo10431a(zzeu zzeu, String str) {
        C2061y.m9076b(str);
        C2061y.m9067a(zzeu);
        m14888a(str, true);
        this.f11025a.mo10385b().mo10579E().mo10593a("Log and bundle. event", this.f11025a.mo10390g().mo10557a(zzeu.f11781a));
        long c = this.f11025a.mo10382a().mo7727c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f11025a.mo10386c().mo11021b(new C3775Pa(this, zzeu, str)).get();
            if (bArr == null) {
                this.f11025a.mo10385b().mo10585y().mo10593a("Log and bundle returned null. appId", C3801W.m15166a(str));
                bArr = new byte[0];
            }
            this.f11025a.mo10385b().mo10579E().mo10595a("Log and bundle processed. event, size, time_ms", this.f11025a.mo10390g().mo10557a(zzeu.f11781a), Integer.valueOf(bArr.length), Long.valueOf((this.f11025a.mo10382a().mo7727c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f11025a.mo10385b().mo10585y().mo10595a("Failed to log and bundle. appId, event, error", C3801W.m15166a(str), this.f11025a.mo10390g().mo10557a(zzeu.f11781a), e);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo10432b(zzdz zzdz) {
        m14889b(zzdz, false);
        m14887a((Runnable) new C3790Ta(this, zzdz));
    }

    /* renamed from: c */
    public final void mo10433c(zzdz zzdz) {
        m14888a(zzdz.f11752a, false);
        m14887a((Runnable) new C3763Ma(this, zzdz));
    }

    /* renamed from: d */
    public final String mo10434d(zzdz zzdz) {
        m14889b(zzdz, false);
        return this.f11025a.mo10710d(zzdz);
    }
}
