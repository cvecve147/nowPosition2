package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C2976bk;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.rj */
final class C3436rj implements C3004cj<C2778Vi> {
    C3436rj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2778Vi mo8280c(C3150hm hmVar) {
        try {
            C2976bk a = C2976bk.m12004a(hmVar);
            if (a instanceof C2976bk) {
                C2612Pl.m10917a(a.mo9243l(), 0);
                C2612Pl.m10916a(a.mo9244m().size());
                return new C3149hl(a.mo9244m().mo9505a());
            }
            throw new GeneralSecurityException("expected AesGcmKey proto");
        } catch (C2755Um unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        o.mo8216a(((C2976bk) mo8278b(hmVar)).mo9039h());
        o.mo8215a(C2346Gk.C2348b.SYMMETRIC);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        if (tnVar instanceof C3033dk) {
            C3033dk dkVar = (C3033dk) tnVar;
            C2612Pl.m10916a(dkVar.mo9315l());
            C2976bk.C2977a n = C2976bk.m12009n();
            n.mo9246a(C3150hm.m12537a(C2461Kl.m10431a(dkVar.mo9315l())));
            n.mo9245a(0);
            return n.mo8629k();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        try {
            return mo8277a((C3498tn) C3033dk.m12158a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C2976bk) {
            C2976bk bkVar = (C2976bk) tnVar;
            C2612Pl.m10917a(bkVar.mo9243l(), 0);
            C2612Pl.m10916a(bkVar.mo9244m().size());
            return new C3149hl(bkVar.mo9244m().mo9505a());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    public final int getVersion() {
        return 0;
    }
}
