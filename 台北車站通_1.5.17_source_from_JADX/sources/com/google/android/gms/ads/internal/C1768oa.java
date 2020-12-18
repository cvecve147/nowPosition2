package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
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
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2626Pz;
import com.google.android.gms.internal.ads.C2880Yz;
import com.google.android.gms.internal.ads.C2903Zv;
import com.google.android.gms.internal.ads.C2965bA;
import com.google.android.gms.internal.ads.C2987bu;
import com.google.android.gms.internal.ads.C3052eA;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3131gv;
import com.google.android.gms.internal.ads.C3306mv;
import com.google.android.gms.internal.ads.C3449rv;
import com.google.android.gms.internal.ads.C3506tv;
import com.google.android.gms.internal.ads.C3507tw;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3568vz;
import com.google.android.gms.internal.ads.C3596wz;
import com.google.android.gms.internal.ads.C3648yv;
import com.google.android.gms.internal.ads.C3681zz;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.List;
import org.json.JSONObject;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.oa */
public final class C1768oa extends C1703ba implements C2301Ev {

    /* renamed from: o */
    private boolean f5808o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2254Dd f5809p;

    /* renamed from: q */
    private boolean f5810q = false;

    public C1768oa(Context context, C1804ua uaVar, zzjn zzjn, String str, C2533Mz mz, zzang zzang) {
        super(context, zzjn, str, mz, zzang, uaVar);
    }

    /* renamed from: a */
    private static C2254Dd m7959a(C2282Ed ed, int i) {
        C2282Ed ed2 = ed;
        zzaef zzaef = ed2.f6942a;
        zzjj zzjj = zzaef.f10753c;
        zzaej zzaej = ed2.f6943b;
        List<String> list = zzaej.f10806e;
        String str = zzaej.f10817p;
        JSONObject jSONObject = ed2.f6949h;
        zzaig zzaig = zzaej.f10781D;
        List<String> list2 = zzaej.f10782E;
        return new C2254Dd(zzjj, (C3520uh) null, list, i, zzaej.f10808g, zzaej.f10812k, zzaej.f10814m, zzaej.f10813l, zzaef.f10760i, zzaej.f10810i, (C3568vz) null, (C2626Pz) null, (String) null, ed2.f6944c, (C3681zz) null, zzaej.f10811j, ed2.f6945d, zzaej.f10809h, ed2.f6947f, ed2.f6948g, str, jSONObject, (C2329Fv) null, zzaig, list2, list2, zzaej.f10784G, zzaej.f10785H, (String) null, zzaej.f10788K, zzaej.f10792O, ed2.f6950i, zzaej.f10796S, ed2.f6951j, zzaej.f10798U, zzaej.f10799V, zzaej.f10800W, zzaej.f10801X);
    }

    /* renamed from: a */
    private final void m7960a(C3648yv yvVar) {
        C3114ge.f9351a.post(new C1796qa(this, yvVar));
    }

    /* renamed from: b */
    private final boolean m7961b(C2254Dd dd, C2254Dd dd2) {
        Handler handler;
        Runnable saVar;
        C3648yv yvVar;
        C2254Dd dd3 = dd2;
        View view = null;
        mo6982d((List<String>) null);
        if (!this.f5648f.mo6842d()) {
            C2227Cf.m9536d("Native ad does not have custom rendering mode.");
        } else {
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
                } else if (Ba == null || this.f5648f.f5633t == null) {
                    if (Ba != null && this.f5648f.f5631r != null) {
                        String b2 = Ba.mo9099b();
                        List a2 = Ba.mo9096a();
                        String h2 = Ba.mo9107h();
                        C2903Zv t2 = Ba.mo9110t() != null ? Ba.mo9110t() : null;
                        String d2 = Ba.mo9103d();
                        double u2 = Ba.mo9111u();
                        String z2 = Ba.mo9112z();
                        String s2 = Ba.mo9109s();
                        Bundle extras = Ba.getExtras();
                        C2987bu videoController2 = Ba.getVideoController();
                        if (Ba.mo9093E() != null) {
                            view = (View) C5468d.m20962z(Ba.mo9093E());
                        }
                        C3449rv rvVar = new C3449rv(b2, a2, h2, t2, d2, u2, z2, s2, (C3306mv) null, extras, videoController2, view, Ba.mo9101c(), c);
                        rvVar.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, Ba, (C2329Fv) rvVar));
                        handler = C3114ge.f9351a;
                        saVar = new C1798ra(this, rvVar);
                    } else if (Ja != null && this.f5648f.f5633t != null) {
                        String b3 = Ja.mo9214b();
                        List a3 = Ja.mo9211a();
                        String h3 = Ja.mo9222h();
                        C2903Zv W = Ja.mo9210W() != null ? Ja.mo9210W() : null;
                        String d3 = Ja.mo9218d();
                        String y2 = Ja.mo9224y();
                        C2987bu videoController3 = Ja.getVideoController();
                        if (Ja.mo9207E() != null) {
                            view = (View) C5468d.m20962z(Ja.mo9207E());
                        }
                        C3648yv yvVar2 = new C3648yv(b3, a3, h3, W, d3, y2, -1.0d, (String) null, (String) null, (C3306mv) null, videoController3, view, Ja.mo9216c(), c, Ja.getExtras());
                        C2965bA bAVar = Ja;
                        yvVar = yvVar2;
                        yvVar.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, bAVar, (C2329Fv) yvVar2));
                    } else if (Ja != null && this.f5648f.f5632s != null) {
                        String b4 = Ja.mo9214b();
                        List a4 = Ja.mo9211a();
                        String h4 = Ja.mo9222h();
                        C2903Zv W2 = Ja.mo9210W() != null ? Ja.mo9210W() : null;
                        String d4 = Ja.mo9218d();
                        String y3 = Ja.mo9224y();
                        Bundle extras2 = Ja.getExtras();
                        C2987bu videoController4 = Ja.getVideoController();
                        if (Ja.mo9207E() != null) {
                            view = (View) C5468d.m20962z(Ja.mo9207E());
                        }
                        C3506tv tvVar = new C3506tv(b4, a4, h4, W2, d4, y3, (C3306mv) null, extras2, videoController4, view, Ja.mo9216c(), c);
                        C2965bA bAVar2 = Ja;
                        C3506tv tvVar2 = tvVar;
                        tvVar2.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, bAVar2, (C2329Fv) tvVar));
                        handler = C3114ge.f9351a;
                        saVar = new C1800sa(this, tvVar2);
                    } else if (ja == null || this.f5648f.f5635v == null || this.f5648f.f5635v.get(ja.mo10061l()) == null) {
                        C2227Cf.m9536d("No matching mapper/listener for retrieved native ad template.");
                        mo6758i(0);
                        return false;
                    } else {
                        C3114ge.f9351a.post(new C1802ta(this, ja));
                        return super.mo6748a(dd, dd2);
                    }
                    handler.post(saVar);
                    return super.mo6748a(dd, dd2);
                } else {
                    String b5 = Ba.mo9099b();
                    List a5 = Ba.mo9096a();
                    String h5 = Ba.mo9107h();
                    C2903Zv t3 = Ba.mo9110t() != null ? Ba.mo9110t() : null;
                    String d5 = Ba.mo9103d();
                    double u3 = Ba.mo9111u();
                    String z3 = Ba.mo9112z();
                    String s3 = Ba.mo9109s();
                    C2987bu videoController5 = Ba.getVideoController();
                    if (Ba.mo9093E() != null) {
                        view = (View) C5468d.m20962z(Ba.mo9093E());
                    }
                    yvVar = new C3648yv(b5, a5, h5, t3, d5, (String) null, u3, z3, s3, (C3306mv) null, videoController5, view, Ba.mo9101c(), c, Ba.getExtras());
                    yvVar.mo8104a((C2244Cv) new C2215Bv(this.f5648f.f5616c, (C2301Ev) this, this.f5648f.f5617d, Ba, (C2329Fv) yvVar));
                }
                m7960a(yvVar);
                return super.mo6748a(dd, dd2);
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
        mo6758i(0);
        return false;
    }

    /* renamed from: c */
    private final boolean m7962c(C2254Dd dd, C2254Dd dd2) {
        View a = C1799s.m8035a(dd2);
        if (a == null) {
            return false;
        }
        View nextView = this.f5648f.f5619f.getNextView();
        if (nextView != null) {
            if (nextView instanceof C3520uh) {
                ((C3520uh) nextView).destroy();
            }
            this.f5648f.f5619f.removeView(nextView);
        }
        if (!C1799s.m8047b(dd2)) {
            try {
                mo6869c(a);
            } catch (Throwable th) {
                C1697X.m7702i().mo8319a(th, "AdLoaderManager.swapBannerViews");
                C2227Cf.m9535c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.f5648f.f5619f.getChildCount() > 1) {
            this.f5648f.f5619f.showNext();
        }
        if (dd != null) {
            View nextView2 = this.f5648f.f5619f.getNextView();
            if (nextView2 != null) {
                this.f5648f.f5619f.removeView(nextView2);
            }
            this.f5648f.mo6841c();
        }
        this.f5648f.f5619f.setMinimumWidth(mo6800X().f10898f);
        this.f5648f.f5619f.setMinimumHeight(mo6800X().f10895c);
        this.f5648f.f5619f.requestLayout();
        this.f5648f.f5619f.setVisibility(0);
        return true;
    }

    /* renamed from: kc */
    private final C3596wz m7963kc() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null || !dd.f6876o) {
            return null;
        }
        return dd.f6880s;
    }

    /* renamed from: Ab */
    public final void mo6734Ab() {
        C2227Cf.m9537d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    /* renamed from: B */
    public final void mo6735B() {
        if (this.f5810q) {
            super.mo6735B();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    /* renamed from: Jb */
    public final void mo6736Jb() {
        C3568vz vzVar;
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(dd.f6879r) || (vzVar = this.f5648f.f5623j.f6877p) == null || !vzVar.mo10155b()) {
            super.mo6736Jb();
        } else {
            mo6855Ib();
        }
    }

    /* renamed from: Kb */
    public final boolean mo6737Kb() {
        if (m7963kc() != null) {
            return m7963kc().f10495q;
        }
        return false;
    }

    /* renamed from: Ob */
    public final void mo6738Ob() {
        C2227Cf.m9537d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    /* renamed from: Rb */
    public final boolean mo6740Rb() {
        if (m7963kc() != null) {
            return m7963kc().f10494p;
        }
        return false;
    }

    /* renamed from: Wb */
    public final void mo6742Wb() {
        C3568vz vzVar;
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(dd.f6879r) || (vzVar = this.f5648f.f5623j.f6877p) == null || !vzVar.mo10155b()) {
            super.mo6742Wb();
        } else {
            mo6857Pb();
        }
    }

    /* renamed from: a */
    public final void mo6743a(View view) {
        C2227Cf.m9537d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6744a(com.google.android.gms.internal.ads.C2282Ed r11, com.google.android.gms.internal.ads.C2930_u r12) {
        /*
            r10 = this;
            r0 = 0
            r10.f5809p = r0
            int r0 = r11.f6946e
            r1 = 0
            r2 = -2
            if (r0 == r2) goto L_0x0010
            com.google.android.gms.internal.ads.Dd r0 = m7959a((com.google.android.gms.internal.ads.C2282Ed) r11, (int) r0)
        L_0x000d:
            r10.f5809p = r0
            goto L_0x0020
        L_0x0010:
            com.google.android.gms.internal.ads.zzaej r0 = r11.f6943b
            boolean r0 = r0.f10810i
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "partialAdState is not mediation"
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)
            com.google.android.gms.internal.ads.Dd r0 = m7959a((com.google.android.gms.internal.ads.C2282Ed) r11, (int) r1)
            goto L_0x000d
        L_0x0020:
            com.google.android.gms.internal.ads.Dd r0 = r10.f5809p
            if (r0 == 0) goto L_0x002f
            android.os.Handler r11 = com.google.android.gms.internal.ads.C3114ge.f9351a
            com.google.android.gms.ads.internal.pa r12 = new com.google.android.gms.ads.internal.pa
            r12.<init>(r10)
            r11.post(r12)
            return
        L_0x002f:
            com.google.android.gms.internal.ads.zzjn r0 = r11.f6945d
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.ads.internal.Y r2 = r10.f5648f
            r2.f5622i = r0
        L_0x0037:
            com.google.android.gms.ads.internal.Y r0 = r10.f5648f
            r0.f5605I = r1
            com.google.android.gms.ads.internal.C1697X.m7697d()
            com.google.android.gms.ads.internal.Y r1 = r10.f5648f
            android.content.Context r2 = r1.f5616c
            com.google.android.gms.internal.ads.Bp r5 = r1.f5617d
            r6 = 0
            com.google.android.gms.internal.ads.Mz r7 = r10.f5658m
            r3 = r10
            r4 = r11
            r8 = r10
            r9 = r12
            com.google.android.gms.internal.ads.ze r11 = com.google.android.gms.internal.ads.C2506M.m10576a(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f5621h = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1768oa.mo6744a(com.google.android.gms.internal.ads.Ed, com.google.android.gms.internal.ads._u):void");
    }

    /* renamed from: a */
    public final void mo6745a(C3131gv gvVar) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6748a(com.google.android.gms.internal.ads.C2254Dd r5, com.google.android.gms.internal.ads.C2254Dd r6) {
        /*
            r4 = this;
            com.google.android.gms.ads.internal.Y r0 = r4.f5648f
            boolean r0 = r0.mo6842d()
            if (r0 == 0) goto L_0x0091
            boolean r0 = r6.f6876o
            r1 = 0
            if (r0 != 0) goto L_0x0016
            r4.mo6758i(r1)
            java.lang.String r5 = "newState is not mediation."
        L_0x0012:
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r5)
            return r1
        L_0x0016:
            com.google.android.gms.internal.ads.vz r0 = r6.f6877p
            r2 = 1
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.mo10154a()
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.Y r0 = r4.f5648f
            boolean r0 = r0.mo6842d()
            if (r0 == 0) goto L_0x0038
            com.google.android.gms.ads.internal.Y r0 = r4.f5648f
            com.google.android.gms.ads.internal.Z r0 = r0.f5619f
            if (r0 == 0) goto L_0x0038
            com.google.android.gms.internal.ads.Ae r0 = r0.mo6847a()
            java.lang.String r3 = r6.f6846D
            r0.mo7814c(r3)
        L_0x0038:
            boolean r0 = super.mo6748a((com.google.android.gms.internal.ads.C2254Dd) r5, (com.google.android.gms.internal.ads.C2254Dd) r6)
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            r5 = r1
            goto L_0x005e
        L_0x0040:
            com.google.android.gms.ads.internal.Y r0 = r4.f5648f
            boolean r0 = r0.mo6842d()
            if (r0 == 0) goto L_0x0052
            boolean r5 = r4.m7962c(r5, r6)
            if (r5 != 0) goto L_0x0052
            r4.mo6758i(r1)
            goto L_0x003e
        L_0x0052:
            com.google.android.gms.ads.internal.Y r5 = r4.f5648f
            boolean r5 = r5.mo6843e()
            if (r5 != 0) goto L_0x005d
            super.mo6886a((com.google.android.gms.internal.ads.C2254Dd) r6, (boolean) r1)
        L_0x005d:
            r5 = r2
        L_0x005e:
            if (r5 != 0) goto L_0x0061
            return r1
        L_0x0061:
            r4.f5810q = r2
            goto L_0x0075
        L_0x0064:
            com.google.android.gms.internal.ads.vz r0 = r6.f6877p
            if (r0 == 0) goto L_0x008b
            boolean r0 = r0.mo10155b()
            if (r0 == 0) goto L_0x008b
            boolean r5 = r4.m7961b(r5, r6)
            if (r5 != 0) goto L_0x0075
            return r1
        L_0x0075:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r2]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.mo6983e((java.util.List<java.lang.Integer>) r5)
            return r2
        L_0x008b:
            r4.mo6758i(r1)
            java.lang.String r5 = "Response is neither banner nor native."
            goto L_0x0012
        L_0x0091:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1768oa.mo6748a(com.google.android.gms.internal.ads.Dd, com.google.android.gms.internal.ads.Dd):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6749a(zzjj zzjj, C2254Dd dd, boolean z) {
        return false;
    }

    /* renamed from: b */
    public final void mo6751b(C2187Av av) {
        C2227Cf.m9537d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    /* renamed from: b */
    public final void mo6752b(C2244Cv cv) {
        C2227Cf.m9537d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    /* renamed from: b */
    public final boolean mo6812b(zzjj zzjj) {
        zzjj zzjj2 = zzjj;
        List<Integer> list = this.f5648f.f5597A;
        if (list != null && list.size() == 1 && this.f5648f.f5597A.get(0).intValue() == 2) {
            C2227Cf.m9529a("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            mo6758i(0);
            return false;
        } else if (this.f5648f.f5639z == null) {
            return super.mo6812b(zzjj);
        } else {
            boolean z = zzjj2.f10882h;
            boolean z2 = this.f5808o;
            if (z != z2) {
                zzjj2 = new zzjj(zzjj2.f10875a, zzjj2.f10876b, zzjj2.f10877c, zzjj2.f10878d, zzjj2.f10879e, zzjj2.f10880f, zzjj2.f10881g, z || z2, zzjj2.f10883i, zzjj2.f10884j, zzjj2.f10885k, zzjj2.f10886l, zzjj2.f10887m, zzjj2.f10888n, zzjj2.f10889o, zzjj2.f10890p, zzjj2.f10891q, zzjj2.f10892r);
            }
            return super.mo6812b(zzjj2);
        }
    }

    /* renamed from: d */
    public final void mo6982d(List<String> list) {
        C2061y.m9072a("setNativeTemplates must be called on the main UI thread.");
        this.f5648f.f5602F = list;
    }

    /* renamed from: e */
    public final void mo6983e(List<Integer> list) {
        C2061y.m9072a("setAllowedAdTypes must be called on the main UI thread.");
        this.f5648f.f5597A = list;
    }

    /* renamed from: e */
    public final void mo6817e(boolean z) {
        C2061y.m9072a("setManualImpressionsEnabled must be called from the main thread.");
        this.f5808o = z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = r2.f5648f;
     */
    /* renamed from: ec */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6756ec() {
        /*
            r2 = this;
            super.mo6756ec()
            com.google.android.gms.ads.internal.Y r0 = r2.f5648f
            com.google.android.gms.internal.ads.Dd r0 = r0.f5623j
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.vz r0 = r0.f6877p
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.mo10154a()
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.ads.internal.Y r0 = r2.f5648f
            com.google.android.gms.internal.ads.Kw r1 = r0.f5639z
            if (r1 == 0) goto L_0x0031
            android.content.Context r0 = r0.f5616c     // Catch:{ RemoteException -> 0x002b }
            d.g.b.a.b.b r0 = p101d.p129g.p131b.p132a.p134b.C5468d.m20961a(r0)     // Catch:{ RemoteException -> 0x002b }
            r1.mo8465a(r2, r0)     // Catch:{ RemoteException -> 0x002b }
            com.google.android.gms.ads.internal.Y r0 = r2.f5648f     // Catch:{ RemoteException -> 0x002b }
            com.google.android.gms.internal.ads.Dd r0 = r0.f5623j     // Catch:{ RemoteException -> 0x002b }
            r1 = 0
            super.mo6889b((com.google.android.gms.internal.ads.C2254Dd) r0, (boolean) r1)     // Catch:{ RemoteException -> 0x002b }
            return
        L_0x002b:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.C2227Cf.m9537d(r1, r0)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1768oa.mo6756ec():void");
    }

    public final C2987bu getVideoController() {
        return null;
    }

    /* renamed from: p */
    public final C2302Ew mo6765p(String str) {
        C2061y.m9072a("getOnCustomClickListener must be called on the main UI thread.");
        return this.f5648f.f5634u.get(str);
    }

    public final void pause() {
        if (this.f5810q) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo6984z(C5464b bVar) {
        Object z = bVar != null ? C5468d.m20962z(bVar) : null;
        if (z instanceof C2244Cv) {
            ((C2244Cv) z).mo7881Cb();
        }
        super.mo6889b(this.f5648f.f5623j, false);
    }

    /* renamed from: zb */
    public final void mo6772zb() {
        C2227Cf.m9537d("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }
}
