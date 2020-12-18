package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.bd */
public final class C2969bd extends C2267Dq implements C2910_c {
    C2969bd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo8809a(C5464b bVar, zzaig zzaig) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9803a(Xa, (Parcelable) zzaig);
        mo8010b(7, Xa);
    }

    /* renamed from: b */
    public final void mo8810b(Bundle bundle) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) bundle);
        mo8010b(12, Xa);
    }

    /* renamed from: b */
    public final void mo8811b(C5464b bVar, int i) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        Xa.writeInt(i);
        mo8010b(9, Xa);
    }

    /* renamed from: g */
    public final void mo8812g(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(10, Xa);
    }

    /* renamed from: o */
    public final void mo8814o(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(1, Xa);
    }

    /* renamed from: p */
    public final void mo8815p(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(11, Xa);
    }

    /* renamed from: s */
    public final void mo8816s(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(4, Xa);
    }

    /* renamed from: t */
    public final void mo8817t(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(3, Xa);
    }

    /* renamed from: w */
    public final void mo8818w(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(6, Xa);
    }

    /* renamed from: y */
    public final void mo8819y(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(5, Xa);
    }
}
