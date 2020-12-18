package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1698Y;
import com.google.android.gms.ads.internal.C1703ba;
import com.google.android.gms.ads.internal.C1804ua;
import com.google.android.gms.common.internal.C2061y;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.qc */
public final class C3401qc extends C1703ba implements C2657Rc {

    /* renamed from: o */
    private static C3401qc f10063o;

    /* renamed from: p */
    private boolean f10064p;

    /* renamed from: q */
    private boolean f10065q;

    /* renamed from: r */
    private final C3459sd f10066r;

    /* renamed from: s */
    private final C3315nc f10067s = new C3315nc(this.f5648f, this.f5658m, this, this, this);

    public C3401qc(Context context, C1804ua uaVar, zzjn zzjn, C2533Mz mz, zzang zzang) {
        super(context, zzjn, (String) null, mz, zzang, uaVar);
        f10063o = this;
        this.f10066r = new C3459sd(context, (String) null);
    }

    /* renamed from: b */
    private static C2282Ed m13499b(C2282Ed ed) {
        C2282Ed ed2 = ed;
        C2857Yd.m11615f("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject a = C2656Rb.m11031a(ed2.f6943b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ed2.f6942a.f10756e);
            C3596wz wzVar = new C3596wz(Arrays.asList(new C3568vz[]{new C3568vz(a.toString(), (String) null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), (String) null, (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject.toString(), (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (String) null, (String) null, (String) null, (List<String>) null, (String) null, Collections.emptyList(), (String) null, -1)}), ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7932mc)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, (String) null, 0, -1, -1, false);
            return new C2282Ed(ed2.f6942a, ed2.f6943b, wzVar, ed2.f6945d, ed2.f6946e, ed2.f6947f, ed2.f6948g, ed2.f6949h, ed2.f6950i, (Boolean) null);
        } catch (JSONException e) {
            C2227Cf.m9533b("Unable to generate ad state for non-mediated rewarded video.", e);
            return new C2282Ed(ed2.f6942a, ed2.f6943b, (C3596wz) null, ed2.f6945d, 0, ed2.f6947f, ed2.f6948g, ed2.f6949h, ed2.f6950i, (Boolean) null);
        }
    }

    /* renamed from: kc */
    public static C3401qc m13500kc() {
        return f10063o;
    }

    /* renamed from: B */
    public final void mo6735B() {
        this.f10067s.mo9779c();
    }

    /* renamed from: Gb */
    public final void mo6975Gb() {
        mo6490f();
    }

    /* renamed from: a */
    public final void mo6744a(C2282Ed ed, C2930_u _uVar) {
        if (ed.f6946e != -2) {
            C3114ge.f9351a.post(new C3458sc(this, ed));
            return;
        }
        C1698Y y = this.f5648f;
        y.f5624k = ed;
        if (ed.f6944c == null) {
            y.f5624k = m13499b(ed);
        }
        this.f10067s.mo9782f();
    }

    /* renamed from: a */
    public final void mo9923a(zzahk zzahk) {
        C2061y.m9072a("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzahk.f10844b)) {
            C2227Cf.m9536d("Invalid ad unit id. Aborting.");
            C3114ge.f9351a.post(new C3429rc(this));
            return;
        }
        this.f10064p = false;
        C1698Y y = this.f5648f;
        String str = zzahk.f10844b;
        y.f5615b = str;
        this.f10066r.mo9994a(str);
        super.mo6812b(zzahk.f10843a);
    }

    /* renamed from: a */
    public final void mo6976a(zzaig zzaig) {
        zzaig a = this.f10067s.mo9774a(zzaig);
        if (C1697X.m7689B().mo10046h(this.f5648f.f5616c) && a != null) {
            C1697X.m7689B().mo10034a(this.f5648f.f5616c, C1697X.m7689B().mo10035b(this.f5648f.f5616c), this.f5648f.f5615b, a.f10845a, a.f10846b);
        }
        mo6870c(a);
    }

    /* renamed from: a */
    public final void mo6809a(boolean z) {
        C2061y.m9072a("setImmersiveMode must be called on the main UI thread.");
        this.f10065q = z;
    }

    /* renamed from: a */
    public final boolean mo6748a(C2254Dd dd, C2254Dd dd2) {
        mo6889b(dd2, false);
        return C3315nc.m13132a(dd, dd2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6749a(zzjj zzjj, C2254Dd dd, boolean z) {
        return false;
    }

    /* renamed from: b */
    public final void mo9924b(Context context) {
        this.f10067s.mo9776a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo6867bc() {
        this.f5648f.f5623j = null;
        super.mo6867bc();
    }

    public final void destroy() {
        this.f10067s.mo9775a();
        super.destroy();
    }

    /* renamed from: lc */
    public final void mo9925lc() {
        C2061y.m9072a("showAd must be called on the main UI thread.");
        if (!mo9927ya()) {
            C2227Cf.m9536d("The reward video has not loaded.");
        } else {
            this.f10067s.mo9777a(this.f10065q);
        }
    }

    /* renamed from: m */
    public final void mo6977m() {
        this.f10067s.mo9783g();
        mo6875fc();
    }

    /* renamed from: n */
    public final void mo6978n() {
        this.f10067s.mo9784h();
        mo6876gc();
    }

    /* renamed from: o */
    public final void mo6979o() {
        mo6871cc();
    }

    public final void pause() {
        this.f10067s.mo9778b();
    }

    /* renamed from: q */
    public final C2884Zc mo9926q(String str) {
        return this.f10067s.mo9773a(str);
    }

    /* renamed from: q */
    public final void mo6980q() {
        if (C1697X.m7689B().mo10046h(this.f5648f.f5616c)) {
            this.f10066r.mo9995a(false);
        }
        mo6867bc();
    }

    /* renamed from: r */
    public final void mo6981r() {
        if (C1697X.m7689B().mo10046h(this.f5648f.f5616c)) {
            this.f10066r.mo9995a(true);
        }
        mo6886a(this.f5648f.f5623j, false);
        mo6874dc();
    }

    /* renamed from: ya */
    public final boolean mo9927ya() {
        C2061y.m9072a("isLoaded must be called on the main UI thread.");
        C1698Y y = this.f5648f;
        return y.f5620g == null && y.f5621h == null && y.f5623j != null;
    }
}
