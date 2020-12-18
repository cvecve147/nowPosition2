package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C2606Pj;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.pj */
final class C3379pj implements C3004cj<C2377Hl> {
    C3379pj() {
    }

    /* renamed from: a */
    private static void m13413a(C2723Tj tj) {
        if (tj.mo8896l() < 12 || tj.mo8896l() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3093fl mo8280c(C3150hm hmVar) {
        try {
            C2606Pj a = C2606Pj.m10886a(hmVar);
            if (a instanceof C2606Pj) {
                C2612Pl.m10917a(a.mo8673l(), 0);
                C2612Pl.m10916a(a.mo8675n().size());
                m13413a(a.mo8674m());
                return new C3093fl(a.mo8675n().mo9505a(), a.mo8674m().mo8896l());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.AesCtrKey");
        o.mo8216a(((C2606Pj) mo8278b(hmVar)).mo9039h());
        o.mo8215a(C2346Gk.C2348b.SYMMETRIC);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        if (tnVar instanceof C2664Rj) {
            C2664Rj rj = (C2664Rj) tnVar;
            C2612Pl.m10916a(rj.mo8784l());
            m13413a(rj.mo8785m());
            C2606Pj.C2607a o = C2606Pj.m10893o();
            o.mo8677a(rj.mo8785m());
            o.mo8678a(C3150hm.m12537a(C2461Kl.m10431a(rj.mo8784l())));
            o.mo8676a(0);
            return o.mo8629k();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        try {
            return mo8277a((C3498tn) C2664Rj.m11052a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C2606Pj) {
            C2606Pj pj = (C2606Pj) tnVar;
            C2612Pl.m10917a(pj.mo8673l(), 0);
            C2612Pl.m10916a(pj.mo8675n().size());
            m13413a(pj.mo8674m());
            return new C3093fl(pj.mo8675n().mo9505a(), pj.mo8674m().mo8896l());
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    public final int getVersion() {
        return 0;
    }
}
