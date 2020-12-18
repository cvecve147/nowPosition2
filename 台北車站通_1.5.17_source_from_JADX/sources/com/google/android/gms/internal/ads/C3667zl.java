package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.zl */
public final class C3667zl implements C3610xl<Cipher> {
    /* renamed from: a */
    public final /* synthetic */ Object mo7828a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
