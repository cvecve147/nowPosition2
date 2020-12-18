package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.rh */
final class C3434rh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f10118a;

    C3434rh(JsPromptResult jsPromptResult) {
        this.f10118a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10118a.cancel();
    }
}
