package com.openlife.checkme.checkme_special.home;

import com.openlife.checkme.checkme_special.home.SpMainAdapter;
import com.openlife.checkme.checkme_special.home.adapter.ADPagerAdapter;
import com.openlife.checkme.net.model.AdBannerData;

/* renamed from: com.openlife.checkme.checkme_special.home.a */
class C4899a implements ADPagerAdapter.C4900a {

    /* renamed from: a */
    final /* synthetic */ SpMainAdapter.HeaderViewBinder.ViewHolder f14034a;

    C4899a(SpMainAdapter.HeaderViewBinder.ViewHolder viewHolder) {
        this.f14034a = viewHolder;
    }

    /* renamed from: a */
    public void mo13447a(AdBannerData adBannerData) {
        if (this.f14034a.f14013a != null) {
            this.f14034a.f14013a.mo13430a(adBannerData);
        }
    }
}
