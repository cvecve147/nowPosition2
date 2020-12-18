package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.yb */
final class C3918yb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzdz f11725a;

    /* renamed from: b */
    private final /* synthetic */ C3910wb f11726b;

    C3918yb(C3910wb wbVar, zzdz zzdz) {
        this.f11726b = wbVar;
        this.f11725a = zzdz;
    }

    public final void run() {
        C3766N d = this.f11726b.f11702d;
        if (d == null) {
            this.f11726b.mo10385b().mo10585y().mo10592a("Failed to reset data on the service; null service");
            return;
        }
        try {
            d.mo10433c(this.f11725a);
        } catch (RemoteException e) {
            this.f11726b.mo10385b().mo10585y().mo10593a("Failed to reset data on the service", e);
        }
        this.f11726b.m15820F();
    }
}
