package android.support.p007v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.A */
class C0505A extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1820a;

    C0505A(SwipeRefreshLayout swipeRefreshLayout) {
        this.f1820a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f1820a;
        int abs = !swipeRefreshLayout.f1949K ? swipeRefreshLayout.f1940B - Math.abs(swipeRefreshLayout.f1939A) : swipeRefreshLayout.f1940B;
        SwipeRefreshLayout swipeRefreshLayout2 = this.f1820a;
        int i = swipeRefreshLayout2.f1976y;
        this.f1820a.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - swipeRefreshLayout2.f1974w.getTop());
        this.f1820a.f1941C.mo2304a(1.0f - f);
    }
}
