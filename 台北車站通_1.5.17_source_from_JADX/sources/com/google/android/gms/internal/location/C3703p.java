package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C1939j;
import com.google.android.gms.location.C3937d;
import com.google.android.gms.location.C3954t;

/* renamed from: com.google.android.gms.internal.location.p */
final class C3703p extends C3954t {

    /* renamed from: a */
    private final C1939j<C3937d> f10948a;

    C3703p(C1939j<C3937d> jVar) {
        this.f10948a = jVar;
    }

    /* renamed from: Xa */
    public final synchronized void mo10353Xa() {
        this.f10948a.mo7451a();
    }

    public final synchronized void onLocationChanged(Location location) {
        this.f10948a.mo7452a(new C3704q(this, location));
    }
}
