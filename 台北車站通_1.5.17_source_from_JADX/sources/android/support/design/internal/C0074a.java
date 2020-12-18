package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p011v7.widget.C0879qa;
import android.util.AttributeSet;
import android.view.Gravity;
import p013b.p018b.p022d.C0963i;

/* renamed from: android.support.design.internal.a */
public class C0074a extends C0879qa {

    /* renamed from: p */
    private Drawable f476p;

    /* renamed from: q */
    private final Rect f477q;

    /* renamed from: r */
    private final Rect f478r;

    /* renamed from: s */
    private int f479s;

    /* renamed from: t */
    protected boolean f480t;

    /* renamed from: u */
    boolean f481u;

    public C0074a(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0074a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0074a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f477q = new Rect();
        this.f478r = new Rect();
        this.f479s = 119;
        this.f480t = true;
        this.f481u = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.ForegroundLinearLayout, i, 0);
        this.f479s = obtainStyledAttributes.getInt(C0963i.ForegroundLinearLayout_android_foregroundGravity, this.f479s);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0963i.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f480t = obtainStyledAttributes.getBoolean(C0963i.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f476p;
        if (drawable != null) {
            if (this.f481u) {
                this.f481u = false;
                Rect rect = this.f477q;
                Rect rect2 = this.f478r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f480t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f479s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f476p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f476p;
        if (drawable != null && drawable.isStateful()) {
            this.f476p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f476p;
    }

    public int getForegroundGravity() {
        return this.f479s;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f476p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f481u = z | this.f481u;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f481u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f476p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f476p);
            }
            this.f476p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f479s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f479s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f479s = i;
            if (this.f479s == 119 && this.f476p != null) {
                this.f476p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f476p;
    }
}
