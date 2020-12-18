package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Jw */
public final class C2444Jw extends C2267Dq implements C2388Hw {
    C2444Jw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo8308a(C3507tw twVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) twVar);
        mo8010b(1, Xa);
    }
}
