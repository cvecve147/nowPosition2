package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.measurement.Fb */
final class C3736Fb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f11101a = true;

    /* renamed from: b */
    private final /* synthetic */ boolean f11102b;

    /* renamed from: c */
    private final /* synthetic */ zzed f11103c;

    /* renamed from: d */
    private final /* synthetic */ zzdz f11104d;

    /* renamed from: e */
    private final /* synthetic */ zzed f11105e;

    /* renamed from: f */
    private final /* synthetic */ C3910wb f11106f;

    C3736Fb(C3910wb wbVar, boolean z, boolean z2, zzed zzed, zzdz zzdz, zzed zzed2) {
        this.f11106f = wbVar;
        this.f11102b = z2;
        this.f11103c = zzed;
        this.f11104d = zzdz;
        this.f11105e = zzed2;
    }

    public final void run() {
        C3766N d = this.f11106f.f11702d;
        if (d == null) {
            this.f11106f.mo10385b().mo10585y().mo10592a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f11101a) {
            this.f11106f.mo11030a(d, this.f11102b ? null : this.f11103c, this.f11104d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f11105e.f11769a)) {
                    d.mo10427a(this.f11103c, this.f11104d);
                } else {
                    d.mo10426a(this.f11103c);
                }
            } catch (RemoteException e) {
                this.f11106f.mo10385b().mo10585y().mo10593a("Failed to send conditional user property to the service", e);
            }
        }
        this.f11106f.m15820F();
    }
}
