package android.support.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: android.support.transition.g */
class C0227g extends Property<Drawable, PointF> {

    /* renamed from: a */
    private Rect f1043a = new Rect();

    C0227g(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public PointF get(Drawable drawable) {
        drawable.copyBounds(this.f1043a);
        Rect rect = this.f1043a;
        return new PointF((float) rect.left, (float) rect.top);
    }

    /* renamed from: a */
    public void set(Drawable drawable, PointF pointF) {
        drawable.copyBounds(this.f1043a);
        this.f1043a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.f1043a);
    }
}
