package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.yv */
public final class C3648yv extends C2738Tw implements C2359Gv {

    /* renamed from: a */
    private String f10613a;

    /* renamed from: b */
    private List<C3420qv> f10614b;

    /* renamed from: c */
    private String f10615c;

    /* renamed from: d */
    private C2903Zv f10616d;

    /* renamed from: e */
    private String f10617e;

    /* renamed from: f */
    private String f10618f;

    /* renamed from: g */
    private double f10619g;

    /* renamed from: h */
    private String f10620h;

    /* renamed from: i */
    private String f10621i;

    /* renamed from: j */
    private C3306mv f10622j;

    /* renamed from: k */
    private C2987bu f10623k;

    /* renamed from: l */
    private View f10624l;

    /* renamed from: m */
    private C5464b f10625m;

    /* renamed from: n */
    private String f10626n;

    /* renamed from: o */
    private Bundle f10627o;

    /* renamed from: p */
    private Object f10628p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C2244Cv f10629q;

    public C3648yv(String str, List<C3420qv> list, String str2, C2903Zv zv, String str3, String str4, double d, String str5, String str6, C3306mv mvVar, C2987bu buVar, View view, C5464b bVar, String str7, Bundle bundle) {
        this.f10613a = str;
        this.f10614b = list;
        this.f10615c = str2;
        this.f10616d = zv;
        this.f10617e = str3;
        this.f10618f = str4;
        this.f10619g = d;
        this.f10620h = str5;
        this.f10621i = str6;
        this.f10622j = mvVar;
        this.f10623k = buVar;
        this.f10624l = view;
        this.f10625m = bVar;
        this.f10626n = str7;
        this.f10627o = bundle;
    }

    /* renamed from: A */
    public final void mo8858A() {
        this.f10629q.mo7878A();
    }

    /* renamed from: Bb */
    public final View mo8101Bb() {
        return this.f10624l;
    }

    /* renamed from: Cb */
    public final String mo8102Cb() {
        return "6";
    }

    /* renamed from: Fb */
    public final C3306mv mo8103Fb() {
        return this.f10622j;
    }

    /* renamed from: a */
    public final List mo8859a() {
        return this.f10614b;
    }

    /* renamed from: a */
    public final void mo8860a(Bundle bundle) {
        synchronized (this.f10628p) {
            if (this.f10629q == null) {
                C2227Cf.m9529a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f10629q.mo7956a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo8104a(C2244Cv cv) {
        synchronized (this.f10628p) {
            this.f10629q = cv;
        }
    }

    /* renamed from: a */
    public final void mo8861a(C2651Qw qw) {
        this.f10629q.mo7892a(qw);
    }

    /* renamed from: b */
    public final String mo8862b() {
        return this.f10613a;
    }

    /* renamed from: c */
    public final C5464b mo8863c() {
        return this.f10625m;
    }

    /* renamed from: c */
    public final boolean mo8864c(Bundle bundle) {
        synchronized (this.f10628p) {
            if (this.f10629q == null) {
                C2227Cf.m9529a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean c = this.f10629q.mo7963c(bundle);
            return c;
        }
    }

    /* renamed from: d */
    public final String mo8865d() {
        return this.f10617e;
    }

    /* renamed from: d */
    public final void mo8866d(Bundle bundle) {
        synchronized (this.f10628p) {
            if (this.f10629q == null) {
                C2227Cf.m9529a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f10629q.mo7964d(bundle);
            }
        }
    }

    public final void destroy() {
        C3114ge.f9351a.post(new C3677zv(this));
    }

    public final Bundle getExtras() {
        return this.f10627o;
    }

    public final C2987bu getVideoController() {
        return this.f10623k;
    }

    /* renamed from: h */
    public final String mo8870h() {
        return this.f10615c;
    }

    /* renamed from: i */
    public final String mo8871i() {
        return this.f10626n;
    }

    /* renamed from: j */
    public final C2793Vv mo8872j() {
        return this.f10622j;
    }

    /* renamed from: l */
    public final String mo8105l() {
        return "";
    }

    /* renamed from: s */
    public final String mo8873s() {
        return this.f10621i;
    }

    /* renamed from: t */
    public final C2903Zv mo8874t() {
        return this.f10616d;
    }

    /* renamed from: u */
    public final double mo8875u() {
        return this.f10619g;
    }

    /* renamed from: x */
    public final C5464b mo8876x() {
        return C5468d.m20961a(this.f10629q);
    }

    /* renamed from: y */
    public final String mo8877y() {
        return this.f10618f;
    }

    /* renamed from: z */
    public final String mo8878z() {
        return this.f10620h;
    }
}
