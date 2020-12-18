package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.Sf */
final /* synthetic */ class C2691Sf implements Runnable {

    /* renamed from: a */
    private final C3116gg f8246a;

    /* renamed from: b */
    private final C2804Wf f8247b;

    C2691Sf(C3116gg ggVar, C2804Wf wf) {
        this.f8246a = ggVar;
        this.f8247b = wf;
    }

    public final void run() {
        Throwable e;
        C3116gg ggVar = this.f8246a;
        try {
            ggVar.mo9464b(this.f8247b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            ggVar.mo9463a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            ggVar.mo9463a(e);
        } catch (Exception e4) {
            ggVar.mo9463a(e4);
        }
    }
}
