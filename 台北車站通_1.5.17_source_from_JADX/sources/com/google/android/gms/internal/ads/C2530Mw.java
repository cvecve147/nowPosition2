package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Mw */
public final class C2530Mw extends C2267Dq implements C2472Kw {
    C2530Mw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: a */
    public final void mo8465a(C2357Gt gt, C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) gt);
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(1, Xa);
    }
}
