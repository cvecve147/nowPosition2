package android.support.p011v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0480o;
import android.support.p007v4.view.C0481p;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.view.menu.C0679v;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1108f;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0796U, C0480o {

    /* renamed from: a */
    static final int[] f2646a = {C1103a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f2647A;

    /* renamed from: B */
    private final Runnable f2648B;

    /* renamed from: C */
    private final C0481p f2649C;

    /* renamed from: b */
    private int f2650b;

    /* renamed from: c */
    private int f2651c;

    /* renamed from: d */
    private ContentFrameLayout f2652d;

    /* renamed from: e */
    ActionBarContainer f2653e;

    /* renamed from: f */
    private C0798V f2654f;

    /* renamed from: g */
    private Drawable f2655g;

    /* renamed from: h */
    private boolean f2656h;

    /* renamed from: i */
    private boolean f2657i;

    /* renamed from: j */
    private boolean f2658j;

    /* renamed from: k */
    private boolean f2659k;

    /* renamed from: l */
    boolean f2660l;

    /* renamed from: m */
    private int f2661m;

    /* renamed from: n */
    private int f2662n;

    /* renamed from: o */
    private final Rect f2663o;

    /* renamed from: p */
    private final Rect f2664p;

    /* renamed from: q */
    private final Rect f2665q;

    /* renamed from: r */
    private final Rect f2666r;

    /* renamed from: s */
    private final Rect f2667s;

    /* renamed from: t */
    private final Rect f2668t;

    /* renamed from: u */
    private final Rect f2669u;

    /* renamed from: v */
    private C0688a f2670v;

    /* renamed from: w */
    private final int f2671w;

    /* renamed from: x */
    private OverScroller f2672x;

    /* renamed from: y */
    ViewPropertyAnimator f2673y;

    /* renamed from: z */
    final AnimatorListenerAdapter f2674z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0688a {
        /* renamed from: a */
        void mo2544a();

        /* renamed from: a */
        void mo2548a(boolean z);

        /* renamed from: b */
        void mo2549b();

        /* renamed from: c */
        void mo2550c();

        /* renamed from: d */
        void mo2551d();

        void onWindowVisibilityChanged(int i);
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C0689b extends ViewGroup.MarginLayoutParams {
        public C0689b(int i, int i2) {
            super(i, i2);
        }

        public C0689b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0689b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2651c = 0;
        this.f2663o = new Rect();
        this.f2664p = new Rect();
        this.f2665q = new Rect();
        this.f2666r = new Rect();
        this.f2667s = new Rect();
        this.f2668t = new Rect();
        this.f2669u = new Rect();
        this.f2671w = 600;
        this.f2674z = new C0825e(this);
        this.f2647A = new C0830f(this);
        this.f2648B = new C0833g(this);
        m3454a(context);
        this.f2649C = new C0481p(this);
    }

    /* renamed from: a */
    private C0798V m3453a(View view) {
        if (view instanceof C0798V) {
            return (C0798V) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m3454a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2646a);
        boolean z = false;
        this.f2650b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2655g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f2655g == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f2656h = z;
        this.f2672x = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m3455a(float f, float f2) {
        this.f2672x.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2672x.getFinalY() > this.f2653e.getHeight();
    }

    /* renamed from: a */
    private boolean m3456a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0689b bVar = (C0689b) view.getLayoutParams();
        if (!z || bVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            bVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && bVar.topMargin != (i3 = rect.top)) {
            bVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && bVar.rightMargin != (i2 = rect.right)) {
            bVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        bVar.bottomMargin = i;
        return true;
    }

    /* renamed from: k */
    private void m3457k() {
        mo3150h();
        this.f2648B.run();
    }

    /* renamed from: l */
    private void m3458l() {
        mo3150h();
        postDelayed(this.f2648B, 600);
    }

    /* renamed from: m */
    private void m3459m() {
        mo3150h();
        postDelayed(this.f2647A, 600);
    }

    /* renamed from: n */
    private void m3460n() {
        mo3150h();
        this.f2647A.run();
    }

    /* renamed from: a */
    public void mo3132a(int i) {
        mo3152j();
        if (i == 2) {
            this.f2654f.mo4395n();
        } else if (i == 5) {
            this.f2654f.mo4396o();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public void mo3133a(Menu menu, C0679v.C0680a aVar) {
        mo3152j();
        this.f2654f.mo4373a(menu, aVar);
    }

    /* renamed from: a */
    public boolean mo3134a() {
        mo3152j();
        return this.f2654f.mo4376a();
    }

    /* renamed from: b */
    public void mo3135b() {
        mo3152j();
        this.f2654f.mo4377b();
    }

    /* renamed from: c */
    public boolean mo3136c() {
        mo3152j();
        return this.f2654f.mo4381c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0689b;
    }

    /* renamed from: d */
    public boolean mo3138d() {
        mo3152j();
        return this.f2654f.mo4383d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2655g != null && !this.f2656h) {
            int bottom = this.f2653e.getVisibility() == 0 ? (int) (((float) this.f2653e.getBottom()) + this.f2653e.getTranslationY() + 0.5f) : 0;
            this.f2655g.setBounds(0, bottom, getWidth(), this.f2655g.getIntrinsicHeight() + bottom);
            this.f2655g.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo3140e() {
        mo3152j();
        return this.f2654f.mo4384e();
    }

    /* renamed from: f */
    public boolean mo3141f() {
        mo3152j();
        return this.f2654f.mo4385f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo3152j();
        int q = C0487v.m2301q(this) & 256;
        boolean a = m3456a(this.f2653e, rect, true, true, false, true);
        this.f2666r.set(rect);
        C0902ub.m5140a(this, this.f2666r, this.f2663o);
        if (!this.f2667s.equals(this.f2666r)) {
            this.f2667s.set(this.f2666r);
            a = true;
        }
        if (!this.f2664p.equals(this.f2663o)) {
            this.f2664p.set(this.f2663o);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public void mo3143g() {
        mo3152j();
        this.f2654f.mo4386g();
    }

    /* access modifiers changed from: protected */
    public C0689b generateDefaultLayoutParams() {
        return new C0689b(-1, -1);
    }

    public C0689b generateLayoutParams(AttributeSet attributeSet) {
        return new C0689b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0689b(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2653e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f2649C.mo1967a();
    }

    public CharSequence getTitle() {
        mo3152j();
        return this.f2654f.getTitle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3150h() {
        removeCallbacks(this.f2647A);
        removeCallbacks(this.f2648B);
        ViewPropertyAnimator viewPropertyAnimator = this.f2673y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public boolean mo3151i() {
        return this.f2657i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3152j() {
        if (this.f2652d == null) {
            this.f2652d = (ContentFrameLayout) findViewById(C1108f.action_bar_activity_content);
            this.f2653e = (ActionBarContainer) findViewById(C1108f.action_bar_container);
            this.f2654f = m3453a(findViewById(C1108f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3454a(getContext());
        C0487v.m2262C(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3150h();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0689b bVar = (C0689b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo3152j();
        measureChildWithMargins(this.f2653e, i, 0, i2, 0);
        C0689b bVar = (C0689b) this.f2653e.getLayoutParams();
        int max = Math.max(0, this.f2653e.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f2653e.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2653e.getMeasuredState());
        boolean z = (C0487v.m2301q(this) & 256) != 0;
        if (z) {
            i3 = this.f2650b;
            if (this.f2658j && this.f2653e.getTabContainer() != null) {
                i3 += this.f2650b;
            }
        } else {
            i3 = this.f2653e.getVisibility() != 8 ? this.f2653e.getMeasuredHeight() : 0;
        }
        this.f2665q.set(this.f2663o);
        this.f2668t.set(this.f2666r);
        Rect rect = (this.f2657i || z) ? this.f2668t : this.f2665q;
        rect.top += i3;
        rect.bottom += 0;
        m3456a(this.f2652d, this.f2665q, true, true, true, true);
        if (!this.f2669u.equals(this.f2668t)) {
            this.f2669u.set(this.f2668t);
            this.f2652d.mo3305a(this.f2668t);
        }
        measureChildWithMargins(this.f2652d, i, 0, i2, 0);
        C0689b bVar2 = (C0689b) this.f2652d.getLayoutParams();
        int max3 = Math.max(max, this.f2652d.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f2652d.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2652d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2659k || !z) {
            return false;
        }
        if (m3455a(f, f2)) {
            m3457k();
        } else {
            m3460n();
        }
        this.f2660l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f2661m += i2;
        setActionBarHideOffset(this.f2661m);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2649C.mo1970a(view, view2, i);
        this.f2661m = getActionBarHideOffset();
        mo3150h();
        C0688a aVar = this.f2670v;
        if (aVar != null) {
            aVar.mo2551d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2653e.getVisibility() != 0) {
            return false;
        }
        return this.f2659k;
    }

    public void onStopNestedScroll(View view) {
        if (this.f2659k && !this.f2660l) {
            if (this.f2661m <= this.f2653e.getHeight()) {
                m3459m();
            } else {
                m3458l();
            }
        }
        C0688a aVar = this.f2670v;
        if (aVar != null) {
            aVar.mo2549b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo3152j();
        int i2 = this.f2662n ^ i;
        this.f2662n = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0688a aVar = this.f2670v;
        if (aVar != null) {
            aVar.mo2548a(!z);
            if (z2 || !z) {
                this.f2670v.mo2544a();
            } else {
                this.f2670v.mo2550c();
            }
        }
        if ((i2 & 256) != 0 && this.f2670v != null) {
            C0487v.m2262C(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2651c = i;
        C0688a aVar = this.f2670v;
        if (aVar != null) {
            aVar.onWindowVisibilityChanged(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo3150h();
        this.f2653e.setTranslationY((float) (-Math.max(0, Math.min(i, this.f2653e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0688a aVar) {
        this.f2670v = aVar;
        if (getWindowToken() != null) {
            this.f2670v.onWindowVisibilityChanged(this.f2651c);
            int i = this.f2662n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0487v.m2262C(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2658j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2659k) {
            this.f2659k = z;
            if (!z) {
                mo3150h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo3152j();
        this.f2654f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo3152j();
        this.f2654f.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo3152j();
        this.f2654f.mo4378b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f2657i = z;
        this.f2656h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo3152j();
        this.f2654f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo3152j();
        this.f2654f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
