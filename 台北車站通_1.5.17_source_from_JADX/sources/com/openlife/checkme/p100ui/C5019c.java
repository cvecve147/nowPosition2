package com.openlife.checkme.p100ui;

import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.ui.c */
class C5019c implements C6242d<Long> {

    /* renamed from: a */
    final /* synthetic */ CarouselViewpager f14280a;

    C5019c(CarouselViewpager carouselViewpager) {
        this.f14280a = carouselViewpager;
    }

    /* renamed from: a */
    public void accept(Long l) {
        if (this.f14280a.getChildCount() > 0) {
            CarouselViewpager carouselViewpager = this.f14280a;
            carouselViewpager.mo1782a((carouselViewpager.getCurrentItem() + 1) % this.f14280a.getChildCount(), true);
        }
    }
}
