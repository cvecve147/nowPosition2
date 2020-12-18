package com.sto.stolibrary.layout;

import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;

/* renamed from: com.sto.stolibrary.layout.d */
class C5097d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BitmapDrawable f14445a;

    /* renamed from: b */
    final /* synthetic */ int f14446b;

    /* renamed from: c */
    final /* synthetic */ int f14447c;

    /* renamed from: d */
    final /* synthetic */ WebImage f14448d;

    C5097d(WebImage webImage, BitmapDrawable bitmapDrawable, int i, int i2) {
        this.f14448d = webImage;
        this.f14445a = bitmapDrawable;
        this.f14446b = i;
        this.f14447c = i2;
    }

    public void run() {
        this.f14448d.findViewWithTag("IM").setBackground(this.f14445a);
        this.f14448d.findViewWithTag("IM").setVisibility(0);
        this.f14448d.findViewWithTag("LD").setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.f14448d.findViewWithTag("IM").getLayoutParams();
        layoutParams.width = this.f14446b;
        layoutParams.height = this.f14447c;
        this.f14448d.findViewWithTag("IM").setLayoutParams(layoutParams);
        this.f14448d.invalidate();
    }
}
