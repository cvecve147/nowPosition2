package android.support.p007v4.widget;

import android.support.p007v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

/* renamed from: android.support.v4.widget.v */
class C0572v implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2078a;

    C0572v(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2078a = swipeRefreshLayout;
    }

    public void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout.C0531b bVar;
        SwipeRefreshLayout swipeRefreshLayout = this.f2078a;
        if (swipeRefreshLayout.f1956e) {
            swipeRefreshLayout.f1941C.setAlpha(255);
            this.f2078a.f1941C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = this.f2078a;
            if (swipeRefreshLayout2.f1947I && (bVar = swipeRefreshLayout2.f1955d) != null) {
                bVar.mo2263a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = this.f2078a;
            swipeRefreshLayout3.f1966o = swipeRefreshLayout3.f1974w.getTop();
            return;
        }
        swipeRefreshLayout.mo2229b();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
