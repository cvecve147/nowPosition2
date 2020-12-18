package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.rv */
public final class C3449rv extends C3307mw implements C2359Gv {

    /* renamed from: a */
    private String f10156a;

    /* renamed from: b */
    private List<C3420qv> f10157b;

    /* renamed from: c */
    private String f10158c;

    /* renamed from: d */
    private C2903Zv f10159d;

    /* renamed from: e */
    private String f10160e;

    /* renamed from: f */
    private double f10161f;

    /* renamed from: g */
    private String f10162g;

    /* renamed from: h */
    private String f10163h;

    /* renamed from: i */
    private C3306mv f10164i;

    /* renamed from: j */
    private Bundle f10165j;

    /* renamed from: k */
    private C2987bu f10166k;

    /* renamed from: l */
    private View f10167l;

    /* renamed from: m */
    private C5464b f10168m;

    /* renamed from: n */
    private String f10169n;

    /* renamed from: o */
    private Object f10170o = new Object();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2244Cv f10171p;

    public C3449rv(String str, List<C3420qv> list, String str2, C2903Zv zv, String str3, double d, String str4, String str5, C3306mv mvVar, Bundle bundle, C2987bu buVar, View view, C5464b bVar, String str6) {
        this.f10156a = str;
        this.f10157b = list;
        this.f10158c = str2;
        this.f10159d = zv;
        this.f10160e = str3;
        this.f10161f = d;
        this.f10162g = str4;
        this.f10163h = str5;
        this.f10164i = mvVar;
        this.f10165j = bundle;
        this.f10166k = buVar;
        this.f10167l = view;
        this.f10168m = bVar;
        this.f10169n = str6;
    }

    /* renamed from: Bb */
    public final View mo8101Bb() {
        return this.f10167l;
    }

    /* renamed from: Cb */
    public final String mo8102Cb() {
        return "2";
    }

    /* renamed from: Fb */
    public final C3306mv mo8103Fb() {
        return this.f10164i;
    }

    /* renamed from: a */
    public final List mo9687a() {
        return this.f10157b;
    }

    /* renamed from: a */
    public final void mo9688a(Bundle bundle) {
        synchronized (this.f10170o) {
            if (this.f10171p == null) {
                C2227Cf.m9529a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f10171p.mo7956a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo8104a(C2244Cv cv) {
        synchronized (this.f10170o) {
            this.f10171p = cv;
        }
    }

    /* renamed from: b */
    public final String mo9689b() {
        return this.f10156a;
    }

    /* renamed from: c */
    public final C5464b mo9690c() {
        return this.f10168m;
    }

    /* renamed from: c */
    public final boolean mo9691c(Bundle bundle) {
        synchronized (this.f10170o) {
            if (this.f10171p == null) {
                C2227Cf.m9529a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean c = this.f10171p.mo7963c(bundle);
            return c;
        }
    }

    /* renamed from: d */
    public final String mo9692d() {
        return this.f10160e;
    }

    /* renamed from: d */
    public final void mo9693d(Bundle bundle) {
        synchronized (this.f10170o) {
            if (this.f10171p == null) {
                C2227Cf.m9529a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f10171p.mo7964d(bundle);
            }
        }
    }

    public final void destroy() {
        C3114ge.f9351a.post(new C3477sv(this));
        this.f10156a = null;
        this.f10157b = null;
        this.f10158c = null;
        this.f10159d = null;
        this.f10160e = null;
        this.f10161f = 0.0d;
        this.f10162g = null;
        this.f10163h = null;
        this.f10164i = null;
        this.f10165j = null;
        this.f10170o = null;
        this.f10166k = null;
        this.f10167l = null;
    }

    public final Bundle getExtras() {
        return this.f10165j;
    }

    public final C2987bu getVideoController() {
        return this.f10166k;
    }

    /* renamed from: h */
    public final String mo9697h() {
        return this.f10158c;
    }

    /* renamed from: i */
    public final String mo9698i() {
        return this.f10169n;
    }

    /* renamed from: j */
    public final C2793Vv mo9699j() {
        return this.f10164i;
    }

    /* renamed from: l */
    public final String mo8105l() {
        return "";
    }

    /* renamed from: s */
    public final String mo9700s() {
        return this.f10163h;
    }

    /* renamed from: t */
    public final C2903Zv mo9701t() {
        return this.f10159d;
    }

    /* renamed from: u */
    public final double mo9702u() {
        return this.f10161f;
    }

    /* renamed from: x */
    public final C5464b mo9703x() {
        return C5468d.m20961a(this.f10171p);
    }

    /* renamed from: z */
    public final String mo9704z() {
        return this.f10162g;
    }
}
