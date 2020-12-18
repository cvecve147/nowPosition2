package android.support.p011v7.widget;

import android.content.Context;
import android.support.p007v4.view.C0429H;
import android.support.p007v4.view.C0487v;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1108f;
import p013b.p018b.p040i.p041a.C1109g;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C0811a {

    /* renamed from: i */
    private CharSequence f2635i;

    /* renamed from: j */
    private CharSequence f2636j;

    /* renamed from: k */
    private View f2637k;

    /* renamed from: l */
    private View f2638l;

    /* renamed from: m */
    private LinearLayout f2639m;

    /* renamed from: n */
    private TextView f2640n;

    /* renamed from: o */
    private TextView f2641o;

    /* renamed from: p */
    private int f2642p;

    /* renamed from: q */
    private int f2643q;

    /* renamed from: r */
    private boolean f2644r;

    /* renamed from: s */
    private int f2645s;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0829eb a = C0829eb.m4793a(context, attributeSet, C1112j.ActionMode, i, 0);
        C0487v.m2273a((View) this, a.mo4477b(C1112j.ActionMode_background));
        this.f2642p = a.mo4486g(C1112j.ActionMode_titleTextStyle, 0);
        this.f2643q = a.mo4486g(C1112j.ActionMode_subtitleTextStyle, 0);
        this.f3366e = a.mo4484f(C1112j.ActionMode_height, 0);
        this.f2645s = a.mo4486g(C1112j.ActionMode_closeItemLayout, C1109g.abc_action_mode_close_item_material);
        a.mo4474a();
    }

    /* renamed from: e */
    private void m3446e() {
        if (this.f2639m == null) {
            LayoutInflater.from(getContext()).inflate(C1109g.abc_action_bar_title_item, this);
            this.f2639m = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2640n = (TextView) this.f2639m.findViewById(C1108f.action_bar_title);
            this.f2641o = (TextView) this.f2639m.findViewById(C1108f.action_bar_subtitle);
            if (this.f2642p != 0) {
                this.f2640n.setTextAppearance(getContext(), this.f2642p);
            }
            if (this.f2643q != 0) {
                this.f2641o.setTextAppearance(getContext(), this.f2643q);
            }
        }
        this.f2640n.setText(this.f2635i);
        this.f2641o.setText(this.f2636j);
        boolean z = !TextUtils.isEmpty(this.f2635i);
        boolean z2 = !TextUtils.isEmpty(this.f2636j);
        int i = 0;
        this.f2641o.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f2639m;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f2639m.getParent() == null) {
            addView(this.f2639m);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0429H mo3107a(int i, long j) {
        return super.mo3107a(i, j);
    }

    /* renamed from: a */
    public void mo3108a() {
        if (this.f2637k == null) {
            mo3111c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.getParent() == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3109a(p013b.p018b.p040i.p050h.C1136b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f2637k
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f2645s
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f2637k = r0
        L_0x0015:
            android.view.View r0 = r3.f2637k
            r3.addView(r0)
            goto L_0x0022
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f2637k
            int r1 = p013b.p018b.p040i.p041a.C1108f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.d r1 = new android.support.v7.widget.d
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo2569c()
            android.support.v7.view.menu.l r4 = (android.support.p011v7.view.menu.C0662l) r4
            android.support.v7.widget.ActionMenuPresenter r0 = r3.f3365d
            if (r0 == 0) goto L_0x003f
            r0.mo3177d()
        L_0x003f:
            android.support.v7.widget.ActionMenuPresenter r0 = new android.support.v7.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f3365d = r0
            android.support.v7.widget.ActionMenuPresenter r0 = r3.f3365d
            r1 = 1
            r0.mo3176c((boolean) r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.ActionMenuPresenter r1 = r3.f3365d
            android.content.Context r2 = r3.f3363b
            r4.mo2857a((android.support.p011v7.view.menu.C0679v) r1, (android.content.Context) r2)
            android.support.v7.widget.ActionMenuPresenter r4 = r3.f3365d
            android.support.v7.view.menu.w r4 = r4.mo2811b((android.view.ViewGroup) r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.p011v7.widget.ActionMenuView) r4
            r3.f3364c = r4
            android.support.v7.widget.ActionMenuView r4 = r3.f3364c
            r1 = 0
            android.support.p007v4.view.C0487v.m2273a((android.view.View) r4, (android.graphics.drawable.Drawable) r1)
            android.support.v7.widget.ActionMenuView r4 = r3.f3364c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.ActionBarContextView.mo3109a(b.b.i.h.b):void");
    }

    /* renamed from: b */
    public boolean mo3110b() {
        return this.f2644r;
    }

    /* renamed from: c */
    public void mo3111c() {
        removeAllViews();
        this.f2638l = null;
        this.f3364c = null;
    }

    /* renamed from: d */
    public boolean mo3112d() {
        ActionMenuPresenter actionMenuPresenter = this.f3365d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo3183j();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2636j;
    }

    public CharSequence getTitle() {
        return this.f2635i;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f3365d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo3179f();
            this.f3365d.mo3180g();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2635i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0902ub.m5141a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2637k;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2637k.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = C0811a.m4759a(paddingRight, i6, a);
            i5 = C0811a.m4759a(a2 + mo4436a(this.f2637k, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f2639m;
        if (!(linearLayout == null || this.f2638l != null || linearLayout.getVisibility() == 8)) {
            i5 += mo4436a(this.f2639m, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        View view2 = this.f2638l;
        if (view2 != null) {
            mo4436a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3364c;
        if (actionMenuView != null) {
            mo4436a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f3366e;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f2637k;
            if (view != null) {
                int a = mo4435a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2637k.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f3364c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo4435a(this.f3364c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f2639m;
            if (linearLayout != null && this.f2638l == null) {
                if (this.f2644r) {
                    this.f2639m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f2639m.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f2639m.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo4435a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f2638l;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f2638l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f3366e <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f3366e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2638l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2638l = view;
        if (!(view == null || (linearLayout = this.f2639m) == null)) {
            removeView(linearLayout);
            this.f2639m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2636j = charSequence;
        m3446e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2635i = charSequence;
        m3446e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2644r) {
            requestLayout();
        }
        this.f2644r = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
