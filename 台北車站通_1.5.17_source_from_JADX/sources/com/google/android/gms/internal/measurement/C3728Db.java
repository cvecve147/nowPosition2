package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.Db */
final class C3728Db implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzdz f11073a;

    /* renamed from: b */
    private final /* synthetic */ C3910wb f11074b;

    C3728Db(C3910wb wbVar, zzdz zzdz) {
        this.f11074b = wbVar;
        this.f11073a = zzdz;
    }

    public final void run() {
        C3766N d = this.f11074b.f11702d;
        if (d == null) {
            this.f11074b.mo10385b().mo10585y().mo10592a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo10425a(this.f11073a);
            this.f11074b.m15820F();
        } catch (RemoteException e) {
            this.f11074b.mo10385b().mo10585y().mo10593a("Failed to send measurementEnabled to the service", e);
        }
    }
}
