package com.askey.taipeinavi.common;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;

/* renamed from: com.askey.taipeinavi.common.j */
class C1206j implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SslErrorHandler f4395a;

    /* renamed from: b */
    final /* synthetic */ WebViewFragment f4396b;

    C1206j(WebViewFragment webViewFragment, SslErrorHandler sslErrorHandler) {
        this.f4396b = webViewFragment;
        this.f4395a = sslErrorHandler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.f4395a.proceed();
            return;
        }
        this.f4395a.cancel();
        this.f4396b.m5964fa();
    }
}
