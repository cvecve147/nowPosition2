package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3507tw;

/* renamed from: com.google.android.gms.ads.internal.ta */
final class C1802ta implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3507tw f5892a;

    /* renamed from: b */
    private final /* synthetic */ C1768oa f5893b;

    C1802ta(C1768oa oaVar, C3507tw twVar) {
        this.f5893b = oaVar;
        this.f5892a = twVar;
    }

    public final void run() {
        try {
            this.f5893b.f5648f.f5635v.get(this.f5892a.mo10061l()).mo8308a(this.f5892a);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
