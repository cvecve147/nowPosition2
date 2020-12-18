package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p013b.p018b.p040i.p041a.C1108f;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    private boolean f2625a;

    /* renamed from: b */
    private View f2626b;

    /* renamed from: c */
    private View f2627c;

    /* renamed from: d */
    private View f2628d;

    /* renamed from: e */
    Drawable f2629e;

    /* renamed from: f */
    Drawable f2630f;

    /* renamed from: g */
    Drawable f2631g;

    /* renamed from: h */
    boolean f2632h;

    /* renamed from: i */
    boolean f2633i;

    /* renamed from: j */
    private int f2634j;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0487v.m2273a((View) this, Build.VERSION.SDK_INT >= 21 ? new C0819c(this) : new C0816b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.ActionBar);
        this.f2629e = obtainStyledAttributes.getDrawable(C1112j.ActionBar_background);
        this.f2630f = obtainStyledAttributes.getDrawable(C1112j.ActionBar_backgroundStacked);
        this.f2634j = obtainStyledAttributes.getDimensionPixelSize(C1112j.ActionBar_height, -1);
        if (getId() == C1108f.split_action_bar) {
            this.f2632h = true;
            this.f2631g = obtainStyledAttributes.getDrawable(C1112j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f2632h ? this.f2629e == null && this.f2630f == null : this.f2631g == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m3444a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m3445b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2629e;
        if (drawable != null && drawable.isStateful()) {
            this.f2629e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2630f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2630f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2631g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f2631g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f2626b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2629e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2630f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2631g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2627c = findViewById(C1108f.action_bar);
        this.f2628d = findViewById(C1108f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2625a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            android.view.View r6 = r5.f2626b
            r8 = 8
            r10 = 1
            r0 = 0
            if (r6 == 0) goto L_0x0013
            int r1 = r6.getVisibility()
            if (r1 == r8) goto L_0x0013
            r1 = r10
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r6 == 0) goto L_0x0035
            int r2 = r6.getVisibility()
            if (r2 == r8) goto L_0x0035
            int r8 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r6.getMeasuredHeight()
            int r3 = r8 - r3
            int r4 = r2.bottomMargin
            int r3 = r3 - r4
            int r2 = r2.bottomMargin
            int r8 = r8 - r2
            r6.layout(r7, r3, r9, r8)
        L_0x0035:
            boolean r7 = r5.f2632h
            if (r7 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r6 = r5.f2631g
            if (r6 == 0) goto L_0x004a
            int r7 = r5.getMeasuredWidth()
            int r8 = r5.getMeasuredHeight()
            r6.setBounds(r0, r0, r7, r8)
            goto L_0x00b8
        L_0x004a:
            r10 = r0
            goto L_0x00b8
        L_0x004c:
            android.graphics.drawable.Drawable r7 = r5.f2629e
            if (r7 == 0) goto L_0x009d
            android.view.View r7 = r5.f2627c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0076
            android.graphics.drawable.Drawable r7 = r5.f2629e
            android.view.View r8 = r5.f2627c
            int r8 = r8.getLeft()
            android.view.View r9 = r5.f2627c
            int r9 = r9.getTop()
            android.view.View r0 = r5.f2627c
            int r0 = r0.getRight()
            android.view.View r2 = r5.f2627c
        L_0x006e:
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto L_0x009c
        L_0x0076:
            android.view.View r7 = r5.f2628d
            if (r7 == 0) goto L_0x0097
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0097
            android.graphics.drawable.Drawable r7 = r5.f2629e
            android.view.View r8 = r5.f2628d
            int r8 = r8.getLeft()
            android.view.View r9 = r5.f2628d
            int r9 = r9.getTop()
            android.view.View r0 = r5.f2628d
            int r0 = r0.getRight()
            android.view.View r2 = r5.f2628d
            goto L_0x006e
        L_0x0097:
            android.graphics.drawable.Drawable r7 = r5.f2629e
            r7.setBounds(r0, r0, r0, r0)
        L_0x009c:
            r0 = r10
        L_0x009d:
            r5.f2633i = r1
            if (r1 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r7 = r5.f2630f
            if (r7 == 0) goto L_0x004a
            int r8 = r6.getLeft()
            int r9 = r6.getTop()
            int r0 = r6.getRight()
            int r6 = r6.getBottom()
            r7.setBounds(r8, r9, r0, r6)
        L_0x00b8:
            if (r10 == 0) goto L_0x00bd
            r5.invalidate()
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f2627c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f2634j
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f2627c
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f2626b
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f2627c
            boolean r0 = r3.m3445b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f2627c
        L_0x0042:
            int r0 = r3.m3444a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f2628d
            boolean r0 = r3.m3445b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f2628d
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f2626b
            int r1 = r3.m3444a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2629e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2629e);
        }
        this.f2629e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2627c;
            if (view != null) {
                this.f2629e.setBounds(view.getLeft(), this.f2627c.getTop(), this.f2627c.getRight(), this.f2627c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2632h ? !(this.f2629e == null && this.f2630f == null) : this.f2631g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2631g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2631g);
        }
        this.f2631g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2632h && (drawable2 = this.f2631g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2632h ? this.f2629e == null && this.f2630f == null : this.f2631g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2630f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2630f);
        }
        this.f2630f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2633i && (drawable2 = this.f2630f) != null) {
                drawable2.setBounds(this.f2626b.getLeft(), this.f2626b.getTop(), this.f2626b.getRight(), this.f2626b.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2632h ? !(this.f2629e == null && this.f2630f == null) : this.f2631g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0744Ra ra) {
        View view = this.f2626b;
        if (view != null) {
            removeView(view);
        }
        this.f2626b = ra;
        if (ra != null) {
            addView(ra);
            ViewGroup.LayoutParams layoutParams = ra.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            ra.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f2625a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2629e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2630f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f2631g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2629e && !this.f2632h) || (drawable == this.f2630f && this.f2633i) || ((drawable == this.f2631g && this.f2632h) || super.verifyDrawable(drawable));
    }
}
