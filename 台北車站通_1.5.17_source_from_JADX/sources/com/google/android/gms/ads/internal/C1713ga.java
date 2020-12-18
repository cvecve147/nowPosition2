package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.C1726I;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2201Bh;
import com.google.android.gms.internal.ads.C2209Bp;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2329Fv;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2506M;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2626Pz;
import com.google.android.gms.internal.ads.C2857Yd;
import com.google.android.gms.internal.ads.C2930_u;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3131gv;
import com.google.android.gms.internal.ads.C3146hi;
import com.google.android.gms.internal.ads.C3340o;
import com.google.android.gms.internal.ads.C3345od;
import com.google.android.gms.internal.ads.C3373pd;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3568vz;
import com.google.android.gms.internal.ads.C3681zz;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.ga */
public abstract class C1713ga extends C1703ba implements C1712g, C3340o {

    /* renamed from: o */
    private boolean f5670o;

    public C1713ga(Context context, zzjn zzjn, String str, C2533Mz mz, zzang zzang, C1804ua uaVar) {
        super(context, zzjn, str, mz, zzang, uaVar);
    }

    /* renamed from: Hb */
    public final void mo6906Hb() {
        mo6490f();
    }

    /* renamed from: Mb */
    public final void mo6907Mb() {
        mo6892e();
        mo6798Ra();
    }

    /* renamed from: Yb */
    public final void mo6909Yb() {
        mo6867bc();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3520uh mo6910a(C2282Ed ed, C1806va vaVar, C3345od odVar) {
        C2282Ed ed2 = ed;
        View nextView = this.f5648f.f5619f.getNextView();
        if (nextView instanceof C3520uh) {
            ((C3520uh) nextView).destroy();
        }
        if (nextView != null) {
            this.f5648f.f5619f.removeView(nextView);
        }
        C1697X.m7699f();
        C1698Y y = this.f5648f;
        Context context = y.f5616c;
        C3146hi a = C3146hi.m12525a(y.f5622i);
        C1698Y y2 = this.f5648f;
        String str = y2.f5622i.f10893a;
        C2209Bp bp = y2.f5617d;
        zzang zzang = y2.f5618e;
        C3520uh a2 = C2201Bh.m9441a(context, a, str, false, false, bp, zzang, this.f5643a, this, this.f5654l, ed2.f6950i);
        if (this.f5648f.f5622i.f10899g == null) {
            mo6869c(a2.getView());
        }
        a2.mo8182mb().mo9229a(this, this, this, this, this, false, (C1726I) null, vaVar, this, odVar);
        mo6912a(a2);
        a2.mo8185o(ed2.f6942a.f10773v);
        return a2;
    }

    /* renamed from: a */
    public final void mo6911a(int i, int i2, int i3, int i4) {
        mo6874dc();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6744a(C2282Ed ed, C2930_u _uVar) {
        if (ed.f6946e != -2) {
            C3114ge.f9351a.post(new C1756ia(this, ed));
            return;
        }
        zzjn zzjn = ed.f6945d;
        if (zzjn != null) {
            this.f5648f.f5622i = zzjn;
        }
        zzaej zzaej = ed.f6943b;
        if (!zzaej.f10810i || zzaej.f10780C) {
            C3373pd pdVar = this.f5654l.f5899c;
            C1698Y y = this.f5648f;
            C3114ge.f9351a.post(new C1758ja(this, ed, pdVar.mo9638a(y.f5616c, y.f5618e, ed.f6943b), _uVar));
            return;
        }
        C1698Y y2 = this.f5648f;
        y2.f5605I = 0;
        C1697X.m7697d();
        C1698Y y3 = this.f5648f;
        y2.f5621h = C2506M.m10576a(y3.f5616c, this, ed, y3.f5617d, (C3520uh) null, this.f5658m, this, _uVar);
    }

    /* renamed from: a */
    public final void mo6745a(C3131gv gvVar) {
        C2061y.m9072a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f5648f.f5598B = gvVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6912a(C3520uh uhVar) {
        uhVar.mo8157b("/trackActiveViewUnit", new C1754ha(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6748a(C2254Dd dd, C2254Dd dd2) {
        C1699Z z;
        if (this.f5648f.mo6842d() && (z = this.f5648f.f5619f) != null) {
            z.mo6847a().mo7814c(dd2.f6846D);
        }
        try {
            if (dd2.f6863b != null && !dd2.f6876o && dd2.f6858P) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7781Me)).booleanValue() && !dd2.f6862a.f10877c.containsKey("sdk_less_server_data")) {
                    try {
                        dd2.f6863b.mo8136Xa();
                    } catch (Throwable unused) {
                        C2857Yd.m11615f("Could not render test Ad label.");
                    }
                }
            }
        } catch (RuntimeException unused2) {
            C2857Yd.m11615f("Could not render test AdLabel.");
        }
        return super.mo6748a(dd, dd2);
    }

    /* renamed from: b */
    public final void mo6908b(View view) {
        C1698Y y = this.f5648f;
        y.f5604H = view;
        mo6859a(new C2254Dd(y.f5624k, (C3520uh) null, (C3568vz) null, (C2626Pz) null, (String) null, (C3681zz) null, (C2329Fv) null, (String) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo6913b(C3520uh uhVar) {
        C1698Y y = this.f5648f;
        C2254Dd dd = y.f5623j;
        if (dd != null) {
            this.f5650h.mo8552a(y.f5622i, dd, uhVar.getView(), uhVar);
            this.f5670o = false;
            return;
        }
        this.f5670o = true;
        C2227Cf.m9536d("Request to enable ActiveView before adState is available.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ec */
    public void mo6756ec() {
        super.mo6756ec();
        if (this.f5670o) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7851Zc)).booleanValue()) {
                mo6913b(this.f5648f.f5623j.f6863b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f6943b;
     */
    /* renamed from: kc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6914kc() {
        /*
            r1 = this;
            com.google.android.gms.ads.internal.Y r0 = r1.f5648f
            com.google.android.gms.internal.ads.Ed r0 = r0.f5624k
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.internal.ads.zzaej r0 = r0.f6943b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f10798U
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1713ga.mo6914kc():boolean");
    }
}
