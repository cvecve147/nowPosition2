package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* renamed from: com.google.android.gms.internal.ads.Fl */
public final class C2319Fl implements C3610xl<Signature> {
    /* renamed from: a */
    public final /* synthetic */ Object mo7828a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
