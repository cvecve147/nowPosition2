package android.support.p011v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p013b.p018b.p040i.p042b.C1113a;
import p013b.p018b.p040i.p042b.C1114b;

/* renamed from: android.support.v7.widget.Na */
class C0736Na extends Drawable {

    /* renamed from: a */
    private static final double f2875a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    static C0737a f2876b;

    /* renamed from: c */
    private final int f2877c;

    /* renamed from: d */
    private Paint f2878d;

    /* renamed from: e */
    private Paint f2879e;

    /* renamed from: f */
    private Paint f2880f;

    /* renamed from: g */
    private final RectF f2881g;

    /* renamed from: h */
    private float f2882h;

    /* renamed from: i */
    private Path f2883i;

    /* renamed from: j */
    private float f2884j;

    /* renamed from: k */
    private float f2885k;

    /* renamed from: l */
    private float f2886l;

    /* renamed from: m */
    private ColorStateList f2887m;

    /* renamed from: n */
    private boolean f2888n = true;

    /* renamed from: o */
    private final int f2889o;

    /* renamed from: p */
    private final int f2890p;

    /* renamed from: q */
    private boolean f2891q = true;

    /* renamed from: r */
    private boolean f2892r = false;

    /* renamed from: android.support.v7.widget.Na$a */
    interface C0737a {
        /* renamed from: a */
        void mo3447a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0736Na(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f2889o = resources.getColor(C1113a.cardview_shadow_start_color);
        this.f2890p = resources.getColor(C1113a.cardview_shadow_end_color);
        this.f2877c = resources.getDimensionPixelSize(C1114b.cardview_compat_inset_shadow);
        this.f2878d = new Paint(5);
        m3835b(colorStateList);
        this.f2879e = new Paint(5);
        this.f2879e.setStyle(Paint.Style.FILL);
        this.f2882h = (float) ((int) (f + 0.5f));
        this.f2881g = new RectF();
        this.f2880f = new Paint(this.f2879e);
        this.f2880f.setAntiAlias(false);
        m3832a(f2, f3);
    }

    /* renamed from: a */
    static float m3831a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f2875a) * ((double) f2))) : f;
    }

    /* renamed from: a */
    private void m3832a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float d = (float) m3837d(f);
            float d2 = (float) m3837d(f2);
            if (d > d2) {
                if (!this.f2892r) {
                    this.f2892r = true;
                }
                d = d2;
            }
            if (this.f2886l != d || this.f2884j != d2) {
                this.f2886l = d;
                this.f2884j = d2;
                this.f2885k = (float) ((int) ((d * 1.5f) + ((float) this.f2877c) + 0.5f));
                this.f2888n = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: a */
    private void m3833a(Canvas canvas) {
        float f = this.f2882h;
        float f2 = (-f) - this.f2885k;
        float f3 = f + ((float) this.f2877c) + (this.f2886l / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f2881g.width() - f4 > 0.0f;
        boolean z2 = this.f2881g.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f2881g;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f2883i, this.f2879e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2881g.width() - f4, -this.f2882h, this.f2880f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f2881g;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2883i, this.f2879e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2881g.width() - f4, (-this.f2882h) + this.f2885k, this.f2880f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f2881g;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2883i, this.f2879e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2881g.height() - f4, -this.f2882h, this.f2880f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f2881g;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2883i, this.f2879e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2881g.height() - f4, -this.f2882h, this.f2880f);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: b */
    static float m3834b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f2875a) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: b */
    private void m3835b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2887m = colorStateList;
        this.f2878d.setColor(this.f2887m.getColorForState(getState(), this.f2887m.getDefaultColor()));
    }

    /* renamed from: b */
    private void m3836b(Rect rect) {
        float f = this.f2884j;
        float f2 = 1.5f * f;
        this.f2881g.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m3838g();
    }

    /* renamed from: d */
    private int m3837d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m3838g() {
        float f = this.f2882h;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f2885k;
        rectF2.inset(-f2, -f2);
        Path path = this.f2883i;
        if (path == null) {
            this.f2883i = new Path();
        } else {
            path.reset();
        }
        this.f2883i.setFillType(Path.FillType.EVEN_ODD);
        this.f2883i.moveTo(-this.f2882h, 0.0f);
        this.f2883i.rLineTo(-this.f2885k, 0.0f);
        this.f2883i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f2883i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f2883i.close();
        float f3 = this.f2882h;
        float f4 = this.f2885k;
        Paint paint = this.f2879e;
        float f5 = f3 + f4;
        int i = this.f2889o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f2890p}, new float[]{0.0f, f3 / (f3 + f4), 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f2880f;
        float f6 = this.f2882h;
        float f7 = this.f2885k;
        int i2 = this.f2889o;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f2890p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f2880f.setAntiAlias(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo3573a() {
        return this.f2887m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3574a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f2882h != f2) {
                this.f2882h = f2;
                this.f2888n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3575a(ColorStateList colorStateList) {
        m3835b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3576a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3577a(boolean z) {
        this.f2891q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo3578b() {
        return this.f2882h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3579b(float f) {
        m3832a(this.f2886l, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo3580c() {
        return this.f2884j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3581c(float f) {
        m3832a(f, this.f2884j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo3582d() {
        float f = this.f2884j;
        return (Math.max(f, this.f2882h + ((float) this.f2877c) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f2884j * 1.5f) + ((float) this.f2877c)) * 2.0f);
    }

    public void draw(Canvas canvas) {
        if (this.f2888n) {
            m3836b(getBounds());
            this.f2888n = false;
        }
        canvas.translate(0.0f, this.f2886l / 2.0f);
        m3833a(canvas);
        canvas.translate(0.0f, (-this.f2886l) / 2.0f);
        f2876b.mo3447a(canvas, this.f2881g, this.f2882h, this.f2878d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo3584e() {
        float f = this.f2884j;
        return (Math.max(f, this.f2882h + ((float) this.f2877c) + (f / 2.0f)) * 2.0f) + ((this.f2884j + ((float) this.f2877c)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo3585f() {
        return this.f2886l;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m3834b(this.f2884j, this.f2882h, this.f2891q));
        int ceil2 = (int) Math.ceil((double) m3831a(this.f2884j, this.f2882h, this.f2891q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f2887m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2888n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2887m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2878d.getColor() == colorForState) {
            return false;
        }
        this.f2878d.setColor(colorForState);
        this.f2888n = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f2878d.setAlpha(i);
        this.f2879e.setAlpha(i);
        this.f2880f.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2878d.setColorFilter(colorFilter);
    }
}
