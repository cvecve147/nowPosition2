package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.qe */
final class C3403qe implements Callable<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ Context f10068a;

    /* renamed from: b */
    private final /* synthetic */ WebSettings f10069b;

    C3403qe(C3374pe peVar, Context context, WebSettings webSettings) {
        this.f10068a = context;
        this.f10069b = webSettings;
    }

    public final /* synthetic */ Object call() {
        if (this.f10068a.getCacheDir() != null) {
            this.f10069b.setAppCachePath(this.f10068a.getCacheDir().getAbsolutePath());
            this.f10069b.setAppCacheMaxSize(0);
            this.f10069b.setAppCacheEnabled(true);
        }
        this.f10069b.setDatabasePath(this.f10068a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f10069b.setDatabaseEnabled(true);
        this.f10069b.setDomStorageEnabled(true);
        this.f10069b.setDisplayZoomControls(false);
        this.f10069b.setBuiltInZoomControls(true);
        this.f10069b.setSupportZoom(true);
        this.f10069b.setAllowContentAccess(false);
        return true;
    }
}
