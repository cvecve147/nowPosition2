package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Pf */
final /* synthetic */ class C2602Pf implements Runnable {

    /* renamed from: a */
    private final C3116gg f8099a;

    C2602Pf(C3116gg ggVar) {
        this.f8099a = ggVar;
    }

    public final void run() {
        this.f8099a.mo9463a(new TimeoutException());
    }
}
