package p287me.relex.circleindicator;

import android.support.p007v4.view.ViewPager;
import android.view.View;

/* renamed from: me.relex.circleindicator.a */
class C6788a implements ViewPager.C0440f {

    /* renamed from: a */
    final /* synthetic */ CircleIndicator f18857a;

    C6788a(CircleIndicator circleIndicator) {
        this.f18857a = circleIndicator;
    }

    /* renamed from: a */
    public void mo781a(int i) {
    }

    /* renamed from: a */
    public void mo782a(int i, float f, int i2) {
    }

    /* renamed from: b */
    public void mo783b(int i) {
        if (this.f18857a.f18839a.getAdapter() != null && this.f18857a.f18839a.getAdapter().mo1972a() > 0) {
            if (this.f18857a.f18850l.isRunning()) {
                this.f18857a.f18850l.end();
                this.f18857a.f18850l.cancel();
            }
            if (this.f18857a.f18849k.isRunning()) {
                this.f18857a.f18849k.end();
                this.f18857a.f18849k.cancel();
            }
            if (this.f18857a.f18853o >= 0) {
                CircleIndicator circleIndicator = this.f18857a;
                View childAt = circleIndicator.getChildAt(circleIndicator.f18853o);
                if (childAt != null) {
                    childAt.setBackgroundResource(this.f18857a.f18848j);
                    childAt.getLayoutParams().width = this.f18857a.f18843e;
                    childAt.getLayoutParams().height = this.f18857a.f18844f;
                    childAt.requestLayout();
                    this.f18857a.f18850l.setTarget(childAt);
                    this.f18857a.f18850l.start();
                }
            }
            View childAt2 = this.f18857a.getChildAt(i);
            if (childAt2 != null) {
                childAt2.setBackgroundResource(this.f18857a.f18847i);
                childAt2.getLayoutParams().width = this.f18857a.f18841c;
                childAt2.getLayoutParams().height = this.f18857a.f18842d;
                childAt2.requestLayout();
                this.f18857a.f18849k.setTarget(childAt2);
                this.f18857a.f18849k.start();
            }
            int unused = this.f18857a.f18853o = i;
        }
    }
}
