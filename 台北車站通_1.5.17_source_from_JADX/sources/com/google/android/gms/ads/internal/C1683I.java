package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3648yv;

/* renamed from: com.google.android.gms.ads.internal.I */
final class C1683I implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3648yv f5526a;

    /* renamed from: b */
    private final /* synthetic */ C1678D f5527b;

    C1683I(C1678D d, C3648yv yvVar) {
        this.f5527b = d;
        this.f5526a = yvVar;
    }

    public final void run() {
        try {
            if (this.f5527b.f5648f.f5633t != null) {
                this.f5527b.f5648f.f5633t.mo8600a(this.f5526a);
                this.f5527b.mo6771z(this.f5526a.mo8876x());
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
