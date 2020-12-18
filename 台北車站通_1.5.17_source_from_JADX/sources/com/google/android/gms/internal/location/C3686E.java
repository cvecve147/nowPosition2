package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C1944k;
import com.google.android.gms.location.C3937d;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.E */
final class C3686E extends C3689b {

    /* renamed from: s */
    private final /* synthetic */ LocationRequest f10932s;

    /* renamed from: t */
    private final /* synthetic */ C3937d f10933t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3686E(C3685D d, GoogleApiClient googleApiClient, LocationRequest locationRequest, C3937d dVar) {
        super(googleApiClient);
        this.f10932s = locationRequest;
        this.f10933t = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo7408a(C1850a.C1852b bVar) {
        ((C3705r) bVar).mo10356a(this.f10932s, C1944k.m8613a(this.f10933t, C3711x.m14830a(), C3937d.class.getSimpleName()), new C3690c(this));
    }
}
