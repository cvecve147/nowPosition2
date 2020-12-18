package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p013b.p018b.p022d.C0963i;

/* renamed from: android.support.design.widget.h */
class C0152h extends FrameLayout {

    /* renamed from: a */
    private C0151g f825a;

    /* renamed from: b */
    private C0150f f826b;

    C0152h(Context context) {
        this(context, (AttributeSet) null);
    }

    C0152h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(C0963i.SnackbarLayout_elevation)) {
            C0487v.m2266a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0963i.SnackbarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0150f fVar = this.f826b;
        if (fVar != null) {
            fVar.onViewAttachedToWindow(this);
        }
        C0487v.m2262C(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0150f fVar = this.f826b;
        if (fVar != null) {
            fVar.onViewDetachedFromWindow(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0151g gVar = this.f825a;
        if (gVar != null) {
            gVar.mo847a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(C0150f fVar) {
        this.f826b = fVar;
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(C0151g gVar) {
        this.f825a = gVar;
    }
}
