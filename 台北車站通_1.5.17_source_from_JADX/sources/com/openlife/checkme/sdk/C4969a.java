package com.openlife.checkme.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;

/* renamed from: com.openlife.checkme.sdk.a */
class C4969a extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C4978b f14146a;

    C4969a(C4978b bVar) {
        this.f14146a = bVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f14146a.f14158e != null && intent.getExtras() != null) {
            switch (intent.getIntExtra("INTENT_LOGIN_NAME", -1)) {
                case BaseImageDownloader.DEFAULT_HTTP_READ_TIMEOUT:
                    this.f14146a.f14158e.mo13997a();
                    return;
                case 20001:
                    this.f14146a.f14158e.mo13999h(intent.getStringExtra("INTENT_LOGIN_ERROR"));
                    return;
                case 20002:
                    this.f14146a.f14158e.mo13998c();
                    return;
                default:
                    throw new NullPointerException("NOT SUPPORT THIS MESSAGE");
            }
        }
    }
}
