package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.Aj */
final class C2174Aj implements C2834Xi<C2947aj> {
    /* renamed from: a */
    public final C3004cj<C2947aj> mo7820a(String str, String str2, int i) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (!((lowerCase.hashCode() == 275448849 && lowerCase.equals("hybriddecrypt")) ? false : true)) {
            if (str.hashCode() == -80133005 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                c = 0;
            }
            if (c == 0) {
                C3608xj xjVar = new C3608xj();
                if (i <= 0) {
                    return xjVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
