package android.support.p007v4.widget;

import android.content.Context;
import android.support.p007v4.view.C0487v;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.I */
public class C0525I {

    /* renamed from: a */
    private static final Interpolator f1883a = new C0523G();

    /* renamed from: b */
    private int f1884b;

    /* renamed from: c */
    private int f1885c;

    /* renamed from: d */
    private int f1886d = -1;

    /* renamed from: e */
    private float[] f1887e;

    /* renamed from: f */
    private float[] f1888f;

    /* renamed from: g */
    private float[] f1889g;

    /* renamed from: h */
    private float[] f1890h;

    /* renamed from: i */
    private int[] f1891i;

    /* renamed from: j */
    private int[] f1892j;

    /* renamed from: k */
    private int[] f1893k;

    /* renamed from: l */
    private int f1894l;

    /* renamed from: m */
    private VelocityTracker f1895m;

    /* renamed from: n */
    private float f1896n;

    /* renamed from: o */
    private float f1897o;

    /* renamed from: p */
    private int f1898p;

    /* renamed from: q */
    private int f1899q;

    /* renamed from: r */
    private OverScroller f1900r;

    /* renamed from: s */
    private final C0526a f1901s;

    /* renamed from: t */
    private View f1902t;

    /* renamed from: u */
    private boolean f1903u;

    /* renamed from: v */
    private final ViewGroup f1904v;

    /* renamed from: w */
    private final Runnable f1905w = new C0524H(this);

    /* renamed from: android.support.v4.widget.I$a */
    public static abstract class C0526a {
        /* renamed from: a */
        public int mo2160a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo659a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo660a(View view, int i, int i2);

        /* renamed from: a */
        public void mo2126a(int i, int i2) {
        }

        /* renamed from: a */
        public abstract void mo661a(View view, float f, float f2);

        /* renamed from: a */
        public void mo662a(View view, int i) {
        }

        /* renamed from: a */
        public void mo663a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: b */
        public int mo853b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo664b(View view, int i, int i2);

        /* renamed from: b */
        public void mo2129b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo2130b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo665b(View view, int i);

        /* renamed from: c */
        public void mo666c(int i) {
        }
    }

    private C0525I(Context context, ViewGroup viewGroup, C0526a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f1904v = viewGroup;
            this.f1901s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f1898p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f1885c = viewConfiguration.getScaledTouchSlop();
            this.f1896n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1897o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1900r = new OverScroller(context, f1883a);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private float m2507a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: a */
    private int m2508a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: a */
    private int m2509a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m2508a(i3, (int) this.f1897o, (int) this.f1896n);
        int a2 = m2508a(i4, (int) this.f1897o, (int) this.f1896n);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m2518b(i, a, this.f1901s.mo659a(view))) * f5) + (((float) m2518b(i2, a2, this.f1901s.mo853b(view))) * f6));
    }

    /* renamed from: a */
    public static C0525I m2510a(ViewGroup viewGroup, float f, C0526a aVar) {
        C0525I a = m2511a(viewGroup, aVar);
        a.f1885c = (int) (((float) a.f1885c) * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    public static C0525I m2511a(ViewGroup viewGroup, C0526a aVar) {
        return new C0525I(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    private void m2512a(float f, float f2) {
        this.f1903u = true;
        this.f1901s.mo661a(this.f1902t, f, f2);
        this.f1903u = false;
        if (this.f1884b == 1) {
            mo2154c(0);
        }
    }

    /* renamed from: a */
    private void m2513a(float f, float f2, int i) {
        int i2 = 1;
        if (!m2515a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m2515a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2515a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2515a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1892j;
            iArr[i] = iArr[i] | i2;
            this.f1901s.mo2126a(i2, i);
        }
    }

    /* renamed from: a */
    private void m2514a(int i, int i2, int i3, int i4) {
        int left = this.f1902t.getLeft();
        int top = this.f1902t.getTop();
        if (i3 != 0) {
            i = this.f1901s.mo660a(this.f1902t, i, i3);
            C0487v.m2267a(this.f1902t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f1901s.mo664b(this.f1902t, i2, i4);
            C0487v.m2283b(this.f1902t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f1901s.mo663a(this.f1902t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    private boolean m2515a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f1891i[i] & i2) != i2 || (this.f1899q & i2) == 0 || (this.f1893k[i] & i2) == i2 || (this.f1892j[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f1885c;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f1901s.mo2130b(i2)) {
            return (this.f1892j[i] & i2) == 0 && abs > ((float) this.f1885c);
        }
        int[] iArr = this.f1893k;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: a */
    private boolean m2516a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f1901s.mo659a(view) > 0;
        boolean z2 = this.f1901s.mo853b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f1885c) : z2 && Math.abs(f2) > ((float) this.f1885c);
        }
        int i = this.f1885c;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: b */
    private float m2517b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: b */
    private int m2518b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f1904v.getWidth();
        float f = (float) (width / 2);
        float b = f + (m2517b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: b */
    private void m2519b(float f, float f2, int i) {
        m2525f(i);
        float[] fArr = this.f1887e;
        this.f1889g[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1888f;
        this.f1890h[i] = f2;
        fArr2[i] = f2;
        this.f1891i[i] = m2522e((int) f, (int) f2);
        this.f1894l |= 1 << i;
    }

    /* renamed from: b */
    private boolean m2520b(int i, int i2, int i3, int i4) {
        int left = this.f1902t.getLeft();
        int top = this.f1902t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1900r.abortAnimation();
            mo2154c(0);
            return false;
        }
        this.f1900r.startScroll(left, top, i5, i6, m2509a(this.f1902t, i5, i6, i3, i4));
        mo2154c(2);
        return true;
    }

    /* renamed from: c */
    private void m2521c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2527g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1889g[pointerId] = x;
                this.f1890h[pointerId] = y;
            }
        }
    }

    /* renamed from: e */
    private int m2522e(int i, int i2) {
        int i3 = i < this.f1904v.getLeft() + this.f1898p ? 1 : 0;
        if (i2 < this.f1904v.getTop() + this.f1898p) {
            i3 |= 4;
        }
        if (i > this.f1904v.getRight() - this.f1898p) {
            i3 |= 2;
        }
        return i2 > this.f1904v.getBottom() - this.f1898p ? i3 | 8 : i3;
    }

    /* renamed from: e */
    private void m2523e(int i) {
        if (this.f1887e != null && mo2149b(i)) {
            this.f1887e[i] = 0.0f;
            this.f1888f[i] = 0.0f;
            this.f1889g[i] = 0.0f;
            this.f1890h[i] = 0.0f;
            this.f1891i[i] = 0;
            this.f1892j[i] = 0;
            this.f1893k[i] = 0;
            this.f1894l = (~(1 << i)) & this.f1894l;
        }
    }

    /* renamed from: f */
    private void m2524f() {
        float[] fArr = this.f1887e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1888f, 0.0f);
            Arrays.fill(this.f1889g, 0.0f);
            Arrays.fill(this.f1890h, 0.0f);
            Arrays.fill(this.f1891i, 0);
            Arrays.fill(this.f1892j, 0);
            Arrays.fill(this.f1893k, 0);
            this.f1894l = 0;
        }
    }

    /* renamed from: f */
    private void m2525f(int i) {
        float[] fArr = this.f1887e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f1887e;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f1888f;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f1889g;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f1890h;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f1891i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1892j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1893k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1887e = fArr2;
            this.f1888f = fArr3;
            this.f1889g = fArr4;
            this.f1890h = fArr5;
            this.f1891i = iArr;
            this.f1892j = iArr2;
            this.f1893k = iArr3;
        }
    }

    /* renamed from: g */
    private void m2526g() {
        this.f1895m.computeCurrentVelocity(1000, this.f1896n);
        m2512a(m2507a(this.f1895m.getXVelocity(this.f1886d), this.f1897o, this.f1896n), m2507a(this.f1895m.getYVelocity(this.f1886d), this.f1897o, this.f1896n));
    }

    /* renamed from: g */
    private boolean m2527g(int i) {
        if (mo2149b(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: a */
    public void mo2139a() {
        this.f1886d = -1;
        m2524f();
        VelocityTracker velocityTracker = this.f1895m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1895m = null;
        }
    }

    /* renamed from: a */
    public void mo2140a(float f) {
        this.f1897o = f;
    }

    /* renamed from: a */
    public void mo2141a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo2139a();
        }
        if (this.f1895m == null) {
            this.f1895m = VelocityTracker.obtain();
        }
        this.f1895m.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f1884b != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m2527g(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f1887e[pointerId];
                                float f2 = y - this.f1888f[pointerId];
                                m2513a(f, f2, pointerId);
                                if (this.f1884b != 1) {
                                    View b = mo2148b((int) x, (int) y);
                                    if (m2516a(b, f, f2) && mo2151b(b, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (m2527g(this.f1886d)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f1886d);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f1889g;
                        int i3 = this.f1886d;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f1890h[i3]);
                        m2514a(this.f1902t.getLeft() + i4, this.f1902t.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    m2521c(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        m2519b(x3, y3, pointerId2);
                        if (this.f1884b == 0) {
                            mo2151b(mo2148b((int) x3, (int) y3), pointerId2);
                            int i6 = this.f1891i[pointerId2];
                            int i7 = this.f1899q;
                            if ((i6 & i7) != 0) {
                                this.f1901s.mo2129b(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (mo2155c((int) x3, (int) y3)) {
                            mo2151b(this.f1902t, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f1884b == 1 && pointerId3 == this.f1886d) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f1886d) {
                                    View b2 = mo2148b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f1902t;
                                    if (b2 == view && mo2151b(view, pointerId4)) {
                                        i = this.f1886d;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m2526g();
                            }
                        }
                        m2523e(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f1884b == 1) {
                    m2512a(0.0f, 0.0f);
                }
            } else if (this.f1884b == 1) {
                m2526g();
            }
            mo2139a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View b3 = mo2148b((int) x4, (int) y4);
        m2519b(x4, y4, pointerId5);
        mo2151b(b3, pointerId5);
        int i8 = this.f1891i[pointerId5];
        int i9 = this.f1899q;
        if ((i8 & i9) != 0) {
            this.f1901s.mo2129b(i8 & i9, pointerId5);
        }
    }

    /* renamed from: a */
    public void mo2142a(View view, int i) {
        if (view.getParent() == this.f1904v) {
            this.f1902t = view;
            this.f1886d = i;
            this.f1901s.mo662a(view, i);
            mo2154c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1904v + ")");
    }

    /* renamed from: a */
    public boolean mo2143a(int i) {
        int length = this.f1887e.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo2144a(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2144a(int i, int i2) {
        if (!mo2149b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f1889g[i2] - this.f1887e[i2];
        float f2 = this.f1890h[i2] - this.f1888f[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f1885c) : z2 && Math.abs(f2) > ((float) this.f1885c);
        }
        int i3 = this.f1885c;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    /* renamed from: a */
    public boolean mo2145a(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: a */
    public boolean mo2146a(boolean z) {
        if (this.f1884b == 2) {
            boolean computeScrollOffset = this.f1900r.computeScrollOffset();
            int currX = this.f1900r.getCurrX();
            int currY = this.f1900r.getCurrY();
            int left = currX - this.f1902t.getLeft();
            int top = currY - this.f1902t.getTop();
            if (left != 0) {
                C0487v.m2267a(this.f1902t, left);
            }
            if (top != 0) {
                C0487v.m2283b(this.f1902t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f1901s.mo663a(this.f1902t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1900r.getFinalX() && currY == this.f1900r.getFinalY()) {
                this.f1900r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f1904v.post(this.f1905w);
                } else {
                    mo2154c(0);
                }
            }
        }
        return this.f1884b == 2;
    }

    /* renamed from: b */
    public View mo2147b() {
        return this.f1902t;
    }

    /* renamed from: b */
    public View mo2148b(int i, int i2) {
        for (int childCount = this.f1904v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f1904v;
            this.f1901s.mo2160a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo2149b(int i) {
        return ((1 << i) & this.f1894l) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2150b(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo2139a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f1895m
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f1895m = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f1895m
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m2523e(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m2519b((float) r7, (float) r1, (int) r2)
            int r3 = r0.f1884b
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f1891i
            r1 = r1[r2]
            int r3 = r0.f1899q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            android.support.v4.widget.I$a r4 = r0.f1901s
            r1 = r1 & r3
            r4.mo2129b((int) r1, (int) r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo2148b((int) r3, (int) r1)
            android.view.View r3 = r0.f1902t
            if (r1 != r3) goto L_0x0031
            r0.mo2151b((android.view.View) r1, (int) r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f1887e
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f1888f
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m2527g(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f1887e
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f1888f
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo2148b((int) r7, (int) r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m2516a((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            android.support.v4.widget.I$a r14 = r0.f1901s
            int r12 = r14.mo660a((android.view.View) r7, (int) r13, (int) r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            android.support.v4.widget.I$a r5 = r0.f1901s
            int r5 = r5.mo664b(r7, r15, r14)
            android.support.v4.widget.I$a r14 = r0.f1901s
            int r14 = r14.mo659a((android.view.View) r7)
            android.support.v4.widget.I$a r15 = r0.f1901s
            int r15 = r15.mo853b((android.view.View) r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m2513a((float) r9, (float) r10, (int) r4)
            int r5 = r0.f1884b
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo2151b((android.view.View) r7, (int) r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m2521c((android.view.MotionEvent) r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo2139a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m2519b((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo2148b((int) r2, (int) r3)
            android.view.View r3 = r0.f1902t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f1884b
            if (r3 != r4) goto L_0x0125
            r0.mo2151b((android.view.View) r2, (int) r1)
        L_0x0125:
            int[] r2 = r0.f1891i
            r2 = r2[r1]
            int r3 = r0.f1899q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            android.support.v4.widget.I$a r4 = r0.f1901s
            r2 = r2 & r3
            r4.mo2129b((int) r2, (int) r1)
        L_0x0135:
            int r1 = r0.f1884b
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.widget.C0525I.mo2150b(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2151b(View view, int i) {
        if (view == this.f1902t && this.f1886d == i) {
            return true;
        }
        if (view == null || !this.f1901s.mo665b(view, i)) {
            return false;
        }
        this.f1886d = i;
        mo2142a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean mo2152b(View view, int i, int i2) {
        this.f1902t = view;
        this.f1886d = -1;
        boolean b = m2520b(i, i2, 0, 0);
        if (!b && this.f1884b == 0 && this.f1902t != null) {
            this.f1902t = null;
        }
        return b;
    }

    /* renamed from: c */
    public int mo2153c() {
        return this.f1898p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2154c(int i) {
        this.f1904v.removeCallbacks(this.f1905w);
        if (this.f1884b != i) {
            this.f1884b = i;
            this.f1901s.mo666c(i);
            if (this.f1884b == 0) {
                this.f1902t = null;
            }
        }
    }

    /* renamed from: c */
    public boolean mo2155c(int i, int i2) {
        return mo2145a(this.f1902t, i, i2);
    }

    /* renamed from: d */
    public int mo2156d() {
        return this.f1885c;
    }

    /* renamed from: d */
    public void mo2157d(int i) {
        this.f1899q = i;
    }

    /* renamed from: d */
    public boolean mo2158d(int i, int i2) {
        if (this.f1903u) {
            return m2520b(i, i2, (int) this.f1895m.getXVelocity(this.f1886d), (int) this.f1895m.getYVelocity(this.f1886d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: e */
    public int mo2159e() {
        return this.f1884b;
    }
}
