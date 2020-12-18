package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.nh */
final class C3320nh implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f9868a;

    C3320nh(JsResult jsResult) {
        this.f9868a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f9868a.cancel();
    }
}
