package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Mu */
final class C2528Mu implements Callable<T> {

    /* renamed from: a */
    private final /* synthetic */ C2271Du f7623a;

    /* renamed from: b */
    private final /* synthetic */ C2500Lu f7624b;

    C2528Mu(C2500Lu lu, C2271Du du) {
        this.f7624b = lu;
        this.f7623a = du;
    }

    public final T call() {
        return this.f7623a.mo8012a(this.f7624b.f7542d);
    }
}
