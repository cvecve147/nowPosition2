package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.Bl */
public final class C2205Bl implements C3610xl<KeyFactory> {
    /* renamed from: a */
    public final /* synthetic */ Object mo7828a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
