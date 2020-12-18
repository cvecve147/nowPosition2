package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.oh */
final class C3349oh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f9947a;

    C3349oh(JsResult jsResult) {
        this.f9947a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9947a.cancel();
    }
}
