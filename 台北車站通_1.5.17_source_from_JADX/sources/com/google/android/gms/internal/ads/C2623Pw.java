package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Pw */
public final class C2623Pw extends C2267Dq implements C2560Nw {
    C2623Pw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo8600a(C2709Sw sw) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) sw);
        mo8010b(1, Xa);
    }
}
