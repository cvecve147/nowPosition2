package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3506tv;

/* renamed from: com.google.android.gms.ads.internal.sa */
final class C1800sa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3506tv f5887a;

    /* renamed from: b */
    private final /* synthetic */ C1768oa f5888b;

    C1800sa(C1768oa oaVar, C3506tv tvVar) {
        this.f5888b = oaVar;
        this.f5887a = tvVar;
    }

    public final void run() {
        try {
            if (this.f5888b.f5648f.f5632s != null) {
                this.f5888b.f5648f.f5632s.mo7853a(this.f5887a);
                this.f5888b.mo6984z(this.f5887a.mo9914x());
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
