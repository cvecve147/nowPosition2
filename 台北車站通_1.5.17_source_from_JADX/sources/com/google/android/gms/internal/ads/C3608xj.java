package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C3380pk;
import com.google.android.gms.internal.ads.C3437rk;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xj */
final class C3608xj implements C3004cj<C2947aj> {
    C3608xj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2947aj mo8280c(C3150hm hmVar) {
        try {
            C3380pk a = C3380pk.m13420a(hmVar);
            if (a instanceof C3380pk) {
                C2612Pl.m10917a(a.mo9890l(), 0);
                C2288Ej.m9702a(a.mo9892n().mo9980m());
                C3323nk m = a.mo9892n().mo9980m();
                C3494tk l = m.mo9789l();
                C3496tl a2 = C2288Ej.m9699a(l.mo10052l());
                byte[] a3 = a.mo9891m().mo9505a();
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, a3), C3439rl.m13666a(a2));
                return new C3296ml((ECPrivateKey) C3582wl.f10449i.mo10164a("EC").generatePrivate(eCPrivateKeySpec), l.mo10054n().mo9505a(), C2288Ej.m9701a(l.mo10053m()), C2288Ej.m9700a(m.mo9791n()), new C2345Gj(m.mo9790m().mo9595l()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        o.mo8216a(((C3380pk) mo8278b(hmVar)).mo9039h());
        o.mo8215a(C2346Gk.C2348b.ASYMMETRIC_PRIVATE);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        if (tnVar instanceof C3266lk) {
            C3266lk lkVar = (C3266lk) tnVar;
            C2288Ej.m9702a(lkVar.mo9683l());
            KeyPair a = C3439rl.m13664a(C3439rl.m13666a(C2288Ej.m9699a(lkVar.mo9683l().mo9789l().mo10052l())));
            ECPoint w = ((ECPublicKey) a.getPublic()).getW();
            C3437rk.C3438a p = C3437rk.m13651p();
            p.mo9983a(0);
            p.mo9985a(lkVar.mo9683l());
            p.mo9984a(C3150hm.m12537a(w.getAffineX().toByteArray()));
            p.mo9986b(C3150hm.m12537a(w.getAffineY().toByteArray()));
            C3380pk.C3381a o = C3380pk.m13427o();
            o.mo9893a(0);
            o.mo9895a((C3437rk) p.mo8629k());
            o.mo9894a(C3150hm.m12537a(((ECPrivateKey) a.getPrivate()).getS().toByteArray()));
            return o.mo8629k();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        try {
            return mo8277a((C3498tn) C3266lk.m12979a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C3380pk) {
            C3380pk pkVar = (C3380pk) tnVar;
            C2612Pl.m10917a(pkVar.mo9890l(), 0);
            C2288Ej.m9702a(pkVar.mo9892n().mo9980m());
            C3323nk m = pkVar.mo9892n().mo9980m();
            C3494tk l = m.mo9789l();
            C3496tl a = C2288Ej.m9699a(l.mo10052l());
            byte[] a2 = pkVar.mo9891m().mo9505a();
            ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, a2), C3439rl.m13666a(a));
            return new C3296ml((ECPrivateKey) C3582wl.f10449i.mo10164a("EC").generatePrivate(eCPrivateKeySpec), l.mo10054n().mo9505a(), C2288Ej.m9701a(l.mo10053m()), C2288Ej.m9700a(m.mo9791n()), new C2345Gj(m.mo9790m().mo9595l()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }

    public final int getVersion() {
        return 0;
    }
}
