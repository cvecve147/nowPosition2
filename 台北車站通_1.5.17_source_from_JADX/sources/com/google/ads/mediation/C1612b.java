package com.google.ads.mediation;

import com.google.ads.mediation.C1622e;

@Deprecated
/* renamed from: com.google.ads.mediation.b */
public interface C1612b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends C1622e> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
