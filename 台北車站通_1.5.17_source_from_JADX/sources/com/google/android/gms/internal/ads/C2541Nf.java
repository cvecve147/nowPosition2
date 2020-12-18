package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Nf */
final /* synthetic */ class C2541Nf implements Runnable {

    /* renamed from: a */
    private final C3116gg f7645a;

    /* renamed from: b */
    private final C2371Hf f7646b;

    /* renamed from: c */
    private final C2804Wf f7647c;

    C2541Nf(C3116gg ggVar, C2371Hf hf, C2804Wf wf) {
        this.f7645a = ggVar;
        this.f7646b = hf;
        this.f7647c = wf;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.gg r0 = r3.f7645a
            com.google.android.gms.internal.ads.Hf r1 = r3.f7646b
            com.google.android.gms.internal.ads.Wf r2 = r3.f7647c
            java.lang.Object r2 = r2.get()     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            java.lang.Object r1 = r1.apply(r2)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            r0.mo9464b(r1)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            return
        L_0x0012:
            r1 = move-exception
            r0.mo9463a(r1)
            return
        L_0x0017:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            r0.mo9463a(r1)
            return
        L_0x0023:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r0.mo9463a(r1)
            return
        L_0x0030:
            r1 = 1
            r0.cancel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2541Nf.run():void");
    }
}
