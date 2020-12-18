package com.onesignal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.C4306Xa;

/* renamed from: com.onesignal.d */
class C4355d implements C4359e {

    /* renamed from: a */
    private static String f12879a;

    C4355d() {
    }

    /* renamed from: a */
    static String m17331a() {
        return f12879a;
    }

    /* renamed from: a */
    public String mo12486a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            f12879a = advertisingIdInfo.isLimitAdTrackingEnabled() ? "OptedOut" : advertisingIdInfo.getId();
            return f12879a;
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.INFO, "Error getting Google Ad id: ", th);
            return null;
        }
    }
}
