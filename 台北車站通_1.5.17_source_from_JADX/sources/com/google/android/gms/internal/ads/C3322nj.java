package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C3035dl;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.nj */
public final class C3322nj {

    /* renamed from: a */
    public static final C3035dl f9869a;

    /* renamed from: b */
    private static final C3035dl f9870b;

    static {
        C3035dl.C3036a m = C3035dl.m12166m();
        m.mo8623a(C2459Kj.f7462a);
        C3035dl.C3036a aVar = m;
        aVar.mo9317a(C2862Yi.m11624a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true));
        aVar.mo9317a(C2862Yi.m11624a("TinkAead", "Aead", "AesEaxKey", 0, true));
        aVar.mo9317a(C2862Yi.m11624a("TinkAead", "Aead", "AesGcmKey", 0, true));
        aVar.mo9317a(C2862Yi.m11624a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true));
        aVar.mo9317a(C2862Yi.m11624a("TinkAead", "Aead", "KmsAeadKey", 0, true));
        aVar.mo9317a(C2862Yi.m11624a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true));
        aVar.mo9318a("TINK_AEAD_1_0_0");
        f9869a = (C3035dl) aVar.mo8629k();
        C3035dl.C3036a m2 = C3035dl.m12166m();
        m2.mo8623a(f9869a);
        C3035dl.C3036a aVar2 = m2;
        aVar2.mo9318a("TINK_AEAD_1_1_0");
        f9870b = (C3035dl) aVar2.mo8629k();
        try {
            m13153a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m13153a() {
        C3237kj.m12886a("TinkAead", new C3294mj());
        C2459Kj.m10428a();
    }
}
