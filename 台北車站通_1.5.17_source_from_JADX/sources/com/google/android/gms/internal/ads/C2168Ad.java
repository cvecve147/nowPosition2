package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ad */
public final class C2168Ad implements C2225Cd {
    /* renamed from: a */
    public final C2804Wf<AdvertisingIdClient.Info> mo7804a(Context context) {
        C3116gg ggVar = new C3116gg();
        C3390pt.m13453a();
        if (C3432rf.m13614f(context)) {
            C3057ee.m12269a((Runnable) new C2197Bd(this, context, ggVar));
        }
        return ggVar;
    }

    /* renamed from: a */
    public final C2804Wf<String> mo7805a(String str, PackageInfo packageInfo) {
        return C2483Lf.m10495a(str);
    }
}
