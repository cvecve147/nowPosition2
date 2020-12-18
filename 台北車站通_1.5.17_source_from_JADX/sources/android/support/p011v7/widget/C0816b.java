package android.support.p011v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C0816b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f3377a;

    public C0816b(ActionBarContainer actionBarContainer) {
        this.f3377a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3377a;
        if (actionBarContainer.f2632h) {
            Drawable drawable = actionBarContainer.f2631g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2629e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f3377a;
        Drawable drawable3 = actionBarContainer2.f2630f;
        if (drawable3 != null && actionBarContainer2.f2633i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
