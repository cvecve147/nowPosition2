package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2187Av;
import com.google.android.gms.internal.ads.C2215Bv;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2244Cv;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2301Ev;
import com.google.android.gms.internal.ads.C2302Ew;
import com.google.android.gms.internal.ads.C2329Fv;
import com.google.android.gms.internal.ads.C2388Hw;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2506M;
import com.google.android.gms.internal.ads.C2524Mq;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2617Pq;
import com.google.android.gms.internal.ads.C2626Pz;
import com.google.android.gms.internal.ads.C2804Wf;
import com.google.android.gms.internal.ads.C2857Yd;
import com.google.android.gms.internal.ads.C2880Yz;
import com.google.android.gms.internal.ads.C2903Zv;
import com.google.android.gms.internal.ads.C2930_u;
import com.google.android.gms.internal.ads.C2965bA;
import com.google.android.gms.internal.ads.C2987bu;
import com.google.android.gms.internal.ads.C3052eA;
import com.google.android.gms.internal.ads.C3057ee;
import com.google.android.gms.internal.ads.C3073eu;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3116gg;
import com.google.android.gms.internal.ads.C3131gv;
import com.google.android.gms.internal.ads.C3306mv;
import com.google.android.gms.internal.ads.C3370pa;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3449rv;
import com.google.android.gms.internal.ads.C3484ta;
import com.google.android.gms.internal.ads.C3506tv;
import com.google.android.gms.internal.ads.C3507tw;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3564vv;
import com.google.android.gms.internal.ads.C3596wz;
import com.google.android.gms.internal.ads.C3625y;
import com.google.android.gms.internal.ads.C3644yr;
import com.google.android.gms.internal.ads.C3648yv;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013b.p018b.p028h.p039h.C1101r;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.D */
public final class C1678D extends C1703ba implements C2301Ev {

    /* renamed from: o */
    private final Object f5504o;

    /* renamed from: p */
    private boolean f5505p;

    /* renamed from: q */
    private C3116gg<C2329Fv> f5506q;

    /* renamed from: r */
    private C3520uh f5507r;

    /* renamed from: s */
    private C3520uh f5508s;

    /* renamed from: t */
    private boolean f5509t;

    /* renamed from: u */
    private int f5510u;

    /* renamed from: v */
    private C3370pa f5511v;

    /* renamed from: w */
    private final String f5512w;

    public C1678D(Context context, C1804ua uaVar, zzjn zzjn, String str, C2533Mz mz, zzang zzang) {
        this(context, uaVar, zzjn, str, mz, zzang, false);
    }

    public C1678D(Context context, C1804ua uaVar, zzjn zzjn, String str, C2533Mz mz, zzang zzang, boolean z) {
        super(context, zzjn, str, mz, zzang, uaVar);
        this.f5504o = new Object();
        this.f5506q = new C3116gg<>();
        this.f5510u = 1;
        this.f5512w = UUID.randomUUID().toString();
        this.f5505p = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m7580a(C1698Y y, C1698Y y2) {
        if (y2.f5631r == null) {
            y2.f5631r = y.f5631r;
        }
        if (y2.f5632s == null) {
            y2.f5632s = y.f5632s;
        }
        if (y2.f5634u == null) {
            y2.f5634u = y.f5634u;
        }
        if (y2.f5635v == null) {
            y2.f5635v = y.f5635v;
        }
        if (y2.f5637x == null) {
            y2.f5637x = y.f5637x;
        }
        if (y2.f5636w == null) {
            y2.f5636w = y.f5636w;
        }
        if (y2.f5602F == null) {
            y2.f5602F = y.f5602F;
        }
        if (y2.f5625l == null) {
            y2.f5625l = y.f5625l;
        }
        if (y2.f5603G == null) {
            y2.f5603G = y.f5603G;
        }
        if (y2.f5626m == null) {
            y2.f5626m = y.f5626m;
        }
        if (y2.f5627n == null) {
            y2.f5627n = y.f5627n;
        }
        if (y2.f5622i == null) {
            y2.f5622i = y.f5622i;
        }
        if (y2.f5623j == null) {
            y2.f5623j = y.f5623j;
        }
        if (y2.f5624k == null) {
            y2.f5624k = y.f5624k;
        }
    }

    /* renamed from: a */
    private final void m7581a(C3449rv rvVar) {
        C3114ge.f9351a.post(new C1682H(this, rvVar));
    }

    /* renamed from: a */
    private final void m7582a(C3506tv tvVar) {
        C3114ge.f9351a.post(new C1684J(this, tvVar));
    }

    /* renamed from: a */
    private final void m7583a(C3648yv yvVar) {
        C3114ge.f9351a.post(new C1683I(this, yvVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C3648yv m7584b(com.google.android.gms.internal.ads.C2329Fv r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C3506tv
            r2 = 0
            if (r1 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.tv r0 = (com.google.android.gms.internal.ads.C3506tv) r0
            com.google.android.gms.internal.ads.yv r1 = new com.google.android.gms.internal.ads.yv
            r3 = r1
            java.lang.String r4 = r0.mo9903b()
            java.util.List r5 = r0.mo9901a()
            java.lang.String r6 = r0.mo9911h()
            com.google.android.gms.internal.ads.Zv r7 = r0.mo9900W()
            java.lang.String r8 = r0.mo9906d()
            java.lang.String r9 = r0.mo9915y()
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = 0
            r13 = 0
            com.google.android.gms.internal.ads.mv r14 = r0.mo8103Fb()
            com.google.android.gms.internal.ads.bu r15 = r0.getVideoController()
            android.view.View r16 = r0.mo8101Bb()
            d.g.b.a.b.b r17 = r0.mo9904c()
            java.lang.String r18 = r0.mo9912i()
            android.os.Bundle r19 = r0.getExtras()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            d.g.b.a.b.b r3 = r0.mo9914x()
            if (r3 == 0) goto L_0x00a4
            d.g.b.a.b.b r0 = r0.mo9914x()
        L_0x004d:
            java.lang.Object r0 = p101d.p129g.p131b.p132a.p134b.C5468d.m20962z(r0)
            r2 = r0
            goto L_0x00a4
        L_0x0053:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C3449rv
            if (r1 == 0) goto L_0x00a3
            com.google.android.gms.internal.ads.rv r0 = (com.google.android.gms.internal.ads.C3449rv) r0
            com.google.android.gms.internal.ads.yv r1 = new com.google.android.gms.internal.ads.yv
            r3 = r1
            java.lang.String r4 = r0.mo9689b()
            java.util.List r5 = r0.mo9687a()
            java.lang.String r6 = r0.mo9697h()
            com.google.android.gms.internal.ads.Zv r7 = r0.mo9701t()
            java.lang.String r8 = r0.mo9692d()
            r9 = 0
            double r10 = r0.mo9702u()
            java.lang.String r12 = r0.mo9704z()
            java.lang.String r13 = r0.mo9700s()
            com.google.android.gms.internal.ads.mv r14 = r0.mo8103Fb()
            com.google.android.gms.internal.ads.bu r15 = r0.getVideoController()
            android.view.View r16 = r0.mo8101Bb()
            d.g.b.a.b.b r17 = r0.mo9690c()
            java.lang.String r18 = r0.mo9698i()
            android.os.Bundle r19 = r0.getExtras()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            d.g.b.a.b.b r3 = r0.mo9703x()
            if (r3 == 0) goto L_0x00a4
            d.g.b.a.b.b r0 = r0.mo9703x()
            goto L_0x004d
        L_0x00a3:
            r1 = r2
        L_0x00a4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.C2387Hv
            if (r0 == 0) goto L_0x00ad
            com.google.android.gms.internal.ads.Hv r2 = (com.google.android.gms.internal.ads.C2387Hv) r2
            r1.mo8104a((com.google.android.gms.internal.ads.C2244Cv) r2)
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1678D.m7584b(com.google.android.gms.internal.ads.Fv):com.google.android.gms.internal.ads.yv");
    }

    /* renamed from: sc */
    private final boolean m7585sc() {
        C2254Dd dd = this.f5648f.f5623j;
        return dd != null && dd.f6859Q;
    }

    /* renamed from: tc */
    private final C3596wz m7586tc() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null || !dd.f6876o) {
            return null;
        }
        return dd.f6880s;
    }

    /* renamed from: uc */
    private final void m7587uc() {
        C3370pa mc = mo6762mc();
        if (mc != null) {
            mc.mo9853a();
        }
    }

    /* renamed from: Ab */
    public final void mo6734Ab() {
        super.mo6877hc();
        C3520uh uhVar = this.f5508s;
        if (uhVar != null) {
            uhVar.destroy();
            this.f5508s = null;
        }
    }

    /* renamed from: B */
    public final void mo6735B() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    /* renamed from: Jb */
    public final void mo6736Jb() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(dd.f6879r)) {
            super.mo6736Jb();
        } else {
            mo6855Ib();
        }
    }

    /* renamed from: Kb */
    public final boolean mo6737Kb() {
        if (m7586tc() != null) {
            return m7586tc().f10495q;
        }
        return false;
    }

    /* renamed from: Ob */
    public final void mo6738Ob() {
        C3520uh uhVar = this.f5507r;
        if (uhVar != null) {
            uhVar.destroy();
            this.f5507r = null;
        }
    }

    /* renamed from: Qb */
    public final void mo6739Qb() {
        C3073eu ca;
        C2626Pz pz = this.f5648f.f5623j.f6878q;
        if (pz == null) {
            super.mo6739Qb();
            return;
        }
        C2987bu buVar = null;
        try {
            C2880Yz Ba = pz.mo8706Ba();
            if (Ba != null) {
                buVar = Ba.getVideoController();
            } else {
                C2965bA Ja = pz.mo8707Ja();
                if (Ja != null) {
                    buVar = Ja.getVideoController();
                } else {
                    C3507tw ja = pz.mo8725ja();
                    if (ja != null) {
                        buVar = ja.getVideoController();
                    }
                }
            }
            if (buVar != null && (ca = buVar.mo8410ca()) != null) {
                ca.mo9410R();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: Rb */
    public final boolean mo6740Rb() {
        if (m7586tc() != null) {
            return m7586tc().f10494p;
        }
        return false;
    }

    /* renamed from: V */
    public final String mo6741V() {
        return this.f5648f.f5615b;
    }

    /* renamed from: Wb */
    public final void mo6742Wb() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(dd.f6879r)) {
            super.mo6742Wb();
        } else {
            mo6857Pb();
        }
    }

    /* renamed from: a */
    public final void mo6743a(View view) {
        if (this.f5653k != null) {
            C1697X.m7714u().mo9849a(this.f5653k, view);
        }
    }

    /* renamed from: a */
    public final void mo6744a(C2282Ed ed, C2930_u _uVar) {
        zzjn zzjn = ed.f6945d;
        if (zzjn != null) {
            this.f5648f.f5622i = zzjn;
        }
        if (ed.f6946e != -2) {
            C3114ge.f9351a.post(new C1679E(this, ed));
            return;
        }
        int i = ed.f6942a.f10747Y;
        if (i == 1) {
            C1698Y y = this.f5648f;
            y.f5605I = 0;
            C1697X.m7697d();
            C1698Y y2 = this.f5648f;
            y.f5621h = C2506M.m10576a(y2.f5616c, this, ed, y2.f5617d, (C3520uh) null, this.f5658m, this, _uVar);
            String valueOf = String.valueOf(this.f5648f.f5621h.getClass().getName());
            C2227Cf.m9532b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(ed.f6943b.f10805d).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("ads");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    jSONArray.put(jSONArray3.get(i3));
                }
            }
            m7587uc();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                arrayList.add(C3057ee.m12270a(new C1680F(this, i4, jSONArray, i, ed)));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    C3114ge.f9351a.post(new C1681G(this, (C2329Fv) ((C2804Wf) arrayList.get(i5)).get(((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7932mc)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException e) {
                    C2227Cf.m9535c("", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e2) {
                    C2227Cf.m9535c("", e2);
                }
            }
        } catch (JSONException e3) {
            C2227Cf.m9535c("Malformed native ad response", e3);
            mo6758i(0);
        }
    }

    /* renamed from: a */
    public final void mo6745a(C3131gv gvVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    /* renamed from: a */
    public final void mo6746a(C3520uh uhVar) {
        this.f5507r = uhVar;
    }

    /* renamed from: a */
    public final void mo6747a(C3625y yVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6748a(C2254Dd dd, C2254Dd dd2) {
        C1101r<String, C2388Hw> rVar;
        C3648yv yvVar;
        C2254Dd dd3 = dd2;
        View view = null;
        mo6755d((List<String>) null);
        if (this.f5648f.mo6842d()) {
            if (dd3.f6876o) {
                m7587uc();
                try {
                    C3052eA Ta = dd3.f6878q != null ? dd3.f6878q.mo8708Ta() : null;
                    C2880Yz Ba = dd3.f6878q != null ? dd3.f6878q.mo8706Ba() : null;
                    C2965bA Ja = dd3.f6878q != null ? dd3.f6878q.mo8707Ja() : null;
                    C3507tw ja = dd3.f6878q != null ? dd3.f6878q.mo8725ja() : null;
                    String c = C1703ba.m7798c(dd2);
                    if (Ta != null && this.f5648f.f5633t != null) {
                        String b = Ta.mo9353b();
                        List a = Ta.mo9350a();
                        String h = Ta.mo9360h();
                        C2903Zv t = Ta.mo9363t() != null ? Ta.mo9363t() : null;
                        String d = Ta.mo9356d();
                        String y = Ta.mo9365y();
                        double u = Ta.mo9364u();
                        String z = Ta.mo9366z();
                        String s = Ta.mo9362s();
                        C2987bu videoController = Ta.getVideoController();
                        if (Ta.mo9347E() != null) {
                            view = (View) C5468d.m20962z(Ta.mo9347E());
                        }
                        yvVar = new C3648yv(b, a, h, t, d, y, u, z, s, (C3306mv) null, videoController, view, Ta.mo9355c(), c, Ta.getExtras());
                        yvVar.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, Ta, (C2329Fv) yvVar));
                    } else if (Ba != null && this.f5648f.f5633t != null) {
                        String b2 = Ba.mo9099b();
                        List a2 = Ba.mo9096a();
                        String h2 = Ba.mo9107h();
                        C2903Zv t2 = Ba.mo9110t() != null ? Ba.mo9110t() : null;
                        String d2 = Ba.mo9103d();
                        double u2 = Ba.mo9111u();
                        String z2 = Ba.mo9112z();
                        String s2 = Ba.mo9109s();
                        C2987bu videoController2 = Ba.getVideoController();
                        if (Ba.mo9093E() != null) {
                            view = (View) C5468d.m20962z(Ba.mo9093E());
                        }
                        yvVar = new C3648yv(b2, a2, h2, t2, d2, (String) null, u2, z2, s2, (C3306mv) null, videoController2, view, Ba.mo9101c(), c, Ba.getExtras());
                        yvVar.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, Ba, (C2329Fv) yvVar));
                    } else if (Ba != null && this.f5648f.f5631r != null) {
                        String b3 = Ba.mo9099b();
                        List a3 = Ba.mo9096a();
                        String h3 = Ba.mo9107h();
                        C2903Zv t3 = Ba.mo9110t() != null ? Ba.mo9110t() : null;
                        String d3 = Ba.mo9103d();
                        double u3 = Ba.mo9111u();
                        String z3 = Ba.mo9112z();
                        String s3 = Ba.mo9109s();
                        Bundle extras = Ba.getExtras();
                        C2987bu videoController3 = Ba.getVideoController();
                        if (Ba.mo9093E() != null) {
                            view = (View) C5468d.m20962z(Ba.mo9093E());
                        }
                        C3449rv rvVar = new C3449rv(b3, a3, h3, t3, d3, u3, z3, s3, (C3306mv) null, extras, videoController3, view, Ba.mo9101c(), c);
                        rvVar.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, Ba, (C2329Fv) rvVar));
                        m7581a(rvVar);
                    } else if (Ja != null && this.f5648f.f5633t != null) {
                        String b4 = Ja.mo9214b();
                        List a4 = Ja.mo9211a();
                        String h4 = Ja.mo9222h();
                        C2903Zv W = Ja.mo9210W() != null ? Ja.mo9210W() : null;
                        String d4 = Ja.mo9218d();
                        String y2 = Ja.mo9224y();
                        C2987bu videoController4 = Ja.getVideoController();
                        if (Ja.mo9207E() != null) {
                            view = (View) C5468d.m20962z(Ja.mo9207E());
                        }
                        C3648yv yvVar2 = new C3648yv(b4, a4, h4, W, d4, y2, -1.0d, (String) null, (String) null, (C3306mv) null, videoController4, view, Ja.mo9216c(), c, Ja.getExtras());
                        C2965bA bAVar = Ja;
                        yvVar = yvVar2;
                        yvVar.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, bAVar, (C2329Fv) yvVar2));
                    } else if (Ja != null && this.f5648f.f5632s != null) {
                        String b5 = Ja.mo9214b();
                        List a5 = Ja.mo9211a();
                        String h5 = Ja.mo9222h();
                        C2903Zv W2 = Ja.mo9210W() != null ? Ja.mo9210W() : null;
                        String d5 = Ja.mo9218d();
                        String y3 = Ja.mo9224y();
                        Bundle extras2 = Ja.getExtras();
                        C2987bu videoController5 = Ja.getVideoController();
                        if (Ja.mo9207E() != null) {
                            view = (View) C5468d.m20962z(Ja.mo9207E());
                        }
                        C3506tv tvVar = new C3506tv(b5, a5, h5, W2, d5, y3, (C3306mv) null, extras2, videoController5, view, Ja.mo9216c(), c);
                        C2965bA bAVar2 = Ja;
                        C3506tv tvVar2 = tvVar;
                        tvVar2.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, bAVar2, (C2329Fv) tvVar));
                        m7582a(tvVar2);
                    } else if (ja == null || this.f5648f.f5635v == null || this.f5648f.f5635v.get(ja.mo10061l()) == null) {
                        C2227Cf.m9536d("No matching mapper/listener for retrieved native ad template.");
                        mo6758i(0);
                        return false;
                    } else {
                        C3114ge.f9351a.post(new C1686L(this, ja));
                    }
                    m7583a(yvVar);
                } catch (RemoteException e) {
                    C2227Cf.m9537d("#007 Could not call remote method.", e);
                }
            } else {
                C2329Fv fv = dd3.f6848F;
                if (this.f5505p) {
                    this.f5506q.mo9464b(fv);
                } else {
                    boolean z4 = fv instanceof C3506tv;
                    if (!z4 || this.f5648f.f5633t == null) {
                        if (!z4 || this.f5648f.f5632s == null) {
                            boolean z5 = fv instanceof C3449rv;
                            if (z5 && this.f5648f.f5633t != null) {
                                fv = dd3.f6848F;
                            } else if (!z5 || this.f5648f.f5631r == null) {
                                if ((fv instanceof C3564vv) && (rVar = this.f5648f.f5635v) != null) {
                                    C3564vv vvVar = (C3564vv) fv;
                                    if (rVar.get(vvVar.mo10061l()) != null) {
                                        C3114ge.f9351a.post(new C1685K(this, vvVar.mo10061l(), dd3));
                                    }
                                }
                                C2227Cf.m9536d("No matching listener for retrieved native ad template.");
                                mo6758i(0);
                                return false;
                            } else {
                                m7581a((C3449rv) dd3.f6848F);
                            }
                        } else {
                            m7582a((C3506tv) dd3.f6848F);
                        }
                    }
                    m7583a(m7584b(fv));
                }
            }
            return super.mo6748a(dd, dd2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6749a(zzjj zzjj, C2254Dd dd, boolean z) {
        return this.f5647e.mo6788e();
    }

    /* renamed from: a */
    public final boolean mo6750a(zzjj zzjj, C2930_u _uVar) {
        try {
            mo6761lc();
            return super.mo6888a(zzjj, _uVar, this.f5510u);
        } catch (Exception e) {
            if (!C2227Cf.m9531a(4)) {
                return false;
            }
            Log.i("Ads", "Error initializing webview.", e);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo6751b(C2187Av av) {
        C3520uh uhVar = this.f5507r;
        if (uhVar != null) {
            uhVar.mo8143a(av);
        }
    }

    /* renamed from: b */
    public final void mo6752b(C2244Cv cv) {
        if (this.f5648f.f5623j.f6872k != null) {
            C2524Mq i = C1697X.m7702i().mo8329i();
            C1698Y y = this.f5648f;
            i.mo8553a(y.f5622i, y.f5623j, (C3644yr) new C2617Pq(cv), (C3520uh) null);
        }
    }

    /* renamed from: b */
    public final void mo6753b(C3520uh uhVar) {
        this.f5508s = uhVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo6754d(int i, boolean z) {
        m7587uc();
        super.mo6754d(i, z);
    }

    /* renamed from: d */
    public final void mo6755d(List<String> list) {
        C2061y.m9072a("setNativeTemplates must be called on the main UI thread.");
        this.f5648f.f5602F = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ec */
    public final void mo6756ec() {
        mo6757h(false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6757h(boolean r7) {
        /*
            r6 = this;
            super.mo6757h(r7)
            boolean r7 = r6.f5509t
            if (r7 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.C2558Nu.f7851Zc
            com.google.android.gms.internal.ads.Lu r0 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r7 = r0.mo8515a(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x001c
            r6.mo6764oc()
        L_0x001c:
            boolean r7 = r6.m7585sc()
            if (r7 == 0) goto L_0x008b
            com.google.android.gms.internal.ads.uh r7 = r6.f5508s
            if (r7 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.uh r7 = r6.f5507r
            if (r7 == 0) goto L_0x008b
        L_0x002a:
            com.google.android.gms.internal.ads.uh r7 = r6.f5508s
            r0 = 0
            if (r7 == 0) goto L_0x0031
        L_0x002f:
            r5 = r0
            goto L_0x003a
        L_0x0031:
            com.google.android.gms.internal.ads.uh r7 = r6.f5507r
            if (r7 == 0) goto L_0x0038
            java.lang.String r0 = "javascript"
            goto L_0x002f
        L_0x0038:
            r7 = r0
            r5 = r7
        L_0x003a:
            android.webkit.WebView r0 = r7.getWebView()
            if (r0 == 0) goto L_0x008b
            com.google.android.gms.internal.ads.p r0 = com.google.android.gms.ads.internal.C1697X.m7714u()
            com.google.android.gms.ads.internal.Y r1 = r6.f5648f
            android.content.Context r1 = r1.f5616c
            boolean r0 = r0.mo9851b((android.content.Context) r1)
            if (r0 == 0) goto L_0x008b
            com.google.android.gms.ads.internal.Y r0 = r6.f5648f
            com.google.android.gms.internal.ads.zzang r0 = r0.f5618e
            int r1 = r0.f10856b
            int r0 = r0.f10857c
            r2 = 23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = "."
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.p r0 = com.google.android.gms.ads.internal.C1697X.m7714u()
            android.webkit.WebView r2 = r7.getWebView()
            java.lang.String r3 = ""
            java.lang.String r4 = "javascript"
            d.g.b.a.b.b r7 = r0.mo9846a(r1, r2, r3, r4, r5)
            r6.f5653k = r7
            d.g.b.a.b.b r7 = r6.f5653k
            if (r7 == 0) goto L_0x008b
            com.google.android.gms.internal.ads.p r7 = com.google.android.gms.ads.internal.C1697X.m7714u()
            d.g.b.a.b.b r0 = r6.f5653k
            r7.mo9848a((p101d.p129g.p131b.p132a.p134b.C5464b) r0)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1678D.mo6757h(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6758i(int i) {
        mo6754d(i, false);
    }

    /* renamed from: j */
    public final void mo6759j(int i) {
        C2061y.m9072a("setMaxNumberOfAds must be called on the main UI thread.");
        this.f5510u = i;
    }

    /* renamed from: kc */
    public final String mo6760kc() {
        return this.f5512w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lc */
    public final void mo6761lc() {
        synchronized (this.f5504o) {
            C2857Yd.m11615f("Initializing webview native ads utills");
            this.f5511v = new C3484ta(this.f5648f.f5616c, this, this.f5512w, this.f5648f.f5617d, this.f5648f.f5618e);
        }
    }

    /* renamed from: mc */
    public final C3370pa mo6762mc() {
        C3370pa paVar;
        synchronized (this.f5504o) {
            paVar = this.f5511v;
        }
        return paVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: nc */
    public final Future<C2329Fv> mo6763nc() {
        return this.f5506q;
    }

    /* renamed from: oc */
    public final void mo6764oc() {
        if (this.f5648f.f5623j == null || this.f5507r == null) {
            this.f5509t = true;
            C2227Cf.m9536d("Request to enable ActiveView before adState is available.");
            return;
        }
        C2524Mq i = C1697X.m7702i().mo8329i();
        C1698Y y = this.f5648f;
        i.mo8552a(y.f5622i, y.f5623j, this.f5507r.getView(), this.f5507r);
        this.f5509t = false;
    }

    /* renamed from: p */
    public final C2302Ew mo6765p(String str) {
        C2061y.m9072a("getOnCustomClickListener must be called on the main UI thread.");
        C1101r<String, C2302Ew> rVar = this.f5648f.f5634u;
        if (rVar == null) {
            return null;
        }
        return rVar.get(str);
    }

    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    /* renamed from: pc */
    public final void mo6767pc() {
        this.f5509t = false;
        if (this.f5648f.f5623j == null || this.f5507r == null) {
            C2227Cf.m9536d("Request to enable ActiveView before adState is available.");
        } else {
            C1697X.m7702i().mo8329i().mo8548a(this.f5648f.f5623j);
        }
    }

    /* renamed from: qc */
    public final C1101r<String, C2388Hw> mo6768qc() {
        C2061y.m9072a("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f5648f.f5635v;
    }

    /* renamed from: rc */
    public final void mo6769rc() {
        zzpl zzpl;
        C3520uh uhVar = this.f5507r;
        if (uhVar != null && uhVar.mo8174jb() != null && (zzpl = this.f5648f.f5636w) != null && zzpl.f10913f != null) {
            this.f5507r.mo8174jb().mo8408b(this.f5648f.f5636w.f10913f);
        }
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo6771z(C5464b bVar) {
        Object z = bVar != null ? C5468d.m20962z(bVar) : null;
        if (z instanceof C2244Cv) {
            ((C2244Cv) z).mo7881Cb();
        }
        super.mo6889b(this.f5648f.f5623j, false);
    }

    /* renamed from: zb */
    public final void mo6772zb() {
        if (m7585sc() && this.f5653k != null) {
            C3520uh uhVar = this.f5508s;
            if (uhVar == null && (uhVar = this.f5507r) == null) {
                uhVar = null;
            }
            if (uhVar != null) {
                uhVar.mo8149a("onSdkImpression", (Map<String, ?>) new HashMap());
            }
        }
    }
}
