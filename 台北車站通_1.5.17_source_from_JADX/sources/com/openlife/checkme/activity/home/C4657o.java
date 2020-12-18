package com.openlife.checkme.activity.home;

import android.app.Activity;

/* renamed from: com.openlife.checkme.activity.home.o */
class C4657o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MainFragment f13515a;

    C4657o(MainFragment mainFragment) {
        this.f13515a = mainFragment;
    }

    public void run() {
        Activity activity = this.f13515a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.f13515a.f13481g.mo12563a(activity);
        }
    }
}
