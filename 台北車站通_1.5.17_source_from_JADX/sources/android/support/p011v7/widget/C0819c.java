package android.support.p011v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.c */
class C0819c extends C0816b {
    public C0819c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f3377a;
        if (actionBarContainer.f2632h) {
            drawable = actionBarContainer.f2631g;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f2629e;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }
}
