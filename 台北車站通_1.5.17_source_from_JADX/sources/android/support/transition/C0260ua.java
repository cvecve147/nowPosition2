package android.support.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: android.support.transition.ua */
class C0260ua implements C0262va {

    /* renamed from: a */
    private final WindowId f1125a;

    C0260ua(View view) {
        this.f1125a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0260ua) && ((C0260ua) obj).f1125a.equals(this.f1125a);
    }

    public int hashCode() {
        return this.f1125a.hashCode();
    }
}
