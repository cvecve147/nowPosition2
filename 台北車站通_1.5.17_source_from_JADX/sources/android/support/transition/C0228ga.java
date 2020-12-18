package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: android.support.transition.ga */
class C0228ga implements C0230ha {

    /* renamed from: a */
    private final ViewOverlay f1044a;

    C0228ga(View view) {
        this.f1044a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo1029a(Drawable drawable) {
        this.f1044a.add(drawable);
    }

    /* renamed from: b */
    public void mo1030b(Drawable drawable) {
        this.f1044a.remove(drawable);
    }
}
