package android.support.p007v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* renamed from: android.support.v4.widget.u */
public class C0571u extends View {
    @Deprecated
    public C0571u(Context context) {
        this(context, (AttributeSet) null);
    }

    @Deprecated
    public C0571u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public C0571u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    /* renamed from: a */
    private static int m2775a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? i : size : Math.min(i, size);
    }

    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m2775a(getSuggestedMinimumWidth(), i), m2775a(getSuggestedMinimumHeight(), i2));
    }
}
