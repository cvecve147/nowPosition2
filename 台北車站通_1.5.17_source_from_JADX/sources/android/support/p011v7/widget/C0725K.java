package android.support.p011v7.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: android.support.v7.widget.K */
class C0725K implements C0742Q {

    /* renamed from: a */
    private Drawable f2818a;

    /* renamed from: b */
    final /* synthetic */ CardView f2819b;

    C0725K(CardView cardView) {
        this.f2819b = cardView;
    }

    /* renamed from: a */
    public void mo3438a(int i, int i2) {
        CardView cardView = this.f2819b;
        if (i > cardView.f2756e) {
            C0725K.super.setMinimumWidth(i);
        }
        CardView cardView2 = this.f2819b;
        if (i2 > cardView2.f2757f) {
            C0725K.super.setMinimumHeight(i2);
        }
    }

    /* renamed from: a */
    public void mo3439a(int i, int i2, int i3, int i4) {
        this.f2819b.f2759h.set(i, i2, i3, i4);
        CardView cardView = this.f2819b;
        Rect rect = cardView.f2758g;
        C0725K.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* renamed from: a */
    public void mo3440a(Drawable drawable) {
        this.f2818a = drawable;
        this.f2819b.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public boolean mo3441a() {
        return this.f2819b.getPreventCornerOverlap();
    }

    /* renamed from: b */
    public boolean mo3442b() {
        return this.f2819b.getUseCompatPadding();
    }

    /* renamed from: c */
    public Drawable mo3443c() {
        return this.f2818a;
    }

    /* renamed from: d */
    public View mo3444d() {
        return this.f2819b;
    }
}
