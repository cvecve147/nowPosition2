package com.google.android.gms.maps.p075a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p141d.C5510a;
import p101d.p129g.p131b.p132a.p137e.p141d.C5512c;

/* renamed from: com.google.android.gms.maps.a.r */
public final class C3976r extends C5510a implements C3961c {
    C3976r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* renamed from: a */
    public final void mo11224a(C3965g gVar) {
        Parcel Xa = mo14955Xa();
        C5512c.m21018a(Xa, (IInterface) gVar);
        mo14958b(9, Xa);
    }

    /* renamed from: e */
    public final void mo11225e(Bundle bundle) {
        Parcel Xa = mo14955Xa();
        C5512c.m21019a(Xa, (Parcelable) bundle);
        mo14958b(2, Xa);
    }

    public final C5464b getView() {
        Parcel a = mo14956a(8, mo14955Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: k */
    public final void mo11227k() {
        mo14958b(12, mo14955Xa());
    }

    public final void onDestroy() {
        mo14958b(5, mo14955Xa());
    }

    public final void onLowMemory() {
        mo14958b(6, mo14955Xa());
    }

    public final void onPause() {
        mo14958b(4, mo14955Xa());
    }

    public final void onResume() {
        mo14958b(3, mo14955Xa());
    }

    /* renamed from: p */
    public final void mo11232p() {
        mo14958b(13, mo14955Xa());
    }
}
