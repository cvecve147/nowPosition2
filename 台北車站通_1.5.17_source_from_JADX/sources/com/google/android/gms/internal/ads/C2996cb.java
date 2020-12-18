package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.cb */
public abstract class C2996cb implements C2939ab, C3660ze<Void> {

    /* renamed from: a */
    private final C3172ig<zzaef> f8986a;

    /* renamed from: b */
    private final C2939ab f8987b;

    /* renamed from: c */
    private final Object f8988c = new Object();

    public C2996cb(C3172ig<zzaef> igVar, C2939ab abVar) {
        this.f8986a = igVar;
        this.f8987b = abVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8107a() {
        C3343ob c = mo9274c();
        if (c == null) {
            this.f8987b.mo8604a(new zzaej(0));
            mo9273b();
            return null;
        }
        this.f8986a.mo9535a(new C3054eb(this, c), new C3082fb(this));
        return null;
    }

    /* renamed from: a */
    public final void mo8604a(zzaej zzaej) {
        synchronized (this.f8988c) {
            this.f8987b.mo8604a(zzaej);
            mo9273b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo9272a(C3343ob obVar, zzaef zzaef) {
        try {
            obVar.mo8525a(zzaef, (C3428rb) new C3257lb(this));
            return true;
        } catch (Throwable th) {
            C2227Cf.m9535c("Could not fetch ad response from ad request service due to an Exception.", th);
            C1697X.m7702i().mo8319a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f8987b.mo8604a(new zzaej(0));
            return false;
        }
    }

    /* renamed from: b */
    public abstract void mo9273b();

    /* renamed from: c */
    public abstract C3343ob mo9274c();

    public final void cancel() {
        mo9273b();
    }
}
