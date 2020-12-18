package com.google.android.gms.internal.ads;

import java.math.BigInteger;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Pd */
public final class C2600Pd {

    /* renamed from: a */
    private BigInteger f8095a = BigInteger.ONE;

    /* renamed from: a */
    public final synchronized String mo8662a() {
        String bigInteger;
        bigInteger = this.f8095a.toString();
        this.f8095a = this.f8095a.add(BigInteger.ONE);
        return bigInteger;
    }
}
