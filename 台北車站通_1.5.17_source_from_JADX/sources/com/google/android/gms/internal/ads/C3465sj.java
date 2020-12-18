package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C3091fk;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.sj */
final class C3465sj implements C3004cj<C2778Vi> {
    C3465sj() {
    }

    /* renamed from: a */
    private static C3091fk m13758a() {
        C3091fk.C3092a n = C3091fk.m12335n();
        n.mo9427a(0);
        n.mo9428a(C3150hm.m12537a(C2461Kl.m10431a(32)));
        return (C3091fk) n.mo8629k();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2778Vi mo8280c(C3150hm hmVar) {
        try {
            C3091fk a = C3091fk.m12330a(hmVar);
            if (a instanceof C3091fk) {
                C2612Pl.m10917a(a.mo9425l(), 0);
                if (a.mo9426m().size() == 32) {
                    return new C3239kl(a.mo9426m().mo9505a());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (C2755Um e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C3091fk a = m13758a();
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        o.mo8216a(a.mo9039h());
        o.mo8215a(C2346Gk.C2348b.SYMMETRIC);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        return m13758a();
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        return m13758a();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C3091fk) {
            C3091fk fkVar = (C3091fk) tnVar;
            C2612Pl.m10917a(fkVar.mo9425l(), 0);
            if (fkVar.mo9426m().size() == 32) {
                return new C3239kl(fkVar.mo9426m().mo9505a());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    public final int getVersion() {
        return 0;
    }
}
