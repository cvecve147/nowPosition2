package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Gw */
public final class C2360Gw extends C2267Dq implements C2302Ew {
    C2360Gw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: a */
    public final void mo8060a(C3507tw twVar, String str) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) twVar);
        Xa.writeString(str);
        mo8010b(1, Xa);
    }
}
