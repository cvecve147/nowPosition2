package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.ad */
public abstract class C2941ad extends C2296Eq implements C2910_c {
    public C2941ad() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C2910_c m11926a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof C2910_c ? (C2910_c) queryLocalInterface : new C2969bd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo8814o(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 2:
                mo8808a(C5464b.C5465a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo8817t(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 4:
                mo8816s(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 5:
                mo8819y(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 6:
                mo8818w(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 7:
                mo8809a(C5464b.C5465a.asInterface(parcel.readStrongBinder()), (zzaig) C2324Fq.m9801a(parcel, zzaig.CREATOR));
                break;
            case 8:
                mo8813j(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 9:
                mo8811b(C5464b.C5465a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo8812g(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 11:
                mo8815p(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 12:
                mo8810b((Bundle) C2324Fq.m9801a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
