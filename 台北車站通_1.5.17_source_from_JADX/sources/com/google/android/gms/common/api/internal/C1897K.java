package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.K */
public final class C1897K implements C1907Q {

    /* renamed from: a */
    private final C1908S f6132a;

    public C1897K(C1908S s) {
        this.f6132a = s;
    }

    /* renamed from: a */
    public final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7358a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo7359a(ConnectionResult connectionResult, C1850a<?> aVar, boolean z) {
    }

    /* renamed from: a */
    public final boolean mo7360a() {
        return true;
    }

    /* renamed from: b */
    public final void mo7361b() {
        for (C1850a.C1861f a : this.f6132a.f6186f.values()) {
            a.mo7288a();
        }
        this.f6132a.f6194n.f6166q = Collections.emptySet();
    }

    public final void connect() {
        this.f6132a.mo7384c();
    }

    /* renamed from: f */
    public final void mo7363f(int i) {
    }

    /* renamed from: j */
    public final void mo7364j(Bundle bundle) {
    }
}
