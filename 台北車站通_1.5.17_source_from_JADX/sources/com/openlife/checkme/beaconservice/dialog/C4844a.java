package com.openlife.checkme.beaconservice.dialog;

import android.support.p007v4.view.ViewPager;

/* renamed from: com.openlife.checkme.beaconservice.dialog.a */
class C4844a implements ViewPager.C0440f {

    /* renamed from: a */
    final /* synthetic */ ADDialog f13915a;

    C4844a(ADDialog aDDialog) {
        this.f13915a = aDDialog;
    }

    /* renamed from: a */
    public void mo781a(int i) {
        if (i == 2) {
            int currentItem = this.f13915a.mImagePager.getCurrentItem();
            this.f13915a.m19091b(currentItem);
            this.f13915a.m19094c(currentItem);
        }
    }

    /* renamed from: a */
    public void mo782a(int i, float f, int i2) {
    }

    /* renamed from: b */
    public void mo783b(int i) {
    }
}
