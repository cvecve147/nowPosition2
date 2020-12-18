package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.pe */
public class C3374pe extends C3346oe {
    /* renamed from: a */
    public C3550vh mo9715a(C3520uh uhVar, boolean z) {
        return new C2693Sh(uhVar, z);
    }

    /* renamed from: a */
    public final Set<String> mo9718a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    /* renamed from: a */
    public final boolean mo9721a(DownloadManager.Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    /* renamed from: a */
    public boolean mo9722a(Context context, WebSettings webSettings) {
        super.mo9722a(context, webSettings);
        return ((Boolean) C3171if.m12583a(context, new C3403qe(this, context, webSettings))).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo9724a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    /* renamed from: b */
    public final boolean mo9727b(View view) {
        view.setLayerType(0, (Paint) null);
        return true;
    }

    /* renamed from: c */
    public final boolean mo9730c(View view) {
        view.setLayerType(1, (Paint) null);
        return true;
    }
}
