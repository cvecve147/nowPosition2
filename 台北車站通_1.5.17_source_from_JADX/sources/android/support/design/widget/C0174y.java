package android.support.design.widget;

import android.content.Context;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: android.support.design.widget.y */
abstract class C0174y<V extends View> extends C0131T<V> {

    /* renamed from: d */
    private Runnable f917d;

    /* renamed from: e */
    OverScroller f918e;

    /* renamed from: f */
    private boolean f919f;

    /* renamed from: g */
    private int f920g = -1;

    /* renamed from: h */
    private int f921h;

    /* renamed from: i */
    private int f922i = -1;

    /* renamed from: j */
    private VelocityTracker f923j;

    /* renamed from: android.support.design.widget.y$a */
    private class C0175a implements Runnable {

        /* renamed from: a */
        private final CoordinatorLayout f924a;

        /* renamed from: b */
        private final V f925b;

        C0175a(CoordinatorLayout coordinatorLayout, V v) {
            this.f924a = coordinatorLayout;
            this.f925b = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f925b != null && (overScroller = C0174y.this.f918e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C0174y yVar = C0174y.this;
                    yVar.mo925c(this.f924a, this.f925b, yVar.f918e.getCurrY());
                    C0487v.m2277a((View) this.f925b, (Runnable) this);
                    return;
                }
                C0174y.this.mo419e(this.f924a, this.f925b);
            }
        }
    }

    public C0174y() {
    }

    public C0174y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private void m885d() {
        if (this.f923j == null) {
            this.f923j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo923a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo411b(coordinatorLayout, v, mo415c() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo924a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f917d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f917d = null;
        }
        if (this.f918e == null) {
            this.f918e = new OverScroller(v.getContext());
        }
        this.f918e.fling(0, mo409b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f918e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f917d = new C0175a(coordinatorLayout, v);
            C0487v.m2277a((View) v, this.f917d);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo419e(coordinatorLayout, v);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo439a(android.support.design.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f922i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f922i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f919f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f920g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f921h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f922i
            if (r6 <= r0) goto L_0x0083
            r4.f919f = r2
            r4.f921h = r5
            goto L_0x0083
        L_0x0051:
            r4.f919f = r3
            r4.f920g = r5
            android.view.VelocityTracker r5 = r4.f923j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f923j = r5
            goto L_0x0083
        L_0x0060:
            r4.f919f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo408a(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.mo530a((android.view.View) r6, (int) r0, (int) r1)
            if (r5 == 0) goto L_0x0083
            r4.f921h = r1
            int r5 = r7.getPointerId(r3)
            r4.f920g = r5
            r4.m885d()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f923j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f919f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.C0174y.mo439a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo408a(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo411b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo412b(V v);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo444b(android.support.design.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f922i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f922i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f920g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f921h
            int r2 = r2 - r0
            boolean r3 = r11.f919f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f922i
            if (r3 <= r4) goto L_0x0049
            r11.f919f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f919f
            if (r2 == 0) goto L_0x00ae
            r11.f921h = r0
            int r7 = r11.mo412b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.mo923a((android.support.design.widget.CoordinatorLayout) r4, r5, (int) r6, (int) r7, (int) r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f923j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f923j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f923j
            int r4 = r11.f920g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo417c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo924a((android.support.design.widget.CoordinatorLayout) r6, r7, (int) r8, (int) r9, (float) r10)
        L_0x007e:
            r11.f919f = r2
            r11.f920g = r3
            android.view.VelocityTracker r12 = r11.f923j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f923j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.mo530a((android.view.View) r13, (int) r0, (int) r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.mo408a(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f921h = r3
            int r12 = r14.getPointerId(r2)
            r11.f920g = r12
            r11.m885d()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f923j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.C0174y.mo444b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo415c();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo925c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo411b(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo417c(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo419e(CoordinatorLayout coordinatorLayout, V v);
}
