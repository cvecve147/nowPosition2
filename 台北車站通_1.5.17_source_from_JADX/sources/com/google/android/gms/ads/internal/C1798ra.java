package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3449rv;

/* renamed from: com.google.android.gms.ads.internal.ra */
final class C1798ra implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3449rv f5885a;

    /* renamed from: b */
    private final /* synthetic */ C1768oa f5886b;

    C1798ra(C1768oa oaVar, C3449rv rvVar) {
        this.f5886b = oaVar;
        this.f5885a = rvVar;
    }

    public final void run() {
        try {
            if (this.f5886b.f5648f.f5631r != null) {
                this.f5886b.f5648f.f5631r.mo9080a(this.f5885a);
                this.f5886b.mo6984z(this.f5885a.mo9703x());
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
