package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C2779Vj;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qj */
final class C3408qj implements C3004cj<C2778Vi> {
    C3408qj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2778Vi mo8280c(C3150hm hmVar) {
        try {
            C2779Vj a = C2779Vj.m11420a(hmVar);
            if (a instanceof C2779Vj) {
                C2612Pl.m10917a(a.mo8957l(), 0);
                C2612Pl.m10916a(a.mo8958m().size());
                if (a.mo8959n().mo9166l() != 12) {
                    if (a.mo8959n().mo9166l() != 16) {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
                return new C3121gl(a.mo8958m().mo9505a(), a.mo8959n().mo9166l());
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        o.mo8216a(((C2779Vj) mo8278b(hmVar)).mo9039h());
        o.mo8215a(C2346Gk.C2348b.SYMMETRIC);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        if (tnVar instanceof C2863Yj) {
            C2863Yj yj = (C2863Yj) tnVar;
            C2612Pl.m10916a(yj.mo9072l());
            if (yj.mo9073m().mo9166l() == 12 || yj.mo9073m().mo9166l() == 16) {
                C2779Vj.C2780a o = C2779Vj.m11427o();
                o.mo8962a(C3150hm.m12537a(C2461Kl.m10431a(yj.mo9072l())));
                o.mo8961a(yj.mo9073m());
                o.mo8960a(0);
                return o.mo8629k();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        try {
            return mo8277a((C3498tn) C2863Yj.m11625a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C2779Vj) {
            C2779Vj vj = (C2779Vj) tnVar;
            C2612Pl.m10917a(vj.mo8957l(), 0);
            C2612Pl.m10916a(vj.mo8958m().size());
            if (vj.mo8959n().mo9166l() == 12 || vj.mo8959n().mo9166l() == 16) {
                return new C3121gl(vj.mo8958m().mo9505a(), vj.mo8959n().mo9166l());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    public final int getVersion() {
        return 0;
    }
}
