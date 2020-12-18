package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p013b.p018b.p040i.p042b.C1113a;
import p013b.p018b.p040i.p042b.C1115c;
import p013b.p018b.p040i.p042b.C1116d;

/* renamed from: android.support.v7.widget.CardView */
public class CardView extends FrameLayout {

    /* renamed from: a */
    private static final int[] f2752a = {16842801};

    /* renamed from: b */
    private static final C0779S f2753b;

    /* renamed from: c */
    private boolean f2754c;

    /* renamed from: d */
    private boolean f2755d;

    /* renamed from: e */
    int f2756e;

    /* renamed from: f */
    int f2757f;

    /* renamed from: g */
    final Rect f2758g = new Rect();

    /* renamed from: h */
    final Rect f2759h = new Rect();

    /* renamed from: i */
    private final C0742Q f2760i = new C0725K(this);

    static {
        int i = Build.VERSION.SDK_INT;
        f2753b = i >= 21 ? new C0735N() : i >= 17 ? new C0733M() : new C0740P();
        f2753b.mo3542a();
    }

    public CardView(Context context) {
        super(context);
        m3553a(context, (AttributeSet) null, 0);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3553a(context, attributeSet, 0);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3553a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m3553a(Context context, AttributeSet attributeSet, int i) {
        Resources resources;
        int i2;
        ColorStateList valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1116d.CardView, i, C1115c.CardView);
        if (obtainStyledAttributes.hasValue(C1116d.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C1116d.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2752a);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = C1113a.cardview_light_background;
            } else {
                resources = getResources();
                i2 = C1113a.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C1116d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C1116d.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C1116d.CardView_cardMaxElevation, 0.0f);
        this.f2754c = obtainStyledAttributes.getBoolean(C1116d.CardView_cardUseCompatPadding, false);
        this.f2755d = obtainStyledAttributes.getBoolean(C1116d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1116d.CardView_contentPadding, 0);
        this.f2758g.left = obtainStyledAttributes.getDimensionPixelSize(C1116d.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f2758g.top = obtainStyledAttributes.getDimensionPixelSize(C1116d.CardView_contentPaddingTop, dimensionPixelSize);
        this.f2758g.right = obtainStyledAttributes.getDimensionPixelSize(C1116d.CardView_contentPaddingRight, dimensionPixelSize);
        this.f2758g.bottom = obtainStyledAttributes.getDimensionPixelSize(C1116d.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2756e = obtainStyledAttributes.getDimensionPixelSize(C1116d.CardView_android_minWidth, 0);
        this.f2757f = obtainStyledAttributes.getDimensionPixelSize(C1116d.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f2753b.mo3561a(this.f2760i, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return f2753b.mo3568e(this.f2760i);
    }

    public float getCardElevation() {
        return f2753b.mo3567d(this.f2760i);
    }

    public int getContentPaddingBottom() {
        return this.f2758g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2758g.left;
    }

    public int getContentPaddingRight() {
        return this.f2758g.right;
    }

    public int getContentPaddingTop() {
        return this.f2758g.top;
    }

    public float getMaxCardElevation() {
        return f2753b.mo3565c(this.f2760i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2755d;
    }

    public float getRadius() {
        return f2753b.mo3569f(this.f2760i);
    }

    public boolean getUseCompatPadding() {
        return this.f2754c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f2753b instanceof C0735N)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2753b.mo3570g(this.f2760i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2753b.mo3559a(this.f2760i)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f2753b.mo3562a(this.f2760i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2753b.mo3562a(this.f2760i, colorStateList);
    }

    public void setCardElevation(float f) {
        f2753b.mo3560a(this.f2760i, f);
    }

    public void setMaxCardElevation(float f) {
        f2753b.mo3564b(this.f2760i, f);
    }

    public void setMinimumHeight(int i) {
        this.f2757f = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f2756e = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2755d) {
            this.f2755d = z;
            f2753b.mo3563b(this.f2760i);
        }
    }

    public void setRadius(float f) {
        f2753b.mo3566c(this.f2760i, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2754c != z) {
            this.f2754c = z;
            f2753b.mo3571h(this.f2760i);
        }
    }
}
