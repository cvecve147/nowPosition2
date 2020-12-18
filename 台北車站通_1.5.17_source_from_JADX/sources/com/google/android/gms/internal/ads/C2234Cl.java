package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.Cl */
public final class C2234Cl implements C3610xl<KeyPairGenerator> {
    /* renamed from: a */
    public final /* synthetic */ Object mo7828a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
