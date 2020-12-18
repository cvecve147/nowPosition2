package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.C1622e;
import com.google.ads.mediation.C1625f;
import p101d.p129g.p130a.C5459c;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends C1625f, SERVER_PARAMETERS extends C1622e> extends C1612b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(C1613c cVar, Activity activity, SERVER_PARAMETERS server_parameters, C5459c cVar2, C1611a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}
