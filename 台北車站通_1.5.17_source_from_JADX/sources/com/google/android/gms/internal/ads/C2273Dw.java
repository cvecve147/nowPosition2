package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Dw */
public final class C2273Dw extends C2267Dq implements C2188Aw {
    C2273Dw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo7853a(C3393pw pwVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) pwVar);
        mo8010b(1, Xa);
    }
}
