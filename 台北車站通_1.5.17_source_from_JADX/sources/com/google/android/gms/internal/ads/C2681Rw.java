package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Rw */
public final class C2681Rw extends C2267Dq implements C2651Qw {
    C2681Rw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: Va */
    public final void mo8767Va() {
        mo8010b(2, mo8007Xa());
    }

    /* renamed from: k */
    public final void mo8768k(String str) {
        Parcel Xa = mo8007Xa();
        Xa.writeString(str);
        mo8010b(1, Xa);
    }
}
