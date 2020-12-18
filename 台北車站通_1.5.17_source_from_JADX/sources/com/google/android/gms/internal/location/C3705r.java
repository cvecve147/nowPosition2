package com.google.android.gms.internal.location;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C1939j;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.location.C3937d;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.r */
public final class C3705r extends C3713z {

    /* renamed from: I */
    private final C3698k f10950I;

    public C3705r(Context context, Looper looper, GoogleApiClient.C1848b bVar, GoogleApiClient.C1849c cVar, String str, C2025f fVar) {
        super(context, looper, bVar, cVar, str, fVar);
        this.f10950I = new C3698k(context, this.f10953H);
    }

    /* renamed from: D */
    public final Location mo7557D() {
        return this.f10950I.mo10345a();
    }

    /* renamed from: a */
    public final void mo7608a() {
        synchronized (this.f10950I) {
            if (isConnected()) {
                try {
                    this.f10950I.mo10349b();
                    this.f10950I.mo10350c();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo7608a();
        }
    }

    /* renamed from: a */
    public final void mo10355a(C1939j.C1940a<C3937d> aVar, C3693f fVar) {
        this.f10950I.mo10346a(aVar, fVar);
    }

    /* renamed from: a */
    public final void mo10356a(LocationRequest locationRequest, C1939j<C3937d> jVar, C3693f fVar) {
        synchronized (this.f10950I) {
            this.f10950I.mo10347a(locationRequest, jVar, fVar);
        }
    }
}
