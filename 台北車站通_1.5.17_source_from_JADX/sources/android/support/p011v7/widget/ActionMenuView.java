package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p011v7.view.menu.ActionMenuItemView;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.view.menu.C0681w;
import android.support.p011v7.widget.C0879qa;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends C0879qa implements C0662l.C0664b, C0681w {

    /* renamed from: A */
    C0700e f2705A;

    /* renamed from: p */
    private C0662l f2706p;

    /* renamed from: q */
    private Context f2707q;

    /* renamed from: r */
    private int f2708r;

    /* renamed from: s */
    private boolean f2709s;

    /* renamed from: t */
    private ActionMenuPresenter f2710t;

    /* renamed from: u */
    private C0679v.C0680a f2711u;

    /* renamed from: v */
    C0662l.C0663a f2712v;

    /* renamed from: w */
    private boolean f2713w;

    /* renamed from: x */
    private int f2714x;

    /* renamed from: y */
    private int f2715y;

    /* renamed from: z */
    private int f2716z;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0696a {
        /* renamed from: b */
        boolean mo2672b();

        /* renamed from: c */
        boolean mo2673c();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0697b implements C0679v.C0680a {
        C0697b() {
        }

        /* renamed from: a */
        public void mo2484a(C0662l lVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo2485a(C0662l lVar) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0698c extends C0879qa.C0880a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f2717c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f2718d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f2719e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f2720f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f2721g;

        /* renamed from: h */
        boolean f2722h;

        public C0698c(int i, int i2) {
            super(i, i2);
            this.f2717c = false;
        }

        public C0698c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0698c(C0698c cVar) {
            super(cVar);
            this.f2717c = cVar.f2717c;
        }

        public C0698c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C0699d implements C0662l.C0663a {
        C0699d() {
        }

        /* renamed from: a */
        public void mo362a(C0662l lVar) {
            C0662l.C0663a aVar = ActionMenuView.this.f2712v;
            if (aVar != null) {
                aVar.mo362a(lVar);
            }
        }

        /* renamed from: a */
        public boolean mo363a(C0662l lVar, MenuItem menuItem) {
            C0700e eVar = ActionMenuView.this.f2705A;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface C0700e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2715y = (int) (56.0f * f);
        this.f2716z = (int) (f * 4.0f);
        this.f2707q = context;
        this.f2708r = 0;
    }

    /* renamed from: a */
    static int m3516a(View view, int i, int i2, int i3, int i4) {
        C0698c cVar = (C0698c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo2674d();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f2717c || !z2) {
            z = false;
        }
        cVar.f2720f = z;
        cVar.f2718d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x023a A[LOOP:5: B:133:0x023a->B:137:0x0258, LOOP_START, PHI: r13 
      PHI: (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:132:0x0238, B:137:0x0258] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0260  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3517e(int r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            int r2 = android.view.View.MeasureSpec.getSize(r30)
            int r3 = android.view.View.MeasureSpec.getSize(r31)
            int r4 = r29.getPaddingLeft()
            int r5 = r29.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r29.getPaddingTop()
            int r6 = r29.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r31
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.f2715y
            int r7 = r2 / r4
            int r8 = r2 % r4
            r9 = 0
            if (r7 != 0) goto L_0x0035
            r0.setMeasuredDimension(r2, r9)
            return
        L_0x0035:
            int r8 = r8 / r7
            int r4 = r4 + r8
            int r8 = r29.getChildCount()
            r14 = r7
            r7 = r9
            r10 = r7
            r12 = r10
            r13 = r12
            r15 = r13
            r16 = r15
            r17 = 0
        L_0x0045:
            if (r7 >= r8) goto L_0x00c5
            android.view.View r11 = r0.getChildAt(r7)
            int r9 = r11.getVisibility()
            r19 = r3
            r3 = 8
            if (r9 != r3) goto L_0x0057
            goto L_0x00bf
        L_0x0057:
            boolean r3 = r11 instanceof android.support.p011v7.view.menu.ActionMenuItemView
            int r13 = r13 + 1
            if (r3 == 0) goto L_0x0066
            int r9 = r0.f2716z
            r20 = r13
            r13 = 0
            r11.setPadding(r9, r13, r9, r13)
            goto L_0x0069
        L_0x0066:
            r20 = r13
            r13 = 0
        L_0x0069:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r9 = (android.support.p011v7.widget.ActionMenuView.C0698c) r9
            r9.f2722h = r13
            r9.f2719e = r13
            r9.f2718d = r13
            r9.f2720f = r13
            r9.leftMargin = r13
            r9.rightMargin = r13
            if (r3 == 0) goto L_0x0088
            r3 = r11
            android.support.v7.view.menu.ActionMenuItemView r3 = (android.support.p011v7.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.mo2674d()
            if (r3 == 0) goto L_0x0088
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            r9.f2721g = r3
            boolean r3 = r9.f2717c
            if (r3 == 0) goto L_0x0091
            r3 = 1
            goto L_0x0092
        L_0x0091:
            r3 = r14
        L_0x0092:
            int r3 = m3516a(r11, r4, r3, r6, r5)
            int r13 = java.lang.Math.max(r15, r3)
            boolean r15 = r9.f2720f
            if (r15 == 0) goto L_0x00a0
            int r16 = r16 + 1
        L_0x00a0:
            boolean r9 = r9.f2717c
            if (r9 == 0) goto L_0x00a5
            r12 = 1
        L_0x00a5:
            int r14 = r14 - r3
            int r9 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r9)
            r9 = 1
            if (r3 != r9) goto L_0x00bb
            int r3 = r9 << r7
            r11 = r10
            long r9 = (long) r3
            long r9 = r17 | r9
            r17 = r9
            r10 = r11
            goto L_0x00bc
        L_0x00bb:
            r11 = r10
        L_0x00bc:
            r15 = r13
            r13 = r20
        L_0x00bf:
            int r7 = r7 + 1
            r3 = r19
            r9 = 0
            goto L_0x0045
        L_0x00c5:
            r19 = r3
            r3 = 2
            if (r12 == 0) goto L_0x00ce
            if (r13 != r3) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            r20 = 1
            if (r16 <= 0) goto L_0x0170
            if (r14 <= 0) goto L_0x0170
            r9 = 2147483647(0x7fffffff, float:NaN)
            r3 = r9
            r9 = 0
            r11 = 0
            r22 = 0
        L_0x00de:
            if (r9 >= r8) goto L_0x010f
            android.view.View r24 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r24 = r24.getLayoutParams()
            r25 = r7
            r7 = r24
            android.support.v7.widget.ActionMenuView$c r7 = (android.support.p011v7.widget.ActionMenuView.C0698c) r7
            r24 = r10
            boolean r10 = r7.f2720f
            if (r10 != 0) goto L_0x00f5
            goto L_0x0108
        L_0x00f5:
            int r7 = r7.f2718d
            if (r7 >= r3) goto L_0x0100
            long r10 = r20 << r9
            r3 = r7
            r22 = r10
            r11 = 1
            goto L_0x0108
        L_0x0100:
            if (r7 != r3) goto L_0x0108
            long r26 = r20 << r9
            long r22 = r22 | r26
            int r11 = r11 + 1
        L_0x0108:
            int r9 = r9 + 1
            r10 = r24
            r7 = r25
            goto L_0x00de
        L_0x010f:
            r25 = r7
            r24 = r10
            long r17 = r17 | r22
            if (r11 <= r14) goto L_0x011b
            r11 = r1
            r26 = r2
            goto L_0x0177
        L_0x011b:
            int r3 = r3 + 1
            r7 = 0
        L_0x011e:
            if (r7 >= r8) goto L_0x016a
            android.view.View r9 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r10 = (android.support.p011v7.widget.ActionMenuView.C0698c) r10
            r26 = r2
            r11 = 1
            int r2 = r11 << r7
            r11 = r1
            long r1 = (long) r2
            long r20 = r22 & r1
            r27 = 0
            int r20 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r20 != 0) goto L_0x0142
            int r9 = r10.f2718d
            if (r9 != r3) goto L_0x013f
            long r17 = r17 | r1
        L_0x013f:
            r20 = r3
            goto L_0x0162
        L_0x0142:
            if (r5 == 0) goto L_0x0156
            boolean r1 = r10.f2721g
            if (r1 == 0) goto L_0x0156
            r1 = 1
            if (r14 != r1) goto L_0x0156
            int r2 = r0.f2716z
            int r1 = r2 + r4
            r20 = r3
            r3 = 0
            r9.setPadding(r1, r3, r2, r3)
            goto L_0x0158
        L_0x0156:
            r20 = r3
        L_0x0158:
            int r1 = r10.f2718d
            r2 = 1
            int r1 = r1 + r2
            r10.f2718d = r1
            r10.f2722h = r2
            int r14 = r14 + -1
        L_0x0162:
            int r7 = r7 + 1
            r1 = r11
            r3 = r20
            r2 = r26
            goto L_0x011e
        L_0x016a:
            r10 = r24
            r3 = 2
            r7 = 1
            goto L_0x00d0
        L_0x0170:
            r11 = r1
            r26 = r2
            r25 = r7
            r24 = r10
        L_0x0177:
            if (r12 != 0) goto L_0x017e
            r1 = 1
            if (r13 != r1) goto L_0x017f
            r2 = r1
            goto L_0x0180
        L_0x017e:
            r1 = 1
        L_0x017f:
            r2 = 0
        L_0x0180:
            if (r14 <= 0) goto L_0x0235
            r9 = 0
            int r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0235
            int r13 = r13 - r1
            if (r14 < r13) goto L_0x018f
            if (r2 != 0) goto L_0x018f
            if (r15 <= r1) goto L_0x0235
        L_0x018f:
            int r1 = java.lang.Long.bitCount(r17)
            float r1 = (float) r1
            if (r2 != 0) goto L_0x01d0
            long r2 = r17 & r20
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L_0x01b1
            r13 = 0
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p011v7.widget.ActionMenuView.C0698c) r2
            boolean r2 = r2.f2721g
            if (r2 != 0) goto L_0x01b2
            float r1 = r1 - r3
            goto L_0x01b2
        L_0x01b1:
            r13 = 0
        L_0x01b2:
            int r2 = r8 + -1
            r5 = 1
            int r7 = r5 << r2
            long r9 = (long) r7
            long r9 = r17 & r9
            r15 = 0
            int r5 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x01d1
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p011v7.widget.ActionMenuView.C0698c) r2
            boolean r2 = r2.f2721g
            if (r2 != 0) goto L_0x01d1
            float r1 = r1 - r3
            goto L_0x01d1
        L_0x01d0:
            r13 = 0
        L_0x01d1:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x01db
            int r14 = r14 * r4
            float r2 = (float) r14
            float r2 = r2 / r1
            int r9 = (int) r2
            goto L_0x01dc
        L_0x01db:
            r9 = r13
        L_0x01dc:
            r1 = r13
        L_0x01dd:
            if (r1 >= r8) goto L_0x0236
            r2 = 1
            int r3 = r2 << r1
            long r2 = (long) r3
            long r2 = r17 & r2
            r14 = 0
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x01ee
            r2 = 1
            r5 = 2
            goto L_0x0232
        L_0x01ee:
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.p011v7.widget.ActionMenuView.C0698c) r3
            boolean r2 = r2 instanceof android.support.p011v7.view.menu.ActionMenuItemView
            if (r2 == 0) goto L_0x0212
            r3.f2719e = r9
            r2 = 1
            r3.f2722h = r2
            if (r1 != 0) goto L_0x020d
            boolean r2 = r3.f2721g
            if (r2 != 0) goto L_0x020d
            int r2 = -r9
            r5 = 2
            int r2 = r2 / r5
            r3.leftMargin = r2
            goto L_0x020e
        L_0x020d:
            r5 = 2
        L_0x020e:
            r2 = 1
            r25 = 1
            goto L_0x0232
        L_0x0212:
            r5 = 2
            boolean r2 = r3.f2717c
            if (r2 == 0) goto L_0x0223
            r3.f2719e = r9
            r2 = 1
            r3.f2722h = r2
            int r7 = -r9
            int r7 = r7 / r5
            r3.rightMargin = r7
            r25 = r2
            goto L_0x0232
        L_0x0223:
            r2 = 1
            if (r1 == 0) goto L_0x022a
            int r7 = r9 / 2
            r3.leftMargin = r7
        L_0x022a:
            int r7 = r8 + -1
            if (r1 == r7) goto L_0x0232
            int r7 = r9 / 2
            r3.rightMargin = r7
        L_0x0232:
            int r1 = r1 + 1
            goto L_0x01dd
        L_0x0235:
            r13 = 0
        L_0x0236:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r25 == 0) goto L_0x025b
        L_0x023a:
            if (r13 >= r8) goto L_0x025b
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.p011v7.widget.ActionMenuView.C0698c) r3
            boolean r5 = r3.f2722h
            if (r5 != 0) goto L_0x024b
            goto L_0x0258
        L_0x024b:
            int r5 = r3.f2718d
            int r5 = r5 * r4
            int r3 = r3.f2719e
            int r5 = r5 + r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r2.measure(r3, r6)
        L_0x0258:
            int r13 = r13 + 1
            goto L_0x023a
        L_0x025b:
            if (r11 == r1) goto L_0x0260
            r1 = r24
            goto L_0x0262
        L_0x0260:
            r1 = r19
        L_0x0262:
            r2 = r26
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.ActionMenuView.m3517e(int, int):void");
    }

    /* renamed from: a */
    public void mo289a(C0662l lVar) {
        this.f2706p = lVar;
    }

    /* renamed from: a */
    public void mo3189a(C0679v.C0680a aVar, C0662l.C0663a aVar2) {
        this.f2711u = aVar;
        this.f2712v = aVar2;
    }

    /* renamed from: a */
    public boolean mo2736a(C0668p pVar) {
        return this.f2706p.mo2861a((MenuItem) pVar, 0);
    }

    /* renamed from: b */
    public void mo3190b() {
        ActionMenuPresenter actionMenuPresenter = this.f2710t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo3177d();
        }
    }

    /* renamed from: c */
    public C0698c mo3191c() {
        C0698c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f2717c = true;
        return generateDefaultLayoutParams;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0698c);
    }

    /* renamed from: d */
    public boolean mo3193d() {
        ActionMenuPresenter actionMenuPresenter = this.f2710t;
        return actionMenuPresenter != null && actionMenuPresenter.mo3179f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo3194d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0696a)) {
            z = false | ((C0696a) childAt).mo2672b();
        }
        return (i <= 0 || !(childAt2 instanceof C0696a)) ? z : z | ((C0696a) childAt2).mo2673c();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo3196e() {
        ActionMenuPresenter actionMenuPresenter = this.f2710t;
        return actionMenuPresenter != null && actionMenuPresenter.mo3181h();
    }

    /* renamed from: f */
    public boolean mo3197f() {
        ActionMenuPresenter actionMenuPresenter = this.f2710t;
        return actionMenuPresenter != null && actionMenuPresenter.mo3182i();
    }

    /* renamed from: g */
    public boolean mo3198g() {
        return this.f2709s;
    }

    /* access modifiers changed from: protected */
    public C0698c generateDefaultLayoutParams() {
        C0698c cVar = new C0698c(-2, -2);
        cVar.f3625b = 16;
        return cVar;
    }

    public C0698c generateLayoutParams(AttributeSet attributeSet) {
        return new C0698c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0698c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0698c cVar = layoutParams instanceof C0698c ? new C0698c((C0698c) layoutParams) : new C0698c(layoutParams);
        if (cVar.f3625b <= 0) {
            cVar.f3625b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.f2706p == null) {
            Context context = getContext();
            this.f2706p = new C0662l(context);
            this.f2706p.mo2708a((C0662l.C0663a) new C0699d());
            this.f2710t = new ActionMenuPresenter(context);
            this.f2710t.mo3176c(true);
            ActionMenuPresenter actionMenuPresenter = this.f2710t;
            C0679v.C0680a aVar = this.f2711u;
            if (aVar == null) {
                aVar = new C0697b();
            }
            actionMenuPresenter.mo2695a(aVar);
            this.f2706p.mo2857a((C0679v) this.f2710t, this.f2707q);
            this.f2710t.mo3174a(this);
        }
        return this.f2706p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2710t.mo3178e();
    }

    public int getPopupTheme() {
        return this.f2708r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public C0662l mo3206h() {
        return this.f2706p;
    }

    /* renamed from: i */
    public boolean mo3207i() {
        ActionMenuPresenter actionMenuPresenter = this.f2710t;
        return actionMenuPresenter != null && actionMenuPresenter.mo3183j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f2710t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo321a(false);
            if (this.f2710t.mo3182i()) {
                this.f2710t.mo3179f();
                this.f2710t.mo3183j();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3190b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f2713w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0902ub.m5141a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0698c cVar = (C0698c) childAt.getLayoutParams();
                if (cVar.f2717c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo3194d(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean d = mo3194d(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0698c cVar2 = (C0698c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f2717c) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            C0698c cVar3 = (C0698c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f2717c) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
            i6++;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0662l lVar;
        boolean z = this.f2713w;
        this.f2713w = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f2713w) {
            this.f2714x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f2713w || (lVar = this.f2706p) == null || size == this.f2714x)) {
            this.f2714x = size;
            lVar.mo353b(true);
        }
        int childCount = getChildCount();
        if (!this.f2713w || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0698c cVar = (C0698c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m3517e(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2710t.mo3175b(z);
    }

    public void setOnMenuItemClickListener(C0700e eVar) {
        this.f2705A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2710t.mo3173a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f2709s = z;
    }

    public void setPopupTheme(int i) {
        if (this.f2708r != i) {
            this.f2708r = i;
            if (i == 0) {
                this.f2707q = getContext();
            } else {
                this.f2707q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f2710t = actionMenuPresenter;
        this.f2710t.mo3174a(this);
    }
}
