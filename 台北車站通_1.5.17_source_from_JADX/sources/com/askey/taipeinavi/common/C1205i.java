package com.askey.taipeinavi.common;

import android.view.View;

/* renamed from: com.askey.taipeinavi.common.i */
class C1205i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ WebViewFragment f4394a;

    C1205i(WebViewFragment webViewFragment) {
        this.f4394a = webViewFragment;
    }

    public void onClick(View view) {
        this.f4394a.f4380a.mo17229a((View.OnClickListener) null);
        this.f4394a.f4380a.onBackPressed();
    }
}
