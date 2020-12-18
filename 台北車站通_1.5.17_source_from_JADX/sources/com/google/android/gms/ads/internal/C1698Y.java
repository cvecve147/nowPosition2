package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.ads.C2188Aw;
import com.google.android.gms.internal.ads.C2209Bp;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2253Dc;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2302Ew;
import com.google.android.gms.internal.ads.C2311Fd;
import com.google.android.gms.internal.ads.C2388Hw;
import com.google.android.gms.internal.ads.C2472Kw;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2499Lt;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2560Nw;
import com.google.android.gms.internal.ads.C2620Pt;
import com.google.android.gms.internal.ads.C2626Pz;
import com.google.android.gms.internal.ads.C2631Qd;
import com.google.android.gms.internal.ads.C2717Td;
import com.google.android.gms.internal.ads.C2791Vt;
import com.google.android.gms.internal.ads.C3115gf;
import com.google.android.gms.internal.ads.C3131gv;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3432rf;
import com.google.android.gms.internal.ads.C3475st;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3562vt;
import com.google.android.gms.internal.ads.C3573wc;
import com.google.android.gms.internal.ads.C3614xp;
import com.google.android.gms.internal.ads.C3621xw;
import com.google.android.gms.internal.ads.C3660ze;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.internal.ads.zzpl;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import p013b.p018b.p028h.p039h.C1101r;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.Y */
public final class C1698Y implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: A */
    List<Integer> f5597A;

    /* renamed from: B */
    C3131gv f5598B;

    /* renamed from: C */
    C2253Dc f5599C;

    /* renamed from: D */
    C3573wc f5600D;

    /* renamed from: E */
    public String f5601E;

    /* renamed from: F */
    List<String> f5602F;

    /* renamed from: G */
    public C2631Qd f5603G;

    /* renamed from: H */
    View f5604H;

    /* renamed from: I */
    public int f5605I;

    /* renamed from: J */
    boolean f5606J;

    /* renamed from: K */
    private HashSet<C2311Fd> f5607K;

    /* renamed from: L */
    private int f5608L;

    /* renamed from: M */
    private int f5609M;

    /* renamed from: N */
    private C3115gf f5610N;

    /* renamed from: O */
    private boolean f5611O;

    /* renamed from: P */
    private boolean f5612P;

    /* renamed from: Q */
    private boolean f5613Q;

    /* renamed from: a */
    final String f5614a;

    /* renamed from: b */
    public String f5615b;

    /* renamed from: c */
    public final Context f5616c;

    /* renamed from: d */
    final C2209Bp f5617d;

    /* renamed from: e */
    public final zzang f5618e;

    /* renamed from: f */
    C1699Z f5619f;

    /* renamed from: g */
    public C2717Td f5620g;

    /* renamed from: h */
    public C3660ze f5621h;

    /* renamed from: i */
    public zzjn f5622i;

    /* renamed from: j */
    public C2254Dd f5623j;

    /* renamed from: k */
    public C2282Ed f5624k;

    /* renamed from: l */
    public C2311Fd f5625l;

    /* renamed from: m */
    C3475st f5626m;

    /* renamed from: n */
    C3562vt f5627n;

    /* renamed from: o */
    C2620Pt f5628o;

    /* renamed from: p */
    C2499Lt f5629p;

    /* renamed from: q */
    C2791Vt f5630q;

    /* renamed from: r */
    C3621xw f5631r;

    /* renamed from: s */
    C2188Aw f5632s;

    /* renamed from: t */
    C2560Nw f5633t;

    /* renamed from: u */
    C1101r<String, C2302Ew> f5634u;

    /* renamed from: v */
    C1101r<String, C2388Hw> f5635v;

    /* renamed from: w */
    zzpl f5636w;

    /* renamed from: x */
    zzmu f5637x;

    /* renamed from: y */
    zzlu f5638y;

    /* renamed from: z */
    C2472Kw f5639z;

    public C1698Y(Context context, zzjn zzjn, String str, zzang zzang) {
        this(context, zzjn, str, zzang, (C2209Bp) null);
    }

    private C1698Y(Context context, zzjn zzjn, String str, zzang zzang, C2209Bp bp) {
        this.f5603G = null;
        this.f5604H = null;
        this.f5605I = 0;
        this.f5606J = false;
        this.f5607K = null;
        this.f5608L = -1;
        this.f5609M = -1;
        this.f5611O = true;
        this.f5612P = true;
        this.f5613Q = false;
        C2558Nu.m10773a(context);
        if (C1697X.m7702i().mo8324d() != null) {
            List<String> b = C2558Nu.m10775b();
            int i = zzang.f10856b;
            if (i != 0) {
                b.add(Integer.toString(i));
            }
            C1697X.m7702i().mo8324d().mo8755a(b);
        }
        this.f5614a = UUID.randomUUID().toString();
        if (zzjn.f10896d || zzjn.f10900h) {
            this.f5619f = null;
        } else {
            this.f5619f = new C1699Z(context, str, zzang.f10855a, this, this);
            this.f5619f.setMinimumWidth(zzjn.f10898f);
            this.f5619f.setMinimumHeight(zzjn.f10895c);
            this.f5619f.setVisibility(4);
        }
        this.f5622i = zzjn;
        this.f5615b = str;
        this.f5616c = context;
        this.f5618e = zzang;
        this.f5617d = new C2209Bp(new C1753h(this));
        this.f5610N = new C3115gf(200);
        this.f5635v = new C1101r<>();
    }

    /* renamed from: b */
    private final void m7720b(boolean z) {
        C2254Dd dd;
        C3520uh uhVar;
        View findViewById;
        if (this.f5619f != null && (dd = this.f5623j) != null && (uhVar = dd.f6863b) != null && uhVar.mo8182mb() != null) {
            if (!z || this.f5610N.mo9462a()) {
                if (this.f5623j.f6863b.mo8182mb().mo9242j()) {
                    int[] iArr = new int[2];
                    this.f5619f.getLocationOnScreen(iArr);
                    C3390pt.m13453a();
                    int b = C3432rf.m13605b(this.f5616c, iArr[0]);
                    C3390pt.m13453a();
                    int b2 = C3432rf.m13605b(this.f5616c, iArr[1]);
                    if (!(b == this.f5608L && b2 == this.f5609M)) {
                        this.f5608L = b;
                        this.f5609M = b2;
                        this.f5623j.f6863b.mo8182mb().mo9227a(this.f5608L, this.f5609M, !z);
                    }
                }
                C1699Z z2 = this.f5619f;
                if (z2 != null && (findViewById = z2.getRootView().findViewById(16908290)) != null) {
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    this.f5619f.getGlobalVisibleRect(rect);
                    findViewById.getGlobalVisibleRect(rect2);
                    if (rect.top != rect2.top) {
                        this.f5611O = false;
                    }
                    if (rect.bottom != rect2.bottom) {
                        this.f5612P = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final HashSet<C2311Fd> mo6836a() {
        return this.f5607K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6837a(View view) {
        C3614xp a;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7962rc)).booleanValue() && (a = this.f5617d.mo7869a()) != null) {
            a.mo6948a(view);
        }
    }

    /* renamed from: a */
    public final void mo6838a(HashSet<C2311Fd> hashSet) {
        this.f5607K = hashSet;
    }

    /* renamed from: a */
    public final void mo6839a(boolean z) {
        C2254Dd dd;
        C3520uh uhVar;
        if (!(this.f5605I != 0 || (dd = this.f5623j) == null || (uhVar = dd.f6863b) == null)) {
            uhVar.stopLoading();
        }
        C2717Td td = this.f5620g;
        if (td != null) {
            td.cancel();
        }
        C3660ze zeVar = this.f5621h;
        if (zeVar != null) {
            zeVar.cancel();
        }
        if (z) {
            this.f5623j = null;
        }
    }

    /* renamed from: b */
    public final void mo6840b() {
        C3520uh uhVar;
        C2254Dd dd = this.f5623j;
        if (dd != null && (uhVar = dd.f6863b) != null) {
            uhVar.destroy();
        }
    }

    /* renamed from: c */
    public final void mo6841c() {
        C2626Pz pz;
        C2254Dd dd = this.f5623j;
        if (dd != null && (pz = dd.f6878q) != null) {
            try {
                pz.destroy();
            } catch (RemoteException unused) {
                C2227Cf.m9536d("Could not destroy mediation adapter.");
            }
        }
    }

    /* renamed from: d */
    public final boolean mo6842d() {
        return this.f5605I == 0;
    }

    /* renamed from: e */
    public final boolean mo6843e() {
        return this.f5605I == 1;
    }

    /* renamed from: f */
    public final String mo6844f() {
        return (!this.f5611O || !this.f5612P) ? this.f5611O ? this.f5613Q ? "top-scrollable" : "top-locked" : this.f5612P ? this.f5613Q ? "bottom-scrollable" : "bottom-locked" : "" : "";
    }

    public final void onGlobalLayout() {
        m7720b(false);
    }

    public final void onScrollChanged() {
        m7720b(true);
        this.f5613Q = true;
    }
}
