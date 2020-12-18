package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2175Ak;
import com.google.android.gms.internal.ads.C2346Gk;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.Hj */
final class C2375Hj implements C3004cj<C3119gj> {
    C2375Hj() {
    }

    /* renamed from: a */
    private static void m10147a(C2289Ek ek) {
        if (ek.mo8042m() >= 10) {
            int i = C2403Ij.f7258a[ek.mo8041l().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (ek.mo8042m() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (ek.mo8042m() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (ek.mo8042m() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3119gj mo8280c(C3150hm hmVar) {
        try {
            C2175Ak a = C2175Ak.m9344a(hmVar);
            if (a instanceof C2175Ak) {
                C2612Pl.m10917a(a.mo7822l(), 0);
                if (a.mo7823m().size() >= 16) {
                    m10147a(a.mo7824n());
                    C3637yk l = a.mo7824n().mo8041l();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(a.mo7823m().mo9505a(), "HMAC");
                    int m = a.mo7824n().mo8042m();
                    int i = C2403Ij.f7258a[l.ordinal()];
                    if (i == 1) {
                        return new C2405Il("HMACSHA1", secretKeySpec, m);
                    }
                    if (i == 2) {
                        return new C2405Il("HMACSHA256", secretKeySpec, m);
                    }
                    if (i == 3) {
                        return new C2405Il("HMACSHA512", secretKeySpec, m);
                    }
                    throw new GeneralSecurityException("unknown hash");
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.HmacKey");
        o.mo8216a(((C2175Ak) mo8278b(hmVar)).mo9039h());
        o.mo8215a(C2346Gk.C2348b.SYMMETRIC);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        if (tnVar instanceof C2232Ck) {
            C2232Ck ck = (C2232Ck) tnVar;
            if (ck.mo7932l() >= 16) {
                m10147a(ck.mo7933m());
                C2175Ak.C2176a o = C2175Ak.m9351o();
                o.mo7825a(0);
                o.mo7826a(ck.mo7933m());
                o.mo7827a(C3150hm.m12537a(C2461Kl.m10431a(ck.mo7932l())));
                return o.mo8629k();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        try {
            return mo8277a((C3498tn) C2232Ck.m9545a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        if (tnVar instanceof C2175Ak) {
            C2175Ak ak = (C2175Ak) tnVar;
            C2612Pl.m10917a(ak.mo7822l(), 0);
            if (ak.mo7823m().size() >= 16) {
                m10147a(ak.mo7824n());
                C3637yk l = ak.mo7824n().mo8041l();
                SecretKeySpec secretKeySpec = new SecretKeySpec(ak.mo7823m().mo9505a(), "HMAC");
                int m = ak.mo7824n().mo8042m();
                int i = C2403Ij.f7258a[l.ordinal()];
                if (i == 1) {
                    return new C2405Il("HMACSHA1", secretKeySpec, m);
                }
                if (i == 2) {
                    return new C2405Il("HMACSHA256", secretKeySpec, m);
                }
                if (i == 3) {
                    return new C2405Il("HMACSHA512", secretKeySpec, m);
                }
                throw new GeneralSecurityException("unknown hash");
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }

    public final int getVersion() {
        return 0;
    }
}
