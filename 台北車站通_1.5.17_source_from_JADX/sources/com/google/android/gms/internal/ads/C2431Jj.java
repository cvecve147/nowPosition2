package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.Jj */
final class C2431Jj implements C2834Xi<C3119gj> {
    /* renamed from: a */
    public final C3004cj<C3119gj> mo7820a(String str, String str2, int i) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (!((lowerCase.hashCode() == 107855 && lowerCase.equals("mac")) ? false : true)) {
            if (str.hashCode() == 836622442 && str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                c = 0;
            }
            if (c == 0) {
                C2375Hj hj = new C2375Hj();
                if (i <= 0) {
                    return hj;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
