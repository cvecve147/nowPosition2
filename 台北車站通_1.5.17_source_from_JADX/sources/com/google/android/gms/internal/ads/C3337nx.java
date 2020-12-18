package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C2011d;

/* renamed from: com.google.android.gms.internal.ads.nx */
final class C3337nx implements C2011d.C2013b {

    /* renamed from: a */
    private final /* synthetic */ C3116gg f9937a;

    /* renamed from: b */
    private final /* synthetic */ C3190ix f9938b;

    C3337nx(C3190ix ixVar, C3116gg ggVar) {
        this.f9938b = ixVar;
        this.f9937a = ggVar;
    }

    /* renamed from: a */
    public final void mo7572a(ConnectionResult connectionResult) {
        synchronized (this.f9938b.f9534d) {
            this.f9937a.mo9463a(new RuntimeException("Connection failed."));
        }
    }
}
