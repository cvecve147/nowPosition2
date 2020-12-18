package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Fc */
public final class C2310Fc extends C2267Dq implements C2253Dc {
    C2310Fc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: I */
    public final void mo7970I() {
        mo8010b(1, mo8007Xa());
    }

    /* renamed from: a */
    public final void mo7971a(int i) {
        Parcel Xa = mo8007Xa();
        Xa.writeInt(i);
        mo8010b(7, Xa);
    }

    /* renamed from: a */
    public final void mo7972a(C3486tc tcVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) tcVar);
        mo8010b(5, Xa);
    }

    /* renamed from: m */
    public final void mo7973m() {
        mo8010b(3, mo8007Xa());
    }

    /* renamed from: n */
    public final void mo7974n() {
        mo8010b(8, mo8007Xa());
    }

    /* renamed from: o */
    public final void mo7975o() {
        mo8010b(6, mo8007Xa());
    }

    /* renamed from: q */
    public final void mo7976q() {
        mo8010b(4, mo8007Xa());
    }

    /* renamed from: r */
    public final void mo7977r() {
        mo8010b(2, mo8007Xa());
    }
}
