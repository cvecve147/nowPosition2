package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Uz */
public final class C2768Uz extends C2267Dq implements C2712Sz {
    C2768Uz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: M */
    public final void mo8880M() {
        mo8010b(5, mo8007Xa());
    }

    /* renamed from: N */
    public final void mo8881N() {
        mo8010b(4, mo8007Xa());
    }

    /* renamed from: P */
    public final void mo8882P() {
        mo8010b(6, mo8007Xa());
    }

    /* renamed from: S */
    public final void mo8884S() {
        mo8010b(8, mo8007Xa());
    }

    /* renamed from: U */
    public final void mo8885U() {
        mo8010b(2, mo8007Xa());
    }

    /* renamed from: a */
    public final void mo8887a(C3507tw twVar, String str) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) twVar);
        Xa.writeString(str);
        mo8010b(10, Xa);
    }

    /* renamed from: a */
    public final void mo8888a(String str, String str2) {
        Parcel Xa = mo8007Xa();
        Xa.writeString(str);
        Xa.writeString(str2);
        mo8010b(9, Xa);
    }

    /* renamed from: c */
    public final void mo8889c(int i) {
        Parcel Xa = mo8007Xa();
        Xa.writeInt(i);
        mo8010b(3, Xa);
    }

    /* renamed from: f */
    public final void mo8890f() {
        mo8010b(1, mo8007Xa());
    }
}
