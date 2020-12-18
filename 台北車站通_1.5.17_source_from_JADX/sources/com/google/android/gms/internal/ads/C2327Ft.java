package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.C2064k;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Ft */
public final class C2327Ft extends C2267Dq implements C2299Et {
    C2327Ft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: a */
    public final IBinder mo8054a(C5464b bVar, String str, C2533Mz mz, int i) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        Xa.writeString(str);
        C2324Fq.m9802a(Xa, (IInterface) mz);
        Xa.writeInt(C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = mo8008a(1, Xa);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
