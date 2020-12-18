package android.support.p007v4.widget;

import android.view.animation.Animation;

/* renamed from: android.support.v4.widget.z */
class C0576z implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2084a;

    C0576z(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2084a = swipeRefreshLayout;
    }

    public void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f2084a;
        if (!swipeRefreshLayout.f1971t) {
            swipeRefreshLayout.mo2227a((Animation.AnimationListener) null);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
