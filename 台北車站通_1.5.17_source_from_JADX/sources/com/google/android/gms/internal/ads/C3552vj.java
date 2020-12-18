package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C2836Xk;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vj */
final class C3552vj implements C3004cj<C2778Vi> {
    C3552vj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2778Vi mo8280c(C3150hm hmVar) {
        try {
            C2836Xk a = C2836Xk.m11574a(hmVar);
            if (a instanceof C2836Xk) {
                C2612Pl.m10917a(a.mo9035l(), 0);
                String l = a.mo9036m().mo9167l();
                return new C3522uj(a.mo9036m().mo9168m(), C3090fj.m12329a(l).mo9394b(l));
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        o.mo8216a(((C2836Xk) mo8278b(hmVar)).mo9039h());
        o.mo8215a(C2346Gk.C2348b.REMOTE);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        if (tnVar instanceof C2919_k) {
            C2836Xk.C2837a n = C2836Xk.m11579n();
            n.mo9038a((C2919_k) tnVar);
            n.mo9037a(0);
            return n.mo8629k();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        try {
            return mo8277a((C3498tn) C2919_k.m11851a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C2836Xk) {
            C2836Xk xk = (C2836Xk) tnVar;
            C2612Pl.m10917a(xk.mo9035l(), 0);
            String l = xk.mo9036m().mo9167l();
            return new C3522uj(xk.mo9036m().mo9168m(), C3090fj.m12329a(l).mo9394b(l));
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }

    public final int getVersion() {
        return 0;
    }
}
