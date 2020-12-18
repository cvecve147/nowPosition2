package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.percent.C0178a;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

@Deprecated
public class PercentRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private final C0178a f931a = new C0178a(this);

    @Deprecated
    /* renamed from: android.support.percent.PercentRelativeLayout$a */
    public static class C0177a extends RelativeLayout.LayoutParams implements C0178a.C0180b {

        /* renamed from: a */
        private C0178a.C0179a f932a;

        public C0177a(int i, int i2) {
            super(i, i2);
        }

        public C0177a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f932a = C0178a.m908a(context, attributeSet);
        }

        /* renamed from: a */
        public C0178a.C0179a mo935a() {
            if (this.f932a == null) {
                this.f932a = new C0178a.C0179a();
            }
            return this.f932a;
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C0178a.m909a(this, typedArray, i, i2);
        }
    }

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public C0177a generateDefaultLayoutParams() {
        return new C0177a(-1, -1);
    }

    public C0177a generateLayoutParams(AttributeSet attributeSet) {
        return new C0177a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f931a.mo939b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f931a.mo937a(i, i2);
        super.onMeasure(i, i2);
        if (this.f931a.mo938a()) {
            super.onMeasure(i, i2);
        }
    }
}
