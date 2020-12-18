package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.su */
final class C3476su implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3448ru f10229a;

    C3476su(C3448ru ruVar) {
        this.f10229a = ruVar;
    }

    public final void run() {
        if (this.f10229a.f10155a.f10049a != null) {
            try {
                this.f10229a.f10155a.f10049a.mo8803c(1);
            } catch (RemoteException e) {
                C2227Cf.m9535c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
