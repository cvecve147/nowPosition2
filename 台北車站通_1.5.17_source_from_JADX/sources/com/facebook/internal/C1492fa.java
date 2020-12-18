package com.facebook.internal;

import android.content.Context;
import android.webkit.WebView;

/* renamed from: com.facebook.internal.fa */
class C1492fa extends WebView {

    /* renamed from: a */
    final /* synthetic */ C1496ha f5146a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1492fa(C1496ha haVar, Context context) {
        super(context);
        this.f5146a = haVar;
    }

    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (NullPointerException unused) {
        }
    }
}
