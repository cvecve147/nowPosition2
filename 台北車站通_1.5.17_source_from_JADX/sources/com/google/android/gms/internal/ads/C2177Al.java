package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.ads.Al */
public final class C2177Al implements C3610xl<KeyAgreement> {
    /* renamed from: a */
    public final /* synthetic */ Object mo7828a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
