package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C1818a;

public interface CustomEventInterstitial extends C1825a {
    void requestInterstitialAd(Context context, C1828d dVar, String str, C1818a aVar, Bundle bundle);

    void showInterstitial();
}
