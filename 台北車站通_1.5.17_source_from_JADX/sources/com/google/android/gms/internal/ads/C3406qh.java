package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.qh */
final class C3406qh implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f10078a;

    C3406qh(JsPromptResult jsPromptResult) {
        this.f10078a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f10078a.cancel();
    }
}
