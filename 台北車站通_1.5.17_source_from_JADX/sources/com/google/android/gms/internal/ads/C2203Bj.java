package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.Bj */
final class C2203Bj implements C2834Xi<C2975bj> {
    /* renamed from: a */
    public final C3004cj<C2975bj> mo7820a(String str, String str2, int i) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (!((lowerCase.hashCode() == 1420614889 && lowerCase.equals("hybridencrypt")) ? false : true)) {
            if (str.hashCode() == 396454335 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                c = 0;
            }
            if (c == 0) {
                C3636yj yjVar = new C3636yj();
                if (i <= 0) {
                    return yjVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
