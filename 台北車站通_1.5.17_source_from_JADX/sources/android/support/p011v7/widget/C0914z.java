package android.support.p011v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.z */
class C0914z extends C0906w {

    /* renamed from: d */
    private final SeekBar f3714d;

    /* renamed from: e */
    private Drawable f3715e;

    /* renamed from: f */
    private ColorStateList f3716f = null;

    /* renamed from: g */
    private PorterDuff.Mode f3717g = null;

    /* renamed from: h */
    private boolean f3718h = false;

    /* renamed from: i */
    private boolean f3719i = false;

    C0914z(SeekBar seekBar) {
        super(seekBar);
        this.f3714d = seekBar;
    }

    /* renamed from: d */
    private void m5183d() {
        if (this.f3715e == null) {
            return;
        }
        if (this.f3718h || this.f3719i) {
            this.f3715e = C1026a.m5462i(this.f3715e.mutate());
            if (this.f3718h) {
                C1026a.m5447a(this.f3715e, this.f3716f);
            }
            if (this.f3719i) {
                C1026a.m5450a(this.f3715e, this.f3717g);
            }
            if (this.f3715e.isStateful()) {
                this.f3715e.setState(this.f3714d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4788a(Canvas canvas) {
        if (this.f3715e != null) {
            int max = this.f3714d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f3715e.getIntrinsicWidth();
                int intrinsicHeight = this.f3715e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f3715e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f3714d.getWidth() - this.f3714d.getPaddingLeft()) - this.f3714d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f3714d.getPaddingLeft(), (float) (this.f3714d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3715e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4789a(Drawable drawable) {
        Drawable drawable2 = this.f3715e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3715e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3714d);
            C1026a.m5453a(drawable, C0487v.m2293i(this.f3714d));
            if (drawable.isStateful()) {
                drawable.setState(this.f3714d.getDrawableState());
            }
            m5183d();
        }
        this.f3714d.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4774a(AttributeSet attributeSet, int i) {
        super.mo4774a(attributeSet, i);
        C0829eb a = C0829eb.m4793a(this.f3714d.getContext(), attributeSet, C1112j.AppCompatSeekBar, i, 0);
        Drawable c = a.mo4479c(C1112j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f3714d.setThumb(c);
        }
        mo4789a(a.mo4477b(C1112j.AppCompatSeekBar_tickMark));
        if (a.mo4487g(C1112j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3717g = C0831fa.m4812a(a.mo4480d(C1112j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3717g);
            this.f3719i = true;
        }
        if (a.mo4487g(C1112j.AppCompatSeekBar_tickMarkTint)) {
            this.f3716f = a.mo4472a(C1112j.AppCompatSeekBar_tickMarkTint);
            this.f3718h = true;
        }
        a.mo4474a();
        m5183d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4790b() {
        Drawable drawable = this.f3715e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3714d.getDrawableState())) {
            this.f3714d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4791c() {
        Drawable drawable = this.f3715e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
