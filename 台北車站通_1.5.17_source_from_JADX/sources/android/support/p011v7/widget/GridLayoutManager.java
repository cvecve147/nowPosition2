package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p007v4.view.p009a.C0446b;
import android.support.p011v7.widget.LinearLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: H */
    boolean f2788H = false;

    /* renamed from: I */
    int f2789I = -1;

    /* renamed from: J */
    int[] f2790J;

    /* renamed from: K */
    View[] f2791K;

    /* renamed from: L */
    final SparseIntArray f2792L = new SparseIntArray();

    /* renamed from: M */
    final SparseIntArray f2793M = new SparseIntArray();

    /* renamed from: N */
    C0718c f2794N = new C0716a();

    /* renamed from: O */
    final Rect f2795O = new Rect();

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C0716a extends C0718c {
        /* renamed from: b */
        public int mo3394b(int i) {
            return 1;
        }

        /* renamed from: c */
        public int mo3395c(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static class C0717b extends RecyclerView.C0762j {

        /* renamed from: e */
        int f2796e = -1;

        /* renamed from: f */
        int f2797f = 0;

        public C0717b(int i, int i2) {
            super(i, i2);
        }

        public C0717b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0717b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0717b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public int mo3396e() {
            return this.f2796e;
        }

        /* renamed from: f */
        public int mo3397f() {
            return this.f2797f;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$c */
    public static abstract class C0718c {

        /* renamed from: a */
        final SparseIntArray f2798a = new SparseIntArray();

        /* renamed from: b */
        private boolean f2799b = false;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3398a(int i) {
            int size = this.f2798a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f2798a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f2798a.size()) {
                return -1;
            }
            return this.f2798a.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3399a(int i, int i2) {
            if (!this.f2799b) {
                return mo3395c(i, i2);
            }
            int i3 = this.f2798a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo3395c(i, i2);
            this.f2798a.put(i, c);
            return c;
        }

        /* renamed from: a */
        public void mo3400a() {
            this.f2798a.clear();
        }

        /* renamed from: b */
        public abstract int mo3394b(int i);

        /* renamed from: b */
        public int mo3401b(int i, int i2) {
            int b = mo3394b(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int b2 = mo3394b(i5);
                i3 += b2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = b2;
                }
            }
            return i3 + b > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3395c(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo3394b(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f2799b
                if (r2 == 0) goto L_0x0026
                android.util.SparseIntArray r2 = r5.f2798a
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0026
                int r2 = r5.mo3398a(r6)
                if (r2 < 0) goto L_0x0026
                android.util.SparseIntArray r3 = r5.f2798a
                int r3 = r3.get(r2)
                int r4 = r5.mo3394b(r2)
                int r3 = r3 + r4
                goto L_0x0036
            L_0x0026:
                r2 = r1
                r3 = r2
            L_0x0028:
                if (r2 >= r6) goto L_0x0039
                int r4 = r5.mo3394b(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x0033
                r3 = r1
                goto L_0x0036
            L_0x0033:
                if (r3 <= r7) goto L_0x0036
                r3 = r4
            L_0x0036:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0039:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x003d
                return r3
            L_0x003d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.GridLayoutManager.C0718c.mo3395c(int, int):int");
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo3393k(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo3393k(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3393k(RecyclerView.C0759i.m4093a(context, attributeSet, i, i2).f3039b);
    }

    /* renamed from: M */
    private void mo11848M() {
        int e = mo3903e();
        for (int i = 0; i < e; i++) {
            C0717b bVar = (C0717b) mo3890c(i).getLayoutParams();
            int a = bVar.mo3940a();
            this.f2792L.put(a, bVar.mo3397f());
            this.f2793M.put(a, bVar.mo3396e());
        }
    }

    /* renamed from: N */
    private void m3610N() {
        this.f2792L.clear();
        this.f2793M.clear();
    }

    /* renamed from: O */
    private void m3611O() {
        View[] viewArr = this.f2791K;
        if (viewArr == null || viewArr.length != this.f2789I) {
            this.f2791K = new View[this.f2789I];
        }
    }

    /* renamed from: P */
    private void m3612P() {
        int i;
        int i2;
        if (mo3497I() == 1) {
            i2 = mo3932r() - mo3930p();
            i = mo3928o();
        } else {
            i2 = mo3914h() - mo3926n();
            i = mo3931q();
        }
        mo11849l(i2 - i);
    }

    /* renamed from: a */
    private int m3613a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, int i) {
        if (!tVar.mo4016d()) {
            return this.f2794N.mo3401b(i, this.f2789I);
        }
        int a = pVar.mo3963a(i);
        if (a != -1) {
            return this.f2794N.mo3401b(a, this.f2789I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: a */
    private void m3614a(float f, int i) {
        mo11849l(Math.max(Math.round(f * ((float) this.f2789I)), i));
    }

    /* renamed from: a */
    private void m3615a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i3 = 1;
            i6 = i;
            i4 = 0;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.f2791K[i4];
            C0717b bVar = (C0717b) view.getLayoutParams();
            bVar.f2797f = m3621c(pVar, tVar, mo3923l(view));
            bVar.f2796e = i5;
            i5 += bVar.f2797f;
            i4 += i3;
        }
    }

    /* renamed from: a */
    private void m3616a(View view, int i, int i2, boolean z) {
        RecyclerView.C0762j jVar = (RecyclerView.C0762j) view.getLayoutParams();
        if (z ? mo3888b(view, i, i2, jVar) : mo3878a(view, i, i2, jVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    static int[] m3617a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: b */
    private int m3618b(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, int i) {
        if (!tVar.mo4016d()) {
            return this.f2794N.mo3399a(i, this.f2789I);
        }
        int i2 = this.f2793M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = pVar.mo3963a(i);
        if (a != -1) {
            return this.f2794N.mo3399a(a, this.f2789I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: b */
    private void m3619b(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, LinearLayoutManager.C0730a aVar, int i) {
        boolean z = i == 1;
        int b = m3618b(pVar, tVar, aVar.f2844b);
        if (z) {
            while (b > 0) {
                int i2 = aVar.f2844b;
                if (i2 > 0) {
                    aVar.f2844b = i2 - 1;
                    b = m3618b(pVar, tVar, aVar.f2844b);
                } else {
                    return;
                }
            }
            return;
        }
        int a = tVar.mo4011a() - 1;
        int i3 = aVar.f2844b;
        while (i3 < a) {
            int i4 = i3 + 1;
            int b2 = m3618b(pVar, tVar, i4);
            if (b2 <= b) {
                break;
            }
            i3 = i4;
            b = b2;
        }
        aVar.f2844b = i3;
    }

    /* renamed from: b */
    private void m3620b(View view, int i, boolean z) {
        int i2;
        int i3;
        C0717b bVar = (C0717b) view.getLayoutParams();
        Rect rect = bVar.f3043b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int f = mo3391f(bVar.f2796e, bVar.f2797f);
        if (this.f2832s == 1) {
            i2 = RecyclerView.C0759i.m4092a(f, i, i5, bVar.width, false);
            i3 = RecyclerView.C0759i.m4092a(this.f2834u.mo3086g(), mo3916i(), i4, bVar.height, true);
        } else {
            int a = RecyclerView.C0759i.m4092a(f, i, i4, bVar.height, false);
            int a2 = RecyclerView.C0759i.m4092a(this.f2834u.mo3086g(), mo3933s(), i5, bVar.width, true);
            i3 = a;
            i2 = a2;
        }
        m3616a(view, i2, i3, z);
    }

    /* renamed from: c */
    private int m3621c(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, int i) {
        if (!tVar.mo4016d()) {
            return this.f2794N.mo3394b(i);
        }
        int i2 = this.f2792L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = pVar.mo3963a(i);
        if (a != -1) {
            return this.f2794N.mo3394b(a);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: l */
    private void mo11849l(int i) {
        this.f2790J = m3617a(this.f2790J, this.f2789I, i);
    }

    /* renamed from: D */
    public boolean mo3366D() {
        return this.f2828D == null && !this.f2788H;
    }

    /* renamed from: L */
    public int mo3367L() {
        return this.f2789I;
    }

    /* renamed from: a */
    public int mo3368a(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        m3612P();
        m3611O();
        return super.mo3368a(i, pVar, tVar);
    }

    /* renamed from: a */
    public int mo3369a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        if (this.f2832s == 1) {
            return this.f2789I;
        }
        if (tVar.mo4011a() < 1) {
            return 0;
        }
        return m3613a(pVar, tVar, tVar.mo4011a() - 1) + 1;
    }

    /* renamed from: a */
    public RecyclerView.C0762j mo3370a(Context context, AttributeSet attributeSet) {
        return new C0717b(context, attributeSet);
    }

    /* renamed from: a */
    public RecyclerView.C0762j mo3371a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0717b((ViewGroup.MarginLayoutParams) layoutParams) : new C0717b(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3372a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, int i, int i2, int i3) {
        mo3494F();
        int f = this.f2834u.mo3084f();
        int b = this.f2834u.mo3076b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View c = mo3890c(i);
            int l = mo3923l(c);
            if (l >= 0 && l < i3 && m3618b(pVar, tVar, l) == 0) {
                if (((RecyclerView.C0762j) c.getLayoutParams()).mo3942c()) {
                    if (view2 == null) {
                        view2 = c;
                    }
                } else if (this.f2834u.mo3081d(c) < b && this.f2834u.mo3074a(c) >= f) {
                    return c;
                } else {
                    if (view == null) {
                        view = c;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f7, code lost:
        if (r13 == r11) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3373a(android.view.View r24, int r25, android.support.p011v7.widget.RecyclerView.C0769p r26, android.support.p011v7.widget.RecyclerView.C0775t r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo3891c((android.view.View) r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r5 = (android.support.p011v7.widget.GridLayoutManager.C0717b) r5
            int r6 = r5.f2796e
            int r5 = r5.f2797f
            int r5 = r5 + r6
            android.view.View r7 = super.mo3373a((android.view.View) r24, (int) r25, (android.support.p011v7.widget.RecyclerView.C0769p) r26, (android.support.p011v7.widget.RecyclerView.C0775t) r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo3522i((int) r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f2837x
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo3903e()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo3903e()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.f2832s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo3498J()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m3613a((android.support.p011v7.widget.RecyclerView.C0769p) r1, (android.support.p011v7.widget.RecyclerView.C0775t) r2, (int) r7)
            r8 = r10
            r17 = r8
            r15 = 0
            r16 = 0
            r10 = r4
        L_0x005d:
            if (r7 == r11) goto L_0x0147
            int r9 = r0.m3613a((android.support.p011v7.widget.RecyclerView.C0769p) r1, (android.support.p011v7.widget.RecyclerView.C0775t) r2, (int) r7)
            android.view.View r1 = r0.mo3890c((int) r7)
            if (r1 != r3) goto L_0x006b
            goto L_0x0147
        L_0x006b:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0147
        L_0x0077:
            r18 = r3
            r19 = r8
            r21 = r10
            r20 = r11
            r8 = r16
            r10 = r17
            goto L_0x0133
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r9 = (android.support.p011v7.widget.GridLayoutManager.C0717b) r9
            int r2 = r9.f2796e
            r18 = r3
            int r3 = r9.f2797f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b9
            if (r10 != 0) goto L_0x00b9
        L_0x00ad:
            r19 = r8
            r21 = r10
        L_0x00b1:
            r20 = r11
            r8 = r16
            r10 = r17
        L_0x00b7:
            r11 = 1
            goto L_0x0103
        L_0x00b9:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00da
            if (r10 <= r15) goto L_0x00d0
        L_0x00cd:
            r19 = r8
            goto L_0x00b1
        L_0x00d0:
            if (r10 != r15) goto L_0x00fa
            if (r2 <= r8) goto L_0x00d6
            r10 = 1
            goto L_0x00d7
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            if (r13 != r10) goto L_0x00fa
            goto L_0x00cd
        L_0x00da:
            if (r4 != 0) goto L_0x00fa
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo3880a((android.view.View) r1, (boolean) r8, (boolean) r11)
            if (r22 == 0) goto L_0x00fe
            r8 = r16
            if (r10 <= r8) goto L_0x00ef
            r10 = r17
            goto L_0x0103
        L_0x00ef:
            if (r10 != r8) goto L_0x0100
            r10 = r17
            if (r2 <= r10) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            if (r13 != r11) goto L_0x0102
            goto L_0x00b7
        L_0x00fa:
            r19 = r8
            r20 = r11
        L_0x00fe:
            r8 = r16
        L_0x0100:
            r10 = r17
        L_0x0102:
            r11 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x0133
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0120
            int r4 = r9.f2796e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r16 = r8
            r17 = r10
            r10 = r21
            r8 = r4
            r4 = r1
            goto L_0x013b
        L_0x0120:
            int r8 = r9.f2796e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r16 = r3
            r17 = r8
            r8 = r19
            goto L_0x013b
        L_0x0133:
            r16 = r8
            r17 = r10
            r8 = r19
            r10 = r21
        L_0x013b:
            int r7 = r7 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005d
        L_0x0147:
            r21 = r10
            if (r4 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            r4 = r21
        L_0x014e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.GridLayoutManager.mo3373a(android.view.View, int, android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$t):android.view.View");
    }

    /* renamed from: a */
    public void mo3374a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2790J == null) {
            super.mo3374a(rect, i, i2);
        }
        int o = mo3928o() + mo3930p();
        int q = mo3931q() + mo3926n();
        if (this.f2832s == 1) {
            i4 = RecyclerView.C0759i.m4091a(i2, rect.height() + q, mo3922l());
            int[] iArr = this.f2790J;
            i3 = RecyclerView.C0759i.m4091a(i, iArr[iArr.length - 1] + o, mo3924m());
        } else {
            i3 = RecyclerView.C0759i.m4091a(i, rect.width() + o, mo3924m());
            int[] iArr2 = this.f2790J;
            i4 = RecyclerView.C0759i.m4091a(i2, iArr2[iArr2.length - 1] + q, mo3922l());
        }
        mo3892c(i3, i4);
    }

    /* renamed from: a */
    public void mo3375a(C0718c cVar) {
        this.f2794N = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3376a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, LinearLayoutManager.C0730a aVar, int i) {
        super.mo3376a(pVar, tVar, aVar, i);
        m3612P();
        if (tVar.mo4011a() > 0 && !tVar.mo4016d()) {
            m3619b(pVar, tVar, aVar, i);
        }
        m3611O();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0224 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0222  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3377a(android.support.p011v7.widget.RecyclerView.C0769p r19, android.support.p011v7.widget.RecyclerView.C0775t r20, android.support.p011v7.widget.LinearLayoutManager.C0732c r21, android.support.p011v7.widget.LinearLayoutManager.C0731b r22) {
        /*
            r18 = this;
            r6 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            r8 = r22
            android.support.v7.widget.Aa r0 = r6.f2834u
            int r9 = r0.mo3082e()
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 1
            if (r9 == r10) goto L_0x0017
            r13 = r11
            goto L_0x0018
        L_0x0017:
            r13 = 0
        L_0x0018:
            int r0 = r18.mo3903e()
            if (r0 <= 0) goto L_0x0026
            int[] r0 = r6.f2790J
            int r3 = r6.f2789I
            r0 = r0[r3]
            r14 = r0
            goto L_0x0027
        L_0x0026:
            r14 = 0
        L_0x0027:
            if (r13 == 0) goto L_0x002c
            r18.m3612P()
        L_0x002c:
            int r0 = r7.f2856e
            if (r0 != r11) goto L_0x0032
            r15 = r11
            goto L_0x0033
        L_0x0032:
            r15 = 0
        L_0x0033:
            int r0 = r6.f2789I
            if (r15 != 0) goto L_0x0044
            int r0 = r7.f2855d
            int r0 = r6.m3618b((android.support.p011v7.widget.RecyclerView.C0769p) r1, (android.support.p011v7.widget.RecyclerView.C0775t) r2, (int) r0)
            int r3 = r7.f2855d
            int r3 = r6.m3621c(r1, r2, r3)
            int r0 = r0 + r3
        L_0x0044:
            r4 = 0
            r5 = 0
        L_0x0046:
            int r3 = r6.f2789I
            if (r5 >= r3) goto L_0x009f
            boolean r3 = r7.mo3540a((android.support.p011v7.widget.RecyclerView.C0775t) r2)
            if (r3 == 0) goto L_0x009f
            if (r0 <= 0) goto L_0x009f
            int r3 = r7.f2855d
            int r10 = r6.m3621c(r1, r2, r3)
            int r12 = r6.f2789I
            if (r10 > r12) goto L_0x0071
            int r0 = r0 - r10
            if (r0 >= 0) goto L_0x0060
            goto L_0x009f
        L_0x0060:
            android.view.View r3 = r7.mo3537a((android.support.p011v7.widget.RecyclerView.C0769p) r1)
            if (r3 != 0) goto L_0x0067
            goto L_0x009f
        L_0x0067:
            int r4 = r4 + r10
            android.view.View[] r10 = r6.f2791K
            r10[r5] = r3
            int r5 = r5 + 1
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0046
        L_0x0071:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f2789I
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009f:
            if (r5 != 0) goto L_0x00a4
            r8.f2849b = r11
            return
        L_0x00a4:
            r10 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r5
            r12 = r5
            r5 = r15
            r0.m3615a((android.support.p011v7.widget.RecyclerView.C0769p) r1, (android.support.p011v7.widget.RecyclerView.C0775t) r2, (int) r3, (int) r4, (boolean) r5)
            r0 = 0
            r1 = 0
        L_0x00b3:
            if (r0 >= r12) goto L_0x0100
            android.view.View[] r2 = r6.f2791K
            r2 = r2[r0]
            java.util.List<android.support.v7.widget.RecyclerView$w> r3 = r7.f2862k
            if (r3 != 0) goto L_0x00c9
            if (r15 == 0) goto L_0x00c4
            r6.mo3885b((android.view.View) r2)
            r3 = 0
            goto L_0x00d3
        L_0x00c4:
            r3 = 0
            r6.mo3886b((android.view.View) r2, (int) r3)
            goto L_0x00d3
        L_0x00c9:
            r3 = 0
            if (r15 == 0) goto L_0x00d0
            r6.mo3861a((android.view.View) r2)
            goto L_0x00d3
        L_0x00d0:
            r6.mo3862a((android.view.View) r2, (int) r3)
        L_0x00d3:
            android.graphics.Rect r4 = r6.f2795O
            r6.mo3866a((android.view.View) r2, (android.graphics.Rect) r4)
            r6.m3620b((android.view.View) r2, (int) r9, (boolean) r3)
            android.support.v7.widget.Aa r3 = r6.f2834u
            int r3 = r3.mo3077b((android.view.View) r2)
            if (r3 <= r1) goto L_0x00e4
            r1 = r3
        L_0x00e4:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r3 = (android.support.p011v7.widget.GridLayoutManager.C0717b) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            android.support.v7.widget.Aa r5 = r6.f2834u
            int r2 = r5.mo3079c(r2)
            float r2 = (float) r2
            float r2 = r2 * r4
            int r3 = r3.f2797f
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fd
            r10 = r2
        L_0x00fd:
            int r0 = r0 + 1
            goto L_0x00b3
        L_0x0100:
            if (r13 == 0) goto L_0x011e
            r6.m3614a((float) r10, (int) r14)
            r0 = 0
            r1 = 0
        L_0x0107:
            if (r0 >= r12) goto L_0x011e
            android.view.View[] r2 = r6.f2791K
            r2 = r2[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r6.m3620b((android.view.View) r2, (int) r3, (boolean) r11)
            android.support.v7.widget.Aa r3 = r6.f2834u
            int r2 = r3.mo3077b((android.view.View) r2)
            if (r2 <= r1) goto L_0x011b
            r1 = r2
        L_0x011b:
            int r0 = r0 + 1
            goto L_0x0107
        L_0x011e:
            r0 = 0
        L_0x011f:
            if (r0 >= r12) goto L_0x0181
            android.view.View[] r2 = r6.f2791K
            r2 = r2[r0]
            android.support.v7.widget.Aa r3 = r6.f2834u
            int r3 = r3.mo3077b((android.view.View) r2)
            if (r3 == r1) goto L_0x017b
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r3 = (android.support.p011v7.widget.GridLayoutManager.C0717b) r3
            android.graphics.Rect r4 = r3.f3043b
            int r5 = r4.top
            int r9 = r4.bottom
            int r5 = r5 + r9
            int r9 = r3.topMargin
            int r5 = r5 + r9
            int r9 = r3.bottomMargin
            int r5 = r5 + r9
            int r9 = r4.left
            int r4 = r4.right
            int r9 = r9 + r4
            int r4 = r3.leftMargin
            int r9 = r9 + r4
            int r4 = r3.rightMargin
            int r9 = r9 + r4
            int r4 = r3.f2796e
            int r10 = r3.f2797f
            int r4 = r6.mo3391f(r4, r10)
            int r10 = r6.f2832s
            if (r10 != r11) goto L_0x0167
            int r3 = r3.width
            r10 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r3 = android.support.p011v7.widget.RecyclerView.C0759i.m4092a((int) r4, (int) r10, (int) r9, (int) r3, (boolean) r13)
            int r4 = r1 - r5
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r10)
            goto L_0x0177
        L_0x0167:
            r10 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r9 = r1 - r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r3 = r3.height
            int r4 = android.support.p011v7.widget.RecyclerView.C0759i.m4092a((int) r4, (int) r10, (int) r5, (int) r3, (boolean) r13)
            r3 = r9
        L_0x0177:
            r6.m3616a((android.view.View) r2, (int) r3, (int) r4, (boolean) r11)
            goto L_0x017e
        L_0x017b:
            r10 = 1073741824(0x40000000, float:2.0)
            r13 = 0
        L_0x017e:
            int r0 = r0 + 1
            goto L_0x011f
        L_0x0181:
            r13 = 0
            r8.f2848a = r1
            int r0 = r6.f2832s
            r2 = -1
            if (r0 != r11) goto L_0x019c
            int r0 = r7.f2857f
            if (r0 != r2) goto L_0x0194
            int r0 = r7.f2853b
            int r1 = r0 - r1
            r3 = r0
            r2 = r1
            goto L_0x0199
        L_0x0194:
            int r0 = r7.f2853b
            int r1 = r1 + r0
            r2 = r0
            r3 = r1
        L_0x0199:
            r0 = r13
            r1 = r0
            goto L_0x01b1
        L_0x019c:
            int r0 = r7.f2857f
            if (r0 != r2) goto L_0x01ac
            int r0 = r7.f2853b
            int r1 = r0 - r1
            r2 = r13
            r3 = r2
            r17 = r1
            r1 = r0
            r0 = r17
            goto L_0x01b1
        L_0x01ac:
            int r0 = r7.f2853b
            int r1 = r1 + r0
            r2 = r13
            r3 = r2
        L_0x01b1:
            if (r13 >= r12) goto L_0x0236
            android.view.View[] r4 = r6.f2791K
            r7 = r4[r13]
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            r9 = r4
            android.support.v7.widget.GridLayoutManager$b r9 = (android.support.p011v7.widget.GridLayoutManager.C0717b) r9
            int r4 = r6.f2832s
            if (r4 != r11) goto L_0x01f4
            boolean r0 = r18.mo3498J()
            if (r0 == 0) goto L_0x01e1
            int r0 = r18.mo3928o()
            int[] r1 = r6.f2790J
            int r4 = r6.f2789I
            int r5 = r9.f2796e
            int r4 = r4 - r5
            r1 = r1[r4]
            int r0 = r0 + r1
            android.support.v7.widget.Aa r1 = r6.f2834u
            int r1 = r1.mo3079c(r7)
            int r1 = r0 - r1
            r15 = r0
            r10 = r1
            goto L_0x0208
        L_0x01e1:
            int r0 = r18.mo3928o()
            int[] r1 = r6.f2790J
            int r4 = r9.f2796e
            r1 = r1[r4]
            int r0 = r0 + r1
            android.support.v7.widget.Aa r1 = r6.f2834u
            int r1 = r1.mo3079c(r7)
            int r1 = r1 + r0
            goto L_0x0206
        L_0x01f4:
            int r2 = r18.mo3931q()
            int[] r3 = r6.f2790J
            int r4 = r9.f2796e
            r3 = r3[r4]
            int r2 = r2 + r3
            android.support.v7.widget.Aa r3 = r6.f2834u
            int r3 = r3.mo3079c(r7)
            int r3 = r3 + r2
        L_0x0206:
            r10 = r0
            r15 = r1
        L_0x0208:
            r14 = r2
            r16 = r3
            r0 = r18
            r1 = r7
            r2 = r10
            r3 = r14
            r4 = r15
            r5 = r16
            r0.mo3864a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
            boolean r0 = r9.mo3942c()
            if (r0 != 0) goto L_0x0222
            boolean r0 = r9.mo3941b()
            if (r0 == 0) goto L_0x0224
        L_0x0222:
            r8.f2850c = r11
        L_0x0224:
            boolean r0 = r8.f2851d
            boolean r1 = r7.hasFocusable()
            r0 = r0 | r1
            r8.f2851d = r0
            int r13 = r13 + 1
            r0 = r10
            r2 = r14
            r1 = r15
            r3 = r16
            goto L_0x01b1
        L_0x0236:
            android.view.View[] r0 = r6.f2791K
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.GridLayoutManager.mo3377a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$t, android.support.v7.widget.LinearLayoutManager$c, android.support.v7.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: a */
    public void mo3378a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, View view, C0446b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0717b)) {
            super.mo3867a(view, bVar);
            return;
        }
        C0717b bVar2 = (C0717b) layoutParams;
        int a = m3613a(pVar, tVar, bVar2.mo3940a());
        if (this.f2832s == 0) {
            int e = bVar2.mo3396e();
            i3 = bVar2.mo3397f();
            i = 1;
            z2 = this.f2789I > 1 && bVar2.mo3397f() == this.f2789I;
            z = false;
            i4 = e;
            i2 = a;
        } else {
            i3 = 1;
            i2 = bVar2.mo3396e();
            i = bVar2.mo3397f();
            z2 = this.f2789I > 1 && bVar2.mo3397f() == this.f2789I;
            z = false;
            i4 = a;
        }
        bVar.mo1865b((Object) C0446b.C0449c.m2139a(i4, i3, i2, i, z2, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3379a(RecyclerView.C0775t tVar, LinearLayoutManager.C0732c cVar, RecyclerView.C0759i.C0760a aVar) {
        int i = this.f2789I;
        for (int i2 = 0; i2 < this.f2789I && cVar.mo3540a(tVar) && i > 0; i2++) {
            int i3 = cVar.f2855d;
            aVar.mo3939a(i3, Math.max(0, cVar.f2858g));
            i -= this.f2794N.mo3394b(i3);
            cVar.f2855d += cVar.f2856e;
        }
    }

    /* renamed from: a */
    public void mo3380a(RecyclerView recyclerView, int i, int i2) {
        this.f2794N.mo3400a();
    }

    /* renamed from: a */
    public void mo3381a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f2794N.mo3400a();
    }

    /* renamed from: a */
    public void mo3382a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f2794N.mo3400a();
    }

    /* renamed from: a */
    public boolean mo3383a(RecyclerView.C0762j jVar) {
        return jVar instanceof C0717b;
    }

    /* renamed from: b */
    public int mo3384b(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        m3612P();
        m3611O();
        return super.mo3384b(i, pVar, tVar);
    }

    /* renamed from: b */
    public int mo3385b(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        if (this.f2832s == 0) {
            return this.f2789I;
        }
        if (tVar.mo4011a() < 1) {
            return 0;
        }
        return m3613a(pVar, tVar, tVar.mo4011a() - 1) + 1;
    }

    /* renamed from: b */
    public void mo3386b(RecyclerView recyclerView, int i, int i2) {
        this.f2794N.mo3400a();
    }

    /* renamed from: b */
    public void mo3387b(boolean z) {
        if (!z) {
            super.mo3387b(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: c */
    public RecyclerView.C0762j mo3388c() {
        return this.f2832s == 0 ? new C0717b(-2, -1) : new C0717b(-1, -2);
    }

    /* renamed from: d */
    public void mo3389d(RecyclerView recyclerView) {
        this.f2794N.mo3400a();
    }

    /* renamed from: e */
    public void mo3390e(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        if (tVar.mo4016d()) {
            mo11848M();
        }
        super.mo3390e(pVar, tVar);
        m3610N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo3391f(int i, int i2) {
        if (this.f2832s != 1 || !mo3498J()) {
            int[] iArr = this.f2790J;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2790J;
        int i3 = this.f2789I;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: g */
    public void mo3392g(RecyclerView.C0775t tVar) {
        super.mo3392g(tVar);
        this.f2788H = false;
    }

    /* renamed from: k */
    public void mo3393k(int i) {
        if (i != this.f2789I) {
            this.f2788H = true;
            if (i >= 1) {
                this.f2789I = i;
                this.f2794N.mo3400a();
                mo3938z();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }
}
