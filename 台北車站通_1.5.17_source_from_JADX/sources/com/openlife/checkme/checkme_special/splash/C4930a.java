package com.openlife.checkme.checkme_special.splash;

import com.openlife.checkme.p100ui.LoadingView;

/* renamed from: com.openlife.checkme.checkme_special.splash.a */
class C4930a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SpSplashFragment f14102a;

    C4930a(SpSplashFragment spSplashFragment) {
        this.f14102a = spSplashFragment;
    }

    public void run() {
        LoadingView loadingView = this.f14102a.loadingView;
        if (loadingView != null) {
            loadingView.mo14062a();
        }
    }
}
