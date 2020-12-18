package com.google.android.gms.internal.ads;

import android.os.IInterface;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.St */
public interface C2706St extends IInterface {
    C2213Bt createAdLoaderBuilder(C5464b bVar, String str, C2533Mz mz, int i);

    C3425r createAdOverlay(C5464b bVar);

    C2357Gt createBannerAdManager(C5464b bVar, zzjn zzjn, String str, C2533Mz mz, int i);

    C2192B createInAppPurchaseManager(C5464b bVar);

    C2357Gt createInterstitialAdManager(C5464b bVar, zzjn zzjn, String str, C2533Mz mz, int i);

    C3047dw createNativeAdViewDelegate(C5464b bVar, C5464b bVar2);

    C3160hw createNativeAdViewHolderDelegate(C5464b bVar, C5464b bVar2, C5464b bVar3);

    C3629yc createRewardedVideoAd(C5464b bVar, C2533Mz mz, int i);

    C2357Gt createSearchAdManager(C5464b bVar, zzjn zzjn, String str, int i);

    C2874Yt getMobileAdsSettingsManager(C5464b bVar);

    C2874Yt getMobileAdsSettingsManagerWithClientJarVersion(C5464b bVar, int i);
}
