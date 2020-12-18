package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1921c;
import com.google.android.gms.common.api.internal.C1925e;

/* renamed from: com.google.android.gms.common.api.internal.va */
public final class C1967va<A extends C1921c<? extends C1874i, C1850a.C1852b>> extends C1903N {

    /* renamed from: b */
    private final A f6314b;

    public C1967va(int i, A a) {
        super(i);
        this.f6314b = a;
    }

    /* renamed from: a */
    public final void mo7374a(Status status) {
        this.f6314b.mo7411c(status);
    }

    /* renamed from: a */
    public final void mo7375a(C1925e.C1926a<?> aVar) {
        try {
            this.f6314b.mo7410b(aVar.mo7434f());
        } catch (RuntimeException e) {
            mo7377a(e);
        }
    }

    /* renamed from: a */
    public final void mo7376a(C1956q qVar, boolean z) {
        qVar.mo7477a((BasePendingResult<? extends C1874i>) this.f6314b, z);
    }

    /* renamed from: a */
    public final void mo7377a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f6314b.mo7411c(new Status(10, sb.toString()));
    }
}
