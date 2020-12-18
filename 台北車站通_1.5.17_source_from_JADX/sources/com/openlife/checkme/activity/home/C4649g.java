package com.openlife.checkme.activity.home;

import android.support.design.widget.AppBarLayout;
import android.support.p007v4.view.C0487v;
import com.openlife.checkme.activity.home.MainFragment;

/* renamed from: com.openlife.checkme.activity.home.g */
class C4649g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MainFragment f13507a;

    C4649g(MainFragment mainFragment) {
        this.f13507a = mainFragment;
    }

    public void run() {
        MainFragment mainFragment = this.f13507a;
        MainFragment.C4642a unused = mainFragment.f13482h = new MainFragment.C4642a((float) (this.f13507a.collapsingToolbarLayout.getHeight() - C0487v.m2294j(this.f13507a.collapsingToolbarLayout)));
        MainFragment mainFragment2 = this.f13507a;
        mainFragment2.appBarLayout.mo366a((AppBarLayout.C0096b) mainFragment2.f13482h);
    }
}
