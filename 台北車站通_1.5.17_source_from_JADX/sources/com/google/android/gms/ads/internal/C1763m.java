package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.C1726I;
import com.google.android.gms.ads.internal.gmsg.C1735i;
import com.google.android.gms.ads.internal.gmsg.C1736j;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C1771c;
import com.google.android.gms.ads.internal.overlay.C1779k;
import com.google.android.gms.ads.internal.overlay.C1781m;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2092n;
import com.google.android.gms.internal.ads.C2201Bh;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2656Rb;
import com.google.android.gms.internal.ads.C2930_u;
import com.google.android.gms.internal.ads.C2974bi;
import com.google.android.gms.internal.ads.C3061ei;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3146hi;
import com.google.android.gms.internal.ads.C3217jr;
import com.google.android.gms.internal.ads.C3289me;
import com.google.android.gms.internal.ads.C3315nc;
import com.google.android.gms.internal.ads.C3331nr;
import com.google.android.gms.internal.ads.C3345od;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3459sd;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3568vz;
import com.google.android.gms.internal.ads.C3596wz;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzaiq;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.m */
public final class C1763m extends C1713ga implements C1736j, C1726I {

    /* renamed from: p */
    private transient boolean f5794p;

    /* renamed from: q */
    private int f5795q = -1;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f5796r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f5797s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f5798t;

    /* renamed from: u */
    private C3459sd f5799u;

    /* renamed from: v */
    private String f5800v;

    /* renamed from: w */
    private final String f5801w;

    /* renamed from: x */
    private final C3315nc f5802x;

    public C1763m(Context context, zzjn zzjn, String str, C2533Mz mz, zzang zzang, C1804ua uaVar) {
        super(context, zzjn, str, mz, zzang, uaVar);
        boolean z = false;
        this.f5794p = false;
        if (zzjn != null && "reward_mb".equals(zzjn.f10893a)) {
            z = true;
        }
        this.f5801w = z ? "/Rewarded" : "/Interstitial";
        this.f5802x = z ? new C3315nc(this.f5648f, this.f5658m, new C1767o(this), this, this) : null;
    }

    /* renamed from: b */
    private static C2282Ed m7926b(C2282Ed ed) {
        C2282Ed ed2 = ed;
        try {
            String jSONObject = C2656Rb.m11031a(ed2.f6943b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ed2.f6942a.f10756e);
            C3568vz vzVar = new C3568vz(jSONObject, (String) null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), (String) null, (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (String) null, (String) null, (String) null, (List<String>) null, (String) null, Collections.emptyList(), (String) null, -1);
            zzaej zzaej = ed2.f6943b;
            C3596wz wzVar = new C3596wz(Collections.singletonList(vzVar), ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7932mc)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaej.f10788K, zzaej.f10789L, "", -1, 0, 1, (String) null, 0, -1, -1, false);
            return new C2282Ed(ed2.f6942a, new zzaej(ed2.f6942a, zzaej.f10804c, zzaej.f10805d, Collections.emptyList(), Collections.emptyList(), zzaej.f10809h, true, zzaej.f10811j, Collections.emptyList(), zzaej.f10813l, zzaej.f10814m, zzaej.f10815n, zzaej.f10816o, zzaej.f10817p, zzaej.f10818q, zzaej.f10819r, (String) null, zzaej.f10821t, zzaej.f10822u, zzaej.f10823v, zzaej.f10824w, zzaej.f10825x, zzaej.f10778A, zzaej.f10779B, zzaej.f10780C, (zzaig) null, Collections.emptyList(), Collections.emptyList(), zzaej.f10784G, zzaej.f10785H, zzaej.f10786I, zzaej.f10787J, zzaej.f10788K, zzaej.f10789L, zzaej.f10790M, (zzaiq) null, zzaej.f10792O, zzaej.f10793P, zzaej.f10794Q, zzaej.f10796S, 0, zzaej.f10798U, Collections.emptyList(), zzaej.f10800W, zzaej.f10801X), wzVar, ed2.f6945d, ed2.f6946e, ed2.f6947f, ed2.f6948g, (JSONObject) null, ed2.f6950i, (Boolean) null);
        } catch (JSONException e) {
            C2227Cf.m9533b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return ed2;
        }
    }

    /* renamed from: j */
    private final void m7928j(Bundle bundle) {
        C3114ge e = C1697X.m7698e();
        C1698Y y = this.f5648f;
        e.mo9455b(y.f5616c, y.f5618e.f10855a, "gmob-apps", bundle, false);
    }

    /* renamed from: q */
    private final boolean m7929q(boolean z) {
        return this.f5802x != null && z;
    }

    /* renamed from: Tb */
    public final void mo6971Tb() {
        C1771c Ya = this.f5648f.f5623j.f6863b.mo8137Ya();
        if (Ya != null) {
            Ya.mo6994bc();
        }
    }

    /* renamed from: Ub */
    public final void mo6940Ub() {
        C2254Dd dd = this.f5648f.f5623j;
        if (m7929q(dd != null && dd.f6876o)) {
            this.f5802x.mo9784h();
        }
        mo6876gc();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3520uh mo6910a(C2282Ed ed, C1806va vaVar, C3345od odVar) {
        C1697X.m7699f();
        C1698Y y = this.f5648f;
        Context context = y.f5616c;
        C3146hi a = C3146hi.m12525a(y.f5622i);
        C1698Y y2 = this.f5648f;
        C3520uh a2 = C2201Bh.m9441a(context, a, y2.f5622i.f10893a, false, false, y2.f5617d, y2.f5618e, this.f5643a, this, this.f5654l, ed.f6950i);
        a2.mo8182mb().mo9229a(this, this, (C1781m) null, this, this, ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7729Ea)).booleanValue(), this, vaVar, this, odVar);
        mo6912a(a2);
        a2.mo8185o(ed.f6942a.f10773v);
        a2.mo8157b("/reward", new C1735i(this));
        return a2;
    }

    /* renamed from: a */
    public final void mo6744a(C2282Ed ed, C2930_u _uVar) {
        if (ed.f6946e != -2) {
            super.mo6744a(ed, _uVar);
            return;
        }
        if (m7929q(ed.f6944c != null)) {
            this.f5802x.mo9782f();
            return;
        }
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7997xb)).booleanValue()) {
            super.mo6744a(ed, _uVar);
            return;
        }
        boolean z = !ed.f6943b.f10810i;
        if (C1700a.m7734c(ed.f6942a.f10753c) && z) {
            this.f5648f.f5624k = m7926b(ed);
        }
        super.mo6744a(this.f5648f.f5624k, _uVar);
    }

    /* renamed from: a */
    public final void mo6809a(boolean z) {
        C2061y.m9072a("setImmersiveMode must be called on the main UI thread.");
        this.f5798t = z;
    }

    /* renamed from: a */
    public final void mo6932a(boolean z, float f) {
        this.f5796r = z;
        this.f5797s = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r4 = r3.f5648f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6748a(com.google.android.gms.internal.ads.C2254Dd r4, com.google.android.gms.internal.ads.C2254Dd r5) {
        /*
            r3 = this;
            boolean r0 = r5.f6876o
            boolean r0 = r3.m7929q(r0)
            if (r0 == 0) goto L_0x000d
            boolean r4 = com.google.android.gms.internal.ads.C3315nc.m13132a(r4, r5)
            return r4
        L_0x000d:
            boolean r4 = super.mo6748a((com.google.android.gms.internal.ads.C2254Dd) r4, (com.google.android.gms.internal.ads.C2254Dd) r5)
            r0 = 0
            if (r4 != 0) goto L_0x0015
            return r0
        L_0x0015:
            com.google.android.gms.ads.internal.Y r4 = r3.f5648f
            boolean r4 = r4.mo6842d()
            if (r4 != 0) goto L_0x002e
            com.google.android.gms.ads.internal.Y r4 = r3.f5648f
            android.view.View r1 = r4.f5604H
            if (r1 == 0) goto L_0x002e
            org.json.JSONObject r2 = r5.f6872k
            if (r2 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.Mq r2 = r3.f5650h
            com.google.android.gms.internal.ads.zzjn r4 = r4.f5622i
            r2.mo8551a(r4, r5, r1)
        L_0x002e:
            r3.mo6889b((com.google.android.gms.internal.ads.C2254Dd) r5, (boolean) r0)
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1763m.mo6748a(com.google.android.gms.internal.ads.Dd, com.google.android.gms.internal.ads.Dd):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6749a(zzjj zzjj, C2254Dd dd, boolean z) {
        if (this.f5648f.mo6842d() && dd.f6863b != null) {
            C1697X.m7700g();
            C3289me.m13057a(dd.f6863b);
        }
        return this.f5647e.mo6788e();
    }

    /* renamed from: a */
    public final boolean mo6750a(zzjj zzjj, C2930_u _uVar) {
        if (this.f5648f.f5623j != null) {
            C2227Cf.m9536d("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f5799u == null && C1700a.m7734c(zzjj) && C1697X.m7689B().mo10045g(this.f5648f.f5616c) && !TextUtils.isEmpty(this.f5648f.f5615b)) {
            C1698Y y = this.f5648f;
            this.f5799u = new C3459sd(y.f5616c, y.f5615b);
        }
        return super.mo6750a(zzjj, _uVar);
    }

    /* renamed from: ac */
    public final void mo6941ac() {
        C2254Dd dd = this.f5648f.f5623j;
        if (m7929q(dd != null && dd.f6876o)) {
            this.f5802x.mo9783g();
            mo6875fc();
            return;
        }
        C2254Dd dd2 = this.f5648f.f5623j;
        if (!(dd2 == null || dd2.f6887z == null)) {
            C1697X.m7698e();
            C1698Y y = this.f5648f;
            C3114ge.m12410a(y.f5616c, y.f5618e.f10855a, y.f5623j.f6887z);
        }
        mo6875fc();
    }

    /* renamed from: b */
    public final void mo6942b(zzaig zzaig) {
        C2254Dd dd = this.f5648f.f5623j;
        if (m7929q(dd != null && dd.f6876o)) {
            mo6870c(this.f5802x.mo9774a(zzaig));
            return;
        }
        C2254Dd dd2 = this.f5648f.f5623j;
        if (dd2 != null) {
            if (dd2.f6843A != null) {
                C1697X.m7698e();
                C1698Y y = this.f5648f;
                C3114ge.m12410a(y.f5616c, y.f5618e.f10855a, y.f5623j.f6843A);
            }
            zzaig zzaig2 = this.f5648f.f5623j.f6886y;
            if (zzaig2 != null) {
                zzaig = zzaig2;
            }
        }
        mo6870c(zzaig);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo6867bc() {
        mo6973mc();
        super.mo6867bc();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ec */
    public final void mo6756ec() {
        zzaej zzaej;
        C2254Dd dd = this.f5648f.f5623j;
        C3520uh uhVar = dd != null ? dd.f6863b : null;
        C2282Ed ed = this.f5648f.f5624k;
        if (!(ed == null || (zzaej = ed.f6943b) == null || !zzaej.f10798U || uhVar == null || !C1697X.m7714u().mo9851b(this.f5648f.f5616c))) {
            zzang zzang = this.f5648f.f5618e;
            int i = zzang.f10856b;
            int i2 = zzang.f10857c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.f5653k = C1697X.m7714u().mo9846a(sb.toString(), uhVar.getWebView(), "", "javascript", mo6878ic());
            if (!(this.f5653k == null || uhVar.getView() == null)) {
                C1697X.m7714u().mo9849a(this.f5653k, uhVar.getView());
                C1697X.m7714u().mo9848a(this.f5653k);
            }
        }
        super.mo6756ec();
        this.f5794p = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: lc */
    public final boolean mo6972lc() {
        Window window;
        Context context = this.f5648f.f5616c;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        }
    }

    /* renamed from: mc */
    public final void mo6973mc() {
        C1697X.m7718y().mo9382b(Integer.valueOf(this.f5795q));
        if (this.f5648f.mo6842d()) {
            this.f5648f.mo6840b();
            C1698Y y = this.f5648f;
            y.f5623j = null;
            y.f5606J = false;
            this.f5794p = false;
        }
    }

    /* renamed from: p */
    public final void mo6933p(boolean z) {
        this.f5648f.f5606J = z;
    }

    public final void showInterstitial() {
        Bitmap bitmap;
        C2061y.m9072a("showInterstitial must be called on the main UI thread.");
        C2254Dd dd = this.f5648f.f5623j;
        if (m7929q(dd != null && dd.f6876o)) {
            this.f5802x.mo9777a(this.f5798t);
            return;
        }
        if (C1697X.m7689B().mo10045g(this.f5648f.f5616c)) {
            this.f5800v = C1697X.m7689B().mo10048j(this.f5648f.f5616c);
            String valueOf = String.valueOf(this.f5800v);
            String valueOf2 = String.valueOf(this.f5801w);
            this.f5800v = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.f5648f.f5623j == null) {
            C2227Cf.m9536d("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7835Wb)).booleanValue()) {
            String packageName = (this.f5648f.f5616c.getApplicationContext() != null ? this.f5648f.f5616c.getApplicationContext() : this.f5648f.f5616c).getPackageName();
            if (!this.f5794p) {
                C2227Cf.m9536d("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m7928j(bundle);
            }
            C1697X.m7698e();
            if (!C3114ge.m12440g(this.f5648f.f5616c)) {
                C2227Cf.m9536d("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                m7928j(bundle2);
            }
        }
        if (!this.f5648f.mo6843e()) {
            C2254Dd dd2 = this.f5648f.f5623j;
            if (!dd2.f6876o || dd2.f6878q == null) {
                C3520uh uhVar = this.f5648f.f5623j.f6863b;
                if (uhVar == null) {
                    C2227Cf.m9536d("The interstitial failed to load.");
                } else if (uhVar.mo8165fb()) {
                    C2227Cf.m9536d("The interstitial is already showing.");
                } else {
                    this.f5648f.f5623j.f6863b.mo8186o(true);
                    C1698Y y = this.f5648f;
                    y.mo6837a(y.f5623j.f6863b.getView());
                    C1698Y y2 = this.f5648f;
                    C2254Dd dd3 = y2.f5623j;
                    if (dd3.f6872k != null) {
                        this.f5650h.mo8550a(y2.f5622i, dd3);
                    }
                    if (C2092n.m9161b()) {
                        C2254Dd dd4 = this.f5648f.f5623j;
                        if (dd4.mo7978a()) {
                            new C3217jr(this.f5648f.f5616c, dd4.f6863b.getView()).mo9611a((C3331nr) dd4.f6863b);
                        } else {
                            dd4.f6863b.mo8182mb().mo9232a((C3061ei) new C1765n(this, dd4));
                        }
                    }
                    if (this.f5648f.f5606J) {
                        C1697X.m7698e();
                        bitmap = C3114ge.m12441h(this.f5648f.f5616c);
                    } else {
                        bitmap = null;
                    }
                    this.f5795q = C1697X.m7718y().mo9380a(bitmap);
                    if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7731Ec)).booleanValue() || bitmap == null) {
                        boolean z = this.f5648f.f5606J;
                        boolean lc = mo6972lc();
                        boolean z2 = this.f5798t;
                        C2254Dd dd5 = this.f5648f.f5623j;
                        zzaq zzaq = new zzaq(z, lc, false, 0.0f, -1, z2, dd5.f6857O, dd5.f6860R);
                        int requestedOrientation = this.f5648f.f5623j.f6863b.getRequestedOrientation();
                        if (requestedOrientation == -1) {
                            requestedOrientation = this.f5648f.f5623j.f6869h;
                        }
                        int i = requestedOrientation;
                        C1698Y y3 = this.f5648f;
                        C2254Dd dd6 = y3.f5623j;
                        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, dd6.f6863b, i, y3.f5618e, dd6.f6846D, zzaq);
                        C1697X.m7696c();
                        C1779k.m8016a(this.f5648f.f5616c, adOverlayInfoParcel, true);
                        return;
                    }
                    new C1793p(this, this.f5795q).mo8892e();
                }
            } else {
                try {
                    if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7955qb)).booleanValue()) {
                        this.f5648f.f5623j.f6878q.mo8719a(this.f5798t);
                    }
                    this.f5648f.f5623j.f6878q.showInterstitial();
                } catch (RemoteException e) {
                    C2227Cf.m9535c("Could not show interstitial.", e);
                    mo6973mc();
                }
            }
        }
    }

    /* renamed from: xb */
    public final void mo6896xb() {
        C2254Dd dd;
        C3520uh uhVar;
        C2254Dd dd2;
        C3520uh uhVar2;
        C2974bi mb;
        mo6892e();
        super.mo6896xb();
        C2254Dd dd3 = this.f5648f.f5623j;
        if (!(dd3 == null || (uhVar2 = dd3.f6863b) == null || (mb = uhVar2.mo8182mb()) == null)) {
            mb.mo9235c();
        }
        if (!(!C1697X.m7689B().mo10045g(this.f5648f.f5616c) || (dd2 = this.f5648f.f5623j) == null || dd2.f6863b == null)) {
            C1697X.m7689B().mo10038c(this.f5648f.f5623j.f6863b.getContext(), this.f5800v);
        }
        C3459sd sdVar = this.f5799u;
        if (sdVar != null) {
            sdVar.mo9995a(true);
        }
        if (this.f5653k != null && (dd = this.f5648f.f5623j) != null && (uhVar = dd.f6863b) != null) {
            uhVar.mo8149a("onSdkImpression", (Map<String, ?>) new HashMap());
        }
    }

    /* renamed from: yb */
    public final void mo6897yb() {
        super.mo6897yb();
        this.f5650h.mo8548a(this.f5648f.f5623j);
        C3459sd sdVar = this.f5799u;
        if (sdVar != null) {
            sdVar.mo9995a(false);
        }
        mo6877hc();
    }
}
