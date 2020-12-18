package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.zb */
final class C3922zb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11743a;

    /* renamed from: b */
    private final /* synthetic */ zzdz f11744b;

    /* renamed from: c */
    private final /* synthetic */ C3910wb f11745c;

    C3922zb(C3910wb wbVar, AtomicReference atomicReference, zzdz zzdz) {
        this.f11745c = wbVar;
        this.f11743a = atomicReference;
        this.f11744b = zzdz;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f11743a) {
            try {
                C3766N d = this.f11745c.f11702d;
                if (d == null) {
                    this.f11745c.mo10385b().mo10585y().mo10592a("Failed to get app instance id");
                    this.f11743a.notify();
                    return;
                }
                this.f11743a.set(d.mo10434d(this.f11744b));
                String str = (String) this.f11743a.get();
                if (str != null) {
                    this.f11745c.mo10567h().mo10611a(str);
                    this.f11745c.mo10455q().f11479m.mo10774a(str);
                }
                this.f11745c.m15820F();
                atomicReference = this.f11743a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f11745c.mo10385b().mo10585y().mo10593a("Failed to get app instance id", e);
                    atomicReference = this.f11743a;
                } catch (Throwable th) {
                    this.f11743a.notify();
                    throw th;
                }
            }
        }
    }
}
