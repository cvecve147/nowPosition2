package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C3035dl;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.zj */
public final class C3665zj {

    /* renamed from: a */
    public static final C3035dl f10651a;

    /* renamed from: b */
    private static final C3035dl f10652b;

    static {
        C3035dl.C3036a m = C3035dl.m12166m();
        m.mo8623a(C3322nj.f9869a);
        C3035dl.C3036a aVar = m;
        aVar.mo9317a(C2862Yi.m11624a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true));
        aVar.mo9317a(C2862Yi.m11624a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true));
        aVar.mo9318a("TINK_HYBRID_1_0_0");
        f10651a = (C3035dl) aVar.mo8629k();
        C3035dl.C3036a m2 = C3035dl.m12166m();
        m2.mo8623a(f10651a);
        C3035dl.C3036a aVar2 = m2;
        aVar2.mo9318a("TINK_HYBRID_1_1_0");
        f10652b = (C3035dl) aVar2.mo8629k();
        try {
            C3237kj.m12886a("TinkHybridEncrypt", new C2203Bj());
            C3237kj.m12886a("TinkHybridDecrypt", new C2174Aj());
            C3322nj.m13153a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
