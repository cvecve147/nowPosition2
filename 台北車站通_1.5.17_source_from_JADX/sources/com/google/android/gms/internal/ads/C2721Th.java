package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C1697X;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.Th */
public class C2721Th extends C3550vh {
    public C2721Th(C3520uh uhVar, boolean z) {
        super(uhVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo8894a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof C3520uh)) {
            C2227Cf.m9536d("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        C3520uh uhVar = (C3520uh) webView;
        C3345od odVar = this.f10372z;
        if (odVar != null) {
            odVar.mo9373a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo10129a(str, map);
        }
        if (uhVar.mo8182mb() != null) {
            uhVar.mo8182mb().mo9236d();
        }
        String str2 = (String) C3390pt.m13458f().mo8515a(uhVar.mo8192rb().mo9497d() ? C2558Nu.f7882ea : uhVar.mo8165fb() ? C2558Nu.f7876da : C2558Nu.f7870ca);
        C1697X.m7698e();
        return C3114ge.m12428c(uhVar.getContext(), uhVar.mo8201ub().f10855a, str2);
    }
}
