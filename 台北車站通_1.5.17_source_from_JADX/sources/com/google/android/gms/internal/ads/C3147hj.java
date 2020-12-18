package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C2608Pk;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hj */
public final class C3147hj {
    @Deprecated
    /* renamed from: a */
    public static final C3032dj m12532a(byte[] bArr) {
        try {
            C2608Pk a = C2608Pk.m10903a(bArr);
            for (C2608Pk.C2610b next : a.mo8680m()) {
                if (next.mo8683m().mo8214n() == C2346Gk.C2348b.UNKNOWN_KEYMATERIAL || next.mo8683m().mo8214n() == C2346Gk.C2348b.SYMMETRIC || next.mo8683m().mo8214n() == C2346Gk.C2348b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return C3032dj.m12156a(a);
        } catch (C2755Um unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
