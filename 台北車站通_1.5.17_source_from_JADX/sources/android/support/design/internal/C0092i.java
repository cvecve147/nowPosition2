package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0434L;
import android.support.p007v4.view.C0482q;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p013b.p018b.p022d.C0962h;
import p013b.p018b.p022d.C0963i;

/* renamed from: android.support.design.internal.i */
public class C0092i extends FrameLayout {

    /* renamed from: a */
    Drawable f508a;

    /* renamed from: b */
    Rect f509b;

    /* renamed from: c */
    private Rect f510c;

    public C0092i(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0092i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0092i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f510c = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.ScrimInsetsFrameLayout, i, C0962h.Widget_Design_ScrimInsetsFrameLayout);
        this.f508a = obtainStyledAttributes.getDrawable(C0963i.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C0487v.m2275a((View) this, (C0482q) new C0091h(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo358a(C0434L l) {
        throw null;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f509b != null && this.f508a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f510c.set(0, 0, width, this.f509b.top);
            this.f508a.setBounds(this.f510c);
            this.f508a.draw(canvas);
            this.f510c.set(0, height - this.f509b.bottom, width, height);
            this.f508a.setBounds(this.f510c);
            this.f508a.draw(canvas);
            Rect rect = this.f510c;
            Rect rect2 = this.f509b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f508a.setBounds(this.f510c);
            this.f508a.draw(canvas);
            Rect rect3 = this.f510c;
            Rect rect4 = this.f509b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f508a.setBounds(this.f510c);
            this.f508a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f508a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f508a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }
}
