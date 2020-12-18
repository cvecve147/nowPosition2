package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.C0475j;
import android.support.p007v4.view.C0499x;
import android.support.p007v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class CirclePageIndicator extends View implements C5106c {

    /* renamed from: a */
    private float f14488a;

    /* renamed from: b */
    private final Paint f14489b;

    /* renamed from: c */
    private final Paint f14490c;

    /* renamed from: d */
    private final Paint f14491d;

    /* renamed from: e */
    private ViewPager f14492e;

    /* renamed from: f */
    private ViewPager.C0440f f14493f;

    /* renamed from: g */
    private int f14494g;

    /* renamed from: h */
    private int f14495h;

    /* renamed from: i */
    private float f14496i;

    /* renamed from: j */
    private int f14497j;

    /* renamed from: k */
    private int f14498k;

    /* renamed from: l */
    private boolean f14499l;

    /* renamed from: m */
    private boolean f14500m;

    /* renamed from: n */
    private int f14501n;

    /* renamed from: o */
    private float f14502o;

    /* renamed from: p */
    private int f14503p;

    /* renamed from: q */
    private boolean f14504q;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5105b();

        /* renamed from: a */
        int f14505a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f14505a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f14505a);
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5107d.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14489b = new Paint(1);
        this.f14490c = new Paint(1);
        this.f14491d = new Paint(1);
        this.f14502o = -1.0f;
        this.f14503p = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C5109f.default_circle_indicator_page_color);
            int color2 = resources.getColor(C5109f.default_circle_indicator_fill_color);
            int integer = resources.getInteger(C5111h.default_circle_indicator_orientation);
            int color3 = resources.getColor(C5109f.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(C5110g.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(C5110g.default_circle_indicator_radius);
            boolean z = resources.getBoolean(C5108e.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(C5108e.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5112i.CirclePageIndicator, i, 0);
            this.f14499l = obtainStyledAttributes.getBoolean(C5112i.CirclePageIndicator_centered, z);
            this.f14498k = obtainStyledAttributes.getInt(C5112i.CirclePageIndicator_android_orientation, integer);
            this.f14489b.setStyle(Paint.Style.FILL);
            this.f14489b.setColor(obtainStyledAttributes.getColor(C5112i.CirclePageIndicator_pageColor, color));
            this.f14490c.setStyle(Paint.Style.STROKE);
            this.f14490c.setColor(obtainStyledAttributes.getColor(C5112i.CirclePageIndicator_strokeColor, color3));
            this.f14490c.setStrokeWidth(obtainStyledAttributes.getDimension(C5112i.CirclePageIndicator_strokeWidth, dimension));
            this.f14491d.setStyle(Paint.Style.FILL);
            this.f14491d.setColor(obtainStyledAttributes.getColor(C5112i.CirclePageIndicator_fillColor, color2));
            this.f14488a = obtainStyledAttributes.getDimension(C5112i.CirclePageIndicator_radius, dimension2);
            this.f14500m = obtainStyledAttributes.getBoolean(C5112i.CirclePageIndicator_snap, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(C5112i.CirclePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f14501n = C0499x.m2414a(ViewConfiguration.get(context));
        }
    }

    /* renamed from: c */
    private int m19991c(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.f14492e) == null) {
            return size;
        }
        int a = viewPager.getAdapter().mo1972a();
        float f = this.f14488a;
        int paddingLeft = (int) (((float) (getPaddingLeft() + getPaddingRight())) + (((float) (a * 2)) * f) + (((float) (a - 1)) * f) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* renamed from: d */
    private int m19992d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f14488a * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* renamed from: a */
    public void mo781a(int i) {
        this.f14497j = i;
        ViewPager.C0440f fVar = this.f14493f;
        if (fVar != null) {
            fVar.mo781a(i);
        }
    }

    /* renamed from: a */
    public void mo782a(int i, float f, int i2) {
        this.f14494g = i;
        this.f14496i = f;
        invalidate();
        ViewPager.C0440f fVar = this.f14493f;
        if (fVar != null) {
            fVar.mo782a(i, f, i2);
        }
    }

    /* renamed from: b */
    public void mo783b(int i) {
        if (this.f14500m || this.f14497j == 0) {
            this.f14494g = i;
            this.f14495h = i;
            invalidate();
        }
        ViewPager.C0440f fVar = this.f14493f;
        if (fVar != null) {
            fVar.mo783b(i);
        }
    }

    public int getFillColor() {
        return this.f14491d.getColor();
    }

    public int getOrientation() {
        return this.f14498k;
    }

    public int getPageColor() {
        return this.f14489b.getColor();
    }

    public float getRadius() {
        return this.f14488a;
    }

    public int getStrokeColor() {
        return this.f14490c.getColor();
    }

    public float getStrokeWidth() {
        return this.f14490c.getStrokeWidth();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int a;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        super.onDraw(canvas);
        ViewPager viewPager = this.f14492e;
        if (viewPager != null && (a = viewPager.getAdapter().mo1972a()) != 0) {
            if (this.f14494g >= a) {
                setCurrentItem(a - 1);
                return;
            }
            if (this.f14498k == 0) {
                i4 = getWidth();
                i3 = getPaddingLeft();
                i2 = getPaddingRight();
                i = getPaddingTop();
            } else {
                i4 = getHeight();
                i3 = getPaddingTop();
                i2 = getPaddingBottom();
                i = getPaddingLeft();
            }
            float f3 = this.f14488a;
            float f4 = 3.0f * f3;
            float f5 = ((float) i) + f3;
            float f6 = ((float) i3) + f3;
            if (this.f14499l) {
                f6 += (((float) ((i4 - i3) - i2)) / 2.0f) - ((((float) a) * f4) / 2.0f);
            }
            float f7 = this.f14488a;
            if (this.f14490c.getStrokeWidth() > 0.0f) {
                f7 -= this.f14490c.getStrokeWidth() / 2.0f;
            }
            for (int i5 = 0; i5 < a; i5++) {
                float f8 = (((float) i5) * f4) + f6;
                if (this.f14498k == 0) {
                    f2 = f5;
                } else {
                    f2 = f8;
                    f8 = f5;
                }
                if (this.f14489b.getAlpha() > 0) {
                    canvas.drawCircle(f8, f2, f7, this.f14489b);
                }
                float f9 = this.f14488a;
                if (f7 != f9) {
                    canvas.drawCircle(f8, f2, f9, this.f14490c);
                }
            }
            float f10 = ((float) (this.f14500m ? this.f14495h : this.f14494g)) * f4;
            if (!this.f14500m) {
                f10 += this.f14496i * f4;
            }
            if (this.f14498k == 0) {
                f = f10 + f6;
            } else {
                float f11 = f5;
                f5 = f10 + f6;
                f = f11;
            }
            canvas.drawCircle(f, f5, this.f14488a, this.f14491d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f14498k == 0) {
            i4 = m19991c(i);
            i3 = m19992d(i2);
        } else {
            i4 = m19992d(i);
            i3 = m19991c(i2);
        }
        setMeasuredDimension(i4, i3);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f14505a;
        this.f14494g = i;
        this.f14495h = i;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f14505a = this.f14494g;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f14492e;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().mo1972a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float c = C0475j.m2210c(motionEvent, C0475j.m2207a(motionEvent, this.f14503p));
                    float f2 = c - this.f14502o;
                    if (!this.f14504q && Math.abs(f2) > ((float) this.f14501n)) {
                        this.f14504q = true;
                    }
                    if (this.f14504q) {
                        this.f14502o = c;
                        if (this.f14492e.mo1810e() || this.f14492e.mo1787a()) {
                            this.f14492e.mo1797b(f2);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int a = C0475j.m2206a(motionEvent);
                        this.f14502o = C0475j.m2210c(motionEvent, a);
                        this.f14503p = C0475j.m2209b(motionEvent, a);
                    } else if (action == 6) {
                        int a2 = C0475j.m2206a(motionEvent);
                        if (C0475j.m2209b(motionEvent, a2) == this.f14503p) {
                            if (a2 == 0) {
                                i = 1;
                            }
                            this.f14503p = C0475j.m2209b(motionEvent, i);
                        }
                        f = C0475j.m2210c(motionEvent, C0475j.m2207a(motionEvent, this.f14503p));
                    }
                }
                return true;
            }
            if (!this.f14504q) {
                int a3 = this.f14492e.getAdapter().mo1972a();
                float width = (float) getWidth();
                float f3 = width / 2.0f;
                float f4 = width / 6.0f;
                if (this.f14494g > 0 && motionEvent.getX() < f3 - f4) {
                    if (action != 3) {
                        this.f14492e.setCurrentItem(this.f14494g - 1);
                    }
                    return true;
                } else if (this.f14494g < a3 - 1 && motionEvent.getX() > f3 + f4) {
                    if (action != 3) {
                        this.f14492e.setCurrentItem(this.f14494g + 1);
                    }
                    return true;
                }
            }
            this.f14504q = false;
            this.f14503p = -1;
            if (this.f14492e.mo1810e()) {
                this.f14492e.mo1800c();
            }
            return true;
        }
        this.f14503p = C0475j.m2209b(motionEvent, 0);
        f = motionEvent.getX();
        this.f14502o = f;
        return true;
    }

    public void setCentered(boolean z) {
        this.f14499l = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f14492e;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.f14494g = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i) {
        this.f14491d.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.C0440f fVar) {
        this.f14493f = fVar;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.f14498k = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setPageColor(int i) {
        this.f14489b.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.f14488a = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.f14500m = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f14490c.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f14490c.setStrokeWidth(f);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f14492e;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener((ViewPager.C0440f) null);
            }
            if (viewPager.getAdapter() != null) {
                this.f14492e = viewPager;
                this.f14492e.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }
}
