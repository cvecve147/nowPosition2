package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.Hb */
final class C3744Hb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11134a;

    /* renamed from: b */
    private final /* synthetic */ String f11135b;

    /* renamed from: c */
    private final /* synthetic */ String f11136c;

    /* renamed from: d */
    private final /* synthetic */ String f11137d;

    /* renamed from: e */
    private final /* synthetic */ boolean f11138e;

    /* renamed from: f */
    private final /* synthetic */ zzdz f11139f;

    /* renamed from: g */
    private final /* synthetic */ C3910wb f11140g;

    C3744Hb(C3910wb wbVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzdz zzdz) {
        this.f11140g = wbVar;
        this.f11134a = atomicReference;
        this.f11135b = str;
        this.f11136c = str2;
        this.f11137d = str3;
        this.f11138e = z;
        this.f11139f = zzdz;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<zzjx> a;
        synchronized (this.f11134a) {
            try {
                C3766N d = this.f11140g.f11702d;
                if (d == null) {
                    this.f11140g.mo10385b().mo10585y().mo10595a("Failed to get user properties", C3801W.m15166a(this.f11135b), this.f11136c, this.f11137d);
                    this.f11134a.set(Collections.emptyList());
                    this.f11134a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f11135b)) {
                    atomicReference2 = this.f11134a;
                    a = d.mo10423a(this.f11136c, this.f11137d, this.f11138e, this.f11139f);
                } else {
                    atomicReference2 = this.f11134a;
                    a = d.mo10422a(this.f11135b, this.f11136c, this.f11137d, this.f11138e);
                }
                atomicReference2.set(a);
                this.f11140g.m15820F();
                atomicReference = this.f11134a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f11140g.mo10385b().mo10585y().mo10595a("Failed to get user properties", C3801W.m15166a(this.f11135b), this.f11136c, e);
                    this.f11134a.set(Collections.emptyList());
                    atomicReference = this.f11134a;
                } catch (Throwable th) {
                    this.f11134a.notify();
                    throw th;
                }
            }
        }
    }
}
