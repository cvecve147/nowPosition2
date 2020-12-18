package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C1939j;
import com.google.android.gms.location.C3937d;

/* renamed from: com.google.android.gms.internal.location.q */
final class C3704q implements C1939j.C1941b<C3937d> {

    /* renamed from: a */
    private final /* synthetic */ Location f10949a;

    C3704q(C3703p pVar, Location location) {
        this.f10949a = location;
    }

    /* renamed from: a */
    public final void mo7457a() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo7458a(Object obj) {
        ((C3937d) obj).onLocationChanged(this.f10949a);
    }
}
