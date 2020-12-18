package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.internal.measurement.Ab */
final class C3716Ab implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzdz f11011a;

    /* renamed from: b */
    private final /* synthetic */ C3910wb f11012b;

    C3716Ab(C3910wb wbVar, zzdz zzdz) {
        this.f11012b = wbVar;
        this.f11011a = zzdz;
    }

    public final void run() {
        C3766N d = this.f11012b.f11702d;
        if (d == null) {
            this.f11012b.mo10385b().mo10585y().mo10592a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo10432b(this.f11011a);
            this.f11012b.mo11030a(d, (AbstractSafeParcelable) null, this.f11011a);
            this.f11012b.m15820F();
        } catch (RemoteException e) {
            this.f11012b.mo10385b().mo10585y().mo10593a("Failed to send app launch to the service", e);
        }
    }
}
