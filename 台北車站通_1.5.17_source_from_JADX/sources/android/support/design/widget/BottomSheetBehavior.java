package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0525I;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0104b<V> {

    /* renamed from: a */
    private float f534a;

    /* renamed from: b */
    private int f535b;

    /* renamed from: c */
    private boolean f536c;

    /* renamed from: d */
    private int f537d;

    /* renamed from: e */
    int f538e;

    /* renamed from: f */
    int f539f;

    /* renamed from: g */
    boolean f540g;

    /* renamed from: h */
    private boolean f541h;

    /* renamed from: i */
    int f542i = 4;

    /* renamed from: j */
    C0525I f543j;

    /* renamed from: k */
    private boolean f544k;

    /* renamed from: l */
    private int f545l;

    /* renamed from: m */
    private boolean f546m;

    /* renamed from: n */
    int f547n;

    /* renamed from: o */
    WeakReference<V> f548o;

    /* renamed from: p */
    WeakReference<View> f549p;

    /* renamed from: q */
    private C0098a f550q;

    /* renamed from: r */
    private VelocityTracker f551r;

    /* renamed from: s */
    int f552s;

    /* renamed from: t */
    private int f553t;

    /* renamed from: u */
    boolean f554u;

    /* renamed from: v */
    private final C0525I.C0526a f555v = new C0153i(this);

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0154j();

        /* renamed from: a */
        final int f556a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f556a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f556a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f556a);
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0098a {
        /* renamed from: a */
        public abstract void mo448a(View view, float f);

        /* renamed from: a */
        public abstract void mo449a(View view, int i);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    private class C0099b implements Runnable {

        /* renamed from: a */
        private final View f557a;

        /* renamed from: b */
        private final int f558b;

        C0099b(View view, int i) {
            this.f557a = view;
            this.f558b = i;
        }

        public void run() {
            C0525I i = BottomSheetBehavior.this.f543j;
            if (i == null || !i.mo2146a(true)) {
                BottomSheetBehavior.this.mo446c(this.f558b);
            } else {
                C0487v.m2277a(this.f557a, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r0 = r0.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 4
            r2.f542i = r0
            android.support.design.widget.i r0 = new android.support.design.widget.i
            r0.<init>(r2)
            r2.f555v = r0
            int[] r0 = p013b.p018b.p022d.C0963i.BottomSheetBehavior_Layout
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
            int r0 = p013b.p018b.p022d.C0963i.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r0 = r4.peekValue(r0)
            r1 = -1
            if (r0 == 0) goto L_0x0021
            int r0 = r0.data
            if (r0 != r1) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            int r0 = p013b.p018b.p022d.C0963i.BottomSheetBehavior_Layout_behavior_peekHeight
            int r0 = r4.getDimensionPixelSize(r0, r1)
        L_0x0027:
            r2.mo442b((int) r0)
            int r0 = p013b.p018b.p022d.C0963i.BottomSheetBehavior_Layout_behavior_hideable
            r1 = 0
            boolean r0 = r4.getBoolean(r0, r1)
            r2.mo438a((boolean) r0)
            int r0 = p013b.p018b.p022d.C0963i.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r0 = r4.getBoolean(r0, r1)
            r2.mo443b((boolean) r0)
            r4.recycle()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledMaximumFlingVelocity()
            float r3 = (float) r3
            r2.f534a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: b */
    private float m469b() {
        this.f551r.computeCurrentVelocity(1000, this.f534a);
        return this.f551r.getYVelocity(this.f552s);
    }

    /* renamed from: c */
    private void m470c() {
        this.f552s = -1;
        VelocityTracker velocityTracker = this.f551r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f551r = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo435a(View view) {
        if (C0487v.m2310z(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = mo435a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo436a(int i) {
        C0098a aVar;
        float f;
        float f2;
        View view = (View) this.f548o.get();
        if (view != null && (aVar = this.f550q) != null) {
            int i2 = this.f539f;
            if (i > i2) {
                f = (float) (i2 - i);
                f2 = (float) (this.f547n - i2);
            } else {
                f = (float) (i2 - i);
                f2 = (float) (i2 - this.f538e);
            }
            aVar.mo448a(view, f / f2);
        }
    }

    /* renamed from: a */
    public void mo397a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo397a(coordinatorLayout, v, savedState.mo1736a());
        int i = savedState.f556a;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f542i = i;
    }

    /* renamed from: a */
    public void mo437a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        int i3;
        if (view == ((View) this.f549p.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                int i5 = this.f538e;
                if (i4 < i5) {
                    iArr[1] = top - i5;
                    C0487v.m2283b((View) v, -iArr[1]);
                    i3 = 3;
                } else {
                    iArr[1] = i2;
                    C0487v.m2283b((View) v, -i2);
                    mo446c(1);
                    mo436a(v.getTop());
                    this.f545l = i2;
                    this.f546m = true;
                }
            } else {
                if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.f539f;
                    if (i4 <= i6 || this.f540g) {
                        iArr[1] = i2;
                        C0487v.m2283b((View) v, -i2);
                        mo446c(1);
                    } else {
                        iArr[1] = top - i6;
                        C0487v.m2283b((View) v, -iArr[1]);
                        i3 = 4;
                    }
                }
                mo436a(v.getTop());
                this.f545l = i2;
                this.f546m = true;
            }
            mo446c(i3);
            mo436a(v.getTop());
            this.f545l = i2;
            this.f546m = true;
        }
    }

    /* renamed from: a */
    public void mo438a(boolean z) {
        this.f540g = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo406a(android.support.design.widget.CoordinatorLayout r6, V r7, int r8) {
        /*
            r5 = this;
            boolean r0 = android.support.p007v4.view.C0487v.m2291g(r6)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = android.support.p007v4.view.C0487v.m2291g(r7)
            if (r0 != 0) goto L_0x0010
            android.support.p007v4.view.C0487v.m2280a((android.view.View) r7, (boolean) r1)
        L_0x0010:
            int r0 = r7.getTop()
            r6.mo540c((android.view.View) r7, (int) r8)
            int r8 = r6.getHeight()
            r5.f547n = r8
            boolean r8 = r5.f536c
            if (r8 == 0) goto L_0x0043
            int r8 = r5.f537d
            if (r8 != 0) goto L_0x0031
            android.content.res.Resources r8 = r6.getResources()
            int r2 = p013b.p018b.p022d.C0956b.design_bottom_sheet_peek_height_min
            int r8 = r8.getDimensionPixelSize(r2)
            r5.f537d = r8
        L_0x0031:
            int r8 = r5.f537d
            int r2 = r5.f547n
            int r3 = r6.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0045
        L_0x0043:
            int r8 = r5.f535b
        L_0x0045:
            r2 = 0
            int r3 = r5.f547n
            int r4 = r7.getHeight()
            int r3 = r3 - r4
            int r2 = java.lang.Math.max(r2, r3)
            r5.f538e = r2
            int r2 = r5.f547n
            int r2 = r2 - r8
            int r8 = r5.f538e
            int r8 = java.lang.Math.max(r2, r8)
            r5.f539f = r8
            int r8 = r5.f542i
            r2 = 3
            if (r8 != r2) goto L_0x0069
            int r8 = r5.f538e
        L_0x0065:
            android.support.p007v4.view.C0487v.m2283b((android.view.View) r7, (int) r8)
            goto L_0x0088
        L_0x0069:
            boolean r2 = r5.f540g
            if (r2 == 0) goto L_0x0073
            r2 = 5
            if (r8 != r2) goto L_0x0073
            int r8 = r5.f547n
            goto L_0x0065
        L_0x0073:
            int r8 = r5.f542i
            r2 = 4
            if (r8 != r2) goto L_0x007b
            int r8 = r5.f539f
            goto L_0x0065
        L_0x007b:
            if (r8 == r1) goto L_0x0080
            r2 = 2
            if (r8 != r2) goto L_0x0088
        L_0x0080:
            int r8 = r7.getTop()
            int r0 = r0 - r8
            android.support.p007v4.view.C0487v.m2283b((android.view.View) r7, (int) r0)
        L_0x0088:
            android.support.v4.widget.I r8 = r5.f543j
            if (r8 != 0) goto L_0x0094
            android.support.v4.widget.I$a r8 = r5.f555v
            android.support.v4.widget.I r6 = android.support.p007v4.widget.C0525I.m2511a((android.view.ViewGroup) r6, (android.support.p007v4.widget.C0525I.C0526a) r8)
            r5.f543j = r6
        L_0x0094:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r7)
            r5.f548o = r6
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            android.view.View r7 = r5.mo435a((android.view.View) r7)
            r6.<init>(r7)
            r5.f549p = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo406a(android.support.design.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* renamed from: a */
    public boolean mo439a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.f544k = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m470c();
        }
        if (this.f551r == null) {
            this.f551r = VelocityTracker.obtain();
        }
        this.f551r.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f553t = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f549p;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && coordinatorLayout.mo530a(view, x, this.f553t)) {
                this.f552s = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f554u = true;
            }
            this.f544k = this.f552s == -1 && !coordinatorLayout.mo530a((View) v, x, this.f553t);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f554u = false;
            this.f552s = -1;
            if (this.f544k) {
                this.f544k = false;
                return false;
            }
        }
        if (!this.f544k && this.f543j.mo2150b(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f549p.get();
        return actionMasked == 2 && view2 != null && !this.f544k && this.f542i != 1 && !coordinatorLayout.mo530a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.f553t) - motionEvent.getY()) > ((float) this.f543j.mo2156d());
    }

    /* renamed from: a */
    public boolean mo440a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f549p.get() && (this.f542i != 3 || super.mo440a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo441a(View view, float f) {
        if (this.f541h) {
            return true;
        }
        if (view.getTop() < this.f539f) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f539f)) / ((float) this.f535b) > 0.5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo442b(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f536c
            if (r4 != 0) goto L_0x0015
            r3.f536c = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f536c
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f535b
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x0024
        L_0x0017:
            r3.f536c = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f535b = r1
            int r1 = r3.f547n
            int r1 = r1 - r4
            r3.f539f = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f542i
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f548o
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo442b(int):void");
    }

    /* renamed from: b */
    public void mo443b(boolean z) {
        this.f541h = z;
    }

    /* renamed from: b */
    public boolean mo444b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f542i == 1 && actionMasked == 0) {
            return true;
        }
        C0525I i = this.f543j;
        if (i != null) {
            i.mo2141a(motionEvent);
        }
        if (actionMasked == 0) {
            m470c();
        }
        if (this.f551r == null) {
            this.f551r = VelocityTracker.obtain();
        }
        this.f551r.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f544k && Math.abs(((float) this.f553t) - motionEvent.getY()) > ((float) this.f543j.mo2156d())) {
            this.f543j.mo2142a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f544k;
    }

    /* renamed from: b */
    public boolean mo445b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f545l = 0;
        this.f546m = false;
        return (i & 2) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo446c(int i) {
        C0098a aVar;
        if (this.f542i != i) {
            this.f542i = i;
            View view = (View) this.f548o.get();
            if (view != null && (aVar = this.f550q) != null) {
                aVar.mo449a(view, i);
            }
        }
    }

    /* renamed from: d */
    public Parcelable mo418d(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo418d(coordinatorLayout, v), this.f542i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (java.lang.Math.abs(r4 - r3.f538e) < java.lang.Math.abs(r4 - r3.f539f)) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo447d(android.support.design.widget.CoordinatorLayout r4, V r5, android.view.View r6) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r0 = r3.f538e
            r1 = 3
            if (r4 != r0) goto L_0x000d
            r3.mo446c(r1)
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f549p
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x0072
            boolean r4 = r3.f546m
            if (r4 != 0) goto L_0x001c
            goto L_0x0072
        L_0x001c:
            int r4 = r3.f545l
            r6 = 4
            if (r4 <= 0) goto L_0x0024
        L_0x0021:
            int r4 = r3.f538e
            goto L_0x0053
        L_0x0024:
            boolean r4 = r3.f540g
            if (r4 == 0) goto L_0x0036
            float r4 = r3.m469b()
            boolean r4 = r3.mo441a(r5, r4)
            if (r4 == 0) goto L_0x0036
            int r4 = r3.f547n
            r1 = 5
            goto L_0x0053
        L_0x0036:
            int r4 = r3.f545l
            if (r4 != 0) goto L_0x0050
            int r4 = r5.getTop()
            int r0 = r3.f538e
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r2 = r3.f539f
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            int r4 = r3.f539f
            r1 = r6
        L_0x0053:
            android.support.v4.widget.I r6 = r3.f543j
            int r0 = r5.getLeft()
            boolean r4 = r6.mo2152b((android.view.View) r5, (int) r0, (int) r4)
            if (r4 == 0) goto L_0x006c
            r4 = 2
            r3.mo446c(r4)
            android.support.design.widget.BottomSheetBehavior$b r4 = new android.support.design.widget.BottomSheetBehavior$b
            r4.<init>(r5, r1)
            android.support.p007v4.view.C0487v.m2277a((android.view.View) r5, (java.lang.Runnable) r4)
            goto L_0x006f
        L_0x006c:
            r3.mo446c(r1)
        L_0x006f:
            r4 = 0
            r3.f546m = r4
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo447d(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):void");
    }
}
