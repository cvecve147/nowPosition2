package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.widget.AppBarLayout;
import android.support.p007v4.view.C0434L;
import android.support.p007v4.view.C0482q;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0527J;
import android.support.p011v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import p013b.p018b.p022d.C0958d;
import p013b.p018b.p022d.C0962h;
import p013b.p018b.p022d.C0963i;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p028h.p035d.C1052a;
import p013b.p018b.p028h.p039h.C1095l;
import p013b.p018b.p040i.p041a.C1111i;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f563a;

    /* renamed from: b */
    private int f564b;

    /* renamed from: c */
    private Toolbar f565c;

    /* renamed from: d */
    private View f566d;

    /* renamed from: e */
    private View f567e;

    /* renamed from: f */
    private int f568f;

    /* renamed from: g */
    private int f569g;

    /* renamed from: h */
    private int f570h;

    /* renamed from: i */
    private int f571i;

    /* renamed from: j */
    private final Rect f572j;

    /* renamed from: k */
    final C0157m f573k;

    /* renamed from: l */
    private boolean f574l;

    /* renamed from: m */
    private boolean f575m;

    /* renamed from: n */
    private Drawable f576n;

    /* renamed from: o */
    Drawable f577o;

    /* renamed from: p */
    private int f578p;

    /* renamed from: q */
    private boolean f579q;

    /* renamed from: r */
    private ValueAnimator f580r;

    /* renamed from: s */
    private long f581s;

    /* renamed from: t */
    private int f582t;

    /* renamed from: u */
    private AppBarLayout.C0096b f583u;

    /* renamed from: v */
    int f584v;

    /* renamed from: w */
    C0434L f585w;

    /* renamed from: android.support.design.widget.CollapsingToolbarLayout$a */
    public static class C0101a extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f586a = 0;

        /* renamed from: b */
        float f587b = 0.5f;

        public C0101a(int i, int i2) {
            super(i, i2);
        }

        public C0101a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.CollapsingToolbarLayout_Layout);
            this.f586a = obtainStyledAttributes.getInt(C0963i.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            mo518a(obtainStyledAttributes.getFloat(C0963i.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public C0101a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo518a(float f) {
            this.f587b = f;
        }
    }

    /* renamed from: android.support.design.widget.CollapsingToolbarLayout$b */
    private class C0102b implements AppBarLayout.C0096b {
        C0102b() {
        }

        /* renamed from: a */
        public void mo431a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f584v = i;
            C0434L l = collapsingToolbarLayout.f585w;
            int e = l != null ? l.mo1772e() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                C0101a aVar = (C0101a) childAt.getLayoutParams();
                C0141U b = CollapsingToolbarLayout.m496b(childAt);
                int i4 = aVar.f586a;
                if (i4 == 1) {
                    i2 = C1052a.m5544a(-i, 0, CollapsingToolbarLayout.this.mo460a(childAt));
                } else if (i4 != 2) {
                } else {
                    i2 = Math.round(((float) (-i)) * aVar.f587b);
                }
                b.mo837b(i2);
            }
            CollapsingToolbarLayout.this.mo462a();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f577o != null && e > 0) {
                C0487v.m2261B(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.f573k.mo870b(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - C0487v.m2294j(CollapsingToolbarLayout.this)) - e)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f563a = true;
        this.f572j = new Rect();
        this.f582t = -1;
        C0128S.m655a(context);
        this.f573k = new C0157m(this);
        this.f573k.mo875b(C0145a.f820e);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.CollapsingToolbarLayout, i, C0962h.Widget_Design_CollapsingToolbar);
        this.f573k.mo880d(obtainStyledAttributes.getInt(C0963i.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f573k.mo871b(obtainStyledAttributes.getInt(C0963i.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0963i.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f571i = dimensionPixelSize;
        this.f570h = dimensionPixelSize;
        this.f569g = dimensionPixelSize;
        this.f568f = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(C0963i.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f568f = obtainStyledAttributes.getDimensionPixelSize(C0963i.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (obtainStyledAttributes.hasValue(C0963i.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f570h = obtainStyledAttributes.getDimensionPixelSize(C0963i.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (obtainStyledAttributes.hasValue(C0963i.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f569g = obtainStyledAttributes.getDimensionPixelSize(C0963i.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (obtainStyledAttributes.hasValue(C0963i.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f571i = obtainStyledAttributes.getDimensionPixelSize(C0963i.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f574l = obtainStyledAttributes.getBoolean(C0963i.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(obtainStyledAttributes.getText(C0963i.CollapsingToolbarLayout_title));
        this.f573k.mo877c(C0962h.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f573k.mo861a(C1111i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (obtainStyledAttributes.hasValue(C0963i.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.f573k.mo877c(obtainStyledAttributes.getResourceId(C0963i.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(C0963i.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.f573k.mo861a(obtainStyledAttributes.getResourceId(C0963i.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f582t = obtainStyledAttributes.getDimensionPixelSize(C0963i.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.f581s = (long) obtainStyledAttributes.getInt(C0963i.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(obtainStyledAttributes.getDrawable(C0963i.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(C0963i.CollapsingToolbarLayout_statusBarScrim));
        this.f564b = obtainStyledAttributes.getResourceId(C0963i.CollapsingToolbarLayout_toolbarId, -1);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C0487v.m2275a((View) this, (C0482q) new C0158n(this));
    }

    /* renamed from: a */
    private void m495a(int i) {
        m497b();
        ValueAnimator valueAnimator = this.f580r;
        if (valueAnimator == null) {
            this.f580r = new ValueAnimator();
            this.f580r.setDuration(this.f581s);
            this.f580r.setInterpolator(i > this.f578p ? C0145a.f818c : C0145a.f819d);
            this.f580r.addUpdateListener(new C0159o(this));
        } else if (valueAnimator.isRunning()) {
            this.f580r.cancel();
        }
        this.f580r.setIntValues(new int[]{this.f578p, i});
        this.f580r.start();
    }

    /* renamed from: b */
    static C0141U m496b(View view) {
        C0141U u = (C0141U) view.getTag(C0958d.view_offset_helper);
        if (u != null) {
            return u;
        }
        C0141U u2 = new C0141U(view);
        view.setTag(C0958d.view_offset_helper, u2);
        return u2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m497b() {
        /*
            r6 = this;
            boolean r0 = r6.f563a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f565c = r0
            r6.f566d = r0
            int r1 = r6.f564b
            r2 = -1
            if (r1 == r2) goto L_0x0021
            android.view.View r1 = r6.findViewById(r1)
            android.support.v7.widget.Toolbar r1 = (android.support.p011v7.widget.Toolbar) r1
            r6.f565c = r1
            android.support.v7.widget.Toolbar r1 = r6.f565c
            if (r1 == 0) goto L_0x0021
            android.view.View r1 = r6.m498c(r1)
            r6.f566d = r1
        L_0x0021:
            android.support.v7.widget.Toolbar r1 = r6.f565c
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x002b:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof android.support.p011v7.widget.Toolbar
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.support.v7.widget.Toolbar r0 = (android.support.p011v7.widget.Toolbar) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003c:
            r6.f565c = r0
        L_0x003e:
            r6.m499c()
            r6.f563a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingToolbarLayout.m497b():void");
    }

    /* renamed from: c */
    private View m498c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: c */
    private void m499c() {
        View view;
        if (!this.f574l && (view = this.f567e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f567e);
            }
        }
        if (this.f574l && this.f565c != null) {
            if (this.f567e == null) {
                this.f567e = new View(getContext());
            }
            if (this.f567e.getParent() == null) {
                this.f565c.addView(this.f567e, -1, -1);
            }
        }
    }

    /* renamed from: d */
    private static int m500d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: e */
    private boolean m501e(View view) {
        View view2 = this.f566d;
        if (view2 == null || view2 == this) {
            if (view == this.f565c) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo460a(View view) {
        return ((getHeight() - m496b(view).mo834a()) - view.getHeight()) - ((C0101a) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0434L mo461a(C0434L l) {
        C0434L l2 = C0487v.m2291g(this) ? l : null;
        if (!C1095l.m5678a(this.f585w, l2)) {
            this.f585w = l2;
            requestLayout();
        }
        return l.mo1767a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo462a() {
        if (this.f576n != null || this.f577o != null) {
            setScrimsShown(getHeight() + this.f584v < getScrimVisibleHeightTrigger());
        }
    }

    /* renamed from: a */
    public void mo463a(boolean z, boolean z2) {
        if (this.f579q != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m495a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f579q = z;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0101a;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m497b();
        if (this.f565c == null && (drawable = this.f576n) != null && this.f578p > 0) {
            drawable.mutate().setAlpha(this.f578p);
            this.f576n.draw(canvas);
        }
        if (this.f574l && this.f575m) {
            this.f573k.mo864a(canvas);
        }
        if (this.f577o != null && this.f578p > 0) {
            C0434L l = this.f585w;
            int e = l != null ? l.mo1772e() : 0;
            if (e > 0) {
                this.f577o.setBounds(0, -this.f584v, getWidth(), e - this.f584v);
                this.f577o.mutate().setAlpha(this.f578p);
                this.f577o.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f576n == null || this.f578p <= 0 || !m501e(view)) {
            z = false;
        } else {
            this.f576n.mutate().setAlpha(this.f578p);
            this.f576n.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f577o;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f576n;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C0157m mVar = this.f573k;
        if (mVar != null) {
            z |= mVar.mo868a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public C0101a generateDefaultLayoutParams() {
        return new C0101a(-1, -1);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0101a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0101a(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f573k.mo869b();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f573k.mo879d();
    }

    public Drawable getContentScrim() {
        return this.f576n;
    }

    public int getExpandedTitleGravity() {
        return this.f573k.mo881e();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f571i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f570h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f568f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f569g;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f573k.mo882f();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.f578p;
    }

    public long getScrimAnimationDuration() {
        return this.f581s;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f582t;
        if (i >= 0) {
            return i;
        }
        C0434L l = this.f585w;
        int e = l != null ? l.mo1772e() : 0;
        int j = C0487v.m2294j(this);
        return j > 0 ? Math.min((j * 2) + e, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f577o;
    }

    public CharSequence getTitle() {
        if (this.f574l) {
            return this.f573k.mo884h();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C0487v.m2280a((View) this, C0487v.m2291g((View) parent));
            if (this.f583u == null) {
                this.f583u = new C0102b();
            }
            ((AppBarLayout) parent).mo366a(this.f583u);
            C0487v.m2262C(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C0096b bVar = this.f583u;
        if (bVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo370b(bVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        C0434L l = this.f585w;
        if (l != null) {
            int e = l.mo1772e();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C0487v.m2291g(childAt) && childAt.getTop() < e) {
                    C0487v.m2283b(childAt, e);
                }
            }
        }
        if (this.f574l && (view = this.f567e) != null) {
            boolean z2 = true;
            this.f575m = C0487v.m2308x(view) && this.f567e.getVisibility() == 0;
            if (this.f575m) {
                if (C0487v.m2293i(this) != 1) {
                    z2 = false;
                }
                View view2 = this.f566d;
                if (view2 == null) {
                    view2 = this.f565c;
                }
                int a = mo460a(view2);
                C0527J.m2562a((ViewGroup) this, this.f567e, this.f572j);
                this.f573k.mo862a(this.f572j.left + (z2 ? this.f565c.getTitleMarginEnd() : this.f565c.getTitleMarginStart()), this.f572j.top + a + this.f565c.getTitleMarginTop(), this.f572j.right + (z2 ? this.f565c.getTitleMarginStart() : this.f565c.getTitleMarginEnd()), (this.f572j.bottom + a) - this.f565c.getTitleMarginBottom());
                this.f573k.mo872b(z2 ? this.f570h : this.f568f, this.f572j.top + this.f569g, (i3 - i) - (z2 ? this.f568f : this.f570h), (i4 - i2) - this.f571i);
                this.f573k.mo887k();
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m496b(getChildAt(i6)).mo838c();
        }
        if (this.f565c != null) {
            if (this.f574l && TextUtils.isEmpty(this.f573k.mo884h())) {
                this.f573k.mo867a(this.f565c.getTitle());
            }
            View view3 = this.f566d;
            if (view3 == null || view3 == this) {
                view3 = this.f565c;
            }
            setMinimumHeight(m500d(view3));
        }
        mo462a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m497b();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C0434L l = this.f585w;
        int e = l != null ? l.mo1772e() : 0;
        if (mode == 0 && e > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + e, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f576n;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f573k.mo871b(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f573k.mo861a(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f573k.mo863a(colorStateList);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f573k.mo865a(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f576n;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f576n = drawable3;
            Drawable drawable4 = this.f576n;
            if (drawable4 != null) {
                drawable4.setBounds(0, 0, getWidth(), getHeight());
                this.f576n.setCallback(this);
                this.f576n.setAlpha(this.f578p);
            }
            C0487v.m2261B(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C1006a.m5394c(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f573k.mo880d(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f571i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f570h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f568f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f569g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f573k.mo877c(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f573k.mo873b(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f573k.mo874b(typeface);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.f578p) {
            if (!(this.f576n == null || (toolbar = this.f565c) == null)) {
                C0487v.m2261B(toolbar);
            }
            this.f578p = i;
            C0487v.m2261B(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f581s = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f582t != i) {
            this.f582t = i;
            mo462a();
        }
    }

    public void setScrimsShown(boolean z) {
        mo463a(z, C0487v.m2309y(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f577o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f577o = drawable3;
            Drawable drawable4 = this.f577o;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f577o.setState(getDrawableState());
                }
                C1026a.m5453a(this.f577o, C0487v.m2293i(this));
                this.f577o.setVisible(getVisibility() == 0, false);
                this.f577o.setCallback(this);
                this.f577o.setAlpha(this.f578p);
            }
            C0487v.m2261B(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C1006a.m5394c(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f573k.mo867a(charSequence);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f574l) {
            this.f574l = z;
            m499c();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f577o;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f577o.setVisible(z, false);
        }
        Drawable drawable2 = this.f576n;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f576n.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f576n || drawable == this.f577o;
    }
}
