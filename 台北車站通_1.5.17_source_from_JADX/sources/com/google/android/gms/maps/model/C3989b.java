package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2061y;
import p101d.p129g.p131b.p132a.p137e.p141d.C5513d;

/* renamed from: com.google.android.gms.maps.model.b */
public final class C3989b {

    /* renamed from: a */
    private static C5513d f11901a;

    /* renamed from: a */
    public static C3988a m16121a(Bitmap bitmap) {
        try {
            return new C3988a(m16122a().mo14961a(bitmap));
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }

    /* renamed from: a */
    private static C5513d m16122a() {
        C5513d dVar = f11901a;
        C2061y.m9068a(dVar, (Object) "IBitmapDescriptorFactory is not initialized");
        return dVar;
    }

    /* renamed from: a */
    public static void m16123a(C5513d dVar) {
        if (f11901a == null) {
            C2061y.m9067a(dVar);
            f11901a = dVar;
        }
    }
}
