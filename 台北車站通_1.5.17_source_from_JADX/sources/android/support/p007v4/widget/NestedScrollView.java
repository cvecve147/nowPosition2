package android.support.p007v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.C0476k;
import android.support.p007v4.view.C0478m;
import android.support.p007v4.view.C0480o;
import android.support.p007v4.view.C0481p;
import android.support.p007v4.view.C0485t;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.view.p009a.C0446b;
import android.support.p007v4.view.p009a.C0451d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C0480o, C0476k, C0485t {

    /* renamed from: a */
    private static final C0528a f1908a = new C0528a();

    /* renamed from: b */
    private static final int[] f1909b = {16843130};

    /* renamed from: A */
    private float f1910A;

    /* renamed from: B */
    private C0529b f1911B;

    /* renamed from: c */
    private long f1912c;

    /* renamed from: d */
    private final Rect f1913d;

    /* renamed from: e */
    private OverScroller f1914e;

    /* renamed from: f */
    private EdgeEffect f1915f;

    /* renamed from: g */
    private EdgeEffect f1916g;

    /* renamed from: h */
    private int f1917h;

    /* renamed from: i */
    private boolean f1918i;

    /* renamed from: j */
    private boolean f1919j;

    /* renamed from: k */
    private View f1920k;

    /* renamed from: l */
    private boolean f1921l;

    /* renamed from: m */
    private VelocityTracker f1922m;

    /* renamed from: n */
    private boolean f1923n;

    /* renamed from: o */
    private boolean f1924o;

    /* renamed from: p */
    private int f1925p;

    /* renamed from: q */
    private int f1926q;

    /* renamed from: r */
    private int f1927r;

    /* renamed from: s */
    private int f1928s;

    /* renamed from: t */
    private final int[] f1929t;

    /* renamed from: u */
    private final int[] f1930u;

    /* renamed from: v */
    private int f1931v;

    /* renamed from: w */
    private int f1932w;

    /* renamed from: x */
    private SavedState f1933x;

    /* renamed from: y */
    private final C0481p f1934y;

    /* renamed from: z */
    private final C0478m f1935z;

    /* renamed from: android.support.v4.widget.NestedScrollView$SavedState */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0564r();

        /* renamed from: a */
        public int f1936a;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1936a = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1936a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1936a);
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C0528a extends C0459c {
        C0528a() {
        }

        /* renamed from: a */
        public void mo309a(View view, C0446b bVar) {
            int scrollRange;
            super.mo309a(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.mo1857a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.mo1890j(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.mo1854a(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.mo1854a((int) SVGParser.ENTITY_WATCH_BUFFER_SIZE);
                }
            }
        }

        /* renamed from: a */
        public boolean mo1844a(View view, int i, Bundle bundle) {
            if (super.mo1844a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2173b(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2173b(0, max);
                return true;
            }
        }

        /* renamed from: b */
        public void mo832b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo832b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0451d.m2141a(accessibilityEvent, nestedScrollView.getScrollX());
            C0451d.m2142b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C0529b {
        /* renamed from: a */
        void mo2225a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1913d = new Rect();
        this.f1918i = true;
        this.f1919j = false;
        this.f1920k = null;
        this.f1921l = false;
        this.f1924o = true;
        this.f1928s = -1;
        this.f1929t = new int[2];
        this.f1930u = new int[2];
        m2579e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1909b, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1934y = new C0481p(this);
        this.f1935z = new C0478m(this);
        setNestedScrollingEnabled(true);
        C0487v.m2274a((View) this, (C0459c) f1908a);
    }

    /* renamed from: a */
    private static int m2565a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    private View m2566a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        boolean z2 = false;
        View view = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m2567a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1928s) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1917h = (int) motionEvent.getY(i);
            this.f1928s = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1922m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m2568a() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
    }

    /* renamed from: a */
    private boolean m2569a(Rect rect, boolean z) {
        int a = mo2161a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo2162a(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m2570a(View view) {
        return !m2571a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m2571a(View view, int i, int i2) {
        view.getDrawingRect(this.f1913d);
        offsetDescendantRectToMyCoords(view, this.f1913d);
        return this.f1913d.bottom + i >= getScrollY() && this.f1913d.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m2572a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m2572a((View) parent, view2);
    }

    /* renamed from: b */
    private void m2573b() {
        this.f1921l = false;
        m2581g();
        mo2191f(0);
        EdgeEffect edgeEffect = this.f1915f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1916g.onRelease();
        }
    }

    /* renamed from: b */
    private void m2574b(View view) {
        view.getDrawingRect(this.f1913d);
        offsetDescendantRectToMyCoords(view, this.f1913d);
        int a = mo2161a(this.f1913d);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    private boolean m2575b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m2566a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2582g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    private void m2576c() {
        if (getOverScrollMode() == 2) {
            this.f1915f = null;
            this.f1916g = null;
        } else if (this.f1915f == null) {
            Context context = getContext();
            this.f1915f = new EdgeEffect(context);
            this.f1916g = new EdgeEffect(context);
        }
    }

    /* renamed from: d */
    private void m2577d() {
        VelocityTracker velocityTracker = this.f1922m;
        if (velocityTracker == null) {
            this.f1922m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: d */
    private boolean m2578d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m2579e() {
        this.f1914e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1925p = viewConfiguration.getScaledTouchSlop();
        this.f1926q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1927r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: f */
    private void m2580f() {
        if (this.f1922m == null) {
            this.f1922m = VelocityTracker.obtain();
        }
    }

    /* renamed from: g */
    private void m2581g() {
        VelocityTracker velocityTracker = this.f1922m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1922m = null;
        }
    }

    /* renamed from: g */
    private void m2582g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1924o) {
            mo2162a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1910A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1910A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1910A;
    }

    /* renamed from: h */
    private void m2583h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            mo2172b(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2161a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: a */
    public final void mo2162a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1912c > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f1914e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, max)) - scrollY);
                C0487v.m2261B(this);
            } else {
                if (!this.f1914e.isFinished()) {
                    this.f1914e.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f1912c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    public boolean mo2163a(int i) {
        int bottom;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2571a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom())) < maxScrollAmount) {
                maxScrollAmount = bottom;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2582g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1913d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1913d);
            m2582g(mo2161a(this.f1913d));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m2570a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2164a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = r5
            goto L_0x0014
        L_0x0013:
            r2 = r4
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = r5
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = r4
            goto L_0x002b
        L_0x002a:
            r2 = r5
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r5
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = r4
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = r4
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = r5
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = r4
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
            r1 = r5
            goto L_0x0060
        L_0x005a:
            if (r6 >= r8) goto L_0x005f
            r1 = r5
            r6 = r8
            goto L_0x0060
        L_0x005f:
            r1 = r4
        L_0x0060:
            if (r1 == 0) goto L_0x007f
            boolean r3 = r12.mo2183d(r5)
            if (r3 != 0) goto L_0x007f
            android.widget.OverScroller r3 = r0.f1914e
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007f:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0086
            if (r1 == 0) goto L_0x0087
        L_0x0086:
            r4 = r5
        L_0x0087:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.widget.NestedScrollView.mo2164a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean mo2165a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1935z.mo1960a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean mo2166a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1935z.mo1962a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean mo2167a(KeyEvent keyEvent) {
        this.f1913d.setEmpty();
        int i = 130;
        if (!m2568a()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? mo2163a(33) : mo2174c(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? mo2163a(130) : mo2174c(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            mo2190e(i);
            return false;
        }
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public void mo2172b(int i) {
        if (getChildCount() > 0) {
            mo2175c(2, 1);
            this.f1914e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1932w = getScrollY();
            C0487v.m2261B(this);
        }
    }

    /* renamed from: b */
    public final void mo2173b(int i, int i2) {
        mo2162a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: c */
    public boolean mo2174c(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1913d;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f1913d.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            Rect rect2 = this.f1913d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1913d;
        return m2575b(i, rect3.top, rect3.bottom);
    }

    /* renamed from: c */
    public boolean mo2175c(int i, int i2) {
        return this.f1935z.mo1958a(i, i2);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1914e.computeScrollOffset()) {
            this.f1914e.getCurrX();
            int currY = this.f1914e.getCurrY();
            int i = currY - this.f1932w;
            if (mo2166a(0, i, this.f1930u, (int[]) null, 1)) {
                i -= this.f1930u[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                mo2164a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!mo2165a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        m2576c();
                        if (currY <= 0 && i3 > 0) {
                            edgeEffect = this.f1915f;
                        } else if (currY >= scrollRange && i3 < scrollRange) {
                            edgeEffect = this.f1916g;
                        }
                        edgeEffect.onAbsorb((int) this.f1914e.getCurrVelocity());
                    }
                }
            }
            this.f1932w = currY;
            C0487v.m2261B(this);
            return;
        }
        if (mo2183d(1)) {
            mo2191f(1);
        }
        this.f1932w = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public boolean mo2183d(int i) {
        return this.f1935z.mo1957a(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2167a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1935z.mo1956a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1935z.mo1955a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1935z.mo1961a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1935z.mo1959a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1915f != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1915f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1915f.setSize(width, height);
                if (this.f1915f.draw(canvas)) {
                    C0487v.m2261B(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1916g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1916g.setSize(width2, height2);
                if (this.f1916g.draw(canvas)) {
                    C0487v.m2261B(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo2190e(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1913d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f1913d.top + height > childAt.getBottom()) {
                    this.f1913d.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f1913d.top = getScrollY() - height;
            Rect rect = this.f1913d;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        Rect rect2 = this.f1913d;
        int i2 = rect2.top;
        rect2.bottom = height + i2;
        return m2575b(i, i2, rect2.bottom);
    }

    /* renamed from: f */
    public void mo2191f(int i) {
        this.f1935z.mo1966c(i);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1934y.mo1967a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.f1935z.mo1954a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1935z.mo1963b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1919j = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1921l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    verticalScrollFactorCompat = 0;
                } else if (verticalScrollFactorCompat > scrollRange) {
                    verticalScrollFactorCompat = scrollRange;
                }
                if (verticalScrollFactorCompat != scrollY) {
                    super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1921l) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1928s;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1917h) > this.f1925p && (2 & getNestedScrollAxes()) == 0) {
                                this.f1921l = true;
                                this.f1917h = y;
                                m2580f();
                                this.f1922m.addMovement(motionEvent);
                                this.f1931v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m2567a(motionEvent);
                    }
                }
            }
            this.f1921l = false;
            this.f1928s = -1;
            m2581g();
            if (this.f1914e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0487v.m2261B(this);
            }
            mo2191f(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m2578d((int) motionEvent.getX(), y2)) {
                this.f1921l = false;
                m2581g();
            } else {
                this.f1917h = y2;
                this.f1928s = motionEvent.getPointerId(0);
                m2577d();
                this.f1922m.addMovement(motionEvent);
                this.f1914e.computeScrollOffset();
                this.f1921l = !this.f1914e.isFinished();
                mo2175c(2, 0);
            }
        }
        return this.f1921l;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1918i = false;
        View view = this.f1920k;
        if (view != null && m2572a(view, (View) this)) {
            m2574b(this.f1920k);
        }
        this.f1920k = null;
        if (!this.f1919j) {
            if (this.f1933x != null) {
                scrollTo(getScrollX(), this.f1933x.f1936a);
                this.f1933x = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1919j = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1923n && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m2583h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, (int[]) null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1934y.mo1970a(view, view2, i);
        startNestedScroll(2);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m2570a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1933x = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1936a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0529b bVar = this.f1911B;
        if (bVar != null) {
            bVar.mo2225a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2571a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1913d);
            offsetDescendantRectToMyCoords(findFocus, this.f1913d);
            m2582g(mo2161a(this.f1913d));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1934y.mo1968a(view);
        stopNestedScroll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r10.f1914e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0218, code lost:
        if (r10.f1914e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m2580f()
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r24)
            int r0 = r24.getActionMasked()
            r13 = 0
            if (r0 != 0) goto L_0x0014
            r10.f1931v = r13
        L_0x0014:
            int r1 = r10.f1931v
            float r1 = (float) r1
            r14 = 0
            r12.offsetLocation(r14, r1)
            r1 = 2
            r15 = 1
            if (r0 == 0) goto L_0x021c
            r2 = -1
            if (r0 == r15) goto L_0x01e4
            if (r0 == r1) goto L_0x007f
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0254
        L_0x002f:
            r23.m2567a((android.view.MotionEvent) r24)
            int r0 = r10.f1928s
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f1917h = r0
            goto L_0x0254
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f1917h = r1
            int r0 = r11.getPointerId(r0)
            r10.f1928s = r0
            goto L_0x0254
        L_0x0054:
            boolean r0 = r10.f1921l
            if (r0 == 0) goto L_0x0078
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x0078
            android.widget.OverScroller r3 = r10.f1914e
            int r4 = r23.getScrollX()
            int r5 = r23.getScrollY()
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r23.getScrollRange()
            boolean r0 = r3.springBack(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0078
        L_0x0075:
            android.support.p007v4.view.C0487v.m2261B(r23)
        L_0x0078:
            r10.f1928s = r2
            r23.m2573b()
            goto L_0x0254
        L_0x007f:
            int r0 = r10.f1928s
            int r9 = r11.findPointerIndex(r0)
            if (r9 != r2) goto L_0x00a6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f1928s
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0254
        L_0x00a6:
            float r0 = r11.getY(r9)
            int r6 = (int) r0
            int r0 = r10.f1917h
            int r7 = r0 - r6
            r1 = 0
            int[] r3 = r10.f1930u
            int[] r4 = r10.f1929t
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo2166a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00d4
            int[] r0 = r10.f1930u
            r0 = r0[r15]
            int r7 = r7 - r0
            int[] r0 = r10.f1929t
            r0 = r0[r15]
            float r0 = (float) r0
            r12.offsetLocation(r14, r0)
            int r0 = r10.f1931v
            int[] r1 = r10.f1929t
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f1931v = r0
        L_0x00d4:
            boolean r0 = r10.f1921l
            if (r0 != 0) goto L_0x00f4
            int r0 = java.lang.Math.abs(r7)
            int r1 = r10.f1925p
            if (r0 <= r1) goto L_0x00f4
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x00e9
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x00e9:
            r10.f1921l = r15
            if (r7 <= 0) goto L_0x00f1
            int r0 = r10.f1925p
            int r7 = r7 - r0
            goto L_0x00f4
        L_0x00f1:
            int r0 = r10.f1925p
            int r7 = r7 + r0
        L_0x00f4:
            r8 = r7
            boolean r0 = r10.f1921l
            if (r0 == 0) goto L_0x0254
            int[] r0 = r10.f1929t
            r0 = r0[r15]
            int r6 = r6 - r0
            r10.f1917h = r6
            int r16 = r23.getScrollY()
            int r7 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0116
            if (r0 != r15) goto L_0x0113
            if (r7 <= 0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            r17 = r13
            goto L_0x0118
        L_0x0116:
            r17 = r15
        L_0x0118:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r0 = r23
            r2 = r8
            r6 = r7
            r21 = r7
            r7 = r18
            r14 = r8
            r8 = r19
            r22 = r9
            r9 = r20
            boolean r0 = r0.mo2164a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0145
            boolean r0 = r10.mo2183d(r13)
            if (r0 != 0) goto L_0x0145
            android.view.VelocityTracker r0 = r10.f1922m
            r0.clear()
        L_0x0145:
            int r0 = r23.getScrollY()
            int r2 = r0 - r16
            int r4 = r14 - r2
            r1 = 0
            r3 = 0
            int[] r5 = r10.f1929t
            r6 = 0
            r0 = r23
            boolean r0 = r0.mo2165a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0175
            int r0 = r10.f1917h
            int[] r1 = r10.f1929t
            r2 = r1[r15]
            int r0 = r0 - r2
            r10.f1917h = r0
            r0 = r1[r15]
            float r0 = (float) r0
            r1 = 0
            r12.offsetLocation(r1, r0)
            int r0 = r10.f1931v
            int[] r1 = r10.f1929t
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f1931v = r0
            goto L_0x0254
        L_0x0175:
            if (r17 == 0) goto L_0x0254
            r23.m2576c()
            int r0 = r16 + r14
            if (r0 >= 0) goto L_0x01a4
            android.widget.EdgeEffect r0 = r10.f1915f
            float r1 = (float) r14
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = r22
            float r2 = r11.getX(r2)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            android.support.p007v4.widget.C0555n.m2739a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f1916g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ce
            android.widget.EdgeEffect r0 = r10.f1916g
        L_0x01a0:
            r0.onRelease()
            goto L_0x01ce
        L_0x01a4:
            r1 = r21
            r2 = r22
            if (r0 <= r1) goto L_0x01ce
            android.widget.EdgeEffect r0 = r10.f1916g
            float r1 = (float) r14
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r11.getX(r2)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            float r3 = r3 - r2
            android.support.p007v4.widget.C0555n.m2739a(r0, r1, r3)
            android.widget.EdgeEffect r0 = r10.f1915f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ce
            android.widget.EdgeEffect r0 = r10.f1915f
            goto L_0x01a0
        L_0x01ce:
            android.widget.EdgeEffect r0 = r10.f1915f
            if (r0 == 0) goto L_0x0254
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01e0
            android.widget.EdgeEffect r0 = r10.f1916g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0254
        L_0x01e0:
            android.support.p007v4.view.C0487v.m2261B(r23)
            goto L_0x0254
        L_0x01e4:
            android.view.VelocityTracker r0 = r10.f1922m
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r10.f1927r
            float r3 = (float) r3
            r0.computeCurrentVelocity(r1, r3)
            int r1 = r10.f1928s
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r3 = r10.f1926q
            if (r1 <= r3) goto L_0x0203
            int r0 = -r0
            r10.m2583h(r0)
            goto L_0x0078
        L_0x0203:
            android.widget.OverScroller r3 = r10.f1914e
            int r4 = r23.getScrollX()
            int r5 = r23.getScrollY()
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r23.getScrollRange()
            boolean r0 = r3.springBack(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0078
            goto L_0x0075
        L_0x021c:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x0223
            return r13
        L_0x0223:
            android.widget.OverScroller r0 = r10.f1914e
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r15
            r10.f1921l = r0
            if (r0 == 0) goto L_0x0237
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0237
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x0237:
            android.widget.OverScroller r0 = r10.f1914e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0244
            android.widget.OverScroller r0 = r10.f1914e
            r0.abortAnimation()
        L_0x0244:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f1917h = r0
            int r0 = r11.getPointerId(r13)
            r10.f1928s = r0
            r10.mo2175c(r1, r13)
        L_0x0254:
            android.view.VelocityTracker r0 = r10.f1922m
            if (r0 == 0) goto L_0x025b
            r0.addMovement(r12)
        L_0x025b:
            r12.recycle()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1918i) {
            m2574b(view2);
        } else {
            this.f1920k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2569a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2581g();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f1918i = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int a = m2565a(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int a2 = m2565a(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1923n) {
            this.f1923n = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1935z.mo1953a(z);
    }

    public void setOnScrollChangeListener(C0529b bVar) {
        this.f1911B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1924o = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f1935z.mo1964b(i);
    }

    public void stopNestedScroll() {
        this.f1935z.mo1965c();
    }
}
