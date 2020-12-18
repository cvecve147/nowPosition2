package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C1925e;

/* renamed from: com.google.android.gms.common.api.internal.Z */
final class C1915Z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f6202a;

    /* renamed from: b */
    private final /* synthetic */ C1925e.C1926a f6203b;

    C1915Z(C1925e.C1926a aVar, ConnectionResult connectionResult) {
        this.f6203b = aVar;
        this.f6202a = connectionResult;
    }

    public final void run() {
        this.f6203b.mo7263a(this.f6202a);
    }
}
