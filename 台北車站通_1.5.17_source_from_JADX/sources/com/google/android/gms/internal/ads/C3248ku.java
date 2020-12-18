package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C1628a;
import com.google.android.gms.ads.C1642d;
import com.google.android.gms.ads.C1668g;
import com.google.android.gms.ads.C1813j;
import com.google.android.gms.ads.C1815k;
import com.google.android.gms.ads.p065a.C1629a;
import com.google.android.gms.ads.p065a.C1631c;
import java.util.concurrent.atomic.AtomicBoolean;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ku */
public final class C3248ku {

    /* renamed from: a */
    private final C2505Lz f9707a;

    /* renamed from: b */
    private final C3072et f9708b;

    /* renamed from: c */
    private final AtomicBoolean f9709c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1813j f9710d;

    /* renamed from: e */
    private final C3447rt f9711e;

    /* renamed from: f */
    private C2845Xs f9712f;

    /* renamed from: g */
    private C1628a f9713g;

    /* renamed from: h */
    private C1642d[] f9714h;

    /* renamed from: i */
    private C1629a f9715i;

    /* renamed from: j */
    private C1668g f9716j;

    /* renamed from: k */
    private C2357Gt f9717k;

    /* renamed from: l */
    private C1631c f9718l;

    /* renamed from: m */
    private C1815k f9719m;

    /* renamed from: n */
    private String f9720n;

    /* renamed from: o */
    private ViewGroup f9721o;

    /* renamed from: p */
    private int f9722p;

    /* renamed from: q */
    private boolean f9723q;

    public C3248ku(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, C3072et.f9119a, i);
    }

    private C3248ku(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C3072et etVar, int i) {
        this(viewGroup, attributeSet, z, etVar, (C2357Gt) null, i);
    }

    private C3248ku(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C3072et etVar, C2357Gt gt, int i) {
        this.f9707a = new C2505Lz();
        this.f9710d = new C1813j();
        this.f9711e = new C3277lu(this);
        this.f9721o = viewGroup;
        this.f9708b = etVar;
        this.f9717k = null;
        this.f9709c = new AtomicBoolean(false);
        this.f9722p = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C3157ht htVar = new C3157ht(context, attributeSet);
                this.f9714h = htVar.mo9528a(z);
                this.f9720n = htVar.mo9527a();
                if (viewGroup.isInEditMode()) {
                    C3432rf a = C3390pt.m13453a();
                    C1642d dVar = this.f9714h[0];
                    int i2 = this.f9722p;
                    zzjn zzjn = new zzjn(context, dVar);
                    zzjn.f10902j = m12905a(i2);
                    a.mo9966a(viewGroup, zzjn, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                C3390pt.m13453a().mo9967a(viewGroup, new zzjn(context, C1642d.f5458a), e.getMessage(), e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private static zzjn m12904a(Context context, C1642d[] dVarArr, int i) {
        zzjn zzjn = new zzjn(context, dVarArr);
        zzjn.f10902j = m12905a(i);
        return zzjn;
    }

    /* renamed from: a */
    private static boolean m12905a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final void mo9644a() {
        try {
            if (this.f9717k != null) {
                this.f9717k.destroy();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo9645a(C1629a aVar) {
        try {
            this.f9715i = aVar;
            if (this.f9717k != null) {
                this.f9717k.mo6804a((C2620Pt) aVar != null ? new C3129gt(aVar) : null);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo9646a(C1631c cVar) {
        this.f9718l = cVar;
        try {
            if (this.f9717k != null) {
                this.f9717k.mo6745a((C3131gv) cVar != null ? new C3221jv(cVar) : null);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo9647a(C1628a aVar) {
        this.f9713g = aVar;
        this.f9711e.mo9991a(aVar);
    }

    /* renamed from: a */
    public final void mo9648a(C1668g gVar) {
        this.f9716j = gVar;
        try {
            if (this.f9717k != null) {
                C2357Gt gt = this.f9717k;
                if (this.f9716j == null) {
                    gt.mo6810b((C2791Vt) null);
                } else {
                    this.f9716j.mo6699a();
                    throw null;
                }
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo9649a(C1815k kVar) {
        this.f9719m = kVar;
        try {
            if (this.f9717k != null) {
                this.f9717k.mo6808a(kVar == null ? null : new zzmu(kVar));
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo9650a(C2845Xs xs) {
        try {
            this.f9712f = xs;
            if (this.f9717k != null) {
                this.f9717k.mo6805a((C3475st) xs != null ? new C2873Ys(xs) : null);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo9651a(C3187iu iuVar) {
        Object a;
        try {
            if (this.f9717k == null) {
                if ((this.f9714h == null || this.f9720n == null) && this.f9717k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f9721o.getContext();
                zzjn a2 = m12904a(context, this.f9714h, this.f9722p);
                if ("search_v2".equals(a2.f10893a)) {
                    a = C3185it.m12647a(context, false, new C3247kt(C3390pt.m13454b(), context, a2, this.f9720n));
                } else {
                    a = C3185it.m12647a(context, false, new C3219jt(C3390pt.m13454b(), context, a2, this.f9720n, this.f9707a));
                }
                this.f9717k = (C2357Gt) a;
                this.f9717k.mo6811b((C3562vt) new C2900Zs(this.f9711e));
                if (this.f9712f != null) {
                    this.f9717k.mo6805a((C3475st) new C2873Ys(this.f9712f));
                }
                if (this.f9715i != null) {
                    this.f9717k.mo6804a((C2620Pt) new C3129gt(this.f9715i));
                }
                if (this.f9718l != null) {
                    this.f9717k.mo6745a((C3131gv) new C3221jv(this.f9718l));
                }
                if (this.f9716j == null) {
                    if (this.f9719m != null) {
                        this.f9717k.mo6808a(new zzmu(this.f9719m));
                    }
                    this.f9717k.mo6817e(this.f9723q);
                    try {
                        C5464b ga = this.f9717k.mo6818ga();
                        if (ga != null) {
                            this.f9721o.addView((View) C5468d.m20962z(ga));
                        }
                    } catch (RemoteException e) {
                        C2227Cf.m9537d("#007 Could not call remote method.", e);
                    }
                } else {
                    C2357Gt gt = this.f9717k;
                    this.f9716j.mo6699a();
                    throw null;
                }
            }
            if (this.f9717k.mo6812b(C3072et.m12305a(this.f9721o.getContext(), iuVar))) {
                this.f9707a.mo8518a(iuVar.mo9585l());
            }
        } catch (RemoteException e2) {
            C2227Cf.m9537d("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: a */
    public final void mo9652a(String str) {
        if (this.f9720n == null) {
            this.f9720n = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: a */
    public final void mo9653a(boolean z) {
        this.f9723q = z;
        try {
            if (this.f9717k != null) {
                this.f9717k.mo6817e(this.f9723q);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo9654a(C1642d... dVarArr) {
        if (this.f9714h == null) {
            mo9656b(dVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: b */
    public final C1628a mo9655b() {
        return this.f9713g;
    }

    /* renamed from: b */
    public final void mo9656b(C1642d... dVarArr) {
        this.f9714h = dVarArr;
        try {
            if (this.f9717k != null) {
                this.f9717k.mo6806a(m12904a(this.f9721o.getContext(), this.f9714h, this.f9722p));
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
        this.f9721o.requestLayout();
    }

    /* renamed from: c */
    public final C1642d mo9657c() {
        zzjn X;
        try {
            if (!(this.f9717k == null || (X = this.f9717k.mo6800X()) == null)) {
                return X.mo10314c();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
        C1642d[] dVarArr = this.f9714h;
        if (dVarArr != null) {
            return dVarArr[0];
        }
        return null;
    }

    /* renamed from: d */
    public final C1642d[] mo9658d() {
        return this.f9714h;
    }

    /* renamed from: e */
    public final String mo9659e() {
        C2357Gt gt;
        if (this.f9720n == null && (gt = this.f9717k) != null) {
            try {
                this.f9720n = gt.mo6741V();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
        return this.f9720n;
    }

    /* renamed from: f */
    public final C1629a mo9660f() {
        return this.f9715i;
    }

    /* renamed from: g */
    public final String mo9661g() {
        try {
            if (this.f9717k != null) {
                return this.f9717k.mo6796O();
            }
            return null;
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: h */
    public final C1631c mo9662h() {
        return this.f9718l;
    }

    /* renamed from: i */
    public final C1813j mo9663i() {
        return this.f9710d;
    }

    /* renamed from: j */
    public final C1815k mo9664j() {
        return this.f9719m;
    }

    /* renamed from: k */
    public final void mo9665k() {
        try {
            if (this.f9717k != null) {
                this.f9717k.pause();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: l */
    public final void mo9666l() {
        try {
            if (this.f9717k != null) {
                this.f9717k.mo6735B();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: m */
    public final C2987bu mo9667m() {
        C2357Gt gt = this.f9717k;
        if (gt == null) {
            return null;
        }
        try {
            return gt.getVideoController();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            return null;
        }
    }
}
