package com.openlife.checkme.activity.browser;

import com.openlife.checkme.activity.browser.TinyGameFragment;

/* renamed from: com.openlife.checkme.activity.browser.d */
class C4534d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13263a;

    /* renamed from: b */
    final /* synthetic */ TinyGameFragment.C4530a f13264b;

    C4534d(TinyGameFragment.C4530a aVar, String str) {
        this.f13264b = aVar;
        this.f13263a = str;
    }

    public void run() {
        TinyGameFragment.this.webView.loadUrl(this.f13263a);
    }
}
