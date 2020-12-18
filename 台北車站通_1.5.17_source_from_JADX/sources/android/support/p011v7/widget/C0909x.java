package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p013b.p018b.p040i.p041a.C1103a;

/* renamed from: android.support.v7.widget.x */
public class C0909x extends RatingBar {

    /* renamed from: a */
    private final C0906w f3711a;

    public C0909x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.ratingBarStyle);
    }

    public C0909x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3711a = new C0906w(this);
        this.f3711a.mo4774a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f3711a.mo4773a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
