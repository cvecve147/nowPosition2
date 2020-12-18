package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1866b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1925e;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.android.gms.common.api.internal.la */
abstract class C1947la<T> extends C1903N {

    /* renamed from: b */
    protected final C5537h<T> f6284b;

    public C1947la(int i, C5537h<T> hVar) {
        super(i);
        this.f6284b = hVar;
    }

    /* renamed from: a */
    public void mo7374a(Status status) {
        this.f6284b.mo14999b((Exception) new C1866b(status));
    }

    /* renamed from: a */
    public final void mo7375a(C1925e.C1926a<?> aVar) {
        try {
            mo7467b(aVar);
        } catch (DeadObjectException e) {
            mo7374a(C1903N.m8456b(e));
            throw e;
        } catch (RemoteException e2) {
            mo7374a(C1903N.m8456b(e2));
        } catch (RuntimeException e3) {
            mo7377a(e3);
        }
    }

    /* renamed from: a */
    public void mo7377a(RuntimeException runtimeException) {
        this.f6284b.mo14999b((Exception) runtimeException);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo7467b(C1925e.C1926a<?> aVar);
}
