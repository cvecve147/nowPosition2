package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3507tw;

/* renamed from: com.google.android.gms.ads.internal.L */
final class C1686L implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3507tw f5533a;

    /* renamed from: b */
    private final /* synthetic */ C1678D f5534b;

    C1686L(C1678D d, C3507tw twVar) {
        this.f5534b = d;
        this.f5533a = twVar;
    }

    public final void run() {
        try {
            this.f5534b.f5648f.f5635v.get(this.f5533a.mo10061l()).mo8308a(this.f5533a);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
