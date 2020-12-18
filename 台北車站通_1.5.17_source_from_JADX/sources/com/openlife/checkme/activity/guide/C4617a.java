package com.openlife.checkme.activity.guide;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

/* renamed from: com.openlife.checkme.activity.guide.a */
class C4617a implements ViewSwitcher.ViewFactory {

    /* renamed from: a */
    final /* synthetic */ GuideFragment f13421a;

    C4617a(GuideFragment guideFragment) {
        this.f13421a = guideFragment;
    }

    public View makeView() {
        ImageView imageView = new ImageView(this.f13421a.getActivity());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return imageView;
    }
}
