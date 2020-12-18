package com.askey.taipeinavi.common;

import android.view.View;

/* renamed from: com.askey.taipeinavi.common.h */
class C1204h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ WebViewFragment f4393a;

    C1204h(WebViewFragment webViewFragment) {
        this.f4393a = webViewFragment;
    }

    public void onClick(View view) {
        if (this.f4393a.mWebview.canGoBack()) {
            this.f4393a.mWebview.goBack();
            return;
        }
        this.f4393a.f4380a.mo17229a((View.OnClickListener) null);
        this.f4393a.f4380a.onBackPressed();
    }
}
