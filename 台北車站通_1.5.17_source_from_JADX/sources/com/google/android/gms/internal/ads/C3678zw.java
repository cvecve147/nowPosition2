package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zw */
public final class C3678zw extends C2267Dq implements C3621xw {
    C3678zw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo9080a(C3279lw lwVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) lwVar);
        mo8010b(1, Xa);
    }
}
