package android.support.p007v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: android.support.v4.app.J */
class C0279J extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f1209a;

    /* renamed from: b */
    final /* synthetic */ C0285N f1210b;

    C0279J(C0285N n, Rect rect) {
        this.f1210b = n;
        this.f1209a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.f1209a;
    }
}
