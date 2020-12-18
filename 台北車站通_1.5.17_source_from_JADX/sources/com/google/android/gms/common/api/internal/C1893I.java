package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.google.android.gms.common.api.internal.I */
final class C1893I implements GoogleApiClient.C1848b, GoogleApiClient.C1849c {

    /* renamed from: a */
    private final /* synthetic */ C1974z f6125a;

    private C1893I(C1974z zVar) {
        this.f6125a = zVar;
    }

    /* synthetic */ C1893I(C1974z zVar, C1875A a) {
        this(zVar);
    }

    /* renamed from: a */
    public final void mo7263a(ConnectionResult connectionResult) {
        this.f6125a.f6328b.lock();
        try {
            if (this.f6125a.m8696a(connectionResult)) {
                this.f6125a.m8710f();
                this.f6125a.m8706d();
            } else {
                this.f6125a.m8700b(connectionResult);
            }
        } finally {
            this.f6125a.f6328b.unlock();
        }
    }

    /* renamed from: f */
    public final void mo7261f(int i) {
    }

    /* renamed from: j */
    public final void mo7262j(Bundle bundle) {
        this.f6125a.f6337k.mo11364a(new C1889G(this.f6125a));
    }
}
