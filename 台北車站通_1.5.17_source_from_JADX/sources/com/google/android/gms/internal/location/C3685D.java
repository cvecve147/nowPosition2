package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.C1870f;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.location.C3934a;
import com.google.android.gms.location.C3937d;
import com.google.android.gms.location.C3938e;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.D */
public final class C3685D implements C3934a {
    /* renamed from: a */
    public final Location mo10330a(GoogleApiClient googleApiClient) {
        try {
            return C3938e.m15990a(googleApiClient).mo7557D();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C1870f<Status> mo10331a(GoogleApiClient googleApiClient, LocationRequest locationRequest, C3937d dVar) {
        C2061y.m9068a(Looper.myLooper(), (Object) "Calling thread must be a prepared Looper thread.");
        return googleApiClient.mo7246a(new C3686E(this, googleApiClient, locationRequest, dVar));
    }

    /* renamed from: a */
    public final C1870f<Status> mo10332a(GoogleApiClient googleApiClient, C3937d dVar) {
        return googleApiClient.mo7246a(new C3687F(this, googleApiClient, dVar));
    }
}
