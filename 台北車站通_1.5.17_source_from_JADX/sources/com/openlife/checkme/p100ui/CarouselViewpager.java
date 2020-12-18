package com.openlife.checkme.p100ui;

import android.content.Context;
import android.support.p007v4.view.ViewPager;
import android.util.AttributeSet;
import java.util.concurrent.TimeUnit;
import p208e.p221b.C6247e;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;

/* renamed from: com.openlife.checkme.ui.CarouselViewpager */
public class CarouselViewpager extends ViewPager {

    /* renamed from: ma */
    private C6223b f14211ma;

    public CarouselViewpager(Context context) {
        super(context);
    }

    public CarouselViewpager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: n */
    private void m19763n() {
        if (this.f14211ma == null) {
            this.f14211ma = C6247e.m23535a(4000, TimeUnit.MILLISECONDS).mo16356d().mo16347a(C6216b.m23500a()).mo16351b(new C5019c(this));
        }
    }

    /* renamed from: o */
    private void m19764o() {
        C6223b bVar = this.f14211ma;
        if (bVar != null) {
            bVar.mo15709a();
            this.f14211ma = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            m19763n();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!isInEditMode()) {
            m19764o();
        }
    }
}
