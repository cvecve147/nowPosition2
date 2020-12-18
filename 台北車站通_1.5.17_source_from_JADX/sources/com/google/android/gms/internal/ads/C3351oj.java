package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C2487Lj;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.oj */
class C3351oj implements C3004cj<C2778Vi> {

    /* renamed from: a */
    private static final Logger f9959a = Logger.getLogger(C3351oj.class.getName());

    C3351oj() {
        C3237kj.m12887a("type.googleapis.com/google.crypto.tink.AesCtrKey", new C3379pj());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2778Vi mo8280c(C3150hm hmVar) {
        try {
            C2487Lj a = C2487Lj.m10517a(hmVar);
            if (a instanceof C2487Lj) {
                C2612Pl.m10917a(a.mo8487l(), 0);
                return new C3554vl((C2377Hl) C3237kj.m12891b("type.googleapis.com/google.crypto.tink.AesCtrKey", a.mo8488m()), (C3119gj) C3237kj.m12891b("type.googleapis.com/google.crypto.tink.HmacKey", a.mo8489n()), a.mo8489n().mo7824n().mo8042m());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        o.mo8216a(((C2487Lj) mo8278b(hmVar)).mo9039h());
        o.mo8215a(C2346Gk.C2348b.SYMMETRIC);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        if (tnVar instanceof C2545Nj) {
            C2545Nj nj = (C2545Nj) tnVar;
            C2487Lj.C2488a o = C2487Lj.m10524o();
            o.mo8492a((C2606Pj) C3237kj.m12883a("type.googleapis.com/google.crypto.tink.AesCtrKey", (C3498tn) nj.mo8567l()));
            o.mo8491a((C2175Ak) C3237kj.m12883a("type.googleapis.com/google.crypto.tink.HmacKey", (C3498tn) nj.mo8568m()));
            o.mo8490a(0);
            return o.mo8629k();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        try {
            return mo8277a((C3498tn) C2545Nj.m10651a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C2487Lj) {
            C2487Lj lj = (C2487Lj) tnVar;
            C2612Pl.m10917a(lj.mo8487l(), 0);
            return new C3554vl((C2377Hl) C3237kj.m12891b("type.googleapis.com/google.crypto.tink.AesCtrKey", lj.mo8488m()), (C3119gj) C3237kj.m12891b("type.googleapis.com/google.crypto.tink.HmacKey", lj.mo8489n()), lj.mo8489n().mo7824n().mo8042m());
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    public final int getVersion() {
        return 0;
    }
}
