package android.support.p007v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0477l;
import android.support.p007v4.view.C0478m;
import android.support.p007v4.view.C0480o;
import android.support.p007v4.view.C0481p;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: android.support.v4.widget.SwipeRefreshLayout */
public class SwipeRefreshLayout extends ViewGroup implements C0480o, C0477l {

    /* renamed from: a */
    private static final String f1937a = "SwipeRefreshLayout";

    /* renamed from: b */
    private static final int[] f1938b = {16842766};

    /* renamed from: A */
    protected int f1939A;

    /* renamed from: B */
    int f1940B;

    /* renamed from: C */
    C0540f f1941C;

    /* renamed from: D */
    private Animation f1942D;

    /* renamed from: E */
    private Animation f1943E;

    /* renamed from: F */
    private Animation f1944F;

    /* renamed from: G */
    private Animation f1945G;

    /* renamed from: H */
    private Animation f1946H;

    /* renamed from: I */
    boolean f1947I;

    /* renamed from: J */
    private int f1948J;

    /* renamed from: K */
    boolean f1949K;

    /* renamed from: L */
    private C0530a f1950L;

    /* renamed from: M */
    private Animation.AnimationListener f1951M;

    /* renamed from: N */
    private final Animation f1952N;

    /* renamed from: O */
    private final Animation f1953O;

    /* renamed from: c */
    private View f1954c;

    /* renamed from: d */
    C0531b f1955d;

    /* renamed from: e */
    boolean f1956e;

    /* renamed from: f */
    private int f1957f;

    /* renamed from: g */
    private float f1958g;

    /* renamed from: h */
    private float f1959h;

    /* renamed from: i */
    private final C0481p f1960i;

    /* renamed from: j */
    private final C0478m f1961j;

    /* renamed from: k */
    private final int[] f1962k;

    /* renamed from: l */
    private final int[] f1963l;

    /* renamed from: m */
    private boolean f1964m;

    /* renamed from: n */
    private int f1965n;

    /* renamed from: o */
    int f1966o;

    /* renamed from: p */
    private float f1967p;

    /* renamed from: q */
    private float f1968q;

    /* renamed from: r */
    private boolean f1969r;

    /* renamed from: s */
    private int f1970s;

    /* renamed from: t */
    boolean f1971t;

    /* renamed from: u */
    private boolean f1972u;

    /* renamed from: v */
    private final DecelerateInterpolator f1973v;

    /* renamed from: w */
    C0536c f1974w;

    /* renamed from: x */
    private int f1975x;

    /* renamed from: y */
    protected int f1976y;

    /* renamed from: z */
    float f1977z;

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$a */
    public interface C0530a {
        /* renamed from: a */
        boolean mo2262a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$b */
    public interface C0531b {
        /* renamed from: a */
        void mo2263a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1956e = false;
        this.f1958g = -1.0f;
        this.f1962k = new int[2];
        this.f1963l = new int[2];
        this.f1970s = -1;
        this.f1975x = -1;
        this.f1951M = new C0572v(this);
        this.f1952N = new C0505A(this);
        this.f1953O = new C0506B(this);
        this.f1957f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1965n = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f1973v = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1948J = (int) (displayMetrics.density * 40.0f);
        m2610c();
        setChildrenDrawingOrderEnabled(true);
        this.f1940B = (int) (displayMetrics.density * 64.0f);
        this.f1958g = (float) this.f1940B;
        this.f1960i = new C0481p(this);
        this.f1961j = new C0478m(this);
        setNestedScrollingEnabled(true);
        int i = -this.f1948J;
        this.f1966o = i;
        this.f1939A = i;
        mo2226a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1938b);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animation m2602a(int i, int i2) {
        C0575y yVar = new C0575y(this, i, i2);
        yVar.setDuration(300);
        this.f1974w.mo2292a((Animation.AnimationListener) null);
        this.f1974w.clearAnimation();
        this.f1974w.startAnimation(yVar);
        return yVar;
    }

    /* renamed from: a */
    private void m2603a(int i, Animation.AnimationListener animationListener) {
        this.f1976y = i;
        this.f1952N.reset();
        this.f1952N.setDuration(200);
        this.f1952N.setInterpolator(this.f1973v);
        if (animationListener != null) {
            this.f1974w.mo2292a(animationListener);
        }
        this.f1974w.clearAnimation();
        this.f1974w.startAnimation(this.f1952N);
    }

    /* renamed from: a */
    private void m2604a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1970s) {
            this.f1970s = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m2605a(boolean z, boolean z2) {
        if (this.f1956e != z) {
            this.f1947I = z2;
            m2613d();
            this.f1956e = z;
            if (this.f1956e) {
                m2603a(this.f1966o, this.f1951M);
            } else {
                mo2227a(this.f1951M);
            }
        }
    }

    /* renamed from: a */
    private boolean m2606a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: b */
    private void m2607b(float f) {
        if (f > this.f1958g) {
            m2605a(true, true);
            return;
        }
        this.f1956e = false;
        this.f1941C.mo2305a(0.0f, 0.0f);
        C0576z zVar = null;
        if (!this.f1971t) {
            zVar = new C0576z(this);
        }
        m2608b(this.f1966o, zVar);
        this.f1941C.mo2307a(false);
    }

    /* renamed from: b */
    private void m2608b(int i, Animation.AnimationListener animationListener) {
        if (this.f1971t) {
            m2612c(i, animationListener);
            return;
        }
        this.f1976y = i;
        this.f1953O.reset();
        this.f1953O.setDuration(200);
        this.f1953O.setInterpolator(this.f1973v);
        if (animationListener != null) {
            this.f1974w.mo2292a(animationListener);
        }
        this.f1974w.clearAnimation();
        this.f1974w.startAnimation(this.f1953O);
    }

    /* renamed from: b */
    private void m2609b(Animation.AnimationListener animationListener) {
        this.f1974w.setVisibility(0);
        this.f1941C.setAlpha(255);
        this.f1942D = new C0573w(this);
        this.f1942D.setDuration((long) this.f1965n);
        if (animationListener != null) {
            this.f1974w.mo2292a(animationListener);
        }
        this.f1974w.clearAnimation();
        this.f1974w.startAnimation(this.f1942D);
    }

    /* renamed from: c */
    private void m2610c() {
        this.f1974w = new C0536c(getContext(), -328966);
        this.f1941C = new C0540f(getContext());
        this.f1941C.mo2306a(1);
        this.f1974w.setImageDrawable(this.f1941C);
        this.f1974w.setVisibility(8);
        addView(this.f1974w);
    }

    /* renamed from: c */
    private void m2611c(float f) {
        this.f1941C.mo2307a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f1958g));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f1958g;
        float f2 = (float) (this.f1949K ? this.f1940B - this.f1939A : this.f1940B);
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i = this.f1939A + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f1974w.getVisibility() != 0) {
            this.f1974w.setVisibility(0);
        }
        if (!this.f1971t) {
            this.f1974w.setScaleX(1.0f);
            this.f1974w.setScaleY(1.0f);
        }
        if (this.f1971t) {
            setAnimationProgress(Math.min(1.0f, f / this.f1958g));
        }
        if (f < this.f1958g) {
            if (this.f1941C.getAlpha() > 76 && !m2606a(this.f1944F)) {
                m2616f();
            }
        } else if (this.f1941C.getAlpha() < 255 && !m2606a(this.f1945G)) {
            m2615e();
        }
        this.f1941C.mo2305a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f1941C.mo2304a(Math.min(1.0f, max));
        this.f1941C.mo2309b((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i - this.f1966o);
    }

    /* renamed from: c */
    private void m2612c(int i, Animation.AnimationListener animationListener) {
        this.f1976y = i;
        this.f1977z = this.f1974w.getScaleX();
        this.f1946H = new C0507C(this);
        this.f1946H.setDuration(150);
        if (animationListener != null) {
            this.f1974w.mo2292a(animationListener);
        }
        this.f1974w.clearAnimation();
        this.f1974w.startAnimation(this.f1946H);
    }

    /* renamed from: d */
    private void m2613d() {
        if (this.f1954c == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1974w)) {
                    this.f1954c = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2614d(float f) {
        float f2 = this.f1968q;
        int i = this.f1957f;
        if (f - f2 > ((float) i) && !this.f1969r) {
            this.f1967p = f2 + ((float) i);
            this.f1969r = true;
            this.f1941C.setAlpha(76);
        }
    }

    /* renamed from: e */
    private void m2615e() {
        this.f1945G = m2602a(this.f1941C.getAlpha(), 255);
    }

    /* renamed from: f */
    private void m2616f() {
        this.f1944F = m2602a(this.f1941C.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f1974w.getBackground().setAlpha(i);
        this.f1941C.setAlpha(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2226a(float f) {
        int i = this.f1976y;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f1939A - i)) * f))) - this.f1974w.getTop());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2227a(Animation.AnimationListener animationListener) {
        this.f1943E = new C0574x(this);
        this.f1943E.setDuration(150);
        this.f1974w.mo2292a(animationListener);
        this.f1974w.clearAnimation();
        this.f1974w.startAnimation(this.f1943E);
    }

    /* renamed from: a */
    public boolean mo2228a() {
        C0530a aVar = this.f1950L;
        if (aVar != null) {
            return aVar.mo2262a(this, this.f1954c);
        }
        View view = this.f1954c;
        return view instanceof ListView ? C0563q.m2761a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2229b() {
        this.f1974w.clearAnimation();
        this.f1941C.stop();
        this.f1974w.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f1971t) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f1939A - this.f1966o);
        }
        this.f1966o = this.f1974w.getTop();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1961j.mo1956a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1961j.mo1955a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1961j.mo1961a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1961j.mo1959a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1975x;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f1960i.mo1967a();
    }

    public int getProgressCircleDiameter() {
        return this.f1948J;
    }

    public int getProgressViewEndOffset() {
        return this.f1940B;
    }

    public int getProgressViewStartOffset() {
        return this.f1939A;
    }

    public boolean hasNestedScrollingParent() {
        return this.f1961j.mo1954a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1961j.mo1963b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2229b();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m2613d();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1972u && actionMasked == 0) {
            this.f1972u = false;
        }
        if (!isEnabled() || this.f1972u || mo2228a() || this.f1956e || this.f1964m) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f1970s;
                    if (i == -1) {
                        Log.e(f1937a, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m2614d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m2604a(motionEvent);
                    }
                }
            }
            this.f1969r = false;
            this.f1970s = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f1939A - this.f1974w.getTop());
            this.f1970s = motionEvent.getPointerId(0);
            this.f1969r = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f1970s);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f1968q = motionEvent.getY(findPointerIndex2);
        }
        return this.f1969r;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1954c == null) {
                m2613d();
            }
            View view = this.f1954c;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f1974w.getMeasuredWidth();
                int measuredHeight2 = this.f1974w.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f1966o;
                this.f1974w.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1954c == null) {
            m2613d();
        }
        View view = this.f1954c;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f1974w.measure(View.MeasureSpec.makeMeasureSpec(this.f1948J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1948J, 1073741824));
            this.f1975x = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f1974w) {
                    this.f1975x = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f1959h;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f1959h = 0.0f;
                } else {
                    this.f1959h = f - f2;
                    iArr[1] = i2;
                }
                m2611c(this.f1959h);
            }
        }
        if (this.f1949K && i2 > 0 && this.f1959h == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f1974w.setVisibility(8);
        }
        int[] iArr2 = this.f1962k;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1963l);
        int i5 = i4 + this.f1963l[1];
        if (i5 < 0 && !mo2228a()) {
            this.f1959h += (float) Math.abs(i5);
            m2611c(this.f1959h);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1960i.mo1970a(view, view2, i);
        startNestedScroll(i & 2);
        this.f1959h = 0.0f;
        this.f1964m = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f1972u && !this.f1956e && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1960i.mo1968a(view);
        this.f1964m = false;
        float f = this.f1959h;
        if (f > 0.0f) {
            m2607b(f);
            this.f1959h = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1972u && actionMasked == 0) {
            this.f1972u = false;
        }
        if (!isEnabled() || this.f1972u || mo2228a() || this.f1956e || this.f1964m) {
            return false;
        }
        if (actionMasked == 0) {
            this.f1970s = motionEvent.getPointerId(0);
            this.f1969r = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1970s);
            if (findPointerIndex < 0) {
                Log.e(f1937a, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f1969r) {
                this.f1969r = false;
                m2607b((motionEvent.getY(findPointerIndex) - this.f1967p) * 0.5f);
            }
            this.f1970s = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f1970s);
            if (findPointerIndex2 < 0) {
                Log.e(f1937a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            m2614d(y);
            if (this.f1969r) {
                float f = (y - this.f1967p) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m2611c(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f1937a, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f1970s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m2604a(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f1954c instanceof AbsListView)) {
            View view = this.f1954c;
            if (view == null || C0487v.m2310z(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.f1974w.setScaleX(f);
        this.f1974w.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m2613d();
        this.f1941C.mo2308a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C1006a.m5386a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1958g = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo2229b();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1961j.mo1953a(z);
    }

    public void setOnChildScrollUpCallback(C0530a aVar) {
        this.f1950L = aVar;
    }

    public void setOnRefreshListener(C0531b bVar) {
        this.f1955d = bVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1974w.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C1006a.m5386a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1956e == z) {
            m2605a(z, false);
            return;
        }
        this.f1956e = z;
        setTargetOffsetTopAndBottom((!this.f1949K ? this.f1940B + this.f1939A : this.f1940B) - this.f1966o);
        this.f1947I = false;
        m2609b(this.f1951M);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f1948J = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f1974w.setImageDrawable((Drawable) null);
            this.f1941C.mo2306a(i);
            this.f1974w.setImageDrawable(this.f1941C);
        }
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f1974w.bringToFront();
        C0487v.m2283b((View) this.f1974w, i);
        this.f1966o = this.f1974w.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f1961j.mo1964b(i);
    }

    public void stopNestedScroll() {
        this.f1961j.mo1965c();
    }
}
