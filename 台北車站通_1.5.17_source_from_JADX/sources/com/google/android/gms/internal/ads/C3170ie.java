package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ie */
final class C3170ie implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f9459a;

    /* renamed from: b */
    private final /* synthetic */ C3114ge f9460b;

    C3170ie(C3114ge geVar, Context context) {
        this.f9460b = geVar;
        this.f9459a = context;
    }

    public final void run() {
        synchronized (this.f9460b.f9352b) {
            String unused = this.f9460b.f9354d = C3114ge.m12434d(this.f9459a);
            this.f9460b.f9352b.notifyAll();
        }
    }
}
