package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.maps.model.C3991d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.p075a.C3959a;

/* renamed from: com.google.android.gms.maps.b */
public final class C3977b {

    /* renamed from: a */
    private static C3959a f11867a;

    /* renamed from: a */
    private static C3959a m16083a() {
        C3959a aVar = f11867a;
        C2061y.m9068a(aVar, (Object) "CameraUpdateFactory is not initialized");
        return aVar;
    }

    /* renamed from: a */
    public static C3958a m16084a(LatLng latLng, float f) {
        try {
            return new C3958a(m16083a().mo11217a(latLng, f));
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }

    /* renamed from: a */
    public static void m16085a(C3959a aVar) {
        C2061y.m9067a(aVar);
        f11867a = aVar;
    }
}
