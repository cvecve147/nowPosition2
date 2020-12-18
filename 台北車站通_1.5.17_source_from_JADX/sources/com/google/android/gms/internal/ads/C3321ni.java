package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1804ua;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ni */
public final class C3321ni {
    /* renamed from: a */
    public static C3520uh m13152a(Context context, C3146hi hiVar, String str, boolean z, boolean z2, C2209Bp bp, zzang zzang, C2930_u _uVar, C1690P p, C1804ua uaVar, C3275ls lsVar) {
        try {
            return (C3520uh) C3171if.m12584a(new C3350oi(context, hiVar, str, z, z2, bp, zzang, _uVar, p, uaVar, lsVar));
        } catch (Throwable th) {
            C1697X.m7702i().mo8319a(th, "AdWebViewFactory.newAdWebView2");
            throw new C2315Fh("Webview initialization failed.", th);
        }
    }
}
