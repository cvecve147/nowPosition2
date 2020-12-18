package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.C1697X;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.xe */
public final class C3603xe extends C3547ve {
    /* renamed from: a */
    public final WebResourceResponse mo9714a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    /* renamed from: a */
    public final C3550vh mo9715a(C3520uh uhVar, boolean z) {
        return new C2750Uh(uhVar, z);
    }

    /* renamed from: c */
    public final CookieManager mo9729c(Context context) {
        if (C3289me.m13059e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C2227Cf.m9533b("Failed to obtain CookieManager.", th);
            C1697X.m7702i().mo8319a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: f */
    public final int mo9732f() {
        return 16974374;
    }
}
