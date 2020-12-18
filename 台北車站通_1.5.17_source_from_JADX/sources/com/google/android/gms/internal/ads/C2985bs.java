package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C2011d;

/* renamed from: com.google.android.gms.internal.ads.bs */
final class C2985bs implements C2011d.C2012a {

    /* renamed from: a */
    private final /* synthetic */ C2899Zr f8975a;

    C2985bs(C2899Zr zr) {
        this.f8975a = zr;
    }

    /* renamed from: f */
    public final void mo7570f(int i) {
        synchronized (this.f8975a.f8714b) {
            C3156hs unused = this.f8975a.f8717e = null;
            this.f8975a.f8714b.notifyAll();
        }
    }

    /* renamed from: j */
    public final void mo7571j(Bundle bundle) {
        synchronized (this.f8975a.f8714b) {
            try {
                if (this.f8975a.f8715c != null) {
                    C3156hs unused = this.f8975a.f8717e = this.f8975a.f8715c.mo7557D();
                }
            } catch (DeadObjectException e) {
                C2227Cf.m9533b("Unable to obtain a cache service instance.", e);
                this.f8975a.m11713c();
            }
            this.f8975a.f8714b.notifyAll();
        }
    }
}
