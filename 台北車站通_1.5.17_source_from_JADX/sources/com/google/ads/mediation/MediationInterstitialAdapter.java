package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.C1622e;
import com.google.ads.mediation.C1625f;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends C1625f, SERVER_PARAMETERS extends C1622e> extends C1612b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(C1621d dVar, Activity activity, SERVER_PARAMETERS server_parameters, C1611a aVar, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
