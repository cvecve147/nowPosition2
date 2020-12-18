package p013b.p018b.p028h.p031b.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p013b.p018b.p028h.p031b.p032a.C1029d;

/* renamed from: b.b.h.b.a.f */
class C1034f extends C1032e {

    /* renamed from: h */
    private static Method f3946h;

    /* renamed from: b.b.h.b.a.f$a */
    private static class C1035a extends C1029d.C1030a {
        C1035a(C1029d.C1030a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1034f(this, resources);
        }
    }

    C1034f(Drawable drawable) {
        super(drawable);
        m5473d();
    }

    C1034f(C1029d.C1030a aVar, Resources resources) {
        super(aVar, resources);
        m5473d();
    }

    /* renamed from: d */
    private void m5473d() {
        if (f3946h == null) {
            try {
                f3946h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo5024b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f3941g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1029d.C1030a mo5025c() {
        return new C1035a(this.f3939e, (Resources) null);
    }

    public Rect getDirtyBounds() {
        return this.f3941g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f3941g.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f3941g.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f3941g.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo5024b()) {
            super.setTint(i);
        } else {
            this.f3941g.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo5024b()) {
            super.setTintList(colorStateList);
        } else {
            this.f3941g.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo5024b()) {
            super.setTintMode(mode);
        } else {
            this.f3941g.setTintMode(mode);
        }
    }
}
