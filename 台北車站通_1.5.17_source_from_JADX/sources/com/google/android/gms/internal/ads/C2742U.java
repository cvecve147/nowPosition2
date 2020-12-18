package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1799s;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.U */
final class C2742U implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f8370a;

    /* renamed from: b */
    private final /* synthetic */ C2713T f8371b;

    C2742U(C2713T t, CountDownLatch countDownLatch) {
        this.f8371b = t;
        this.f8370a = countDownLatch;
    }

    public final void run() {
        synchronized (this.f8371b.f7226g) {
            boolean unused = this.f8371b.f8329p = C1799s.m8044a(this.f8371b.f8328o, this.f8371b.f8326m, this.f8370a);
        }
    }
}
