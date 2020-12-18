package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2064k;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Kt */
public final class C2469Kt extends C2267Dq implements C2441Jt {
    C2469Kt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo8380a(C5464b bVar, zzjn zzjn, String str, C2533Mz mz, int i, int i2) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9803a(Xa, (Parcelable) zzjn);
        Xa.writeString(str);
        C2324Fq.m9802a(Xa, (IInterface) mz);
        Xa.writeInt(C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Xa.writeInt(i2);
        Parcel a = mo8008a(2, Xa);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
