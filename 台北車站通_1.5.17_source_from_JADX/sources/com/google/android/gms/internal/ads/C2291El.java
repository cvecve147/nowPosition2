package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.El */
public final class C2291El implements C3610xl<MessageDigest> {
    /* renamed from: a */
    public final /* synthetic */ Object mo7828a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
