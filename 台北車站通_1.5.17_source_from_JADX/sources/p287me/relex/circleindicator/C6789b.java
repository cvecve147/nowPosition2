package p287me.relex.circleindicator;

import android.database.DataSetObserver;

/* renamed from: me.relex.circleindicator.b */
class C6789b extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ CircleIndicator f18858a;

    C6789b(CircleIndicator circleIndicator) {
        this.f18858a = circleIndicator;
    }

    public void onChanged() {
        int a;
        int i;
        CircleIndicator circleIndicator;
        super.onChanged();
        if (this.f18858a.f18839a != null && (a = this.f18858a.f18839a.getAdapter().mo1972a()) != this.f18858a.getChildCount()) {
            if (this.f18858a.f18853o < a) {
                circleIndicator = this.f18858a;
                i = circleIndicator.f18839a.getCurrentItem();
            } else {
                circleIndicator = this.f18858a;
                i = -1;
            }
            int unused = circleIndicator.f18853o = i;
            this.f18858a.m25714a();
        }
    }
}
