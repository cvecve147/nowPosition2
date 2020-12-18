package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.uu */
final class C3535uu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3505tu f10325a;

    C3535uu(C3505tu tuVar) {
        this.f10325a = tuVar;
    }

    public final void run() {
        if (this.f10325a.f10273a != null) {
            try {
                this.f10325a.f10273a.mo8803c(1);
            } catch (RemoteException e) {
                C2227Cf.m9535c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
