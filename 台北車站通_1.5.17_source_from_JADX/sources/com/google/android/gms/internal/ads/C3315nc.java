package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1698Y;
import com.google.android.gms.ads.internal.gmsg.C1737k;
import com.google.android.gms.common.internal.C2061y;
import java.util.HashMap;
import java.util.Map;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.nc */
public final class C3315nc {

    /* renamed from: a */
    private static final C2505Lz f9854a = new C2505Lz();

    /* renamed from: b */
    private final C2533Mz f9855b;

    /* renamed from: c */
    private final C1698Y f9856c;

    /* renamed from: d */
    private final Map<String, C2884Zc> f9857d = new HashMap();

    /* renamed from: e */
    private final C2657Rc f9858e;

    /* renamed from: f */
    private final C1737k f9859f;

    /* renamed from: g */
    private final C2534N f9860g;

    public C3315nc(C1698Y y, C2533Mz mz, C2657Rc rc, C1737k kVar, C2534N n) {
        this.f9856c = y;
        this.f9855b = mz;
        this.f9858e = rc;
        this.f9859f = kVar;
        this.f9860g = n;
    }

    /* renamed from: a */
    public static boolean m13132a(C2254Dd dd, C2254Dd dd2) {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2884Zc mo9773a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.Zc> r0 = r4.f9857d
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.Zc r0 = (com.google.android.gms.internal.ads.C2884Zc) r0
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.Mz r1 = r4.f9855b     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.Lz r1 = f9854a     // Catch:{ Exception -> 0x002b }
        L_0x0016:
            com.google.android.gms.internal.ads.Zc r2 = new com.google.android.gms.internal.ads.Zc     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.Pz r1 = r1.mo8520g(r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.Rc r3 = r4.f9858e     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002b }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.Zc> r0 = r4.f9857d     // Catch:{ Exception -> 0x0028 }
            r0.put(r5, r2)     // Catch:{ Exception -> 0x0028 }
            r0 = r2
            goto L_0x0045
        L_0x0028:
            r1 = move-exception
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            java.lang.String r2 = "Fail to instantiate adapter "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003d
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0042
        L_0x003d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0042:
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r5, r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3315nc.mo9773a(java.lang.String):com.google.android.gms.internal.ads.Zc");
    }

    /* renamed from: a */
    public final zzaig mo9774a(zzaig zzaig) {
        C3596wz wzVar;
        C2254Dd dd = this.f9856c.f5623j;
        if (!(dd == null || (wzVar = dd.f6880s) == null || TextUtils.isEmpty(wzVar.f10489k))) {
            C3596wz wzVar2 = this.f9856c.f5623j.f6880s;
            zzaig = new zzaig(wzVar2.f10489k, wzVar2.f10490l);
        }
        C2254Dd dd2 = this.f9856c.f5623j;
        if (!(dd2 == null || dd2.f6877p == null)) {
            C1697X.m7717x();
            C1698Y y = this.f9856c;
            C2333Fz.m9843a(y.f5616c, y.f5618e.f10855a, y.f5623j.f6877p.f10417m, y.f5601E, zzaig);
        }
        return zzaig;
    }

    /* renamed from: a */
    public final void mo9775a() {
        C2061y.m9072a("destroy must be called on the main UI thread.");
        for (String str : this.f9857d.keySet()) {
            try {
                C2884Zc zc = this.f9857d.get(str);
                if (!(zc == null || zc.mo9113a() == null)) {
                    zc.mo9113a().destroy();
                }
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo9776a(Context context) {
        for (C2884Zc a : this.f9857d.values()) {
            try {
                a.mo9113a().mo8729u(C5468d.m20961a(context));
            } catch (RemoteException e) {
                C2227Cf.m9533b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo9777a(boolean z) {
        C2884Zc a = mo9773a(this.f9856c.f5623j.f6879r);
        if (a != null && a.mo9113a() != null) {
            try {
                a.mo9113a().mo8719a(z);
                a.mo9113a().showVideo();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo9778b() {
        C2061y.m9072a("pause must be called on the main UI thread.");
        for (String str : this.f9857d.keySet()) {
            try {
                C2884Zc zc = this.f9857d.get(str);
                if (!(zc == null || zc.mo9113a() == null)) {
                    zc.mo9113a().pause();
                }
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo9779c() {
        C2061y.m9072a("resume must be called on the main UI thread.");
        for (String str : this.f9857d.keySet()) {
            try {
                C2884Zc zc = this.f9857d.get(str);
                if (!(zc == null || zc.mo9113a() == null)) {
                    zc.mo9113a().mo8705B();
                }
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: d */
    public final C1737k mo9780d() {
        return this.f9859f;
    }

    /* renamed from: e */
    public final C2534N mo9781e() {
        return this.f9860g;
    }

    /* renamed from: f */
    public final void mo9782f() {
        C1698Y y = this.f9856c;
        y.f5605I = 0;
        C1697X.m7697d();
        C1698Y y2 = this.f9856c;
        C2745Uc uc = new C2745Uc(y2.f5616c, y2.f5624k, this);
        String valueOf = String.valueOf(C2745Uc.class.getName());
        C2227Cf.m9532b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        uc.mo8107a();
        y.f5621h = uc;
    }

    /* renamed from: g */
    public final void mo9783g() {
        C2254Dd dd = this.f9856c.f5623j;
        if (dd != null && dd.f6877p != null) {
            C1697X.m7717x();
            C1698Y y = this.f9856c;
            Context context = y.f5616c;
            String str = y.f5618e.f10855a;
            C2254Dd dd2 = y.f5623j;
            C2333Fz.m9842a(context, str, dd2, y.f5615b, false, dd2.f6877p.f10416l);
        }
    }

    /* renamed from: h */
    public final void mo9784h() {
        C2254Dd dd = this.f9856c.f5623j;
        if (dd != null && dd.f6877p != null) {
            C1697X.m7717x();
            C1698Y y = this.f9856c;
            Context context = y.f5616c;
            String str = y.f5618e.f10855a;
            C2254Dd dd2 = y.f5623j;
            C2333Fz.m9842a(context, str, dd2, y.f5615b, false, dd2.f6877p.f10418n);
        }
    }
}
