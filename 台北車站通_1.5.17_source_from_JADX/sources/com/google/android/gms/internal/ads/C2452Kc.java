package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1737k;
import java.util.concurrent.Future;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Kc */
public final class C2452Kc extends C2717Td implements C2630Qc, C2716Tc, C2856Yc {

    /* renamed from: d */
    public final String f7426d;

    /* renamed from: e */
    private final C2282Ed f7427e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f7428f;

    /* renamed from: g */
    private final C2884Zc f7429g;

    /* renamed from: h */
    private final C2716Tc f7430h;

    /* renamed from: i */
    private final Object f7431i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final String f7432j;

    /* renamed from: k */
    private final C3568vz f7433k;

    /* renamed from: l */
    private final long f7434l;

    /* renamed from: m */
    private int f7435m = 0;

    /* renamed from: n */
    private int f7436n = 3;

    /* renamed from: o */
    private C2538Nc f7437o;

    /* renamed from: p */
    private Future f7438p;

    /* renamed from: q */
    private volatile C1737k f7439q;

    public C2452Kc(Context context, String str, String str2, C3568vz vzVar, C2282Ed ed, C2884Zc zc, C2716Tc tc, long j) {
        this.f7428f = context;
        this.f7426d = str;
        this.f7432j = str2;
        this.f7433k = vzVar;
        this.f7427e = ed;
        this.f7429g = zc;
        this.f7431i = new Object();
        this.f7430h = tc;
        this.f7434l = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10392a(zzjj zzjj, C2626Pz pz) {
        this.f7429g.mo9114b().mo8806a((C2716Tc) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f7426d)) {
                pz.mo8711a(zzjj, this.f7432j, this.f7433k.f10405a);
            } else {
                pz.mo8710a(zzjj, this.f7432j);
            }
        } catch (RemoteException e) {
            C2227Cf.m9535c("Fail to load ad from adapter.", e);
            mo8392a(this.f7426d, 0);
        }
    }

    /* renamed from: a */
    private final boolean m10393a(long j) {
        int i;
        long b = this.f7434l - (C1697X.m7705l().mo7726b() - j);
        if (b <= 0) {
            i = 4;
        } else {
            try {
                this.f7431i.wait(b);
                return true;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i = 5;
            }
        }
        this.f7436n = i;
        return false;
    }

    /* renamed from: a */
    public final void mo8389a(int i) {
        mo8392a(this.f7426d, 0);
    }

    /* renamed from: a */
    public final void mo8390a(C1737k kVar) {
        this.f7439q = kVar;
    }

    /* renamed from: a */
    public final void mo8391a(String str) {
        synchronized (this.f7431i) {
            this.f7435m = 1;
            this.f7431i.notify();
        }
    }

    /* renamed from: a */
    public final void mo8392a(String str, int i) {
        synchronized (this.f7431i) {
            this.f7435m = 2;
            this.f7436n = i;
            this.f7431i.notify();
        }
    }

    /* renamed from: b */
    public final void mo8393b() {
        m10392a(this.f7427e.f6942a.f10753c, this.f7429g.mo9113a());
    }

    /* renamed from: b */
    public final void mo8394b(Bundle bundle) {
        C1737k kVar = this.f7439q;
        if (kVar != null) {
            kVar.mo6872d("", bundle);
        }
    }

    /* renamed from: c */
    public final void mo7015c() {
    }

    /* renamed from: d */
    public final void mo7016d() {
        Handler handler;
        Runnable mc;
        C2884Zc zc = this.f7429g;
        if (zc != null && zc.mo9114b() != null && this.f7429g.mo9113a() != null) {
            C2688Sc b = this.f7429g.mo9114b();
            b.mo8806a((C2716Tc) null);
            b.mo8805a((C2630Qc) this);
            b.mo8807a((C2856Yc) this);
            zzjj zzjj = this.f7427e.f6942a.f10753c;
            C2626Pz a = this.f7429g.mo9113a();
            try {
                if (a.isInitialized()) {
                    handler = C3432rf.f10110a;
                    mc = new C2480Lc(this, zzjj, a);
                } else {
                    handler = C3432rf.f10110a;
                    mc = new C2510Mc(this, a, zzjj, b);
                }
                handler.post(mc);
            } catch (RemoteException e) {
                C2227Cf.m9535c("Fail to check if adapter is initialized.", e);
                mo8392a(this.f7426d, 0);
            }
            long b2 = C1697X.m7705l().mo7726b();
            while (true) {
                synchronized (this.f7431i) {
                    if (this.f7435m != 0) {
                        C2599Pc pc = new C2599Pc();
                        pc.mo8659a(C1697X.m7705l().mo7726b() - b2);
                        pc.mo8658a(1 == this.f7435m ? 6 : this.f7436n);
                        pc.mo8660a(this.f7426d);
                        pc.mo8661b(this.f7433k.f10408d);
                        this.f7437o = pc.mo8657a();
                    } else if (!m10393a(b2)) {
                        C2599Pc pc2 = new C2599Pc();
                        pc2.mo8658a(this.f7436n);
                        pc2.mo8659a(C1697X.m7705l().mo7726b() - b2);
                        pc2.mo8660a(this.f7426d);
                        pc2.mo8661b(this.f7433k.f10408d);
                        this.f7437o = pc2.mo8657a();
                        break;
                    }
                }
            }
            b.mo8806a((C2716Tc) null);
            b.mo8805a((C2630Qc) null);
            if (this.f7435m == 1) {
                this.f7430h.mo8391a(this.f7426d);
            } else {
                this.f7430h.mo8392a(this.f7426d, this.f7436n);
            }
        }
    }

    /* renamed from: f */
    public final Future mo8395f() {
        Future future = this.f7438p;
        if (future != null) {
            return future;
        }
        C2804Wf wf = (C2804Wf) mo8107a();
        this.f7438p = wf;
        return wf;
    }

    /* renamed from: g */
    public final C2538Nc mo8396g() {
        C2538Nc nc;
        synchronized (this.f7431i) {
            nc = this.f7437o;
        }
        return nc;
    }

    /* renamed from: h */
    public final C3568vz mo8397h() {
        return this.f7433k;
    }
}
