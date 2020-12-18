package com.openlife.checkme.checkme_special.home;

import android.app.Activity;

/* renamed from: com.openlife.checkme.checkme_special.home.i */
class C4911i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SpMainFragment f14063a;

    C4911i(SpMainFragment spMainFragment) {
        this.f14063a = spMainFragment;
    }

    public void run() {
        Activity activity = this.f14063a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.f14063a.f14030c.mo12563a(activity);
        }
    }
}
