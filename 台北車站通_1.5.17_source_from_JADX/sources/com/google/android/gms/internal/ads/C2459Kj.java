package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C3035dl;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.Kj */
public final class C2459Kj {

    /* renamed from: a */
    public static final C3035dl f7462a;

    /* renamed from: b */
    private static final C3035dl f7463b;

    static {
        C3035dl.C3036a m = C3035dl.m12166m();
        m.mo9318a("TINK_MAC_1_0_0");
        m.mo9317a(C2862Yi.m11624a("TinkMac", "Mac", "HmacKey", 0, true));
        f7462a = (C3035dl) m.mo8629k();
        C3035dl.C3036a m2 = C3035dl.m12166m();
        m2.mo8623a(f7462a);
        C3035dl.C3036a aVar = m2;
        aVar.mo9318a("TINK_MAC_1_1_0");
        f7463b = (C3035dl) aVar.mo8629k();
        try {
            m10428a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m10428a() {
        C3237kj.m12886a("TinkMac", new C2431Jj());
    }
}
