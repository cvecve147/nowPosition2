package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p007v4.view.C0470h;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: android.support.percent.a */
public class C0178a {

    /* renamed from: a */
    private final ViewGroup f933a;

    @Deprecated
    /* renamed from: android.support.percent.a$a */
    public static class C0179a {

        /* renamed from: a */
        public float f934a = -1.0f;

        /* renamed from: b */
        public float f935b = -1.0f;

        /* renamed from: c */
        public float f936c = -1.0f;

        /* renamed from: d */
        public float f937d = -1.0f;

        /* renamed from: e */
        public float f938e = -1.0f;

        /* renamed from: f */
        public float f939f = -1.0f;

        /* renamed from: g */
        public float f940g = -1.0f;

        /* renamed from: h */
        public float f941h = -1.0f;

        /* renamed from: i */
        public float f942i;

        /* renamed from: j */
        final C0181c f943j = new C0181c(0, 0);

        /* renamed from: a */
        public void mo940a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
            mo942a(marginLayoutParams, i, i2);
            C0181c cVar = this.f943j;
            cVar.leftMargin = marginLayoutParams.leftMargin;
            cVar.topMargin = marginLayoutParams.topMargin;
            cVar.rightMargin = marginLayoutParams.rightMargin;
            cVar.bottomMargin = marginLayoutParams.bottomMargin;
            C0470h.m2180c(cVar, C0470h.m2178b(marginLayoutParams));
            C0470h.m2179b(this.f943j, C0470h.m2176a(marginLayoutParams));
            float f = this.f936c;
            if (f >= 0.0f) {
                marginLayoutParams.leftMargin = Math.round(((float) i) * f);
            }
            float f2 = this.f937d;
            if (f2 >= 0.0f) {
                marginLayoutParams.topMargin = Math.round(((float) i2) * f2);
            }
            float f3 = this.f938e;
            if (f3 >= 0.0f) {
                marginLayoutParams.rightMargin = Math.round(((float) i) * f3);
            }
            float f4 = this.f939f;
            if (f4 >= 0.0f) {
                marginLayoutParams.bottomMargin = Math.round(((float) i2) * f4);
            }
            boolean z = false;
            float f5 = this.f940g;
            if (f5 >= 0.0f) {
                C0470h.m2180c(marginLayoutParams, Math.round(((float) i) * f5));
                z = true;
            }
            float f6 = this.f941h;
            if (f6 >= 0.0f) {
                C0470h.m2179b(marginLayoutParams, Math.round(((float) i) * f6));
                z = true;
            }
            if (z && view != null) {
                C0470h.m2177a(marginLayoutParams, C0487v.m2293i(view));
            }
        }

        /* renamed from: a */
        public void mo941a(ViewGroup.LayoutParams layoutParams) {
            if (!this.f943j.f945b) {
                layoutParams.width = this.f943j.width;
            }
            if (!this.f943j.f944a) {
                layoutParams.height = this.f943j.height;
            }
            boolean unused = this.f943j.f945b = false;
            boolean unused2 = this.f943j.f944a = false;
        }

        /* renamed from: a */
        public void mo942a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
            C0181c cVar = this.f943j;
            cVar.width = layoutParams.width;
            cVar.height = layoutParams.height;
            boolean z = false;
            boolean z2 = (cVar.f945b || this.f943j.width == 0) && this.f934a < 0.0f;
            if ((this.f943j.f944a || this.f943j.height == 0) && this.f935b < 0.0f) {
                z = true;
            }
            float f = this.f934a;
            if (f >= 0.0f) {
                layoutParams.width = Math.round(((float) i) * f);
            }
            float f2 = this.f935b;
            if (f2 >= 0.0f) {
                layoutParams.height = Math.round(((float) i2) * f2);
            }
            float f3 = this.f942i;
            if (f3 >= 0.0f) {
                if (z2) {
                    layoutParams.width = Math.round(((float) layoutParams.height) * f3);
                    boolean unused = this.f943j.f945b = true;
                }
                if (z) {
                    layoutParams.height = Math.round(((float) layoutParams.width) / this.f942i);
                    boolean unused2 = this.f943j.f944a = true;
                }
            }
        }

        /* renamed from: a */
        public void mo943a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            mo941a((ViewGroup.LayoutParams) marginLayoutParams);
            C0181c cVar = this.f943j;
            marginLayoutParams.leftMargin = cVar.leftMargin;
            marginLayoutParams.topMargin = cVar.topMargin;
            marginLayoutParams.rightMargin = cVar.rightMargin;
            marginLayoutParams.bottomMargin = cVar.bottomMargin;
            C0470h.m2180c(marginLayoutParams, C0470h.m2178b(cVar));
            C0470h.m2179b(marginLayoutParams, C0470h.m2176a(this.f943j));
        }

        public String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", new Object[]{Float.valueOf(this.f934a), Float.valueOf(this.f935b), Float.valueOf(this.f936c), Float.valueOf(this.f937d), Float.valueOf(this.f938e), Float.valueOf(this.f939f), Float.valueOf(this.f940g), Float.valueOf(this.f941h)});
        }
    }

    @Deprecated
    /* renamed from: android.support.percent.a$b */
    public interface C0180b {
        /* renamed from: a */
        C0179a mo935a();
    }

    /* renamed from: android.support.percent.a$c */
    static class C0181c extends ViewGroup.MarginLayoutParams {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f944a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f945b;

        public C0181c(int i, int i2) {
            super(i, i2);
        }
    }

    public C0178a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f933a = viewGroup;
            return;
        }
        throw new IllegalArgumentException("host must be non-null");
    }

    /* renamed from: a */
    public static C0179a m908a(Context context, AttributeSet attributeSet) {
        C0179a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0182b.PercentLayout_Layout);
        float fraction = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            aVar = new C0179a();
            aVar.f934a = fraction;
        } else {
            aVar = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f935b = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f936c = fraction3;
            aVar.f937d = fraction3;
            aVar.f938e = fraction3;
            aVar.f939f = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f936c = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f937d = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f938e = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f939f = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f940g = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f941h = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(C0182b.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (aVar == null) {
                aVar = new C0179a();
            }
            aVar.f942i = fraction10;
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    public static void m909a(ViewGroup.LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    /* renamed from: a */
    private static boolean m910a(View view, C0179a aVar) {
        return (view.getMeasuredHeightAndState() & -16777216) == 16777216 && aVar.f935b >= 0.0f && aVar.f943j.height == -2;
    }

    /* renamed from: b */
    private static boolean m911b(View view, C0179a aVar) {
        return (view.getMeasuredWidthAndState() & -16777216) == 16777216 && aVar.f934a >= 0.0f && aVar.f943j.width == -2;
    }

    /* renamed from: a */
    public void mo937a(int i, int i2) {
        C0179a a;
        int size = (View.MeasureSpec.getSize(i) - this.f933a.getPaddingLeft()) - this.f933a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - this.f933a.getPaddingTop()) - this.f933a.getPaddingBottom();
        int childCount = this.f933a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f933a.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C0180b) && (a = ((C0180b) layoutParams).mo935a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    a.mo940a(childAt, (ViewGroup.MarginLayoutParams) layoutParams, size, size2);
                } else {
                    a.mo942a(layoutParams, size, size2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo938a() {
        C0179a a;
        int childCount = this.f933a.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f933a.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C0180b) && (a = ((C0180b) layoutParams).mo935a()) != null) {
                if (m911b(childAt, a)) {
                    layoutParams.width = -2;
                    z = true;
                }
                if (m910a(childAt, a)) {
                    layoutParams.height = -2;
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo939b() {
        C0179a a;
        int childCount = this.f933a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = this.f933a.getChildAt(i).getLayoutParams();
            if ((layoutParams instanceof C0180b) && (a = ((C0180b) layoutParams).mo935a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    a.mo943a((ViewGroup.MarginLayoutParams) layoutParams);
                } else {
                    a.mo941a(layoutParams);
                }
            }
        }
    }
}
