package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C1818a;
import com.google.android.gms.ads.mediation.C1819b;

public interface MediationRewardedVideoAdAdapter extends C1819b {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, C1818a aVar, String str, C1842a aVar2, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(C1818a aVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}
