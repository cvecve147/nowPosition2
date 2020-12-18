package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.gu */
public final class C3130gu extends C2267Dq implements C3073eu {
    C3130gu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: Ga */
    public final void mo9408Ga() {
        mo8010b(1, mo8007Xa());
    }

    /* renamed from: Ia */
    public final void mo9409Ia() {
        mo8010b(2, mo8007Xa());
    }

    /* renamed from: R */
    public final void mo9410R() {
        mo8010b(4, mo8007Xa());
    }

    /* renamed from: d */
    public final void mo9411d(boolean z) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9804a(Xa, z);
        mo8010b(5, Xa);
    }

    /* renamed from: ha */
    public final void mo9412ha() {
        mo8010b(3, mo8007Xa());
    }
}
