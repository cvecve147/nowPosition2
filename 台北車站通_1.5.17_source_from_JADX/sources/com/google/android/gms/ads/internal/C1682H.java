package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3449rv;

/* renamed from: com.google.android.gms.ads.internal.H */
final class C1682H implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3449rv f5524a;

    /* renamed from: b */
    private final /* synthetic */ C1678D f5525b;

    C1682H(C1678D d, C3449rv rvVar) {
        this.f5525b = d;
        this.f5524a = rvVar;
    }

    public final void run() {
        try {
            if (this.f5525b.f5648f.f5631r != null) {
                this.f5525b.f5648f.f5631r.mo9080a(this.f5524a);
                this.f5525b.mo6771z(this.f5524a.mo9703x());
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
