package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3648yv;

/* renamed from: com.google.android.gms.ads.internal.qa */
final class C1796qa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3648yv f5883a;

    /* renamed from: b */
    private final /* synthetic */ C1768oa f5884b;

    C1796qa(C1768oa oaVar, C3648yv yvVar) {
        this.f5884b = oaVar;
        this.f5883a = yvVar;
    }

    public final void run() {
        try {
            if (this.f5884b.f5648f.f5633t != null) {
                this.f5884b.f5648f.f5633t.mo8600a(this.f5883a);
                this.f5884b.mo6984z(this.f5883a.mo8876x());
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
