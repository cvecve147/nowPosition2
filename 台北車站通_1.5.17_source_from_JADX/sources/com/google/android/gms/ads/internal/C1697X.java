package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.C1769a;
import com.google.android.gms.ads.internal.overlay.C1779k;
import com.google.android.gms.ads.internal.overlay.C1788t;
import com.google.android.gms.ads.internal.overlay.C1789u;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.common.util.C2086h;
import com.google.android.gms.internal.ads.C2201Bh;
import com.google.android.gms.internal.ads.C2211Br;
import com.google.android.gms.internal.ads.C2333Fz;
import com.google.android.gms.internal.ads.C2370He;
import com.google.android.gms.internal.ads.C2397Id;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2506M;
import com.google.android.gms.internal.ads.C2508Ma;
import com.google.android.gms.internal.ads.C2658Rd;
import com.google.android.gms.internal.ads.C2707Su;
import com.google.android.gms.internal.ads.C2739Tx;
import com.google.android.gms.internal.ads.C2872Yr;
import com.google.android.gms.internal.ads.C2899Zr;
import com.google.android.gms.internal.ads.C2968bc;
import com.google.android.gms.internal.ads.C3028df;
import com.google.android.gms.internal.ads.C3058ef;
import com.google.android.gms.internal.ads.C3060eh;
import com.google.android.gms.internal.ads.C3078ez;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3144hg;
import com.google.android.gms.internal.ads.C3246ks;
import com.google.android.gms.internal.ads.C3289me;
import com.google.android.gms.internal.ads.C3318nf;
import com.google.android.gms.internal.ads.C3338ny;
import com.google.android.gms.internal.ads.C3348og;
import com.google.android.gms.internal.ads.C3368p;
import com.google.android.gms.internal.ads.C3431re;
import com.google.android.gms.internal.ads.C3460se;
import com.google.android.gms.internal.ads.C3487td;
import com.google.android.gms.internal.ads.C3488te;
import com.google.android.gms.internal.ads.C3517ue;
import com.google.android.gms.internal.ads.C3547ve;
import com.google.android.gms.internal.ads.C3603xe;
import com.google.android.gms.internal.ads.C3631ye;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.X */
public final class C1697X {

    /* renamed from: a */
    private static final Object f5561a = new Object();

    /* renamed from: b */
    private static C1697X f5562b;

    /* renamed from: A */
    private final C1677C f5563A;

    /* renamed from: B */
    private final C3368p f5564B;

    /* renamed from: C */
    private final C3246ks f5565C;

    /* renamed from: D */
    private final C3487td f5566D;

    /* renamed from: E */
    private final C3060eh f5567E;

    /* renamed from: F */
    private final C3348og f5568F;

    /* renamed from: G */
    private final C3338ny f5569G;

    /* renamed from: H */
    private final C3631ye f5570H;

    /* renamed from: I */
    private final C3318nf f5571I;

    /* renamed from: J */
    private final C2658Rd f5572J;

    /* renamed from: c */
    private final C1769a f5573c = new C1769a();

    /* renamed from: d */
    private final C2508Ma f5574d = new C2508Ma();

    /* renamed from: e */
    private final C1779k f5575e = new C1779k();

    /* renamed from: f */
    private final C2506M f5576f = new C2506M();

    /* renamed from: g */
    private final C3114ge f5577g = new C3114ge();

    /* renamed from: h */
    private final C2201Bh f5578h = new C2201Bh();

    /* renamed from: i */
    private final C3289me f5579i;

    /* renamed from: j */
    private final C2211Br f5580j;

    /* renamed from: k */
    private final C2397Id f5581k;

    /* renamed from: l */
    private final C2872Yr f5582l;

    /* renamed from: m */
    private final C2899Zr f5583m;

    /* renamed from: n */
    private final C2083e f5584n;

    /* renamed from: o */
    private final C1708e f5585o;

    /* renamed from: p */
    private final C2707Su f5586p;

    /* renamed from: q */
    private final C2370He f5587q;

    /* renamed from: r */
    private final C2968bc f5588r;

    /* renamed from: s */
    private final C3144hg f5589s;

    /* renamed from: t */
    private final C2739Tx f5590t;

    /* renamed from: u */
    private final C3078ez f5591u;

    /* renamed from: v */
    private final C3028df f5592v;

    /* renamed from: w */
    private final C1788t f5593w;

    /* renamed from: x */
    private final C1789u f5594x;

    /* renamed from: y */
    private final C2333Fz f5595y;

    /* renamed from: z */
    private final C3058ef f5596z;

    static {
        C1697X x = new C1697X();
        synchronized (f5561a) {
            f5562b = x;
        }
    }

    protected C1697X() {
        int i = Build.VERSION.SDK_INT;
        this.f5579i = i >= 21 ? new C3603xe() : i >= 19 ? new C3547ve() : i >= 18 ? new C3488te() : i >= 17 ? new C3460se() : i >= 16 ? new C3517ue() : new C3431re();
        this.f5580j = new C2211Br();
        this.f5581k = new C2397Id();
        this.f5572J = new C2658Rd();
        this.f5582l = new C2872Yr();
        this.f5583m = new C2899Zr();
        this.f5584n = C2086h.m9144d();
        this.f5585o = new C1708e();
        this.f5586p = new C2707Su();
        this.f5587q = new C2370He();
        this.f5588r = new C2968bc();
        this.f5569G = new C3338ny();
        this.f5589s = new C3144hg();
        this.f5590t = new C2739Tx();
        this.f5591u = new C3078ez();
        this.f5592v = new C3028df();
        this.f5593w = new C1788t();
        this.f5594x = new C1789u();
        this.f5595y = new C2333Fz();
        this.f5596z = new C3058ef();
        this.f5563A = new C1677C();
        this.f5564B = new C3368p();
        this.f5565C = new C3246ks();
        this.f5566D = new C3487td();
        this.f5567E = new C3060eh();
        this.f5568F = new C3348og();
        this.f5570H = new C3631ye();
        this.f5571I = new C3318nf();
    }

    /* renamed from: A */
    public static C3348og m7688A() {
        return m7693F().f5568F;
    }

    /* renamed from: B */
    public static C3487td m7689B() {
        return m7693F().f5566D;
    }

    /* renamed from: C */
    public static C3338ny m7690C() {
        return m7693F().f5569G;
    }

    /* renamed from: D */
    public static C3631ye m7691D() {
        return m7693F().f5570H;
    }

    /* renamed from: E */
    public static C3318nf m7692E() {
        return m7693F().f5571I;
    }

    /* renamed from: F */
    private static C1697X m7693F() {
        C1697X x;
        synchronized (f5561a) {
            x = f5562b;
        }
        return x;
    }

    /* renamed from: a */
    public static C2508Ma m7694a() {
        return m7693F().f5574d;
    }

    /* renamed from: b */
    public static C1769a m7695b() {
        return m7693F().f5573c;
    }

    /* renamed from: c */
    public static C1779k m7696c() {
        return m7693F().f5575e;
    }

    /* renamed from: d */
    public static C2506M m7697d() {
        return m7693F().f5576f;
    }

    /* renamed from: e */
    public static C3114ge m7698e() {
        return m7693F().f5577g;
    }

    /* renamed from: f */
    public static C2201Bh m7699f() {
        return m7693F().f5578h;
    }

    /* renamed from: g */
    public static C3289me m7700g() {
        return m7693F().f5579i;
    }

    /* renamed from: h */
    public static C2211Br m7701h() {
        return m7693F().f5580j;
    }

    /* renamed from: i */
    public static C2397Id m7702i() {
        return m7693F().f5581k;
    }

    /* renamed from: j */
    public static C2658Rd m7703j() {
        return m7693F().f5572J;
    }

    /* renamed from: k */
    public static C2899Zr m7704k() {
        return m7693F().f5583m;
    }

    /* renamed from: l */
    public static C2083e m7705l() {
        return m7693F().f5584n;
    }

    /* renamed from: m */
    public static C1708e m7706m() {
        return m7693F().f5585o;
    }

    /* renamed from: n */
    public static C2707Su m7707n() {
        return m7693F().f5586p;
    }

    /* renamed from: o */
    public static C2370He m7708o() {
        return m7693F().f5587q;
    }

    /* renamed from: p */
    public static C2968bc m7709p() {
        return m7693F().f5588r;
    }

    /* renamed from: q */
    public static C3144hg m7710q() {
        return m7693F().f5589s;
    }

    /* renamed from: r */
    public static C2739Tx m7711r() {
        return m7693F().f5590t;
    }

    /* renamed from: s */
    public static C3078ez m7712s() {
        return m7693F().f5591u;
    }

    /* renamed from: t */
    public static C3028df m7713t() {
        return m7693F().f5592v;
    }

    /* renamed from: u */
    public static C3368p m7714u() {
        return m7693F().f5564B;
    }

    /* renamed from: v */
    public static C1788t m7715v() {
        return m7693F().f5593w;
    }

    /* renamed from: w */
    public static C1789u m7716w() {
        return m7693F().f5594x;
    }

    /* renamed from: x */
    public static C2333Fz m7717x() {
        return m7693F().f5595y;
    }

    /* renamed from: y */
    public static C3058ef m7718y() {
        return m7693F().f5596z;
    }

    /* renamed from: z */
    public static C3060eh m7719z() {
        return m7693F().f5567E;
    }
}
