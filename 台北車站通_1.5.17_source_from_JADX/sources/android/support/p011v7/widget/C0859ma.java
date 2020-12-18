package android.support.p011v7.widget;

import android.os.SystemClock;
import android.support.p011v7.view.menu.C0685z;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.ma */
public abstract class C0859ma implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f3536a;

    /* renamed from: b */
    private final int f3537b;

    /* renamed from: c */
    private final int f3538c;

    /* renamed from: d */
    final View f3539d;

    /* renamed from: e */
    private Runnable f3540e;

    /* renamed from: f */
    private Runnable f3541f;

    /* renamed from: g */
    private boolean f3542g;

    /* renamed from: h */
    private int f3543h;

    /* renamed from: i */
    private final int[] f3544i = new int[2];

    /* renamed from: android.support.v7.widget.ma$a */
    private class C0860a implements Runnable {
        C0860a() {
        }

        public void run() {
            ViewParent parent = C0859ma.this.f3539d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ma$b */
    private class C0861b implements Runnable {
        C0861b() {
        }

        public void run() {
            C0859ma.this.mo4592d();
        }
    }

    public C0859ma(View view) {
        this.f3539d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3536a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3537b = ViewConfiguration.getTapTimeout();
        this.f3538c = (this.f3537b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m4953a(MotionEvent motionEvent) {
        C0837ha haVar;
        View view = this.f3539d;
        C0685z a = mo2688a();
        if (a == null || !a.mo2706w() || (haVar = (C0837ha) a.mo2707x()) == null || !haVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m4955a(view, obtainNoHistory);
        m4957b(haVar, obtainNoHistory);
        boolean a2 = haVar.mo4493a(obtainNoHistory, this.f3543h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: a */
    private static boolean m4954a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m4955a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3544i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4956b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f3539d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f3543h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f3536a
            boolean r6 = m4954a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m4958e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m4958e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f3543h = r6
            java.lang.Runnable r6 = r5.f3540e
            if (r6 != 0) goto L_0x0052
            android.support.v7.widget.ma$a r6 = new android.support.v7.widget.ma$a
            r6.<init>()
            r5.f3540e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f3540e
            int r1 = r5.f3537b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f3541f
            if (r6 != 0) goto L_0x0065
            android.support.v7.widget.ma$b r6 = new android.support.v7.widget.ma$b
            r6.<init>()
            r5.f3541f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f3541f
            int r1 = r5.f3538c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0859ma.m4956b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private boolean m4957b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3544i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: e */
    private void m4958e() {
        Runnable runnable = this.f3541f;
        if (runnable != null) {
            this.f3539d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3540e;
        if (runnable2 != null) {
            this.f3539d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract C0685z mo2688a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo2689b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo4491c() {
        C0685z a = mo2688a();
        if (a == null || !a.mo2706w()) {
            return true;
        }
        a.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4592d() {
        m4958e();
        View view = this.f3539d;
        if (view.isEnabled() && !view.isLongClickable() && mo2689b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f3542g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f3542g;
        if (z2) {
            z = m4953a(motionEvent) || !mo4491c();
        } else {
            z = m4956b(motionEvent) && mo2689b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3539d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f3542g = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f3542g = false;
        this.f3543h = -1;
        Runnable runnable = this.f3540e;
        if (runnable != null) {
            this.f3539d.removeCallbacks(runnable);
        }
    }
}
