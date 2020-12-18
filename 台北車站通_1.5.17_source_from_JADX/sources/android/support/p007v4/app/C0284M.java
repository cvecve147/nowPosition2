package android.support.p007v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: android.support.v4.app.M */
class C0284M extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f1228a;

    /* renamed from: b */
    final /* synthetic */ C0285N f1229b;

    C0284M(C0285N n, Rect rect) {
        this.f1229b = n;
        this.f1228a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f1228a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f1228a;
    }
}
