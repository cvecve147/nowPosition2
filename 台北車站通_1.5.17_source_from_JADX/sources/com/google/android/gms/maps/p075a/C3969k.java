package com.google.android.gms.maps.p075a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p141d.C5510a;
import p101d.p129g.p131b.p132a.p137e.p141d.C5512c;

/* renamed from: com.google.android.gms.maps.a.k */
public final class C3969k extends C5510a implements C3959a {
    C3969k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: a */
    public final C5464b mo11217a(LatLng latLng, float f) {
        Parcel Xa = mo14955Xa();
        C5512c.m21019a(Xa, (Parcelable) latLng);
        Xa.writeFloat(f);
        Parcel a = mo14956a(9, Xa);
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }
}
