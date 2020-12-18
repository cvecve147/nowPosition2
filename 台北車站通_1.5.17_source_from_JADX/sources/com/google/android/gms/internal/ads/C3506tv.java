package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.tv */
public final class C3506tv extends C3421qw implements C2359Gv {

    /* renamed from: a */
    private String f10274a;

    /* renamed from: b */
    private List<C3420qv> f10275b;

    /* renamed from: c */
    private String f10276c;

    /* renamed from: d */
    private C2903Zv f10277d;

    /* renamed from: e */
    private String f10278e;

    /* renamed from: f */
    private String f10279f;

    /* renamed from: g */
    private C3306mv f10280g;

    /* renamed from: h */
    private Bundle f10281h;

    /* renamed from: i */
    private C2987bu f10282i;

    /* renamed from: j */
    private View f10283j;

    /* renamed from: k */
    private C5464b f10284k;

    /* renamed from: l */
    private String f10285l;

    /* renamed from: m */
    private Object f10286m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C2244Cv f10287n;

    public C3506tv(String str, List<C3420qv> list, String str2, C2903Zv zv, String str3, String str4, C3306mv mvVar, Bundle bundle, C2987bu buVar, View view, C5464b bVar, String str5) {
        this.f10274a = str;
        this.f10275b = list;
        this.f10276c = str2;
        this.f10277d = zv;
        this.f10278e = str3;
        this.f10279f = str4;
        this.f10280g = mvVar;
        this.f10281h = bundle;
        this.f10282i = buVar;
        this.f10283j = view;
        this.f10284k = bVar;
        this.f10285l = str5;
    }

    /* renamed from: Bb */
    public final View mo8101Bb() {
        return this.f10283j;
    }

    /* renamed from: Cb */
    public final String mo8102Cb() {
        return "1";
    }

    /* renamed from: Fb */
    public final C3306mv mo8103Fb() {
        return this.f10280g;
    }

    /* renamed from: W */
    public final C2903Zv mo9900W() {
        return this.f10277d;
    }

    /* renamed from: a */
    public final List mo9901a() {
        return this.f10275b;
    }

    /* renamed from: a */
    public final void mo9902a(Bundle bundle) {
        synchronized (this.f10286m) {
            if (this.f10287n == null) {
                C2227Cf.m9529a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f10287n.mo7956a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo8104a(C2244Cv cv) {
        synchronized (this.f10286m) {
            this.f10287n = cv;
        }
    }

    /* renamed from: b */
    public final String mo9903b() {
        return this.f10274a;
    }

    /* renamed from: c */
    public final C5464b mo9904c() {
        return this.f10284k;
    }

    /* renamed from: c */
    public final boolean mo9905c(Bundle bundle) {
        synchronized (this.f10286m) {
            if (this.f10287n == null) {
                C2227Cf.m9529a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean c = this.f10287n.mo7963c(bundle);
            return c;
        }
    }

    /* renamed from: d */
    public final String mo9906d() {
        return this.f10278e;
    }

    /* renamed from: d */
    public final void mo9907d(Bundle bundle) {
        synchronized (this.f10286m) {
            if (this.f10287n == null) {
                C2227Cf.m9529a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f10287n.mo7964d(bundle);
            }
        }
    }

    public final void destroy() {
        C3114ge.f9351a.post(new C3536uv(this));
        this.f10274a = null;
        this.f10275b = null;
        this.f10276c = null;
        this.f10277d = null;
        this.f10278e = null;
        this.f10279f = null;
        this.f10280g = null;
        this.f10281h = null;
        this.f10286m = null;
        this.f10282i = null;
        this.f10283j = null;
    }

    public final Bundle getExtras() {
        return this.f10281h;
    }

    public final C2987bu getVideoController() {
        return this.f10282i;
    }

    /* renamed from: h */
    public final String mo9911h() {
        return this.f10276c;
    }

    /* renamed from: i */
    public final String mo9912i() {
        return this.f10285l;
    }

    /* renamed from: j */
    public final C2793Vv mo9913j() {
        return this.f10280g;
    }

    /* renamed from: l */
    public final String mo8105l() {
        return "";
    }

    /* renamed from: x */
    public final C5464b mo9914x() {
        return C5468d.m20961a(this.f10287n);
    }

    /* renamed from: y */
    public final String mo9915y() {
        return this.f10279f;
    }
}
