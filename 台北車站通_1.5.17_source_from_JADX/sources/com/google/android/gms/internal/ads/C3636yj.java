package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.yj */
final class C3636yj implements C3004cj<C2975bj> {
    C3636yj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2975bj mo8280c(C3150hm hmVar) {
        try {
            C3437rk a = C3437rk.m13642a(hmVar);
            if (a instanceof C3437rk) {
                C2612Pl.m10917a(a.mo9979l(), 0);
                C2288Ej.m9702a(a.mo9980m());
                C3323nk m = a.mo9980m();
                C3494tk l = m.mo9789l();
                return new C3325nl(C3439rl.m13665a(C2288Ej.m9699a(l.mo10052l()), a.mo9981n().mo9505a(), a.mo9982o().mo9505a()), l.mo10054n().mo9505a(), C2288Ej.m9701a(l.mo10053m()), C2288Ej.m9700a(m.mo9791n()), new C2345Gj(m.mo9790m().mo9595l()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C3437rk) {
            C3437rk rkVar = (C3437rk) tnVar;
            C2612Pl.m10917a(rkVar.mo9979l(), 0);
            C2288Ej.m9702a(rkVar.mo9980m());
            C3323nk m = rkVar.mo9980m();
            C3494tk l = m.mo9789l();
            return new C3325nl(C3439rl.m13665a(C2288Ej.m9699a(l.mo10052l()), rkVar.mo9981n().mo9505a(), rkVar.mo9982o().mo9505a()), l.mo10054n().mo9505a(), C2288Ej.m9701a(l.mo10053m()), C2288Ej.m9700a(m.mo9791n()), new C2345Gj(m.mo9790m().mo9595l()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    public final int getVersion() {
        return 0;
    }
}
