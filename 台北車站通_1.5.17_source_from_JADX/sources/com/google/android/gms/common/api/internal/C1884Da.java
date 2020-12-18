package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.common.api.internal.Da */
public final class C1884Da implements GoogleApiClient.C1848b, GoogleApiClient.C1849c {

    /* renamed from: a */
    public final C1850a<?> f6101a;

    /* renamed from: b */
    private final boolean f6102b;

    /* renamed from: c */
    private C1886Ea f6103c;

    public C1884Da(C1850a<?> aVar, boolean z) {
        this.f6101a = aVar;
        this.f6102b = z;
    }

    /* renamed from: a */
    private final void m8346a() {
        C2061y.m9068a(this.f6103c, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: a */
    public final void mo7263a(ConnectionResult connectionResult) {
        m8346a();
        this.f6103c.mo7345a(connectionResult, this.f6101a, this.f6102b);
    }

    /* renamed from: a */
    public final void mo7344a(C1886Ea ea) {
        this.f6103c = ea;
    }

    /* renamed from: f */
    public final void mo7261f(int i) {
        m8346a();
        this.f6103c.mo7261f(i);
    }

    /* renamed from: j */
    public final void mo7262j(Bundle bundle) {
        m8346a();
        this.f6103c.mo7262j(bundle);
    }
}
