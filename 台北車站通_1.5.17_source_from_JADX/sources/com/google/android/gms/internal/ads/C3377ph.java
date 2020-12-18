package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.ph */
final class C3377ph implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f9997a;

    C3377ph(JsResult jsResult) {
        this.f9997a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9997a.confirm();
    }
}
