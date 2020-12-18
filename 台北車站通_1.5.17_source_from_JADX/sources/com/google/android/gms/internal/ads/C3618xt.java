package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xt */
public final class C3618xt extends C2267Dq implements C3562vt {
    C3618xt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: M */
    public final void mo8798M() {
        mo8010b(5, mo8007Xa());
    }

    /* renamed from: N */
    public final void mo8799N() {
        mo8010b(3, mo8007Xa());
    }

    /* renamed from: P */
    public final void mo8800P() {
        mo8010b(4, mo8007Xa());
    }

    /* renamed from: S */
    public final void mo8801S() {
        mo8010b(7, mo8007Xa());
    }

    /* renamed from: U */
    public final void mo8802U() {
        mo8010b(1, mo8007Xa());
    }

    /* renamed from: c */
    public final void mo8803c(int i) {
        Parcel Xa = mo8007Xa();
        Xa.writeInt(i);
        mo8010b(2, Xa);
    }

    /* renamed from: f */
    public final void mo8804f() {
        mo8010b(6, mo8007Xa());
    }
}
