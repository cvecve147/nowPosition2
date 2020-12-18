package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.internal.location.C3705r;

/* renamed from: com.google.android.gms.location.j */
final class C3944j extends C1850a.C1851a<C3705r, Object> {
    C3944j() {
    }

    /* renamed from: a */
    public final /* synthetic */ C1850a.C1861f mo7283a(Context context, Looper looper, C2025f fVar, Object obj, GoogleApiClient.C1848b bVar, GoogleApiClient.C1849c cVar) {
        return new C3705r(context, looper, bVar, cVar, "locationServices", fVar);
    }
}
