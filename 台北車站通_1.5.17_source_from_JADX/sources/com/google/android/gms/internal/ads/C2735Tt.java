package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Tt */
public abstract class C2735Tt extends C2296Eq implements C2706St {
    public C2735Tt() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static C2706St asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof C2706St ? (C2706St) queryLocalInterface : new C2762Ut(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = createBannerAdManager(C5464b.C5465a.asInterface(parcel.readStrongBinder()), (zzjn) C2324Fq.m9801a(parcel, zzjn.CREATOR), parcel.readString(), C2563Nz.m10778a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = createInterstitialAdManager(C5464b.C5465a.asInterface(parcel.readStrongBinder()), (zzjn) C2324Fq.m9801a(parcel, zzjn.CREATOR), parcel.readString(), C2563Nz.m10778a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = createAdLoaderBuilder(C5464b.C5465a.asInterface(parcel.readStrongBinder()), parcel.readString(), C2563Nz.m10778a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterface = getMobileAdsSettingsManager(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 5:
                iInterface = createNativeAdViewDelegate(C5464b.C5465a.asInterface(parcel.readStrongBinder()), C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = createRewardedVideoAd(C5464b.C5465a.asInterface(parcel.readStrongBinder()), C2563Nz.m10778a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterface = createInAppPurchaseManager(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 8:
                iInterface = createAdOverlay(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = getMobileAdsSettingsManagerWithClientJarVersion(C5464b.C5465a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = createSearchAdManager(C5464b.C5465a.asInterface(parcel.readStrongBinder()), (zzjn) C2324Fq.m9801a(parcel, zzjn.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = createNativeAdViewHolderDelegate(C5464b.C5465a.asInterface(parcel.readStrongBinder()), C5464b.C5465a.asInterface(parcel.readStrongBinder()), C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        C2324Fq.m9802a(parcel2, iInterface);
        return true;
    }
}
