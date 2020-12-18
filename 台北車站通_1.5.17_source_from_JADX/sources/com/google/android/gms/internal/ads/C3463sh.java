package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.sh */
final class C3463sh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f10200a;

    /* renamed from: b */
    private final /* synthetic */ EditText f10201b;

    C3463sh(JsPromptResult jsPromptResult, EditText editText) {
        this.f10200a = jsPromptResult;
        this.f10201b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10200a.confirm(this.f10201b.getText().toString());
    }
}
