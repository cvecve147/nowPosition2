package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1925e;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.android.gms.common.api.internal.wa */
public final class C1969wa<ResultT> extends C1903N {

    /* renamed from: b */
    private final C1952o<C1850a.C1852b, ResultT> f6317b;

    /* renamed from: c */
    private final C5537h<ResultT> f6318c;

    /* renamed from: d */
    private final C1950n f6319d;

    /* renamed from: a */
    public final void mo7374a(Status status) {
        this.f6318c.mo14999b(this.f6319d.mo7392a(status));
    }

    /* renamed from: a */
    public final void mo7375a(C1925e.C1926a<?> aVar) {
        try {
            this.f6317b.mo7470a(aVar.mo7434f(), this.f6318c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo7374a(C1903N.m8456b(e2));
        } catch (RuntimeException e3) {
            mo7377a(e3);
        }
    }

    /* renamed from: a */
    public final void mo7376a(C1956q qVar, boolean z) {
        qVar.mo7478a(this.f6318c, z);
    }

    /* renamed from: a */
    public final void mo7377a(RuntimeException runtimeException) {
        this.f6318c.mo14999b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final Feature[] mo7490a() {
        return this.f6317b.mo7472b();
    }

    /* renamed from: b */
    public final boolean mo7491b() {
        return this.f6317b.mo7471a();
    }
}
