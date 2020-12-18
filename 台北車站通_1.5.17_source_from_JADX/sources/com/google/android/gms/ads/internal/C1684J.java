package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3506tv;

/* renamed from: com.google.android.gms.ads.internal.J */
final class C1684J implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3506tv f5528a;

    /* renamed from: b */
    private final /* synthetic */ C1678D f5529b;

    C1684J(C1678D d, C3506tv tvVar) {
        this.f5529b = d;
        this.f5528a = tvVar;
    }

    public final void run() {
        try {
            if (this.f5529b.f5648f.f5632s != null) {
                this.f5529b.f5648f.f5632s.mo7853a(this.f5528a);
                this.f5529b.mo6771z(this.f5528a.mo9914x());
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
