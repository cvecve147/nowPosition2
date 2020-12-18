package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.Dl */
public final class C2262Dl implements C3610xl<Mac> {
    /* renamed from: a */
    public final /* synthetic */ Object mo7828a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
