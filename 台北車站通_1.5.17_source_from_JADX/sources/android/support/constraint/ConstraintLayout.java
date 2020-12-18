package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.p005a.p006a.C0048b;
import android.support.constraint.p005a.p006a.C0053d;
import android.support.constraint.p005a.p006a.C0055e;
import android.support.constraint.p005a.p006a.C0057g;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f141a = new SparseArray<>();

    /* renamed from: b */
    private final ArrayList<C0053d> f142b = new ArrayList<>(100);

    /* renamed from: c */
    C0055e f143c = new C0055e();

    /* renamed from: d */
    private int f144d = 0;

    /* renamed from: e */
    private int f145e = 0;

    /* renamed from: f */
    private int f146f = Integer.MAX_VALUE;

    /* renamed from: g */
    private int f147g = Integer.MAX_VALUE;

    /* renamed from: h */
    private boolean f148h = true;

    /* renamed from: i */
    private int f149i = 2;

    /* renamed from: j */
    private C0071b f150j = null;

    /* renamed from: android.support.constraint.ConstraintLayout$a */
    public static class C0044a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        int f151A = 1;

        /* renamed from: B */
        public float f152B = 0.0f;

        /* renamed from: C */
        public float f153C = 0.0f;

        /* renamed from: D */
        public int f154D = 0;

        /* renamed from: E */
        public int f155E = 0;

        /* renamed from: F */
        public int f156F = 0;

        /* renamed from: G */
        public int f157G = 0;

        /* renamed from: H */
        public int f158H = 0;

        /* renamed from: I */
        public int f159I = 0;

        /* renamed from: J */
        public int f160J = 0;

        /* renamed from: K */
        public int f161K = 0;

        /* renamed from: L */
        public int f162L = -1;

        /* renamed from: M */
        public int f163M = -1;

        /* renamed from: N */
        public int f164N = -1;

        /* renamed from: O */
        boolean f165O = true;

        /* renamed from: P */
        boolean f166P = true;

        /* renamed from: Q */
        boolean f167Q = false;

        /* renamed from: R */
        boolean f168R = false;

        /* renamed from: S */
        int f169S = -1;

        /* renamed from: T */
        int f170T = -1;

        /* renamed from: U */
        int f171U = -1;

        /* renamed from: V */
        int f172V = -1;

        /* renamed from: W */
        int f173W = -1;

        /* renamed from: X */
        int f174X = -1;

        /* renamed from: Y */
        float f175Y = 0.5f;

        /* renamed from: Z */
        C0053d f176Z = new C0053d();

        /* renamed from: a */
        public int f177a = -1;

        /* renamed from: b */
        public int f178b = -1;

        /* renamed from: c */
        public float f179c = -1.0f;

        /* renamed from: d */
        public int f180d = -1;

        /* renamed from: e */
        public int f181e = -1;

        /* renamed from: f */
        public int f182f = -1;

        /* renamed from: g */
        public int f183g = -1;

        /* renamed from: h */
        public int f184h = -1;

        /* renamed from: i */
        public int f185i = -1;

        /* renamed from: j */
        public int f186j = -1;

        /* renamed from: k */
        public int f187k = -1;

        /* renamed from: l */
        public int f188l = -1;

        /* renamed from: m */
        public int f189m = -1;

        /* renamed from: n */
        public int f190n = -1;

        /* renamed from: o */
        public int f191o = -1;

        /* renamed from: p */
        public int f192p = -1;

        /* renamed from: q */
        public int f193q = -1;

        /* renamed from: r */
        public int f194r = -1;

        /* renamed from: s */
        public int f195s = -1;

        /* renamed from: t */
        public int f196t = -1;

        /* renamed from: u */
        public int f197u = -1;

        /* renamed from: v */
        public int f198v = -1;

        /* renamed from: w */
        public float f199w = 0.5f;

        /* renamed from: x */
        public float f200x = 0.5f;

        /* renamed from: y */
        public String f201y = null;

        /* renamed from: z */
        float f202z = 0.0f;

        public C0044a(int i, int i2) {
            super(i, i2);
        }

        public C0044a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            float parseFloat;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0073c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == C0073c.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf) {
                    this.f180d = obtainStyledAttributes.getResourceId(index, this.f180d);
                    if (this.f180d == -1) {
                        this.f180d = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintLeft_toRightOf) {
                    this.f181e = obtainStyledAttributes.getResourceId(index, this.f181e);
                    if (this.f181e == -1) {
                        this.f181e = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintRight_toLeftOf) {
                    this.f182f = obtainStyledAttributes.getResourceId(index, this.f182f);
                    if (this.f182f == -1) {
                        this.f182f = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintRight_toRightOf) {
                    this.f183g = obtainStyledAttributes.getResourceId(index, this.f183g);
                    if (this.f183g == -1) {
                        this.f183g = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintTop_toTopOf) {
                    this.f184h = obtainStyledAttributes.getResourceId(index, this.f184h);
                    if (this.f184h == -1) {
                        this.f184h = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintTop_toBottomOf) {
                    this.f185i = obtainStyledAttributes.getResourceId(index, this.f185i);
                    if (this.f185i == -1) {
                        this.f185i = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintBottom_toTopOf) {
                    this.f186j = obtainStyledAttributes.getResourceId(index, this.f186j);
                    if (this.f186j == -1) {
                        this.f186j = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf) {
                    this.f187k = obtainStyledAttributes.getResourceId(index, this.f187k);
                    if (this.f187k == -1) {
                        this.f187k = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf) {
                    this.f188l = obtainStyledAttributes.getResourceId(index, this.f188l);
                    if (this.f188l == -1) {
                        this.f188l = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_editor_absoluteX) {
                    this.f162L = obtainStyledAttributes.getDimensionPixelOffset(index, this.f162L);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_editor_absoluteY) {
                    this.f163M = obtainStyledAttributes.getDimensionPixelOffset(index, this.f163M);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintGuide_begin) {
                    this.f177a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f177a);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintGuide_end) {
                    this.f178b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f178b);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintGuide_percent) {
                    this.f179c = obtainStyledAttributes.getFloat(index, this.f179c);
                } else if (index == C0073c.ConstraintLayout_Layout_android_orientation) {
                    this.f164N = obtainStyledAttributes.getInt(index, this.f164N);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintStart_toEndOf) {
                    this.f189m = obtainStyledAttributes.getResourceId(index, this.f189m);
                    if (this.f189m == -1) {
                        this.f189m = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintStart_toStartOf) {
                    this.f190n = obtainStyledAttributes.getResourceId(index, this.f190n);
                    if (this.f190n == -1) {
                        this.f190n = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintEnd_toStartOf) {
                    this.f191o = obtainStyledAttributes.getResourceId(index, this.f191o);
                    if (this.f191o == -1) {
                        this.f191o = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintEnd_toEndOf) {
                    this.f192p = obtainStyledAttributes.getResourceId(index, this.f192p);
                    if (this.f192p == -1) {
                        this.f192p = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_goneMarginLeft) {
                    this.f193q = obtainStyledAttributes.getDimensionPixelSize(index, this.f193q);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_goneMarginTop) {
                    this.f194r = obtainStyledAttributes.getDimensionPixelSize(index, this.f194r);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_goneMarginRight) {
                    this.f195s = obtainStyledAttributes.getDimensionPixelSize(index, this.f195s);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_goneMarginBottom) {
                    this.f196t = obtainStyledAttributes.getDimensionPixelSize(index, this.f196t);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_goneMarginStart) {
                    this.f197u = obtainStyledAttributes.getDimensionPixelSize(index, this.f197u);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_goneMarginEnd) {
                    this.f198v = obtainStyledAttributes.getDimensionPixelSize(index, this.f198v);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintHorizontal_bias) {
                    this.f199w = obtainStyledAttributes.getFloat(index, this.f199w);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintVertical_bias) {
                    this.f200x = obtainStyledAttributes.getFloat(index, this.f200x);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintDimensionRatio) {
                    this.f201y = obtainStyledAttributes.getString(index);
                    this.f202z = Float.NaN;
                    this.f151A = -1;
                    String str = this.f201y;
                    if (str != null) {
                        int length = str.length();
                        int indexOf = this.f201y.indexOf(44);
                        if (indexOf <= 0 || indexOf >= length - 1) {
                            i = 0;
                        } else {
                            String substring = this.f201y.substring(0, indexOf);
                            if (substring.equalsIgnoreCase("W")) {
                                this.f151A = 0;
                            } else if (substring.equalsIgnoreCase("H")) {
                                this.f151A = 1;
                            }
                            i = indexOf + 1;
                        }
                        int indexOf2 = this.f201y.indexOf(58);
                        if (indexOf2 < 0 || indexOf2 >= length - 1) {
                            String substring2 = this.f201y.substring(i);
                            if (substring2.length() > 0) {
                                parseFloat = Float.parseFloat(substring2);
                            }
                        } else {
                            String substring3 = this.f201y.substring(i, indexOf2);
                            String substring4 = this.f201y.substring(indexOf2 + 1);
                            if (substring3.length() > 0 && substring4.length() > 0) {
                                try {
                                    float parseFloat2 = Float.parseFloat(substring3);
                                    float parseFloat3 = Float.parseFloat(substring4);
                                    parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.f151A == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                        this.f202z = parseFloat;
                    }
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintHorizontal_weight) {
                    this.f152B = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintVertical_weight) {
                    this.f153C = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle) {
                    this.f154D = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintVertical_chainStyle) {
                    this.f155E = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintWidth_default) {
                    this.f156F = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintHeight_default) {
                    this.f157G = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintWidth_min) {
                    this.f158H = obtainStyledAttributes.getDimensionPixelSize(index, this.f158H);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintWidth_max) {
                    this.f160J = obtainStyledAttributes.getDimensionPixelSize(index, this.f160J);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintHeight_min) {
                    this.f159I = obtainStyledAttributes.getDimensionPixelSize(index, this.f159I);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_constraintHeight_max) {
                    this.f161K = obtainStyledAttributes.getDimensionPixelSize(index, this.f161K);
                } else if (!(index == C0073c.ConstraintLayout_Layout_layout_constraintLeft_creator || index == C0073c.ConstraintLayout_Layout_layout_constraintTop_creator || index == C0073c.ConstraintLayout_Layout_layout_constraintRight_creator || index == C0073c.ConstraintLayout_Layout_layout_constraintBottom_creator)) {
                    int i3 = C0073c.ConstraintLayout_Layout_layout_constraintBaseline_creator;
                }
            }
            obtainStyledAttributes.recycle();
            mo94a();
        }

        public C0044a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo94a() {
            this.f168R = false;
            this.f165O = true;
            this.f166P = true;
            if (this.width == 0 || this.width == -1) {
                this.f165O = false;
            }
            if (this.height == 0 || this.height == -1) {
                this.f166P = false;
            }
            if (this.f179c != -1.0f || this.f177a != -1 || this.f178b != -1) {
                this.f168R = true;
                this.f165O = true;
                this.f166P = true;
                if (!(this.f176Z instanceof C0057g)) {
                    this.f176Z = new C0057g();
                }
                ((C0057g) this.f176Z).mo211o(this.f164N);
            }
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            super.resolveLayoutDirection(i);
            this.f171U = -1;
            this.f172V = -1;
            this.f169S = -1;
            this.f170T = -1;
            this.f173W = -1;
            this.f174X = -1;
            this.f173W = this.f193q;
            this.f174X = this.f195s;
            this.f175Y = this.f199w;
            boolean z = true;
            if (1 != getLayoutDirection()) {
                z = false;
            }
            if (z) {
                int i2 = this.f189m;
                if (i2 != -1) {
                    this.f171U = i2;
                } else {
                    int i3 = this.f190n;
                    if (i3 != -1) {
                        this.f172V = i3;
                    }
                }
                int i4 = this.f191o;
                if (i4 != -1) {
                    this.f170T = i4;
                }
                int i5 = this.f192p;
                if (i5 != -1) {
                    this.f169S = i5;
                }
                int i6 = this.f197u;
                if (i6 != -1) {
                    this.f174X = i6;
                }
                int i7 = this.f198v;
                if (i7 != -1) {
                    this.f173W = i7;
                }
                this.f175Y = 1.0f - this.f199w;
            } else {
                int i8 = this.f189m;
                if (i8 != -1) {
                    this.f170T = i8;
                }
                int i9 = this.f190n;
                if (i9 != -1) {
                    this.f169S = i9;
                }
                int i10 = this.f191o;
                if (i10 != -1) {
                    this.f171U = i10;
                }
                int i11 = this.f192p;
                if (i11 != -1) {
                    this.f172V = i11;
                }
                int i12 = this.f197u;
                if (i12 != -1) {
                    this.f173W = i12;
                }
                int i13 = this.f198v;
                if (i13 != -1) {
                    this.f174X = i13;
                }
            }
            if (this.f191o == -1 && this.f192p == -1) {
                int i14 = this.f182f;
                if (i14 != -1) {
                    this.f171U = i14;
                } else {
                    int i15 = this.f183g;
                    if (i15 != -1) {
                        this.f172V = i15;
                    }
                }
            }
            if (this.f190n == -1 && this.f189m == -1) {
                int i16 = this.f180d;
                if (i16 != -1) {
                    this.f169S = i16;
                    return;
                }
                int i17 = this.f181e;
                if (i17 != -1) {
                    this.f170T = i17;
                }
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m122a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m122a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m122a(attributeSet);
    }

    /* renamed from: a */
    private final C0053d m119a(int i) {
        if (i == 0) {
            return this.f143c;
        }
        View view = this.f141a.get(i);
        if (view == this) {
            return this.f143c;
        }
        if (view == null) {
            return null;
        }
        return ((C0044a) view.getLayoutParams()).f176Z;
    }

    /* renamed from: a */
    private final C0053d m120a(View view) {
        if (view == this) {
            return this.f143c;
        }
        if (view == null) {
            return null;
        }
        return ((C0044a) view.getLayoutParams()).f176Z;
    }

    /* renamed from: a */
    private void m121a(int i, int i2) {
        boolean z;
        int baseline;
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0044a aVar = (C0044a) childAt.getLayoutParams();
                C0053d dVar = aVar.f176Z;
                if (!aVar.f168R) {
                    int i8 = aVar.width;
                    int i9 = aVar.height;
                    boolean z2 = aVar.f165O;
                    boolean z3 = true;
                    if (z2 || aVar.f166P || (!z2 && aVar.f156F == 1) || aVar.width == -1 || (!aVar.f166P && (aVar.f157G == 1 || aVar.height == -1))) {
                        if (i8 == 0 || i8 == -1) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -2);
                            z = true;
                        } else {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, i8);
                            z = false;
                        }
                        if (i9 == 0 || i9 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -2);
                        } else {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, i9);
                            z3 = false;
                        }
                        childAt.measure(i3, i4);
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z = false;
                        z3 = false;
                    }
                    dVar.mo169h(i8);
                    dVar.mo149b(i9);
                    if (z) {
                        dVar.mo173j(i8);
                    }
                    if (z3) {
                        dVar.mo171i(i9);
                    }
                    if (aVar.f167Q && (baseline = childAt.getBaseline()) != -1) {
                        dVar.mo136a(baseline);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m122a(AttributeSet attributeSet) {
        this.f143c.mo145a((Object) this);
        this.f141a.put(getId(), this);
        this.f150j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0073c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0073c.ConstraintLayout_Layout_android_minWidth) {
                    this.f144d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f144d);
                } else if (index == C0073c.ConstraintLayout_Layout_android_minHeight) {
                    this.f145e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f145e);
                } else if (index == C0073c.ConstraintLayout_Layout_android_maxWidth) {
                    this.f146f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f146f);
                } else if (index == C0073c.ConstraintLayout_Layout_android_maxHeight) {
                    this.f147g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f147g);
                } else if (index == C0073c.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f149i = obtainStyledAttributes.getInt(index, this.f149i);
                } else if (index == C0073c.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    this.f150j = new C0071b();
                    this.f150j.mo269a(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f143c.mo203m(this.f149i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0143  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m123b() {
        /*
            r24 = this;
            r0 = r24
            android.support.constraint.b r1 = r0.f150j
            if (r1 == 0) goto L_0x0009
            r1.mo270a(r0)
        L_0x0009:
            int r1 = r24.getChildCount()
            android.support.constraint.a.a.e r2 = r0.f143c
            r2.mo216F()
            r3 = 0
        L_0x0013:
            if (r3 >= r1) goto L_0x02a2
            android.view.View r4 = r0.getChildAt(r3)
            android.support.constraint.a.a.d r11 = r0.m120a((android.view.View) r4)
            if (r11 != 0) goto L_0x0022
        L_0x001f:
            r2 = 0
            goto L_0x029e
        L_0x0022:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            r12 = r5
            android.support.constraint.ConstraintLayout$a r12 = (android.support.constraint.ConstraintLayout.C0044a) r12
            r11.mo130A()
            int r5 = r4.getVisibility()
            r11.mo167g(r5)
            r11.mo145a((java.lang.Object) r4)
            android.support.constraint.a.a.e r4 = r0.f143c
            r4.mo217b(r11)
            boolean r4 = r12.f166P
            if (r4 == 0) goto L_0x0043
            boolean r4 = r12.f165O
            if (r4 != 0) goto L_0x0048
        L_0x0043:
            java.util.ArrayList<android.support.constraint.a.a.d> r4 = r0.f142b
            r4.add(r11)
        L_0x0048:
            boolean r4 = r12.f168R
            r13 = -1
            if (r4 == 0) goto L_0x0069
            android.support.constraint.a.a.g r11 = (android.support.constraint.p005a.p006a.C0057g) r11
            int r4 = r12.f177a
            if (r4 == r13) goto L_0x0056
            r11.mo209m(r4)
        L_0x0056:
            int r4 = r12.f178b
            if (r4 == r13) goto L_0x005d
            r11.mo210n(r4)
        L_0x005d:
            float r4 = r12.f179c
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            r11.mo208e(r4)
            goto L_0x001f
        L_0x0069:
            int r4 = r12.f169S
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f170T
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f171U
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f172V
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f184h
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f185i
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f186j
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f187k
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f188l
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f162L
            if (r4 != r13) goto L_0x009d
            int r4 = r12.f163M
            if (r4 != r13) goto L_0x009d
            int r4 = r12.width
            if (r4 == r13) goto L_0x009d
            int r4 = r12.height
            if (r4 != r13) goto L_0x001f
        L_0x009d:
            int r4 = r12.f169S
            int r5 = r12.f170T
            int r6 = r12.f171U
            int r7 = r12.f172V
            int r8 = r12.f173W
            int r9 = r12.f174X
            float r10 = r12.f175Y
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 17
            if (r14 >= r15) goto L_0x00e1
            int r4 = r12.f180d
            int r5 = r12.f181e
            int r6 = r12.f182f
            int r7 = r12.f183g
            int r8 = r12.f193q
            int r9 = r12.f195s
            float r10 = r12.f199w
            if (r4 != r13) goto L_0x00ce
            if (r5 != r13) goto L_0x00ce
            int r14 = r12.f190n
            if (r14 == r13) goto L_0x00c9
            r4 = r14
            goto L_0x00ce
        L_0x00c9:
            int r14 = r12.f189m
            if (r14 == r13) goto L_0x00ce
            r5 = r14
        L_0x00ce:
            if (r6 != r13) goto L_0x00e1
            if (r7 != r13) goto L_0x00e1
            int r14 = r12.f191o
            if (r14 == r13) goto L_0x00d7
            goto L_0x00e2
        L_0x00d7:
            int r14 = r12.f192p
            if (r14 == r13) goto L_0x00e1
            r16 = r9
            r9 = r10
            r15 = r14
            r14 = r6
            goto L_0x00e6
        L_0x00e1:
            r14 = r6
        L_0x00e2:
            r15 = r7
            r16 = r9
            r9 = r10
        L_0x00e6:
            r10 = r8
            if (r4 == r13) goto L_0x00fa
            android.support.constraint.a.a.d r7 = r0.m119a((int) r4)
            if (r7 == 0) goto L_0x00f8
            android.support.constraint.a.a.b$c r8 = android.support.constraint.p005a.p006a.C0048b.C0051c.LEFT
            int r4 = r12.leftMargin
            r5 = r11
            r6 = r8
            r2 = r9
            r9 = r4
            goto L_0x010a
        L_0x00f8:
            r2 = r9
            goto L_0x010d
        L_0x00fa:
            r2 = r9
            if (r5 == r13) goto L_0x010d
            android.support.constraint.a.a.d r7 = r0.m119a((int) r5)
            if (r7 == 0) goto L_0x010d
            android.support.constraint.a.a.b$c r6 = android.support.constraint.p005a.p006a.C0048b.C0051c.LEFT
            android.support.constraint.a.a.b$c r8 = android.support.constraint.p005a.p006a.C0048b.C0051c.RIGHT
            int r9 = r12.leftMargin
            r5 = r11
        L_0x010a:
            r5.mo140a(r6, r7, r8, r9, r10)
        L_0x010d:
            if (r14 == r13) goto L_0x011d
            android.support.constraint.a.a.d r7 = r0.m119a((int) r14)
            if (r7 == 0) goto L_0x0130
            android.support.constraint.a.a.b$c r6 = android.support.constraint.p005a.p006a.C0048b.C0051c.RIGHT
            android.support.constraint.a.a.b$c r8 = android.support.constraint.p005a.p006a.C0048b.C0051c.LEFT
            int r9 = r12.rightMargin
            r5 = r11
            goto L_0x012b
        L_0x011d:
            if (r15 == r13) goto L_0x0130
            android.support.constraint.a.a.d r7 = r0.m119a((int) r15)
            if (r7 == 0) goto L_0x0130
            android.support.constraint.a.a.b$c r8 = android.support.constraint.p005a.p006a.C0048b.C0051c.RIGHT
            int r9 = r12.rightMargin
            r5 = r11
            r6 = r8
        L_0x012b:
            r10 = r16
            r5.mo140a(r6, r7, r8, r9, r10)
        L_0x0130:
            int r4 = r12.f184h
            if (r4 == r13) goto L_0x0143
            android.support.constraint.a.a.d r7 = r0.m119a((int) r4)
            if (r7 == 0) goto L_0x0159
            android.support.constraint.a.a.b$c r8 = android.support.constraint.p005a.p006a.C0048b.C0051c.TOP
            int r9 = r12.topMargin
            int r10 = r12.f194r
            r5 = r11
            r6 = r8
            goto L_0x0156
        L_0x0143:
            int r4 = r12.f185i
            if (r4 == r13) goto L_0x0159
            android.support.constraint.a.a.d r7 = r0.m119a((int) r4)
            if (r7 == 0) goto L_0x0159
            android.support.constraint.a.a.b$c r6 = android.support.constraint.p005a.p006a.C0048b.C0051c.TOP
            android.support.constraint.a.a.b$c r8 = android.support.constraint.p005a.p006a.C0048b.C0051c.BOTTOM
            int r9 = r12.topMargin
            int r10 = r12.f194r
            r5 = r11
        L_0x0156:
            r5.mo140a(r6, r7, r8, r9, r10)
        L_0x0159:
            int r4 = r12.f186j
            if (r4 == r13) goto L_0x016d
            android.support.constraint.a.a.d r7 = r0.m119a((int) r4)
            if (r7 == 0) goto L_0x0182
            android.support.constraint.a.a.b$c r6 = android.support.constraint.p005a.p006a.C0048b.C0051c.BOTTOM
            android.support.constraint.a.a.b$c r8 = android.support.constraint.p005a.p006a.C0048b.C0051c.TOP
            int r9 = r12.bottomMargin
            int r10 = r12.f196t
            r5 = r11
            goto L_0x017f
        L_0x016d:
            int r4 = r12.f187k
            if (r4 == r13) goto L_0x0182
            android.support.constraint.a.a.d r7 = r0.m119a((int) r4)
            if (r7 == 0) goto L_0x0182
            android.support.constraint.a.a.b$c r8 = android.support.constraint.p005a.p006a.C0048b.C0051c.BOTTOM
            int r9 = r12.bottomMargin
            int r10 = r12.f196t
            r5 = r11
            r6 = r8
        L_0x017f:
            r5.mo140a(r6, r7, r8, r9, r10)
        L_0x0182:
            int r4 = r12.f188l
            if (r4 == r13) goto L_0x01d6
            android.util.SparseArray<android.view.View> r5 = r0.f141a
            java.lang.Object r4 = r5.get(r4)
            android.view.View r4 = (android.view.View) r4
            int r5 = r12.f188l
            android.support.constraint.a.a.d r5 = r0.m119a((int) r5)
            if (r5 == 0) goto L_0x01d6
            if (r4 == 0) goto L_0x01d6
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            boolean r6 = r6 instanceof android.support.constraint.ConstraintLayout.C0044a
            if (r6 == 0) goto L_0x01d6
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.constraint.ConstraintLayout$a r4 = (android.support.constraint.ConstraintLayout.C0044a) r4
            r6 = 1
            r12.f167Q = r6
            r4.f167Q = r6
            android.support.constraint.a.a.b$c r4 = android.support.constraint.p005a.p006a.C0048b.C0051c.BASELINE
            android.support.constraint.a.a.b r17 = r11.mo133a((android.support.constraint.p005a.p006a.C0048b.C0051c) r4)
            android.support.constraint.a.a.b$c r4 = android.support.constraint.p005a.p006a.C0048b.C0051c.BASELINE
            android.support.constraint.a.a.b r18 = r5.mo133a((android.support.constraint.p005a.p006a.C0048b.C0051c) r4)
            r19 = 0
            r20 = -1
            android.support.constraint.a.a.b$b r21 = android.support.constraint.p005a.p006a.C0048b.C0050b.STRONG
            r22 = 0
            r23 = 1
            r17.mo118a(r18, r19, r20, r21, r22, r23)
            android.support.constraint.a.a.b$c r4 = android.support.constraint.p005a.p006a.C0048b.C0051c.TOP
            android.support.constraint.a.a.b r4 = r11.mo133a((android.support.constraint.p005a.p006a.C0048b.C0051c) r4)
            r4.mo128j()
            android.support.constraint.a.a.b$c r4 = android.support.constraint.p005a.p006a.C0048b.C0051c.BOTTOM
            android.support.constraint.a.a.b r4 = r11.mo133a((android.support.constraint.p005a.p006a.C0048b.C0051c) r4)
            r4.mo128j()
        L_0x01d6:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r5 < 0) goto L_0x01e4
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x01e4
            r11.mo135a((float) r2)
        L_0x01e4:
            float r2 = r12.f200x
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x01f1
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01f1
            r11.mo155c((float) r2)
        L_0x01f1:
            boolean r2 = r24.isInEditMode()
            if (r2 == 0) goto L_0x0206
            int r2 = r12.f162L
            if (r2 != r13) goto L_0x01ff
            int r2 = r12.f163M
            if (r2 == r13) goto L_0x0206
        L_0x01ff:
            int r2 = r12.f162L
            int r4 = r12.f163M
            r11.mo157c(r2, r4)
        L_0x0206:
            boolean r2 = r12.f165O
            if (r2 != 0) goto L_0x022f
            int r2 = r12.width
            if (r2 != r13) goto L_0x0228
            android.support.constraint.a.a.d$a r2 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_PARENT
            r11.mo141a((android.support.constraint.p005a.p006a.C0053d.C0054a) r2)
            android.support.constraint.a.a.b$c r2 = android.support.constraint.p005a.p006a.C0048b.C0051c.LEFT
            android.support.constraint.a.a.b r2 = r11.mo133a((android.support.constraint.p005a.p006a.C0048b.C0051c) r2)
            int r4 = r12.leftMargin
            r2.f218d = r4
            android.support.constraint.a.a.b$c r2 = android.support.constraint.p005a.p006a.C0048b.C0051c.RIGHT
            android.support.constraint.a.a.b r2 = r11.mo133a((android.support.constraint.p005a.p006a.C0048b.C0051c) r2)
            int r4 = r12.rightMargin
            r2.f218d = r4
            goto L_0x0239
        L_0x0228:
            android.support.constraint.a.a.d$a r2 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            r11.mo141a((android.support.constraint.p005a.p006a.C0053d.C0054a) r2)
            r2 = 0
            goto L_0x0236
        L_0x022f:
            android.support.constraint.a.a.d$a r2 = android.support.constraint.p005a.p006a.C0053d.C0054a.FIXED
            r11.mo141a((android.support.constraint.p005a.p006a.C0053d.C0054a) r2)
            int r2 = r12.width
        L_0x0236:
            r11.mo169h(r2)
        L_0x0239:
            boolean r2 = r12.f166P
            if (r2 != 0) goto L_0x0266
            int r2 = r12.height
            if (r2 != r13) goto L_0x025c
            android.support.constraint.a.a.d$a r2 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_PARENT
            r11.mo152b((android.support.constraint.p005a.p006a.C0053d.C0054a) r2)
            android.support.constraint.a.a.b$c r2 = android.support.constraint.p005a.p006a.C0048b.C0051c.TOP
            android.support.constraint.a.a.b r2 = r11.mo133a((android.support.constraint.p005a.p006a.C0048b.C0051c) r2)
            int r4 = r12.topMargin
            r2.f218d = r4
            android.support.constraint.a.a.b$c r2 = android.support.constraint.p005a.p006a.C0048b.C0051c.BOTTOM
            android.support.constraint.a.a.b r2 = r11.mo133a((android.support.constraint.p005a.p006a.C0048b.C0051c) r2)
            int r4 = r12.bottomMargin
            r2.f218d = r4
            r2 = 0
            goto L_0x0271
        L_0x025c:
            android.support.constraint.a.a.d$a r2 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            r11.mo152b((android.support.constraint.p005a.p006a.C0053d.C0054a) r2)
            r2 = 0
            r11.mo149b((int) r2)
            goto L_0x0271
        L_0x0266:
            r2 = 0
            android.support.constraint.a.a.d$a r4 = android.support.constraint.p005a.p006a.C0053d.C0054a.FIXED
            r11.mo152b((android.support.constraint.p005a.p006a.C0053d.C0054a) r4)
            int r4 = r12.height
            r11.mo149b((int) r4)
        L_0x0271:
            java.lang.String r4 = r12.f201y
            if (r4 == 0) goto L_0x0278
            r11.mo146a((java.lang.String) r4)
        L_0x0278:
            float r4 = r12.f152B
            r11.mo148b((float) r4)
            float r4 = r12.f153C
            r11.mo159d((float) r4)
            int r4 = r12.f154D
            r11.mo156c((int) r4)
            int r4 = r12.f155E
            r11.mo165f(r4)
            int r4 = r12.f156F
            int r5 = r12.f158H
            int r6 = r12.f160J
            r11.mo138a(r4, r5, r6)
            int r4 = r12.f157G
            int r5 = r12.f159I
            int r6 = r12.f161K
            r11.mo151b(r4, r5, r6)
        L_0x029e:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m123b():void");
    }

    /* renamed from: b */
    private void m124b(int i, int i2) {
        C0053d.C0054a aVar;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0053d.C0054a aVar2 = C0053d.C0054a.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                aVar = C0053d.C0054a.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                aVar = aVar2;
            } else {
                i3 = Math.min(this.f146f, size) - paddingLeft;
                aVar = aVar2;
            }
            i3 = 0;
        } else {
            i3 = size;
            aVar = C0053d.C0054a.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                aVar2 = C0053d.C0054a.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f147g, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            aVar2 = C0053d.C0054a.WRAP_CONTENT;
        }
        this.f143c.mo163e(0);
        this.f143c.mo160d(0);
        this.f143c.mo141a(aVar);
        this.f143c.mo169h(i3);
        this.f143c.mo152b(aVar2);
        this.f143c.mo149b(size2);
        this.f143c.mo163e((this.f144d - getPaddingLeft()) - getPaddingRight());
        this.f143c.mo160d((this.f145e - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: c */
    private void m125c() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f142b.clear();
            m123b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71a() {
        this.f143c.mo193E();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0044a;
    }

    /* access modifiers changed from: protected */
    public C0044a generateDefaultLayoutParams() {
        return new C0044a(-2, -2);
    }

    public C0044a generateLayoutParams(AttributeSet attributeSet) {
        return new C0044a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0044a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f147g;
    }

    public int getMaxWidth() {
        return this.f146f;
    }

    public int getMinHeight() {
        return this.f145e;
    }

    public int getMinWidth() {
        return this.f144d;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0044a aVar = (C0044a) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || aVar.f168R || isInEditMode) {
                C0053d dVar = aVar.f176Z;
                int h = dVar.mo168h();
                int i6 = dVar.mo170i();
                childAt.layout(h, i6, dVar.mo185t() + h, dVar.mo172j() + i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        View view;
        int baseline;
        int i4 = i;
        int i5 = i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f143c.mo175k(paddingLeft);
        this.f143c.mo177l(paddingTop);
        m124b(i, i2);
        int i6 = 0;
        if (this.f148h) {
            this.f148h = false;
            m125c();
        }
        m121a(i, i2);
        if (getChildCount() > 0) {
            mo71a();
        }
        int size = this.f142b.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size > 0) {
            boolean z = this.f143c.mo174k() == C0053d.C0054a.WRAP_CONTENT;
            boolean z2 = this.f143c.mo183r() == C0053d.C0054a.WRAP_CONTENT;
            boolean z3 = false;
            int i7 = 0;
            while (i6 < size) {
                C0053d dVar = this.f142b.get(i6);
                if ((dVar instanceof C0057g) || (view = (View) dVar.mo158d()) == null || view.getVisibility() == 8) {
                    i3 = size;
                } else {
                    C0044a aVar = (C0044a) view.getLayoutParams();
                    i3 = size;
                    view.measure(aVar.width == -2 ? ViewGroup.getChildMeasureSpec(i4, paddingRight, aVar.width) : View.MeasureSpec.makeMeasureSpec(dVar.mo185t(), 1073741824), aVar.height == -2 ? ViewGroup.getChildMeasureSpec(i5, paddingBottom, aVar.height) : View.MeasureSpec.makeMeasureSpec(dVar.mo172j(), 1073741824));
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth != dVar.mo185t()) {
                        dVar.mo169h(measuredWidth);
                        if (z && dVar.mo180o() > this.f143c.mo185t()) {
                            this.f143c.mo169h(Math.max(this.f144d, dVar.mo180o() + dVar.mo133a(C0048b.C0051c.RIGHT).mo121c()));
                        }
                        z3 = true;
                    }
                    if (measuredHeight != dVar.mo172j()) {
                        dVar.mo149b(measuredHeight);
                        if (z2 && dVar.mo154c() > this.f143c.mo172j()) {
                            this.f143c.mo149b(Math.max(this.f145e, dVar.mo154c() + dVar.mo133a(C0048b.C0051c.BOTTOM).mo121c()));
                        }
                        z3 = true;
                    }
                    if (!(!aVar.f167Q || (baseline = view.getBaseline()) == -1 || baseline == dVar.mo147b())) {
                        dVar.mo136a(baseline);
                        z3 = true;
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        i7 = ViewGroup.combineMeasuredStates(i7, view.getMeasuredState());
                    }
                }
                i6++;
                size = i3;
            }
            if (z3) {
                mo71a();
            }
            i6 = i7;
        }
        int t = this.f143c.mo185t() + paddingRight;
        int j = this.f143c.mo172j() + paddingBottom;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(t, i4, i6);
            int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(j, i5, i6 << 16);
            int min = Math.min(this.f146f, resolveSizeAndState) & 16777215;
            int min2 = Math.min(this.f147g, resolveSizeAndState2) & 16777215;
            if (this.f143c.mo196I()) {
                min |= 16777216;
            }
            if (this.f143c.mo195H()) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            return;
        }
        setMeasuredDimension(t, j);
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0053d a = m120a(view);
        if ((view instanceof Guideline) && !(a instanceof C0057g)) {
            C0044a aVar = (C0044a) view.getLayoutParams();
            aVar.f176Z = new C0057g();
            aVar.f168R = true;
            ((C0057g) aVar.f176Z).mo211o(aVar.f164N);
            C0053d dVar = aVar.f176Z;
        }
        this.f141a.put(view.getId(), view);
        this.f148h = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f141a.remove(view.getId());
        this.f143c.mo218c(m120a(view));
        this.f148h = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f148h = true;
    }

    public void setConstraintSet(C0071b bVar) {
        this.f150j = bVar;
    }

    public void setId(int i) {
        this.f141a.remove(getId());
        super.setId(i);
        this.f141a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f147g) {
            this.f147g = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f146f) {
            this.f146f = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f145e) {
            this.f145e = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f144d) {
            this.f144d = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f143c.mo203m(i);
    }
}
