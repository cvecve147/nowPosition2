package com.openlife.checkme.checkme_special.home.adapter;

import android.view.View;
import com.openlife.checkme.checkme_special.home.adapter.ADPagerAdapter;
import com.openlife.checkme.net.model.AdBannerData;

/* renamed from: com.openlife.checkme.checkme_special.home.adapter.a */
class C4901a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ADPagerAdapter.C4900a f14040a;

    /* renamed from: b */
    final /* synthetic */ AdBannerData f14041b;

    /* renamed from: c */
    final /* synthetic */ ADPagerAdapter.ViewHolder f14042c;

    C4901a(ADPagerAdapter.ViewHolder viewHolder, ADPagerAdapter.C4900a aVar, AdBannerData adBannerData) {
        this.f14042c = viewHolder;
        this.f14040a = aVar;
        this.f14041b = adBannerData;
    }

    public void onClick(View view) {
        ADPagerAdapter.C4900a aVar = this.f14040a;
        if (aVar != null) {
            aVar.mo13447a(this.f14041b);
        }
    }
}
