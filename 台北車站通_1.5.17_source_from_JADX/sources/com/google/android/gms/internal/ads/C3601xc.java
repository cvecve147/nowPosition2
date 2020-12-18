package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xc */
public final class C3601xc extends C2267Dq implements C3573wc {
    C3601xc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: a */
    public final void mo10159a(C3486tc tcVar, String str) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) tcVar);
        Xa.writeString(str);
        mo8010b(1, Xa);
    }
}
