package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.api.C1870f;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.a */
public interface C3934a {
    /* renamed from: a */
    Location mo10330a(GoogleApiClient googleApiClient);

    /* renamed from: a */
    C1870f<Status> mo10331a(GoogleApiClient googleApiClient, LocationRequest locationRequest, C3937d dVar);

    /* renamed from: a */
    C1870f<Status> mo10332a(GoogleApiClient googleApiClient, C3937d dVar);
}
