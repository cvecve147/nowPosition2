package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.Bb */
final class C3720Bb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3894sb f11021a;

    /* renamed from: b */
    private final /* synthetic */ C3910wb f11022b;

    C3720Bb(C3910wb wbVar, C3894sb sbVar) {
        this.f11022b = wbVar;
        this.f11021a = sbVar;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        C3766N d = this.f11022b.f11702d;
        if (d == null) {
            this.f11022b.mo10385b().mo10585y().mo10592a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f11021a == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f11022b.getContext().getPackageName();
            } else {
                j = this.f11021a.f11641c;
                str = this.f11021a.f11639a;
                str2 = this.f11021a.f11640b;
                packageName = this.f11022b.getContext().getPackageName();
            }
            d.mo10424a(j, str, str2, packageName);
            this.f11022b.m15820F();
        } catch (RemoteException e) {
            this.f11022b.mo10385b().mo10585y().mo10593a("Failed to send current screen to the service", e);
        }
    }
}
