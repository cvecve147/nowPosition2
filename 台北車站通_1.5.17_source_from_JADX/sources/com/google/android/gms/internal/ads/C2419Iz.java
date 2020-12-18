package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Iz */
final class C2419Iz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2804Wf f7305a;

    /* renamed from: b */
    private final /* synthetic */ C2363Gz f7306b;

    C2419Iz(C2363Gz gz, C2804Wf wf) {
        this.f7306b = gz;
        this.f7305a = wf;
    }

    public final void run() {
        for (C2804Wf wf : this.f7306b.f7110k.keySet()) {
            if (wf != this.f7305a) {
                ((C2191Az) this.f7306b.f7110k.get(wf)).mo7857a();
            }
        }
    }
}
