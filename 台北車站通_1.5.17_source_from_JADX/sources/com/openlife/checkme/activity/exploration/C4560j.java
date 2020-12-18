package com.openlife.checkme.activity.exploration;

import android.app.Activity;

/* renamed from: com.openlife.checkme.activity.exploration.j */
class C4560j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ExplorationFragment f13317a;

    C4560j(ExplorationFragment explorationFragment) {
        this.f13317a = explorationFragment;
    }

    public void run() {
        Activity activity = this.f13317a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.f13317a.f13299n.mo12563a(activity);
        }
    }
}
