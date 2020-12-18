package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Pl */
public final class C2612Pl {

    /* renamed from: a */
    private static final Pattern f8113a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);

    /* renamed from: b */
    private static final Pattern f8114b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);

    /* renamed from: a */
    public static void m10916a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new GeneralSecurityException("invalid AES key size");
        }
    }

    /* renamed from: a */
    public static void m10917a(int i, int i2) {
        if (i < 0 || i > 0) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(i), 0}));
        }
    }
}
