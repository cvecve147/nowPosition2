package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.dj */
public final class C3032dj {

    /* renamed from: a */
    private C2608Pk f9065a;

    private C3032dj(C2608Pk pk) {
        this.f9065a = pk;
    }

    /* renamed from: a */
    static final C3032dj m12156a(C2608Pk pk) {
        if (pk != null && pk.mo8681n() > 0) {
            return new C3032dj(pk);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2608Pk mo9313a() {
        return this.f9065a;
    }

    public final String toString() {
        return C3265lj.m12977a(this.f9065a).toString();
    }
}
