package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C1628a;
import com.google.android.gms.ads.C1668g;
import com.google.android.gms.ads.p065a.C1629a;
import com.google.android.gms.ads.p065a.C1631c;
import com.google.android.gms.ads.p065a.C1633e;
import com.google.android.gms.ads.p067c.C1640b;
import com.google.android.gms.ads.p067c.C1641c;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.nu */
public final class C3334nu {

    /* renamed from: a */
    private final C2505Lz f9917a;

    /* renamed from: b */
    private final Context f9918b;

    /* renamed from: c */
    private final C3072et f9919c;

    /* renamed from: d */
    private C1628a f9920d;

    /* renamed from: e */
    private C2845Xs f9921e;

    /* renamed from: f */
    private C2357Gt f9922f;

    /* renamed from: g */
    private String f9923g;

    /* renamed from: h */
    private C1641c f9924h;

    /* renamed from: i */
    private C1629a f9925i;

    /* renamed from: j */
    private C1631c f9926j;

    /* renamed from: k */
    private C1668g f9927k;

    /* renamed from: l */
    private C1640b f9928l;

    /* renamed from: m */
    private boolean f9929m;

    /* renamed from: n */
    private boolean f9930n;

    public C3334nu(Context context) {
        this(context, C3072et.f9119a, (C1633e) null);
    }

    private C3334nu(Context context, C3072et etVar, C1633e eVar) {
        this.f9917a = new C2505Lz();
        this.f9918b = context;
        this.f9919c = etVar;
    }

    /* renamed from: b */
    private final void m13175b(String str) {
        if (this.f9922f == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo9804a() {
        try {
            m13175b("show");
            this.f9922f.showInterstitial();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo9805a(C1628a aVar) {
        try {
            this.f9920d = aVar;
            if (this.f9922f != null) {
                this.f9922f.mo6811b((C3562vt) aVar != null ? new C2900Zs(aVar) : null);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo9806a(C1640b bVar) {
        try {
            this.f9928l = bVar;
            if (this.f9922f != null) {
                this.f9922f.mo6802a((C2253Dc) bVar != null ? new C2396Ic(bVar) : null);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo9807a(C1641c cVar) {
        try {
            this.f9924h = cVar;
            if (this.f9922f != null) {
                this.f9922f.mo6803a((C2499Lt) cVar != null ? new C2986bt(cVar) : null);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo9808a(C2845Xs xs) {
        try {
            this.f9921e = xs;
            if (this.f9922f != null) {
                this.f9922f.mo6805a((C3475st) xs != null ? new C2873Ys(xs) : null);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo9809a(C3187iu iuVar) {
        try {
            if (this.f9922f == null) {
                if (this.f9923g == null) {
                    m13175b("loadAd");
                }
                zzjn b = this.f9929m ? zzjn.m14778b() : new zzjn();
                C3185it b2 = C3390pt.m13454b();
                Context context = this.f9918b;
                this.f9922f = (C2357Gt) C3185it.m12647a(context, false, new C3276lt(b2, context, b, this.f9923g, this.f9917a));
                if (this.f9920d != null) {
                    this.f9922f.mo6811b((C3562vt) new C2900Zs(this.f9920d));
                }
                if (this.f9921e != null) {
                    this.f9922f.mo6805a((C3475st) new C2873Ys(this.f9921e));
                }
                if (this.f9924h != null) {
                    this.f9922f.mo6803a((C2499Lt) new C2986bt(this.f9924h));
                }
                if (this.f9925i != null) {
                    this.f9922f.mo6804a((C2620Pt) new C3129gt(this.f9925i));
                }
                if (this.f9926j != null) {
                    this.f9922f.mo6745a((C3131gv) new C3221jv(this.f9926j));
                }
                if (this.f9927k == null) {
                    if (this.f9928l != null) {
                        this.f9922f.mo6802a((C2253Dc) new C2396Ic(this.f9928l));
                    }
                    this.f9922f.mo6809a(this.f9930n);
                } else {
                    C2357Gt gt = this.f9922f;
                    this.f9927k.mo6699a();
                    throw null;
                }
            }
            if (this.f9922f.mo6812b(C3072et.m12305a(this.f9918b, iuVar))) {
                this.f9917a.mo8518a(iuVar.mo9585l());
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo9810a(String str) {
        if (this.f9923g == null) {
            this.f9923g = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    /* renamed from: a */
    public final void mo9811a(boolean z) {
        try {
            this.f9930n = z;
            if (this.f9922f != null) {
                this.f9922f.mo6809a(z);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: b */
    public final Bundle mo9812b() {
        try {
            if (this.f9922f != null) {
                return this.f9922f.mo6797Q();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    /* renamed from: b */
    public final void mo9813b(boolean z) {
        this.f9929m = true;
    }
}
