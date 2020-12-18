package android.support.p007v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.y */
class C0575y extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f2081a;

    /* renamed from: b */
    final /* synthetic */ int f2082b;

    /* renamed from: c */
    final /* synthetic */ SwipeRefreshLayout f2083c;

    C0575y(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f2083c = swipeRefreshLayout;
        this.f2081a = i;
        this.f2082b = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C0540f fVar = this.f2083c.f1941C;
        int i = this.f2081a;
        fVar.setAlpha((int) (((float) i) + (((float) (this.f2082b - i)) * f)));
    }
}
