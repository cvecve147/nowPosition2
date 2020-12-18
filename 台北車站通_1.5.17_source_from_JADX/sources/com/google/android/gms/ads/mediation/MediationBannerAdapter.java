package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C1642d;

public interface MediationBannerAdapter extends C1819b {
    View getBannerView();

    void requestBannerAd(Context context, C1821c cVar, Bundle bundle, C1642d dVar, C1818a aVar, Bundle bundle2);
}
