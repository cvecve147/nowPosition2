package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: android.support.transition.Y */
class C0211Y implements C0212Z {

    /* renamed from: a */
    private final ViewGroupOverlay f1021a;

    C0211Y(ViewGroup viewGroup) {
        this.f1021a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo1029a(Drawable drawable) {
        this.f1021a.add(drawable);
    }

    /* renamed from: a */
    public void mo1027a(View view) {
        this.f1021a.add(view);
    }

    /* renamed from: b */
    public void mo1030b(Drawable drawable) {
        this.f1021a.remove(drawable);
    }

    /* renamed from: b */
    public void mo1028b(View view) {
        this.f1021a.remove(view);
    }
}
