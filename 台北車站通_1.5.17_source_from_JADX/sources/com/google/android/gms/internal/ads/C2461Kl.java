package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.Kl */
public final class C2461Kl {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f7464a = new C2491Ll();

    /* renamed from: a */
    public static byte[] m10431a(int i) {
        byte[] bArr = new byte[i];
        f7464a.get().nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static SecureRandom m10432b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
