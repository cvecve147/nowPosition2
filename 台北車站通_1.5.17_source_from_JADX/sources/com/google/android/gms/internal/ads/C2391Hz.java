package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Hz */
final class C2391Hz implements Callable<C2276Dz> {

    /* renamed from: a */
    private final /* synthetic */ C2191Az f7221a;

    /* renamed from: b */
    private final /* synthetic */ C2363Gz f7222b;

    C2391Hz(C2363Gz gz, C2191Az az) {
        this.f7222b = gz;
        this.f7221a = az;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2276Dz call() {
        synchronized (this.f7222b.f7108i) {
            if (this.f7222b.f7109j) {
                return null;
            }
            return this.f7221a.mo7856a(this.f7222b.f7105f, this.f7222b.f7106g);
        }
    }
}
