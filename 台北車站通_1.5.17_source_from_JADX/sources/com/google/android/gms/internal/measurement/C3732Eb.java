package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.measurement.Eb */
final class C3732Eb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f11082a = true;

    /* renamed from: b */
    private final /* synthetic */ boolean f11083b;

    /* renamed from: c */
    private final /* synthetic */ zzeu f11084c;

    /* renamed from: d */
    private final /* synthetic */ zzdz f11085d;

    /* renamed from: e */
    private final /* synthetic */ String f11086e;

    /* renamed from: f */
    private final /* synthetic */ C3910wb f11087f;

    C3732Eb(C3910wb wbVar, boolean z, boolean z2, zzeu zzeu, zzdz zzdz, String str) {
        this.f11087f = wbVar;
        this.f11083b = z2;
        this.f11084c = zzeu;
        this.f11085d = zzdz;
        this.f11086e = str;
    }

    public final void run() {
        C3766N d = this.f11087f.f11702d;
        if (d == null) {
            this.f11087f.mo10385b().mo10585y().mo10592a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f11082a) {
            this.f11087f.mo11030a(d, this.f11083b ? null : this.f11084c, this.f11085d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f11086e)) {
                    d.mo10428a(this.f11084c, this.f11085d);
                } else {
                    d.mo10429a(this.f11084c, this.f11086e, this.f11087f.mo10385b().mo10581G());
                }
            } catch (RemoteException e) {
                this.f11087f.mo10385b().mo10585y().mo10593a("Failed to send event to the service", e);
            }
        }
        this.f11087f.m15820F();
    }
}
