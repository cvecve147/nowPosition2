package android.support.p011v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.Ma */
class C0734Ma extends Drawable {

    /* renamed from: a */
    private float f2864a;

    /* renamed from: b */
    private final Paint f2865b;

    /* renamed from: c */
    private final RectF f2866c;

    /* renamed from: d */
    private final Rect f2867d;

    /* renamed from: e */
    private float f2868e;

    /* renamed from: f */
    private boolean f2869f = false;

    /* renamed from: g */
    private boolean f2870g = true;

    /* renamed from: h */
    private ColorStateList f2871h;

    /* renamed from: i */
    private PorterDuffColorFilter f2872i;

    /* renamed from: j */
    private ColorStateList f2873j;

    /* renamed from: k */
    private PorterDuff.Mode f2874k = PorterDuff.Mode.SRC_IN;

    C0734Ma(ColorStateList colorStateList, float f) {
        this.f2864a = f;
        this.f2865b = new Paint(5);
        m3808b(colorStateList);
        this.f2866c = new RectF();
        this.f2867d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m3806a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    private void m3807a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2866c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f2867d.set(rect);
        if (this.f2869f) {
            float b = C0736Na.m3834b(this.f2868e, this.f2864a, this.f2870g);
            this.f2867d.inset((int) Math.ceil((double) C0736Na.m3831a(this.f2868e, this.f2864a, this.f2870g)), (int) Math.ceil((double) b));
            this.f2866c.set(this.f2867d);
        }
    }

    /* renamed from: b */
    private void m3808b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2871h = colorStateList;
        this.f2865b.setColor(this.f2871h.getColorForState(getState(), this.f2871h.getDefaultColor()));
    }

    /* renamed from: a */
    public ColorStateList mo3543a() {
        return this.f2871h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3544a(float f) {
        if (f != this.f2864a) {
            this.f2864a = f;
            m3807a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3545a(float f, boolean z, boolean z2) {
        if (f != this.f2868e || this.f2869f != z || this.f2870g != z2) {
            this.f2868e = f;
            this.f2869f = z;
            this.f2870g = z2;
            m3807a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3546a(ColorStateList colorStateList) {
        m3808b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo3547b() {
        return this.f2868e;
    }

    /* renamed from: c */
    public float mo3548c() {
        return this.f2864a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2865b;
        if (this.f2872i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f2872i);
            z = true;
        }
        RectF rectF = this.f2866c;
        float f = this.f2864a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2867d, this.f2864a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f2871h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f2873j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f2871h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0734Ma.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3807a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2871h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f2865b.getColor();
        if (z) {
            this.f2865b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2873j;
        if (colorStateList2 == null || (mode = this.f2874k) == null) {
            return z;
        }
        this.f2872i = m3806a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f2865b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2865b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2873j = colorStateList;
        this.f2872i = m3806a(this.f2873j, this.f2874k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2874k = mode;
        this.f2872i = m3806a(this.f2873j, this.f2874k);
        invalidateSelf();
    }
}
