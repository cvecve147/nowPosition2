package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.Gb */
final class C3740Gb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11117a;

    /* renamed from: b */
    private final /* synthetic */ String f11118b;

    /* renamed from: c */
    private final /* synthetic */ String f11119c;

    /* renamed from: d */
    private final /* synthetic */ String f11120d;

    /* renamed from: e */
    private final /* synthetic */ zzdz f11121e;

    /* renamed from: f */
    private final /* synthetic */ C3910wb f11122f;

    C3740Gb(C3910wb wbVar, AtomicReference atomicReference, String str, String str2, String str3, zzdz zzdz) {
        this.f11122f = wbVar;
        this.f11117a = atomicReference;
        this.f11118b = str;
        this.f11119c = str2;
        this.f11120d = str3;
        this.f11121e = zzdz;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<zzed> a;
        synchronized (this.f11117a) {
            try {
                C3766N d = this.f11122f.f11702d;
                if (d == null) {
                    this.f11122f.mo10385b().mo10585y().mo10595a("Failed to get conditional properties", C3801W.m15166a(this.f11118b), this.f11119c, this.f11120d);
                    this.f11117a.set(Collections.emptyList());
                    this.f11117a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f11118b)) {
                    atomicReference2 = this.f11117a;
                    a = d.mo10420a(this.f11119c, this.f11120d, this.f11121e);
                } else {
                    atomicReference2 = this.f11117a;
                    a = d.mo10421a(this.f11118b, this.f11119c, this.f11120d);
                }
                atomicReference2.set(a);
                this.f11122f.m15820F();
                atomicReference = this.f11117a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f11122f.mo10385b().mo10585y().mo10595a("Failed to get conditional properties", C3801W.m15166a(this.f11118b), this.f11119c, e);
                    this.f11117a.set(Collections.emptyList());
                    atomicReference = this.f11117a;
                } catch (Throwable th) {
                    this.f11117a.notify();
                    throw th;
                }
            }
        }
    }
}
