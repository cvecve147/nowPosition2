package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.Jb */
final class C3752Jb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11156a;

    /* renamed from: b */
    private final /* synthetic */ zzdz f11157b;

    /* renamed from: c */
    private final /* synthetic */ boolean f11158c;

    /* renamed from: d */
    private final /* synthetic */ C3910wb f11159d;

    C3752Jb(C3910wb wbVar, AtomicReference atomicReference, zzdz zzdz, boolean z) {
        this.f11159d = wbVar;
        this.f11156a = atomicReference;
        this.f11157b = zzdz;
        this.f11158c = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f11156a) {
            try {
                C3766N d = this.f11159d.f11702d;
                if (d == null) {
                    this.f11159d.mo10385b().mo10585y().mo10592a("Failed to get user properties");
                    this.f11156a.notify();
                    return;
                }
                this.f11156a.set(d.mo10419a(this.f11157b, this.f11158c));
                this.f11159d.m15820F();
                atomicReference = this.f11156a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f11159d.mo10385b().mo10585y().mo10593a("Failed to get user properties", e);
                    atomicReference = this.f11156a;
                } catch (Throwable th) {
                    this.f11156a.notify();
                    throw th;
                }
            }
        }
    }
}
