package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0466f;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.qa */
public class C0879qa extends ViewGroup {

    /* renamed from: a */
    private boolean f3609a;

    /* renamed from: b */
    private int f3610b;

    /* renamed from: c */
    private int f3611c;

    /* renamed from: d */
    private int f3612d;

    /* renamed from: e */
    private int f3613e;

    /* renamed from: f */
    private int f3614f;

    /* renamed from: g */
    private float f3615g;

    /* renamed from: h */
    private boolean f3616h;

    /* renamed from: i */
    private int[] f3617i;

    /* renamed from: j */
    private int[] f3618j;

    /* renamed from: k */
    private Drawable f3619k;

    /* renamed from: l */
    private int f3620l;

    /* renamed from: m */
    private int f3621m;

    /* renamed from: n */
    private int f3622n;

    /* renamed from: o */
    private int f3623o;

    /* renamed from: android.support.v7.widget.qa$a */
    public static class C0880a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f3624a;

        /* renamed from: b */
        public int f3625b;

        public C0880a(int i, int i2) {
            super(i, i2);
            this.f3625b = -1;
            this.f3624a = 0.0f;
        }

        public C0880a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3625b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.LinearLayoutCompat_Layout);
            this.f3624a = obtainStyledAttributes.getFloat(C1112j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f3625b = obtainStyledAttributes.getInt(C1112j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0880a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3625b = -1;
        }
    }

    public C0879qa(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0879qa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0879qa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3609a = true;
        this.f3610b = -1;
        this.f3611c = 0;
        this.f3613e = 8388659;
        C0829eb a = C0829eb.m4793a(context, attributeSet, C1112j.LinearLayoutCompat, i, 0);
        int d = a.mo4480d(C1112j.LinearLayoutCompat_android_orientation, -1);
        if (d >= 0) {
            setOrientation(d);
        }
        int d2 = a.mo4480d(C1112j.LinearLayoutCompat_android_gravity, -1);
        if (d2 >= 0) {
            setGravity(d2);
        }
        boolean a2 = a.mo4475a(C1112j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f3615g = a.mo4470a(C1112j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f3610b = a.mo4480d(C1112j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f3616h = a.mo4475a(C1112j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo4477b(C1112j.LinearLayoutCompat_divider));
        this.f3622n = a.mo4480d(C1112j.LinearLayoutCompat_showDividers, 0);
        this.f3623o = a.mo4478c(C1112j.LinearLayoutCompat_dividerPadding, 0);
        a.mo4474a();
    }

    /* renamed from: a */
    private void m5035a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private void m5036c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo4645a(i3);
            if (a.getVisibility() != 8) {
                C0880a aVar = (C0880a) a.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = a.getMeasuredWidth();
                    measureChildWithMargins(a, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m5037d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo4645a(i3);
            if (a.getVisibility() != 8) {
                C0880a aVar = (C0880a) a.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = a.getMeasuredHeight();
                    measureChildWithMargins(a, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4643a(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4644a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4645a(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03ac, code lost:
        if (r8 > 0) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03b7, code lost:
        if (r8 < 0) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b9, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ba, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r4), r2);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r2 = r23;
        r4 = r24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4646a(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f3614f = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.f3617i
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f3618j
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f3617i = r0
            int[] r0 = new int[r14]
            r7.f3618j = r0
        L_0x0026:
            int[] r15 = r7.f3617i
            int[] r6 = r7.f3618j
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f3609a
            boolean r3 = r7.f3616h
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = r18
            goto L_0x004e
        L_0x004c:
            r19 = r10
        L_0x004e:
            r20 = 0
            r1 = r10
            r14 = r1
            r21 = r14
            r22 = r21
            r23 = r22
            r24 = r23
            r26 = r24
            r28 = r26
            r27 = r18
            r0 = r20
        L_0x0062:
            r29 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0201
            android.view.View r6 = r7.mo4645a((int) r1)
            if (r6 != 0) goto L_0x007d
            int r5 = r7.f3614f
            int r6 = r7.mo4657c(r1)
            int r5 = r5 + r6
            r7.f3614f = r5
        L_0x0077:
            r33 = r3
            r37 = r4
            goto L_0x01f1
        L_0x007d:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x0089
            int r5 = r7.mo4644a((android.view.View) r6, (int) r1)
            int r1 = r1 + r5
            goto L_0x0077
        L_0x0089:
            boolean r5 = r7.mo4656b((int) r1)
            if (r5 == 0) goto L_0x0096
            int r5 = r7.f3614f
            int r10 = r7.f3620l
            int r5 = r5 + r10
            r7.f3614f = r5
        L_0x0096:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            android.support.v7.widget.qa$a r10 = (android.support.p011v7.widget.C0879qa.C0880a) r10
            float r5 = r10.f3624a
            float r32 = r0 + r5
            if (r12 != r2) goto L_0x00ea
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ea
            float r0 = r10.f3624a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            if (r19 == 0) goto L_0x00b8
            int r0 = r7.f3614f
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            goto L_0x00c4
        L_0x00b8:
            int r0 = r7.f3614f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
        L_0x00c4:
            r7.f3614f = r0
            if (r4 == 0) goto L_0x00db
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r31 = -2
            goto L_0x0164
        L_0x00db:
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r24 = r18
            r1 = 1073741824(0x40000000, float:2.0)
            r31 = -2
            goto L_0x0166
        L_0x00ea:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f9
            float r0 = r10.f3624a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fc
        L_0x00f9:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fc:
            int r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            int r0 = r7.f3614f
            r30 = r0
            goto L_0x0107
        L_0x0105:
            r30 = 0
        L_0x0107:
            r34 = 0
            r0 = r38
            r35 = r1
            r1 = r6
            r36 = r2
            r2 = r35
            r33 = r3
            r3 = r39
            r37 = r4
            r4 = r30
            r30 = r5
            r9 = -1
            r5 = r40
            r31 = r30
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = r6
            r6 = r34
            r0.mo4650a(r1, r2, r3, r4, r5, r6)
            r0 = r36
            if (r0 == r9) goto L_0x0130
            r10.width = r0
        L_0x0130:
            int r0 = r30.getMeasuredWidth()
            if (r19 == 0) goto L_0x0147
            int r1 = r7.f3614f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r30
            int r4 = r7.mo4651b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L_0x015c
        L_0x0147:
            r3 = r30
            int r1 = r7.f3614f
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo4651b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L_0x015c:
            r7.f3614f = r1
            if (r33 == 0) goto L_0x0164
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0164:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0166:
            if (r13 == r1) goto L_0x0172
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0172
            r0 = r18
            r28 = r0
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r26
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r37 == 0) goto L_0x01b2
            int r6 = r3.getBaseline()
            r9 = -1
            if (r6 == r9) goto L_0x01b2
            int r9 = r10.f3625b
            if (r9 >= 0) goto L_0x0196
            int r9 = r7.f3613e
        L_0x0196:
            r9 = r9 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r1 = r15[r9]
            int r1 = java.lang.Math.max(r1, r6)
            r15[r9] = r1
            r1 = r29[r9]
            int r6 = r4 - r6
            int r1 = java.lang.Math.max(r1, r6)
            r29[r9] = r1
        L_0x01b2:
            r1 = r21
            int r1 = java.lang.Math.max(r1, r4)
            if (r27 == 0) goto L_0x01c2
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01c2
            r6 = r18
            goto L_0x01c3
        L_0x01c2:
            r6 = 0
        L_0x01c3:
            float r9 = r10.f3624a
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01d4
            if (r0 == 0) goto L_0x01cc
            goto L_0x01cd
        L_0x01cc:
            r2 = r4
        L_0x01cd:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01e1
        L_0x01d4:
            r10 = r23
            if (r0 == 0) goto L_0x01d9
            r4 = r2
        L_0x01d9:
            r2 = r22
            int r22 = java.lang.Math.max(r2, r4)
            r23 = r10
        L_0x01e1:
            r10 = r35
            int r0 = r7.mo4644a((android.view.View) r3, (int) r10)
            int r0 = r0 + r10
            r21 = r1
            r26 = r5
            r27 = r6
            r1 = r0
            r0 = r32
        L_0x01f1:
            int r1 = r1 + 1
            r9 = r40
            r6 = r29
            r3 = r33
            r4 = r37
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0062
        L_0x0201:
            r33 = r3
            r37 = r4
            r1 = r21
            r2 = r22
            r10 = r23
            r6 = r26
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            int r3 = r7.f3614f
            if (r3 <= 0) goto L_0x0222
            boolean r3 = r7.mo4656b((int) r11)
            if (r3 == 0) goto L_0x0222
            int r3 = r7.f3614f
            int r4 = r7.f3620l
            int r3 = r3 + r4
            r7.f3614f = r3
        L_0x0222:
            r3 = r15[r18]
            r4 = -1
            if (r3 != r4) goto L_0x0238
            r3 = 0
            r5 = r15[r3]
            if (r5 != r4) goto L_0x0238
            r3 = r15[r17]
            if (r3 != r4) goto L_0x0238
            r3 = r15[r16]
            if (r3 == r4) goto L_0x0235
            goto L_0x0238
        L_0x0235:
            r23 = r6
            goto L_0x0269
        L_0x0238:
            r3 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r9 = r15[r18]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r9, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r29[r16]
            r5 = 0
            r9 = r29[r5]
            r5 = r29[r18]
            r23 = r6
            r6 = r29[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + r4
            int r1 = java.lang.Math.max(r1, r3)
        L_0x0269:
            if (r33 == 0) goto L_0x02cc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x0271
            if (r12 != 0) goto L_0x02cc
        L_0x0271:
            r3 = 0
            r7.f3614f = r3
            r3 = 0
        L_0x0275:
            if (r3 >= r11) goto L_0x02cc
            android.view.View r4 = r7.mo4645a((int) r3)
            if (r4 != 0) goto L_0x0287
            int r4 = r7.f3614f
            int r5 = r7.mo4657c(r3)
            int r4 = r4 + r5
            r7.f3614f = r4
            goto L_0x0294
        L_0x0287:
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0297
            int r4 = r7.mo4644a((android.view.View) r4, (int) r3)
            int r3 = r3 + r4
        L_0x0294:
            r22 = r1
            goto L_0x02c7
        L_0x0297:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.qa$a r5 = (android.support.p011v7.widget.C0879qa.C0880a) r5
            if (r19 == 0) goto L_0x02b0
            int r6 = r7.f3614f
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.mo4651b((android.view.View) r4)
            int r9 = r9 + r4
            int r6 = r6 + r9
            r7.f3614f = r6
            goto L_0x0294
        L_0x02b0:
            int r6 = r7.f3614f
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo4651b((android.view.View) r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f3614f = r1
        L_0x02c7:
            int r3 = r3 + 1
            r1 = r22
            goto L_0x0275
        L_0x02cc:
            r22 = r1
            int r1 = r7.f3614f
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.f3614f = r1
            int r1 = r7.f3614f
            int r3 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r7.f3614f
            int r3 = r3 - r4
            if (r24 != 0) goto L_0x033f
            if (r3 == 0) goto L_0x02fb
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02fb
            goto L_0x033f
        L_0x02fb:
            int r0 = java.lang.Math.max(r2, r10)
            if (r33 == 0) goto L_0x0337
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0337
            r2 = 0
        L_0x0306:
            if (r2 >= r11) goto L_0x0337
            android.view.View r3 = r7.mo4645a((int) r2)
            if (r3 == 0) goto L_0x0334
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0317
            goto L_0x0334
        L_0x0317:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.qa$a r5 = (android.support.p011v7.widget.C0879qa.C0880a) r5
            float r5 = r5.f3624a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x0334
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r9 = r3.getMeasuredHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            r3.measure(r6, r9)
        L_0x0334:
            int r2 = r2 + 1
            goto L_0x0306
        L_0x0337:
            r3 = r40
            r26 = r11
            r2 = r22
            goto L_0x04d9
        L_0x033f:
            float r5 = r7.f3615g
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0346
            r0 = r5
        L_0x0346:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r29[r16] = r5
            r29[r17] = r5
            r29[r18] = r5
            r29[r6] = r5
            r7.f3614f = r6
            r10 = r2
            r6 = r5
            r9 = r23
            r2 = r0
            r0 = 0
        L_0x0360:
            if (r0 >= r11) goto L_0x0480
            android.view.View r14 = r7.mo4645a((int) r0)
            if (r14 == 0) goto L_0x046f
            int r5 = r14.getVisibility()
            r4 = 8
            if (r5 != r4) goto L_0x0372
            goto L_0x046f
        L_0x0372:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            android.support.v7.widget.qa$a r5 = (android.support.p011v7.widget.C0879qa.C0880a) r5
            float r4 = r5.f3624a
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03d1
            float r8 = (float) r3
            float r8 = r8 * r4
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r4
            int r3 = r3 - r8
            int r4 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r4 = r4 + r23
            r23 = r2
            int r2 = r5.topMargin
            int r4 = r4 + r2
            int r2 = r5.bottomMargin
            int r4 = r4 + r2
            int r2 = r5.height
            r24 = r3
            r26 = r11
            r11 = -1
            r3 = r40
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r2)
            int r4 = r5.width
            if (r4 != 0) goto L_0x03af
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x03ac
            goto L_0x03b1
        L_0x03ac:
            if (r8 <= 0) goto L_0x03b9
            goto L_0x03ba
        L_0x03af:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x03b1:
            int r30 = r14.getMeasuredWidth()
            int r8 = r30 + r8
            if (r8 >= 0) goto L_0x03ba
        L_0x03b9:
            r8 = 0
        L_0x03ba:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
            int r2 = r14.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r23
            r4 = r24
            goto L_0x03d7
        L_0x03d1:
            r4 = r3
            r26 = r11
            r11 = -1
            r3 = r40
        L_0x03d7:
            if (r19 == 0) goto L_0x03f4
            int r8 = r7.f3614f
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo4651b((android.view.View) r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f3614f = r8
            r23 = r2
            goto L_0x040e
        L_0x03f4:
            int r8 = r7.f3614f
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r2
            int r2 = r5.leftMargin
            int r11 = r11 + r2
            int r2 = r5.rightMargin
            int r11 = r11 + r2
            int r2 = r7.mo4651b((android.view.View) r14)
            int r11 = r11 + r2
            int r2 = java.lang.Math.max(r8, r11)
            r7.f3614f = r2
        L_0x040e:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x041a
            int r2 = r5.height
            r8 = -1
            if (r2 != r8) goto L_0x041a
            r2 = r18
            goto L_0x041b
        L_0x041a:
            r2 = 0
        L_0x041b:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r2 == 0) goto L_0x042c
            goto L_0x042d
        L_0x042c:
            r8 = r11
        L_0x042d:
            int r2 = java.lang.Math.max(r10, r8)
            if (r27 == 0) goto L_0x043b
            int r8 = r5.height
            r10 = -1
            if (r8 != r10) goto L_0x043c
            r8 = r18
            goto L_0x043d
        L_0x043b:
            r10 = -1
        L_0x043c:
            r8 = 0
        L_0x043d:
            if (r37 == 0) goto L_0x0467
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x0467
            int r5 = r5.f3625b
            if (r5 >= 0) goto L_0x044b
            int r5 = r7.f3613e
        L_0x044b:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r10 = r15[r5]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r5] = r10
            r10 = r29[r5]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r29[r5] = r10
            goto L_0x0469
        L_0x0467:
            r24 = 4
        L_0x0469:
            r10 = r2
            r27 = r8
            r2 = r23
            goto L_0x0476
        L_0x046f:
            r4 = r3
            r26 = r11
            r24 = 4
            r3 = r40
        L_0x0476:
            int r0 = r0 + 1
            r8 = r39
            r3 = r4
            r11 = r26
            r5 = -1
            goto L_0x0360
        L_0x0480:
            r3 = r40
            r26 = r11
            int r0 = r7.f3614f
            int r2 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f3614f = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x04a7
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x04a7
            r0 = r15[r17]
            if (r0 != r2) goto L_0x04a7
            r0 = r15[r16]
            if (r0 == r2) goto L_0x04a5
            goto L_0x04a7
        L_0x04a5:
            r0 = r6
            goto L_0x04d5
        L_0x04a7:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r29[r16]
            r2 = r29[r2]
            r5 = r29[r18]
            r8 = r29[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
        L_0x04d5:
            r2 = r0
            r23 = r9
            r0 = r10
        L_0x04d9:
            if (r27 != 0) goto L_0x04e0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04e0
            goto L_0x04e1
        L_0x04e0:
            r0 = r2
        L_0x04e1:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r2 = r2 + r4
            int r0 = r0 + r2
            int r2 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r23 & r2
            r1 = r1 | r2
            int r2 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r28 == 0) goto L_0x050a
            r0 = r39
            r1 = r26
            r7.m5036c(r1, r0)
        L_0x050a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0879qa.mo4646a(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4647a(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = android.support.p011v7.widget.C0902ub.m5141a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f3613e
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f3609a
            int[] r13 = r6.f3617i
            int[] r14 = r6.f3618j
            int r1 = android.support.p007v4.view.C0487v.m2293i(r24)
            int r1 = android.support.p007v4.view.C0466f.m2170a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f3614f
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f3614f
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = r2
            r17 = r5
        L_0x0064:
            r3 = r2
        L_0x0065:
            if (r3 >= r10) goto L_0x014e
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo4645a((int) r2)
            if (r0 != 0) goto L_0x0080
            int r0 = r6.mo4657c(r2)
            int r1 = r1 + r0
            r21 = r5
            r22 = r7
            r19 = r10
            r20 = r11
            goto L_0x013f
        L_0x0080:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0135
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            android.support.v7.widget.qa$a r4 = (android.support.p011v7.widget.C0879qa.C0880a) r4
            if (r12 == 0) goto L_0x00a8
            r18 = r3
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00ac
            int r3 = r0.getBaseline()
            goto L_0x00ad
        L_0x00a8:
            r18 = r3
            r19 = r10
        L_0x00ac:
            r3 = -1
        L_0x00ad:
            int r10 = r4.f3625b
            if (r10 >= 0) goto L_0x00b2
            r10 = r11
        L_0x00b2:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00f1
            r11 = 48
            if (r10 == r11) goto L_0x00de
            r11 = 80
            if (r10 == r11) goto L_0x00c7
            r3 = r7
            r11 = -1
        L_0x00c4:
            r21 = 1
            goto L_0x00ff
        L_0x00c7:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00dc
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = 2
            r22 = r14[r3]
            int r22 = r22 - r21
            int r10 = r10 - r22
        L_0x00dc:
            r3 = r10
            goto L_0x00c4
        L_0x00de:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            if (r3 == r11) goto L_0x00ed
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r3
            int r10 = r10 + r22
            goto L_0x00ef
        L_0x00ed:
            r21 = 1
        L_0x00ef:
            r3 = r10
            goto L_0x00ff
        L_0x00f1:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00ff:
            boolean r10 = r6.mo4656b((int) r2)
            if (r10 == 0) goto L_0x0108
            int r10 = r6.f3620l
            int r1 = r1 + r10
        L_0x0108:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo4643a((android.view.View) r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m5035a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo4651b((android.view.View) r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo4644a((android.view.View) r0, (int) r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0141
        L_0x0135:
            r18 = r3
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
        L_0x013f:
            r23 = -1
        L_0x0141:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r5 = r21
            r7 = r22
            r15 = 2
            goto L_0x0065
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0879qa.mo4647a(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4648a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0902ub.m5141a(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View a2 = mo4645a(i4);
            if (!(a2 == null || a2.getVisibility() == 8 || !mo4656b(i4))) {
                C0880a aVar = (C0880a) a2.getLayoutParams();
                mo4655b(canvas, a ? a2.getRight() + aVar.rightMargin : (a2.getLeft() - aVar.leftMargin) - this.f3620l);
            }
        }
        if (mo4656b(virtualChildCount)) {
            View a3 = mo4645a(virtualChildCount - 1);
            if (a3 != null) {
                C0880a aVar2 = (C0880a) a3.getLayoutParams();
                if (a) {
                    i3 = a3.getLeft();
                    i2 = aVar2.leftMargin;
                } else {
                    i = a3.getRight() + aVar2.rightMargin;
                    mo4655b(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                mo4655b(canvas, i);
            } else {
                i3 = getWidth();
                i2 = getPaddingRight();
            }
            i = (i3 - i2) - this.f3620l;
            mo4655b(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4649a(Canvas canvas, int i) {
        this.f3619k.setBounds(getPaddingLeft() + this.f3623o, i, (getWidth() - getPaddingRight()) - this.f3623o, this.f3621m + i);
        this.f3619k.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4650a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4651b(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e1, code lost:
        if (r15 > 0) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ec, code lost:
        if (r15 < 0) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ee, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ef, code lost:
        r13.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0339  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4652b(int r35, int r36) {
        /*
            r34 = this;
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = 0
            r7.f3614f = r10
            int r11 = r34.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r35)
            int r13 = android.view.View.MeasureSpec.getMode(r36)
            int r14 = r7.f3610b
            boolean r15 = r7.f3616h
            r16 = 0
            r17 = 1
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r18 = r6
            r20 = r18
            r0 = r16
            r19 = r17
        L_0x002b:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x01a2
            android.view.View r4 = r7.mo4645a((int) r6)
            if (r4 != 0) goto L_0x0048
            int r4 = r7.f3614f
            int r10 = r7.mo4657c(r6)
            int r4 = r4 + r10
            r7.f3614f = r4
            r23 = r11
            r4 = r22
        L_0x0044:
            r22 = r13
            goto L_0x0196
        L_0x0048:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005c
            int r1 = r7.mo4644a((android.view.View) r4, (int) r6)
            int r6 = r6 + r1
            r23 = r11
            r4 = r22
            r1 = r24
            goto L_0x0044
        L_0x005c:
            boolean r1 = r7.mo4656b((int) r6)
            if (r1 == 0) goto L_0x0069
            int r1 = r7.f3614f
            int r10 = r7.f3621m
            int r1 = r1 + r10
            r7.f3614f = r1
        L_0x0069:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            android.support.v7.widget.qa$a r10 = (android.support.p011v7.widget.C0879qa.C0880a) r10
            float r1 = r10.f3624a
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a7
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a7
            float r0 = r10.f3624a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a7
            int r0 = r7.f3614f
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f3614f = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r23 = r11
            r18 = r17
            r8 = r24
            r30 = r26
            r11 = r6
            r32 = r22
            r22 = r13
            r13 = r32
            goto L_0x011b
        L_0x00a7:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b8
            float r0 = r10.f3624a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b8
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00ba
        L_0x00b8:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ba:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            int r0 = r7.f3614f
            r28 = r0
            goto L_0x00c7
        L_0x00c5:
            r28 = 0
        L_0x00c7:
            r0 = r34
            r8 = r24
            r23 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r29 = r2
            r30 = r26
            r2 = r6
            r9 = r3
            r3 = r35
            r24 = r4
            r32 = r23
            r23 = r11
            r11 = r32
            r33 = r22
            r22 = r13
            r13 = r33
            r4 = r27
            r31 = r5
            r5 = r36
            r11 = r6
            r6 = r28
            r0.mo4650a(r1, r2, r3, r4, r5, r6)
            r0 = r29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f8
            r10.height = r0
        L_0x00f8:
            int r0 = r24.getMeasuredHeight()
            int r1 = r7.f3614f
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r24
            int r4 = r7.mo4651b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f3614f = r1
            if (r15 == 0) goto L_0x011a
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x011b
        L_0x011a:
            r0 = r9
        L_0x011b:
            if (r14 < 0) goto L_0x0125
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0125
            int r1 = r7.f3614f
            r7.f3611c = r1
        L_0x0125:
            if (r11 >= r14) goto L_0x0136
            float r1 = r10.f3624a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x012e
            goto L_0x0136
        L_0x012e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0136:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0144
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x0144
            r1 = r17
            r20 = r1
            goto L_0x0145
        L_0x0144:
            r1 = 0
        L_0x0145:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r30
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0167
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0167
            r8 = r17
            goto L_0x0168
        L_0x0167:
            r8 = 0
        L_0x0168:
            float r9 = r10.f3624a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x017a
            if (r1 == 0) goto L_0x0171
            goto L_0x0172
        L_0x0171:
            r2 = r4
        L_0x0172:
            int r4 = java.lang.Math.max(r13, r2)
            r13 = r4
            r1 = r31
            goto L_0x0184
        L_0x017a:
            if (r1 == 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r2 = r4
        L_0x017e:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
        L_0x0184:
            int r2 = r7.mo4644a((android.view.View) r3, (int) r11)
            int r2 = r2 + r11
            r3 = r0
            r19 = r8
            r4 = r13
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x0196:
            int r6 = r6 + 1
            r8 = r35
            r9 = r36
            r13 = r22
            r11 = r23
            goto L_0x002b
        L_0x01a2:
            r8 = r1
            r9 = r3
            r1 = r5
            r23 = r11
            r5 = r2
            r32 = r22
            r22 = r13
            r13 = r32
            int r2 = r7.f3614f
            if (r2 <= 0) goto L_0x01c2
            r2 = r23
            boolean r3 = r7.mo4656b((int) r2)
            if (r3 == 0) goto L_0x01c4
            int r3 = r7.f3614f
            int r4 = r7.f3621m
            int r3 = r3 + r4
            r7.f3614f = r3
            goto L_0x01c4
        L_0x01c2:
            r2 = r23
        L_0x01c4:
            if (r15 == 0) goto L_0x0212
            r3 = r22
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01ce
            if (r3 != 0) goto L_0x0214
        L_0x01ce:
            r4 = 0
            r7.f3614f = r4
            r4 = 0
        L_0x01d2:
            if (r4 >= r2) goto L_0x0214
            android.view.View r6 = r7.mo4645a((int) r4)
            if (r6 != 0) goto L_0x01e4
            int r6 = r7.f3614f
            int r11 = r7.mo4657c(r4)
            int r6 = r6 + r11
        L_0x01e1:
            r7.f3614f = r6
            goto L_0x020d
        L_0x01e4:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01f0
            int r6 = r7.mo4644a((android.view.View) r6, (int) r4)
            int r4 = r4 + r6
            goto L_0x020d
        L_0x01f0:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            android.support.v7.widget.qa$a r11 = (android.support.p011v7.widget.C0879qa.C0880a) r11
            int r14 = r7.f3614f
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo4651b((android.view.View) r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L_0x01e1
        L_0x020d:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01d2
        L_0x0212:
            r3 = r22
        L_0x0214:
            int r4 = r7.f3614f
            int r6 = r34.getPaddingTop()
            int r10 = r34.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f3614f = r4
            int r4 = r7.f3614f
            int r6 = r34.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r36
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f3614f
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0285
            if (r9 == 0) goto L_0x0244
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0244
            goto L_0x0285
        L_0x0244:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0280
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0280
            r1 = 0
        L_0x024f:
            if (r1 >= r2) goto L_0x0280
            android.view.View r3 = r7.mo4645a((int) r1)
            if (r3 == 0) goto L_0x027d
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0260
            goto L_0x027d
        L_0x0260:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            android.support.v7.widget.qa$a r9 = (android.support.p011v7.widget.C0879qa.C0880a) r9
            float r9 = r9.f3624a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x027d
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x027d:
            int r1 = r1 + 1
            goto L_0x024f
        L_0x0280:
            r11 = r35
            r1 = r8
            goto L_0x0370
        L_0x0285:
            float r10 = r7.f3615g
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x028c
            r0 = r10
        L_0x028c:
            r10 = 0
            r7.f3614f = r10
            r11 = r0
            r0 = r10
            r32 = r8
            r8 = r1
            r1 = r32
        L_0x0296:
            if (r0 >= r2) goto L_0x035f
            android.view.View r13 = r7.mo4645a((int) r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02aa
            r21 = r11
            r11 = r35
            goto L_0x0358
        L_0x02aa:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v7.widget.qa$a r14 = (android.support.p011v7.widget.C0879qa.C0880a) r14
            float r10 = r14.f3624a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0301
            float r15 = (float) r9
            float r15 = r15 * r10
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r10
            int r9 = r9 - r15
            int r10 = r34.getPaddingLeft()
            int r18 = r34.getPaddingRight()
            int r10 = r10 + r18
            r18 = r9
            int r9 = r14.leftMargin
            int r10 = r10 + r9
            int r9 = r14.rightMargin
            int r10 = r10 + r9
            int r9 = r14.width
            r21 = r11
            r11 = r35
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r9)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02e4
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02e1
            goto L_0x02e6
        L_0x02e1:
            if (r15 <= 0) goto L_0x02ee
            goto L_0x02ef
        L_0x02e4:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02e6:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02ef
        L_0x02ee:
            r15 = 0
        L_0x02ef:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
            int r9 = r13.getMeasuredState()
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r9)
            goto L_0x0308
        L_0x0301:
            r10 = r11
            r11 = r35
            r18 = r9
            r21 = r10
        L_0x0308:
            int r9 = r14.leftMargin
            int r10 = r14.rightMargin
            int r9 = r9 + r10
            int r10 = r13.getMeasuredWidth()
            int r10 = r10 + r9
            int r5 = java.lang.Math.max(r5, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x0324
            int r15 = r14.width
            r23 = r1
            r1 = -1
            if (r15 != r1) goto L_0x0327
            r15 = r17
            goto L_0x0328
        L_0x0324:
            r23 = r1
            r1 = -1
        L_0x0327:
            r15 = 0
        L_0x0328:
            if (r15 == 0) goto L_0x032b
            goto L_0x032c
        L_0x032b:
            r9 = r10
        L_0x032c:
            int r8 = java.lang.Math.max(r8, r9)
            if (r19 == 0) goto L_0x0339
            int r9 = r14.width
            if (r9 != r1) goto L_0x0339
            r9 = r17
            goto L_0x033a
        L_0x0339:
            r9 = 0
        L_0x033a:
            int r10 = r7.f3614f
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo4651b((android.view.View) r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f3614f = r1
            r19 = r9
            r9 = r18
            r1 = r23
        L_0x0358:
            int r0 = r0 + 1
            r11 = r21
            r10 = 0
            goto L_0x0296
        L_0x035f:
            r11 = r35
            int r0 = r7.f3614f
            int r3 = r34.getPaddingTop()
            int r9 = r34.getPaddingBottom()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r7.f3614f = r0
            r0 = r8
        L_0x0370:
            if (r19 != 0) goto L_0x0377
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0377
            goto L_0x0378
        L_0x0377:
            r0 = r5
        L_0x0378:
            int r3 = r34.getPaddingLeft()
            int r5 = r34.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r34.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0396
            r7.m5037d(r2, r6)
        L_0x0396:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0879qa.mo4652b(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4653b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.f3613e;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f3614f : getPaddingTop() + (((i4 - i2) - this.f3614f) / 2);
        int i12 = 0;
        while (i12 < virtualChildCount) {
            View a = mo4645a(i12);
            if (a == null) {
                paddingTop += mo4657c(i12);
            } else if (a.getVisibility() != 8) {
                int measuredWidth = a.getMeasuredWidth();
                int measuredHeight = a.getMeasuredHeight();
                C0880a aVar = (C0880a) a.getLayoutParams();
                int i13 = aVar.f3625b;
                if (i13 < 0) {
                    i13 = i11;
                }
                int a2 = C0466f.m2170a(i13, C0487v.m2293i(this)) & 7;
                if (a2 == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + aVar.leftMargin;
                    i7 = i6 - aVar.rightMargin;
                } else if (a2 != 5) {
                    i7 = aVar.leftMargin + paddingLeft;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i7 = i6 - aVar.rightMargin;
                }
                int i14 = i7;
                if (mo4656b(i12)) {
                    paddingTop += this.f3621m;
                }
                int i15 = paddingTop + aVar.topMargin;
                m5035a(a, i14, i15 + mo4643a(a), measuredWidth, measuredHeight);
                i12 += mo4644a(a, i12);
                paddingTop = i15 + measuredHeight + aVar.bottomMargin + mo4651b(a);
                i5 = 1;
                i12 += i5;
            }
            i5 = 1;
            i12 += i5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4654b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View a = mo4645a(i);
            if (!(a == null || a.getVisibility() == 8 || !mo4656b(i))) {
                mo4649a(canvas, (a.getTop() - ((C0880a) a.getLayoutParams()).topMargin) - this.f3621m);
            }
        }
        if (mo4656b(virtualChildCount)) {
            View a2 = mo4645a(virtualChildCount - 1);
            mo4649a(canvas, a2 == null ? (getHeight() - getPaddingBottom()) - this.f3621m : a2.getBottom() + ((C0880a) a2.getLayoutParams()).bottomMargin);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4655b(Canvas canvas, int i) {
        this.f3619k.setBounds(i, getPaddingTop() + this.f3623o, this.f3620l + i, (getHeight() - getPaddingBottom()) - this.f3623o);
        this.f3619k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4656b(int i) {
        if (i == 0) {
            return (this.f3622n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f3622n & 4) != 0;
        }
        if ((this.f3622n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo4657c(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0880a;
    }

    /* access modifiers changed from: protected */
    public C0880a generateDefaultLayoutParams() {
        int i = this.f3612d;
        if (i == 0) {
            return new C0880a(-2, -2);
        }
        if (i == 1) {
            return new C0880a(-1, -2);
        }
        return null;
    }

    public C0880a generateLayoutParams(AttributeSet attributeSet) {
        return new C0880a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0880a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0880a(layoutParams);
    }

    public int getBaseline() {
        int i;
        if (this.f3610b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f3610b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f3611c;
                if (this.f3612d == 1 && (i = this.f3613e & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3614f) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3614f;
                    }
                }
                return i3 + ((C0880a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f3610b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3610b;
    }

    public Drawable getDividerDrawable() {
        return this.f3619k;
    }

    public int getDividerPadding() {
        return this.f3623o;
    }

    public int getDividerWidth() {
        return this.f3620l;
    }

    public int getGravity() {
        return this.f3613e;
    }

    public int getOrientation() {
        return this.f3612d;
    }

    public int getShowDividers() {
        return this.f3622n;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3615g;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f3619k != null) {
            if (this.f3612d == 1) {
                mo4654b(canvas);
            } else {
                mo4648a(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0879qa.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0879qa.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f3612d == 1) {
            mo4653b(i, i2, i3, i4);
        } else {
            mo4647a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f3612d == 1) {
            mo4652b(i, i2);
        } else {
            mo4646a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f3609a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f3610b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f3619k) {
            this.f3619k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f3620l = drawable.getIntrinsicWidth();
                this.f3621m = drawable.getIntrinsicHeight();
            } else {
                this.f3620l = 0;
                this.f3621m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f3623o = i;
    }

    public void setGravity(int i) {
        if (this.f3613e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3613e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f3613e;
        if ((8388615 & i3) != i2) {
            this.f3613e = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f3616h = z;
    }

    public void setOrientation(int i) {
        if (this.f3612d != i) {
            this.f3612d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f3622n) {
            requestLayout();
        }
        this.f3622n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f3613e;
        if ((i3 & 112) != i2) {
            this.f3613e = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f3615g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
