package com.google.android.gms.ads.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.gmsg.C1737k;
import com.google.android.gms.ads.internal.gmsg.C1739m;
import com.google.android.gms.ads.internal.overlay.C1787s;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2087i;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2249D;
import com.google.android.gms.internal.ads.C2253Dc;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2311Fd;
import com.google.android.gms.internal.ads.C2370He;
import com.google.android.gms.internal.ads.C2385Ht;
import com.google.android.gms.internal.ads.C2397Id;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2499Lt;
import com.google.android.gms.internal.ads.C2524Mq;
import com.google.android.gms.internal.ads.C2534N;
import com.google.android.gms.internal.ads.C2536Na;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2568Od;
import com.google.android.gms.internal.ads.C2620Pt;
import com.google.android.gms.internal.ads.C2631Qd;
import com.google.android.gms.internal.ads.C2773Vd;
import com.google.android.gms.internal.ads.C2791Vt;
import com.google.android.gms.internal.ads.C2845Xs;
import com.google.android.gms.internal.ads.C2857Yd;
import com.google.android.gms.internal.ads.C2875Yu;
import com.google.android.gms.internal.ads.C2930_u;
import com.google.android.gms.internal.ads.C2987bu;
import com.google.android.gms.internal.ads.C3014ct;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3131gv;
import com.google.android.gms.internal.ads.C3146hi;
import com.google.android.gms.internal.ads.C3275ls;
import com.google.android.gms.internal.ads.C3303ms;
import com.google.android.gms.internal.ads.C3332ns;
import com.google.android.gms.internal.ads.C3344oc;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3432rf;
import com.google.android.gms.internal.ads.C3475st;
import com.google.android.gms.internal.ads.C3486tc;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3562vt;
import com.google.android.gms.internal.ads.C3568vz;
import com.google.android.gms.internal.ads.C3573wc;
import com.google.android.gms.internal.ads.C3602xd;
import com.google.android.gms.internal.ads.C3625y;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzms;
import com.google.android.gms.internal.ads.zzmu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.a */
public abstract class C1700a extends C2385Ht implements C1737k, C1739m, C1787s, C2534N, C2536Na, C2568Od, C2845Xs {

    /* renamed from: a */
    protected C2930_u f5643a;

    /* renamed from: b */
    protected C2875Yu f5644b;

    /* renamed from: c */
    private C2875Yu f5645c;

    /* renamed from: d */
    protected boolean f5646d = false;

    /* renamed from: e */
    protected final C1687M f5647e;

    /* renamed from: f */
    protected final C1698Y f5648f;

    /* renamed from: g */
    protected transient zzjj f5649g;

    /* renamed from: h */
    protected final C2524Mq f5650h;

    /* renamed from: i */
    private final Bundle f5651i = new Bundle();

    /* renamed from: j */
    private boolean f5652j = false;

    /* renamed from: k */
    protected C5464b f5653k;

    /* renamed from: l */
    protected final C1804ua f5654l;

    C1700a(C1698Y y, C1687M m, C1804ua uaVar) {
        this.f5648f = y;
        this.f5647e = new C1687M(this);
        this.f5654l = uaVar;
        C1697X.m7698e().mo9456b(this.f5648f.f5616c);
        C1697X.m7698e().mo9458c(this.f5648f.f5616c);
        C2773Vd.m11403a(this.f5648f.f5616c);
        C1697X.m7690C().mo9818a(this.f5648f.f5616c);
        C2397Id i = C1697X.m7702i();
        C1698Y y2 = this.f5648f;
        i.mo8316a(y2.f5616c, y2.f5618e);
        C1697X.m7704k().mo9125a(this.f5648f.f5616c);
        this.f5650h = C1697X.m7702i().mo8329i();
        C1697X.m7701h().mo7875a(this.f5648f.f5616c);
        C1697X.m7692E().mo9785a(this.f5648f.f5616c);
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7891fd)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new C1675A(this, new CountDownLatch(((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7903hd)).intValue()), timer), 0, ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7897gd)).longValue());
        }
    }

    /* renamed from: c */
    protected static boolean m7734c(zzjj zzjj) {
        Bundle bundle = zzjj.f10887m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    /* renamed from: q */
    private static long mo9926q(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            C2227Cf.m9533b("", e);
            return -1;
        }
    }

    /* renamed from: B */
    public void mo6735B() {
        C2061y.m9072a("#008 Must be called on the main UI thread.: resume");
    }

    /* renamed from: Da */
    public final C2620Pt mo6794Da() {
        return this.f5648f.f5628o;
    }

    /* renamed from: Ib */
    public final void mo6855Ib() {
        C2227Cf.m9534c("Ad clicked.");
        C3562vt vtVar = this.f5648f.f5627n;
        if (vtVar != null) {
            try {
                vtVar.mo8804f();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: Lb */
    public final void mo6856Lb() {
        mo6871cc();
    }

    /* renamed from: Na */
    public final C3562vt mo6795Na() {
        return this.f5648f.f5627n;
    }

    /* renamed from: Pb */
    public final void mo6857Pb() {
        C2227Cf.m9534c("Ad impression.");
        C3562vt vtVar = this.f5648f.f5627n;
        if (vtVar != null) {
            try {
                vtVar.mo8801S();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: Q */
    public final Bundle mo6797Q() {
        return this.f5652j ? this.f5651i : new Bundle();
    }

    /* renamed from: Ra */
    public final void mo6798Ra() {
        List<String> list;
        C2061y.m9072a("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.f5648f.f5623j == null) {
            C2227Cf.m9536d("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C2227Cf.m9532b("Pinging manual tracking URLs.");
        if (!this.f5648f.f5623j.f6853K) {
            ArrayList arrayList = new ArrayList();
            List<String> list2 = this.f5648f.f5623j.f6868g;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            C3568vz vzVar = this.f5648f.f5623j.f6877p;
            if (!(vzVar == null || (list = vzVar.f10413i) == null)) {
                arrayList.addAll(list);
            }
            if (!arrayList.isEmpty()) {
                C1697X.m7698e();
                C1698Y y = this.f5648f;
                C3114ge.m12410a(y.f5616c, y.f5618e.f10855a, (List<String>) arrayList);
                this.f5648f.f5623j.f6853K = true;
            }
        }
    }

    /* renamed from: T */
    public final boolean mo6799T() {
        return this.f5646d;
    }

    /* renamed from: V */
    public String mo6741V() {
        return this.f5648f.f5615b;
    }

    /* renamed from: X */
    public final zzjn mo6800X() {
        C2061y.m9072a("#008 Must be called on the main UI thread.: getAdSize");
        zzjn zzjn = this.f5648f.f5622i;
        if (zzjn == null) {
            return null;
        }
        return new zzms(zzjn);
    }

    /* renamed from: Zb */
    public final void mo6858Zb() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd != null && !TextUtils.isEmpty(dd.f6847E) && !dd.f6854L && C1697X.m7708o().mo8263b()) {
            C2227Cf.m9532b("Sending troubleshooting signals to the server.");
            C2370He o = C1697X.m7708o();
            C1698Y y = this.f5648f;
            o.mo8262b(y.f5616c, y.f5618e.f10855a, dd.f6847E, y.f5615b);
            dd.f6854L = true;
        }
    }

    /* renamed from: a */
    public final void mo6801a(C2249D d, String str) {
        C2227Cf.m9536d("#006 Unexpected call to a deprecated method.");
    }

    /* renamed from: a */
    public final void mo6802a(C2253Dc dc) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.f5648f.f5599C = dc;
    }

    /* renamed from: a */
    public void mo6859a(C2254Dd dd) {
        C3332ns nsVar;
        C3275ls lsVar;
        this.f5643a.mo9180a(this.f5645c, "awr");
        C1698Y y = this.f5648f;
        y.f5621h = null;
        int i = dd.f6865d;
        if (!(i == -2 || i == 3 || y.mo6836a() == null)) {
            C1697X.m7703j().mo8776a(this.f5648f.mo6836a());
        }
        if (dd.f6865d == -1) {
            this.f5646d = false;
            return;
        }
        if (mo6866b(dd)) {
            C2227Cf.m9532b("Ad refresh scheduled.");
        }
        int i2 = dd.f6865d;
        if (i2 != -2) {
            if (i2 == 3) {
                lsVar = dd.f6856N;
                nsVar = C3332ns.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                lsVar = dd.f6856N;
                nsVar = C3332ns.AD_FAILED_TO_LOAD;
            }
            lsVar.mo9686a(nsVar);
            mo6758i(dd.f6865d);
            return;
        }
        C1698Y y2 = this.f5648f;
        if (y2.f5603G == null) {
            y2.f5603G = new C2631Qd(y2.f5615b);
        }
        C1699Z z = this.f5648f.f5619f;
        if (z != null) {
            z.mo6847a().mo7816d(dd.f6847E);
        }
        this.f5650h.mo8548a(this.f5648f.f5623j);
        if (mo6748a(this.f5648f.f5623j, dd)) {
            C1698Y y3 = this.f5648f;
            y3.f5623j = dd;
            C2311Fd fd = y3.f5625l;
            if (fd != null) {
                C2254Dd dd2 = y3.f5623j;
                if (dd2 != null) {
                    fd.mo8067a(dd2.f6844B);
                    y3.f5625l.mo8071b(y3.f5623j.f6845C);
                    y3.f5625l.mo8072b(y3.f5623j.f6876o);
                }
                y3.f5625l.mo8069a(y3.f5622i.f10896d);
            }
            String str = "1";
            this.f5643a.mo9178a("is_mraid", this.f5648f.f5623j.mo7978a() ? str : "0");
            this.f5643a.mo9178a("is_mediation", this.f5648f.f5623j.f6876o ? str : "0");
            C3520uh uhVar = this.f5648f.f5623j.f6863b;
            if (!(uhVar == null || uhVar.mo8182mb() == null)) {
                C2930_u _uVar = this.f5643a;
                if (!this.f5648f.f5623j.f6863b.mo8182mb().mo9239g()) {
                    str = "0";
                }
                _uVar.mo9178a("is_delay_pl", str);
            }
            this.f5643a.mo9180a(this.f5644b, "ttc");
            if (C1697X.m7702i().mo8324d() != null) {
                C1697X.m7702i().mo8324d().mo8756a(this.f5643a);
            }
            mo6858Zb();
            if (this.f5648f.mo6842d()) {
                mo6756ec();
            }
        }
        if (dd.f6855M != null) {
            C1697X.m7698e().mo9451a(this.f5648f.f5616c, dd.f6855M);
        }
    }

    /* renamed from: a */
    public final void mo6860a(C2282Ed ed) {
        zzaej zzaej = ed.f6943b;
        if (zzaej.f10816o != -1 && !TextUtils.isEmpty(zzaej.f10827z)) {
            long q = mo9926q(ed.f6943b.f10827z);
            if (q != -1) {
                this.f5643a.mo9180a(this.f5643a.mo9175a(ed.f6943b.f10816o + q), "stc");
            }
        }
        this.f5643a.mo9177a(ed.f6943b.f10827z);
        this.f5643a.mo9180a(this.f5644b, "arf");
        this.f5645c = this.f5643a.mo9174a();
        this.f5643a.mo9178a("gqi", ed.f6943b.f10778A);
        C1698Y y = this.f5648f;
        y.f5620g = null;
        y.f5624k = ed;
        ed.f6950i.mo9685a((C3303ms) new C1701aa(this, ed));
        ed.f6950i.mo9686a(C3332ns.AD_LOADED);
        mo6744a(ed, this.f5643a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6744a(C2282Ed ed, C2930_u _uVar);

    /* renamed from: a */
    public final void mo6803a(C2499Lt lt) {
        this.f5648f.f5629p = lt;
    }

    /* renamed from: a */
    public final void mo6804a(C2620Pt pt) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setAppEventListener");
        this.f5648f.f5628o = pt;
    }

    /* renamed from: a */
    public final void mo6861a(C2875Yu yu) {
        this.f5643a = new C2930_u(((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7900ha)).booleanValue(), "load_ad", this.f5648f.f5622i.f10893a);
        this.f5645c = new C2875Yu(-1, (String) null, (C2875Yu) null);
        if (yu == null) {
            this.f5644b = new C2875Yu(-1, (String) null, (C2875Yu) null);
        } else {
            this.f5644b = new C2875Yu(yu.mo9077a(), yu.mo9078b(), yu.mo9079c());
        }
    }

    /* renamed from: a */
    public void mo6745a(C3131gv gvVar) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* renamed from: a */
    public final void mo6805a(C3475st stVar) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setAdClickListener");
        this.f5648f.f5626m = stVar;
    }

    /* renamed from: a */
    public final void mo6862a(C3573wc wcVar) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f5648f.f5600D = wcVar;
    }

    /* renamed from: a */
    public void mo6747a(C3625y yVar) {
        C2227Cf.m9536d("#006 Unexpected call to a deprecated method.");
    }

    /* renamed from: a */
    public final void mo6806a(zzjn zzjn) {
        C3520uh uhVar;
        C2061y.m9072a("#008 Must be called on the main UI thread.: setAdSize");
        C1698Y y = this.f5648f;
        y.f5622i = zzjn;
        C2254Dd dd = y.f5623j;
        if (!(dd == null || (uhVar = dd.f6863b) == null || y.f5605I != 0)) {
            uhVar.mo8145a(C3146hi.m12525a(zzjn));
        }
        C1699Z z = this.f5648f.f5619f;
        if (z != null) {
            if (z.getChildCount() > 1) {
                C1699Z z2 = this.f5648f.f5619f;
                z2.removeView(z2.getNextView());
            }
            this.f5648f.f5619f.setMinimumWidth(zzjn.f10898f);
            this.f5648f.f5619f.setMinimumHeight(zzjn.f10895c);
            this.f5648f.f5619f.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo6807a(zzlu zzlu) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.f5648f.f5638y = zzlu;
    }

    /* renamed from: a */
    public final void mo6808a(zzmu zzmu) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setVideoOptions");
        this.f5648f.f5637x = zzmu;
    }

    /* renamed from: a */
    public final void mo6863a(String str, String str2) {
        C2620Pt pt = this.f5648f.f5628o;
        if (pt != null) {
            try {
                pt.mo8698a(str, str2);
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo6864a(HashSet<C2311Fd> hashSet) {
        this.f5648f.mo6838a(hashSet);
    }

    /* renamed from: a */
    public void mo6809a(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo6748a(C2254Dd dd, C2254Dd dd2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo6750a(zzjj zzjj, C2930_u _uVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<String> mo6865b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String b : list) {
            arrayList.add(C3602xd.m14410b(b, this.f5648f.f5616c));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo6810b(C2791Vt vt) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.f5648f.f5630q = vt;
    }

    /* renamed from: b */
    public final void mo6811b(C3562vt vtVar) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setAdListener");
        this.f5648f.f5627n = vtVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6866b(C2254Dd dd) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6812b(zzjj zzjj) {
        String str;
        C2061y.m9072a("#008 Must be called on the main UI thread.: loadAd");
        C1697X.m7704k().mo9124a();
        this.f5651i.clear();
        this.f5652j = false;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7937nb)).booleanValue()) {
            zzjj = zzjj.mo10310b();
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7943ob)).booleanValue()) {
                zzjj.f10877c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
            }
        }
        if (C2087i.m9150b(this.f5648f.f5616c) && zzjj.f10885k != null) {
            C3014ct ctVar = new C3014ct(zzjj);
            ctVar.mo9288a((Location) null);
            zzjj = ctVar.mo9289a();
        }
        C1698Y y = this.f5648f;
        if (y.f5620g == null && y.f5621h == null) {
            C2227Cf.m9534c("Starting ad request.");
            mo6861a((C2875Yu) null);
            this.f5644b = this.f5643a.mo9174a();
            if (zzjj.f10880f) {
                str = "This request is sent from a test device.";
            } else {
                C3390pt.m13453a();
                String a = C3432rf.m13597a(this.f5648f.f5616c);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 71);
                sb.append("Use AdRequest.Builder.addTestDevice(\"");
                sb.append(a);
                sb.append("\") to get test ads on this device.");
                str = sb.toString();
            }
            C2227Cf.m9534c(str);
            this.f5647e.mo6782a(zzjj);
            this.f5646d = mo6750a(zzjj, this.f5643a);
            return this.f5646d;
        }
        C2227Cf.m9536d(this.f5649g != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
        this.f5649g = zzjj;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public void mo6867bc() {
        C2857Yd.m11615f("Ad closing.");
        C3562vt vtVar = this.f5648f.f5627n;
        if (vtVar != null) {
            try {
                vtVar.mo8802U();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
        C2253Dc dc = this.f5648f.f5599C;
        if (dc != null) {
            try {
                dc.mo7976q();
            } catch (RemoteException e2) {
                C2227Cf.m9537d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final List<String> mo6868c(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(C3602xd.m14409a(a, this.f5648f.f5616c));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo6869c(View view) {
        C1699Z z = this.f5648f.f5619f;
        if (z != null) {
            z.addView(view, C1697X.m7700g().mo9731d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo6870c(zzaig zzaig) {
        if (this.f5648f.f5599C != null) {
            String str = "";
            int i = 1;
            if (zzaig != null) {
                try {
                    str = zzaig.f10845a;
                    i = zzaig.f10846b;
                } catch (RemoteException e) {
                    C2227Cf.m9537d("#007 Could not call remote method.", e);
                    return;
                }
            }
            C3344oc ocVar = new C3344oc(str, i);
            this.f5648f.f5599C.mo7972a((C3486tc) ocVar);
            if (this.f5648f.f5600D != null) {
                this.f5648f.f5600D.mo10159a(ocVar, this.f5648f.f5624k.f6942a.f10773v);
            }
        }
    }

    /* renamed from: c */
    public final void mo6814c(String str) {
        C2061y.m9072a("#008 Must be called on the main UI thread.: setUserId");
        this.f5648f.f5601E = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cc */
    public final void mo6871cc() {
        C2857Yd.m11615f("Ad leaving application.");
        C3562vt vtVar = this.f5648f.f5627n;
        if (vtVar != null) {
            try {
                vtVar.mo8799N();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
        C2253Dc dc = this.f5648f.f5599C;
        if (dc != null) {
            try {
                dc.mo7975o();
            } catch (RemoteException e2) {
                C2227Cf.m9537d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo6754d(int i, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        C2227Cf.m9536d(sb.toString());
        this.f5646d = z;
        C3562vt vtVar = this.f5648f.f5627n;
        if (vtVar != null) {
            try {
                vtVar.mo8803c(i);
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
        C2253Dc dc = this.f5648f.f5599C;
        if (dc != null) {
            try {
                dc.mo7971a(i);
            } catch (RemoteException e2) {
                C2227Cf.m9537d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* renamed from: d */
    public final void mo6872d(String str, Bundle bundle) {
        C2499Lt lt;
        this.f5651i.putAll(bundle);
        if (this.f5652j && (lt = this.f5648f.f5629p) != null) {
            try {
                lt.mo8514Wa();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo6873d(zzjj zzjj) {
        C1699Z z = this.f5648f.f5619f;
        if (z == null) {
            return false;
        }
        ViewParent parent = z.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return C1697X.m7698e().mo9452a(view, view.getContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: dc */
    public final void mo6874dc() {
        C2857Yd.m11615f("Ad opening.");
        C3562vt vtVar = this.f5648f.f5627n;
        if (vtVar != null) {
            try {
                vtVar.mo8798M();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
        C2253Dc dc = this.f5648f.f5599C;
        if (dc != null) {
            try {
                dc.mo7977r();
            } catch (RemoteException e2) {
                C2227Cf.m9537d("#007 Could not call remote method.", e2);
            }
        }
    }

    public void destroy() {
        C2061y.m9072a("#008 Must be called on the main UI thread.: destroy");
        this.f5647e.mo6781a();
        this.f5650h.mo8554b(this.f5648f.f5623j);
        C1698Y y = this.f5648f;
        C1699Z z = y.f5619f;
        if (z != null) {
            z.mo6848b();
        }
        y.f5627n = null;
        y.f5629p = null;
        y.f5628o = null;
        y.f5598B = null;
        y.f5630q = null;
        y.mo6839a(false);
        C1699Z z2 = y.f5619f;
        if (z2 != null) {
            z2.removeAllViews();
        }
        y.mo6840b();
        y.mo6841c();
        y.f5623j = null;
    }

    /* renamed from: e */
    public void mo6817e(boolean z) {
        C2227Cf.m9536d("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ec */
    public void mo6756ec() {
        mo6757h(false);
    }

    /* renamed from: f */
    public void mo6490f() {
        if (this.f5648f.f5623j == null) {
            C2227Cf.m9536d("Ad state was null when trying to ping click URLs.");
            return;
        }
        C2227Cf.m9532b("Pinging click URLs.");
        C2311Fd fd = this.f5648f.f5625l;
        if (fd != null) {
            fd.mo8073c();
        }
        if (this.f5648f.f5623j.f6864c != null) {
            C1697X.m7698e();
            C1698Y y = this.f5648f;
            C3114ge.m12410a(y.f5616c, y.f5618e.f10855a, mo6868c(y.f5623j.f6864c));
        }
        C3475st stVar = this.f5648f.f5626m;
        if (stVar != null) {
            try {
                stVar.mo8018f();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: fc */
    public final void mo6875fc() {
        C2253Dc dc = this.f5648f.f5599C;
        if (dc != null) {
            try {
                dc.mo7973m();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: ga */
    public final C5464b mo6818ga() {
        C2061y.m9072a("#008 Must be called on the main UI thread.: getAdFrame");
        return C5468d.m20961a(this.f5648f.f5619f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: gc */
    public final void mo6876gc() {
        C2253Dc dc = this.f5648f.f5599C;
        if (dc != null) {
            try {
                dc.mo7974n();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    public C2987bu getVideoController() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo6757h(boolean z) {
        C2857Yd.m11615f("Ad finished loading.");
        this.f5646d = z;
        this.f5652j = true;
        C3562vt vtVar = this.f5648f.f5627n;
        if (vtVar != null) {
            try {
                vtVar.mo8800P();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
        C2253Dc dc = this.f5648f.f5599C;
        if (dc != null) {
            try {
                dc.mo7970I();
            } catch (RemoteException e2) {
                C2227Cf.m9537d("#007 Could not call remote method.", e2);
            }
        }
        C2499Lt lt = this.f5648f.f5629p;
        if (lt != null) {
            try {
                lt.mo8514Wa();
            } catch (RemoteException e3) {
                C2227Cf.m9537d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hc */
    public final void mo6877hc() {
        if (this.f5653k != null) {
            C1697X.m7714u().mo9850b(this.f5653k);
            this.f5653k = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6758i(int i) {
        mo6754d(i, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ic */
    public final String mo6878ic() {
        zzaej zzaej;
        C2282Ed ed = this.f5648f.f5624k;
        if (ed == null || (zzaej = ed.f6943b) == null) {
            return "javascript";
        }
        String str = zzaej.f10801X;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e) {
            C2227Cf.m9535c("", e);
            return "javascript";
        }
    }

    /* renamed from: kb */
    public final C1804ua mo6879kb() {
        return this.f5654l;
    }

    /* renamed from: pa */
    public final boolean mo6822pa() {
        C2061y.m9072a("#008 Must be called on the main UI thread.: isLoaded");
        C1698Y y = this.f5648f;
        return y.f5620g == null && y.f5621h == null && y.f5623j != null;
    }

    public void pause() {
        C2061y.m9072a("#008 Must be called on the main UI thread.: pause");
    }

    public final void stopLoading() {
        C2061y.m9072a("#008 Must be called on the main UI thread.: stopLoading");
        this.f5646d = false;
        this.f5648f.mo6839a(true);
    }
}
