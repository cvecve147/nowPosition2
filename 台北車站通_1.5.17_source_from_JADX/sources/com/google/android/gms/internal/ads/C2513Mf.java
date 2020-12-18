package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.Mf */
final /* synthetic */ class C2513Mf implements Runnable {

    /* renamed from: a */
    private final C2399If f7575a;

    /* renamed from: b */
    private final C2804Wf f7576b;

    C2513Mf(C2399If ifR, C2804Wf wf) {
        this.f7575a = ifR;
        this.f7576b = wf;
    }

    public final void run() {
        Throwable e;
        C2399If ifR = this.f7575a;
        try {
            ifR.mo7801a(this.f7576b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            ifR.mo7802a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            ifR.mo7802a(e);
        } catch (Exception e4) {
            e = e4;
            ifR.mo7802a(e);
        }
    }
}
