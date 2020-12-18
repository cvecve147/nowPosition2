package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mj */
final class C3294mj implements C2834Xi<C2778Vi> {
    /* renamed from: a */
    public final C3004cj<C2778Vi> mo7820a(String str, String str2, int i) {
        C3004cj<C2778Vi> cjVar;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (!((lowerCase.hashCode() == 2989895 && lowerCase.equals("aead")) ? false : true)) {
            switch (str.hashCode()) {
                case 360753376:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1215885937:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1469984853:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1797113348:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1855890991:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2079211877:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                cjVar = new C3351oj();
            } else if (c == 1) {
                cjVar = new C3408qj();
            } else if (c == 2) {
                cjVar = new C3436rj();
            } else if (c == 3) {
                cjVar = new C3465sj();
            } else if (c == 4) {
                cjVar = new C3493tj();
            } else if (c == 5) {
                cjVar = new C3552vj();
            } else {
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
            }
            if (cjVar.getVersion() >= i) {
                return cjVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
