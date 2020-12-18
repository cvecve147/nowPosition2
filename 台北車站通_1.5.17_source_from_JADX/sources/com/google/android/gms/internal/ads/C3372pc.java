package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C1804ua;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.pc */
public final class C3372pc extends C2167Ac {

    /* renamed from: a */
    private final Context f9989a;

    /* renamed from: b */
    private final Object f9990b;

    /* renamed from: c */
    private final zzang f9991c;

    /* renamed from: d */
    private final C3401qc f9992d;

    public C3372pc(Context context, C1804ua uaVar, C2533Mz mz, zzang zzang) {
        this(context, zzang, new C3401qc(context, uaVar, zzjn.m14778b(), mz, zzang));
    }

    private C3372pc(Context context, zzang zzang, C3401qc qcVar) {
        this.f9990b = new Object();
        this.f9989a = context;
        this.f9991c = zzang;
        this.f9992d = qcVar;
    }

    /* renamed from: B */
    public final void mo9860B() {
        mo9871i((C5464b) null);
    }

    /* renamed from: Q */
    public final Bundle mo9861Q() {
        Bundle Q;
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7883eb)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.f9990b) {
            Q = this.f9992d.mo6797Q();
        }
        return Q;
    }

    /* renamed from: a */
    public final void mo9862a(C2253Dc dc) {
        synchronized (this.f9990b) {
            this.f9992d.mo6802a(dc);
        }
    }

    /* renamed from: a */
    public final void mo9863a(C2499Lt lt) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7883eb)).booleanValue()) {
            synchronized (this.f9990b) {
                this.f9992d.mo6803a(lt);
            }
        }
    }

    /* renamed from: a */
    public final void mo9864a(C3573wc wcVar) {
        synchronized (this.f9990b) {
            this.f9992d.mo6862a(wcVar);
        }
    }

    /* renamed from: a */
    public final void mo9865a(zzahk zzahk) {
        synchronized (this.f9990b) {
            this.f9992d.mo9923a(zzahk);
        }
    }

    /* renamed from: a */
    public final void mo9866a(boolean z) {
        synchronized (this.f9990b) {
            this.f9992d.mo6809a(z);
        }
    }

    /* renamed from: c */
    public final void mo9867c(String str) {
        synchronized (this.f9990b) {
            this.f9992d.mo6814c(str);
        }
    }

    public final void destroy() {
        mo9869f((C5464b) null);
    }

    /* renamed from: f */
    public final void mo9869f(C5464b bVar) {
        synchronized (this.f9990b) {
            this.f9992d.destroy();
        }
    }

    /* renamed from: i */
    public final String mo9870i() {
        String i;
        synchronized (this.f9990b) {
            i = this.f9992d.mo6820i();
        }
        return i;
    }

    /* renamed from: i */
    public final void mo9871i(C5464b bVar) {
        Context context;
        synchronized (this.f9990b) {
            if (bVar == null) {
                context = null;
            } else {
                try {
                    context = (Context) C5468d.m20962z(bVar);
                } catch (Exception e) {
                    C2227Cf.m9535c("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f9992d.mo9924b(context);
            }
            this.f9992d.mo6735B();
        }
    }

    public final void pause() {
        mo9874v((C5464b) null);
    }

    /* renamed from: v */
    public final void mo9873v() {
        synchronized (this.f9990b) {
            this.f9992d.mo9925lc();
        }
    }

    /* renamed from: v */
    public final void mo9874v(C5464b bVar) {
        synchronized (this.f9990b) {
            this.f9992d.pause();
        }
    }

    /* renamed from: ya */
    public final boolean mo9875ya() {
        boolean ya;
        synchronized (this.f9990b) {
            ya = this.f9992d.mo9927ya();
        }
        return ya;
    }
}
