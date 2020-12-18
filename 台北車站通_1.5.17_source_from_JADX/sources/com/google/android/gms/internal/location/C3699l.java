package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1939j;
import com.google.android.gms.location.C3936c;
import com.google.android.gms.location.C3951q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.l */
final class C3699l extends C3951q {

    /* renamed from: a */
    private final C1939j<C3936c> f10945a;

    /* renamed from: a */
    public final void mo10351a(LocationAvailability locationAvailability) {
        this.f10945a.mo7452a(new C3701n(this, locationAvailability));
    }

    /* renamed from: a */
    public final void mo10352a(LocationResult locationResult) {
        this.f10945a.mo7452a(new C3700m(this, locationResult));
    }
}
