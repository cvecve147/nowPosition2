package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1925e;
import com.google.android.gms.common.util.C2092n;

/* renamed from: com.google.android.gms.common.api.internal.N */
public abstract class C1903N {

    /* renamed from: a */
    private final int f6178a;

    public C1903N(int i) {
        this.f6178a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Status m8456b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C2092n.m9162c() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo7374a(Status status);

    /* renamed from: a */
    public abstract void mo7375a(C1925e.C1926a<?> aVar);

    /* renamed from: a */
    public abstract void mo7376a(C1956q qVar, boolean z);

    /* renamed from: a */
    public abstract void mo7377a(RuntimeException runtimeException);
}
