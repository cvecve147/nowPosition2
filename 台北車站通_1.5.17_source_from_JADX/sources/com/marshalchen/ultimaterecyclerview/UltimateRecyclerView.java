package com.marshalchen.ultimaterecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.p007v4.widget.SwipeRefreshLayout;
import android.support.p011v7.widget.GridLayoutManager;
import android.support.p011v7.widget.LinearLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.support.p011v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.marshalchen.ultimaterecyclerview.p083ui.VerticalSwipeRefreshLayout;
import com.marshalchen.ultimaterecyclerview.p083ui.floatingactionbutton.C4202b;
import com.marshalchen.ultimaterecyclerview.p083ui.p084a.C4200a;
import com.marshalchen.ultimaterecyclerview.uiUtils.C4204a;
import com.marshalchen.ultimaterecyclerview.uiUtils.SavedStateScrolling;

public class UltimateRecyclerView extends FrameLayout implements C4185h {

    /* renamed from: a */
    public static int f12348a = 0;

    /* renamed from: b */
    public static int f12349b = 1;

    /* renamed from: c */
    public static int f12350c = 2;

    /* renamed from: d */
    public static int f12351d = 3;

    /* renamed from: e */
    public static int f12352e = 0;

    /* renamed from: f */
    public static int f12353f = 1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static boolean f12354g = false;

    /* renamed from: A */
    private int f12355A;

    /* renamed from: B */
    private int f12356B;

    /* renamed from: C */
    private SparseIntArray f12357C = new SparseIntArray();

    /* renamed from: D */
    private C4162a f12358D;

    /* renamed from: E */
    private C4165b f12359E;

    /* renamed from: F */
    private boolean f12360F;

    /* renamed from: G */
    private boolean f12361G;

    /* renamed from: H */
    private boolean f12362H;

    /* renamed from: I */
    private boolean f12363I = false;

    /* renamed from: J */
    private MotionEvent f12364J;

    /* renamed from: K */
    private ViewGroup f12365K;

    /* renamed from: L */
    private View f12366L;

    /* renamed from: M */
    protected ViewStub f12367M;

    /* renamed from: N */
    protected View f12368N;

    /* renamed from: O */
    protected int f12369O;

    /* renamed from: P */
    protected C4200a f12370P;

    /* renamed from: Q */
    protected ViewStub f12371Q;

    /* renamed from: R */
    protected View f12372R;

    /* renamed from: S */
    protected int f12373S;

    /* renamed from: T */
    protected int[] f12374T = null;

    /* renamed from: U */
    public int f12375U = 3;

    /* renamed from: V */
    public VerticalSwipeRefreshLayout f12376V;

    /* renamed from: W */
    private C4204a f12377W;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public C4158a f12378aa;
    /* access modifiers changed from: private */

    /* renamed from: ba */
    public int f12379ba;

    /* renamed from: ca */
    private final float f12380ca = 0.5f;

    /* renamed from: da */
    private C4161d f12381da;

    /* renamed from: ea */
    private LayoutInflater f12382ea;

    /* renamed from: fa */
    private boolean f12383fa = false;

    /* renamed from: ga */
    private int f12384ga;

    /* renamed from: h */
    private int f12385h;

    /* renamed from: ha */
    private int f12386ha = 0;

    /* renamed from: i */
    private int f12387i;

    /* renamed from: ia */
    private int f12388ia = 0;

    /* renamed from: j */
    public RecyclerView f12389j;

    /* renamed from: ja */
    private int f12390ja = 0;

    /* renamed from: k */
    protected C4202b f12391k;

    /* renamed from: ka */
    private int f12392ka;

    /* renamed from: l */
    private C4160c f12393l;

    /* renamed from: la */
    private int[] f12394la;

    /* renamed from: m */
    private int f12395m;

    /* renamed from: ma */
    private float f12396ma = 0.5f;

    /* renamed from: n */
    protected RecyclerView.C0766n f12397n;

    /* renamed from: o */
    protected C4159b f12398o;

    /* renamed from: p */
    private boolean f12399p = false;

    /* renamed from: q */
    protected int f12400q;

    /* renamed from: r */
    protected int f12401r;

    /* renamed from: s */
    protected int f12402s;

    /* renamed from: t */
    protected int f12403t;

    /* renamed from: u */
    protected int f12404u;

    /* renamed from: v */
    protected boolean f12405v;

    /* renamed from: w */
    private C4195q f12406w;

    /* renamed from: x */
    private int f12407x;

    /* renamed from: y */
    private int f12408y = -1;

    /* renamed from: z */
    private int f12409z;

    /* renamed from: com.marshalchen.ultimaterecyclerview.UltimateRecyclerView$a */
    public static class C4158a extends RelativeLayout {

        /* renamed from: a */
        private int f12410a;

        public C4158a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            if (UltimateRecyclerView.f12354g) {
                canvas.clipRect(new Rect(getLeft(), getTop(), getRight(), getBottom() + this.f12410a));
            }
            super.dispatchDraw(canvas);
        }

        public void setClipY(int i) {
            this.f12410a = i;
            invalidate();
        }
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.UltimateRecyclerView$b */
    public enum C4159b {
        LINEAR,
        GRID,
        STAGGERED_GRID,
        PUZZLE
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.UltimateRecyclerView$c */
    public interface C4160c {
        /* renamed from: a */
        void mo11787a(int i, int i2);
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.UltimateRecyclerView$d */
    public interface C4161d {
        /* renamed from: a */
        void mo11788a(float f, float f2, View view);
    }

    public UltimateRecyclerView(Context context) {
        super(context);
        mo11747c();
    }

    public UltimateRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo11745a(attributeSet);
        mo11747c();
    }

    public UltimateRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo11745a(attributeSet);
        mo11747c();
    }

    /* renamed from: a */
    private int m16598a(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    private int m16603b(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    private void m16604b(int i, int i2) {
        this.f12385h = i;
        this.f12387i = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16605b(RecyclerView recyclerView) {
        int i;
        int i2;
        C4159b bVar;
        RecyclerView.C0759i layoutManager = recyclerView.getLayoutManager();
        if (this.f12398o == null) {
            if (layoutManager instanceof GridLayoutManager) {
                bVar = C4159b.GRID;
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                bVar = C4159b.STAGGERED_GRID;
            } else if (layoutManager instanceof LinearLayoutManager) {
                bVar = C4159b.LINEAR;
            } else {
                throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager and StaggeredGridLayoutManager");
            }
            this.f12398o = bVar;
        }
        this.f12388ia = layoutManager.mo3918j();
        this.f12386ha = layoutManager.mo3903e();
        int i3 = C4193o.f12477a[this.f12398o.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3 && (layoutManager instanceof StaggeredGridLayoutManager)) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    if (this.f12394la == null) {
                        this.f12394la = new int[staggeredGridLayoutManager.mo4125K()];
                    }
                    staggeredGridLayoutManager.mo4135b(this.f12394la);
                    this.f12395m = m16598a(this.f12394la);
                    staggeredGridLayoutManager.mo4132a(this.f12394la);
                    i2 = m16603b(this.f12394la);
                }
            } else if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                this.f12395m = gridLayoutManager.mo3496H();
                i2 = gridLayoutManager.mo3495G();
            }
            this.f12392ka = i2;
        } else {
            this.f12392ka = this.f12377W.mo11930a();
            this.f12395m = this.f12377W.mo11931b();
        }
        boolean z = false;
        if (this.f12399p && (i = this.f12388ia) > this.f12390ja) {
            this.f12399p = false;
            this.f12390ja = i;
        }
        if (this.f12388ia - this.f12386ha <= this.f12392ka) {
            z = true;
        }
        if (z) {
            if (this.f12363I && !this.f12399p) {
                this.f12393l.mo11787a(this.f12389j.getAdapter().mo337a(), this.f12395m);
                this.f12399p = true;
            }
            this.f12406w.mo11874i();
            this.f12390ja = this.f12388ia;
        }
    }

    /* renamed from: g */
    private void m16607g() {
        int i;
        View view;
        if (this.f12406w.mo11867f() != null) {
            if (this.f12406w.mo11864d()) {
                view = this.f12406w.mo11867f();
                i = 0;
            } else {
                view = this.f12406w.mo11867f();
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: h */
    private void m16608h() {
        this.f12389j.mo3655b(this.f12397n);
        this.f12397n = new C4188k(this);
        this.f12389j.mo3636a(this.f12397n);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m16609i() {
        int i = 0;
        this.f12399p = false;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = this.f12376V;
        if (verticalSwipeRefreshLayout != null) {
            verticalSwipeRefreshLayout.setRefreshing(false);
        }
        C4195q qVar = this.f12406w;
        if (qVar != null) {
            if (!this.f12383fa) {
                this.f12383fa = true;
                if (qVar.mo11799e() == 0) {
                    ViewStub viewStub = this.f12367M;
                    if (this.f12368N != null) {
                        i = 8;
                    }
                    viewStub.setVisibility(i);
                } else if (this.f12369O != 0) {
                    m16607g();
                    this.f12367M.setVisibility(8);
                }
            } else {
                setRefreshing(false);
                m16607g();
            }
        }
    }

    private void setAdapterInternal(C4195q qVar) {
        View view;
        this.f12406w = qVar;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = this.f12376V;
        if (verticalSwipeRefreshLayout != null) {
            verticalSwipeRefreshLayout.setRefreshing(false);
        }
        C4195q qVar2 = this.f12406w;
        if (qVar2 != null) {
            qVar2.mo3788a((RecyclerView.C0750c) new C4191m(this));
        }
        this.f12377W = C4204a.m16760a(this.f12389j);
        this.f12406w.mo11872h(this.f12385h);
        this.f12406w.mo11871g(this.f12387i);
        if (this.f12406w.mo11799e() == 0 && this.f12387i == f12352e) {
            mo11750f();
        }
        if (this.f12387i == f12353f) {
            mo11746b();
        }
        if (this.f12406w.mo11867f() == null && (view = this.f12366L) != null) {
            this.f12406w.mo11868f(view);
            this.f12406w.mo11861a(true);
            this.f12406w.mo3798c();
            this.f12363I = true;
        }
        C4158a aVar = this.f12378aa;
        if (aVar != null) {
            this.f12406w.mo11860a(aVar);
        }
    }

    private void setEmptyView(int i) {
        if (this.f12368N != null || i <= 0) {
            Log.d("View", "unabled to set empty view because the empty has been set");
            return;
        }
        this.f12369O = i;
        this.f12367M.setLayoutResource(i);
        if (Build.VERSION.SDK_INT >= 16) {
            this.f12367M.setLayoutInflater(this.f12382ea);
        }
        this.f12368N = this.f12367M.inflate();
    }

    private void setEmptyView(View view) {
        if (view != null) {
            this.f12368N = view;
        }
    }

    /* renamed from: a */
    public void mo11742a(float f) {
        float f2 = this.f12396ma * f;
        if (Build.VERSION.SDK_INT >= 11 && f < ((float) this.f12378aa.getHeight())) {
            this.f12378aa.setTranslationY(f2);
        } else if (f < ((float) this.f12378aa.getHeight())) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f2, f2);
            translateAnimation.setFillAfter(true);
            translateAnimation.setDuration(0);
            this.f12378aa.startAnimation(translateAnimation);
        }
        this.f12378aa.setClipY(Math.round(f2));
        if (this.f12381da != null) {
            float f3 = 1.0f;
            if (this.f12389j.mo3650b(0) != null) {
                f3 = Math.min(1.0f, f2 / (((float) this.f12378aa.getHeight()) * this.f12396ma));
            }
            this.f12381da.mo11788a(f3, f, this.f12378aa);
        }
    }

    /* renamed from: a */
    public final void mo11743a(int i, int i2) {
        setEmptyView(i);
        m16604b(i2, f12352e);
        this.f12367M.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11744a(android.support.p011v7.widget.RecyclerView r10) {
        /*
            r9 = this;
            com.marshalchen.ultimaterecyclerview.b r0 = r9.f12359E
            if (r0 == 0) goto L_0x010d
            int r0 = r9.getChildCount()
            if (r0 <= 0) goto L_0x010d
            r0 = 0
            android.view.View r1 = r10.getChildAt(r0)
            int r1 = r10.mo3688f((android.view.View) r1)
            int r2 = r10.getChildCount()
            r3 = 1
            int r2 = r2 - r3
            android.view.View r2 = r10.getChildAt(r2)
            int r2 = r10.mo3688f((android.view.View) r2)
            r5 = r0
            r4 = r1
        L_0x0023:
            if (r4 > r2) goto L_0x005a
            android.view.View r6 = r10.getChildAt(r5)     // Catch:{ NullPointerException -> 0x0051 }
            android.util.SparseIntArray r7 = r9.f12357C     // Catch:{ NullPointerException -> 0x0051 }
            int r7 = r7.indexOfKey(r4)     // Catch:{ NullPointerException -> 0x0051 }
            if (r7 < 0) goto L_0x003f
            if (r6 == 0) goto L_0x0046
            int r7 = r6.getHeight()     // Catch:{ NullPointerException -> 0x0051 }
            android.util.SparseIntArray r8 = r9.f12357C     // Catch:{ NullPointerException -> 0x0051 }
            int r8 = r8.get(r4)     // Catch:{ NullPointerException -> 0x0051 }
            if (r7 == r8) goto L_0x0046
        L_0x003f:
            if (r6 == 0) goto L_0x0046
            int r6 = r6.getHeight()     // Catch:{ NullPointerException -> 0x0051 }
            goto L_0x0047
        L_0x0046:
            r6 = r0
        L_0x0047:
            android.util.SparseIntArray r7 = r9.f12357C     // Catch:{ NullPointerException -> 0x0051 }
            r7.put(r4, r6)     // Catch:{ NullPointerException -> 0x0051 }
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0051:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.String r4 = ""
            com.marshalchen.ultimaterecyclerview.C4186i.m16670a(r2, r4)
        L_0x005a:
            android.view.View r10 = r10.getChildAt(r0)
            if (r10 == 0) goto L_0x010d
            int r2 = r9.f12407x
            if (r2 >= r1) goto L_0x0096
            int r2 = r1 - r2
            if (r2 == r3) goto L_0x0086
            int r2 = r1 + -1
            r3 = r0
        L_0x006b:
            int r4 = r9.f12407x
            if (r2 <= r4) goto L_0x0087
            android.util.SparseIntArray r4 = r9.f12357C
            int r4 = r4.indexOfKey(r2)
            if (r4 <= 0) goto L_0x007e
            android.util.SparseIntArray r4 = r9.f12357C
            int r4 = r4.get(r2)
            goto L_0x0082
        L_0x007e:
            int r4 = r10.getHeight()
        L_0x0082:
            int r3 = r3 + r4
            int r2 = r2 + -1
            goto L_0x006b
        L_0x0086:
            r3 = r0
        L_0x0087:
            int r2 = r9.f12409z
            int r4 = r9.f12408y
            int r4 = r4 + r3
            int r2 = r2 + r4
        L_0x008d:
            r9.f12409z = r2
            int r2 = r10.getHeight()
            r9.f12408y = r2
            goto L_0x00cb
        L_0x0096:
            if (r1 >= r2) goto L_0x00c1
            int r4 = r2 - r1
            if (r4 == r3) goto L_0x00b7
            int r2 = r2 - r3
            r3 = r0
        L_0x009e:
            if (r2 <= r1) goto L_0x00b8
            android.util.SparseIntArray r4 = r9.f12357C
            int r4 = r4.indexOfKey(r2)
            if (r4 <= 0) goto L_0x00af
            android.util.SparseIntArray r4 = r9.f12357C
            int r4 = r4.get(r2)
            goto L_0x00b3
        L_0x00af:
            int r4 = r10.getHeight()
        L_0x00b3:
            int r3 = r3 + r4
            int r2 = r2 + -1
            goto L_0x009e
        L_0x00b7:
            r3 = r0
        L_0x00b8:
            int r2 = r9.f12409z
            int r4 = r10.getHeight()
            int r4 = r4 + r3
            int r2 = r2 - r4
            goto L_0x008d
        L_0x00c1:
            if (r1 != 0) goto L_0x00cb
            int r2 = r10.getHeight()
            r9.f12408y = r2
            r9.f12409z = r0
        L_0x00cb:
            int r2 = r9.f12408y
            if (r2 >= 0) goto L_0x00d1
            r9.f12408y = r0
        L_0x00d1:
            int r2 = r9.f12409z
            int r10 = r10.getTop()
            int r2 = r2 - r10
            r9.f12356B = r2
            r9.f12407x = r1
            com.marshalchen.ultimaterecyclerview.b r10 = r9.f12359E
            int r1 = r9.f12356B
            boolean r2 = r9.f12360F
            boolean r3 = r9.f12361G
            r10.mo11790a(r1, r2, r3)
            int r10 = r9.f12355A
            int r1 = r9.f12356B
            if (r10 >= r1) goto L_0x00fa
            boolean r10 = r9.f12360F
            if (r10 == 0) goto L_0x00f7
            r9.f12360F = r0
            com.marshalchen.ultimaterecyclerview.a r10 = com.marshalchen.ultimaterecyclerview.C4162a.STOP
            r9.f12358D = r10
        L_0x00f7:
            com.marshalchen.ultimaterecyclerview.a r10 = com.marshalchen.ultimaterecyclerview.C4162a.UP
            goto L_0x0101
        L_0x00fa:
            if (r1 >= r10) goto L_0x00ff
            com.marshalchen.ultimaterecyclerview.a r10 = com.marshalchen.ultimaterecyclerview.C4162a.DOWN
            goto L_0x0101
        L_0x00ff:
            com.marshalchen.ultimaterecyclerview.a r10 = com.marshalchen.ultimaterecyclerview.C4162a.STOP
        L_0x0101:
            r9.f12358D = r10
            boolean r10 = r9.f12360F
            if (r10 == 0) goto L_0x0109
            r9.f12360F = r0
        L_0x0109:
            int r10 = r9.f12356B
            r9.f12355A = r10
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marshalchen.ultimaterecyclerview.UltimateRecyclerView.mo11744a(android.support.v7.widget.RecyclerView):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11745a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4183g.UltimateRecyclerview);
        try {
            this.f12400q = (int) obtainStyledAttributes.getDimension(C4183g.UltimateRecyclerview_recyclerviewPadding, -1.1f);
            this.f12401r = (int) obtainStyledAttributes.getDimension(C4183g.UltimateRecyclerview_recyclerviewPaddingTop, 0.0f);
            this.f12402s = (int) obtainStyledAttributes.getDimension(C4183g.UltimateRecyclerview_recyclerviewPaddingBottom, 0.0f);
            this.f12403t = (int) obtainStyledAttributes.getDimension(C4183g.UltimateRecyclerview_recyclerviewPaddingLeft, 0.0f);
            this.f12404u = (int) obtainStyledAttributes.getDimension(C4183g.UltimateRecyclerview_recyclerviewPaddingRight, 0.0f);
            this.f12405v = obtainStyledAttributes.getBoolean(C4183g.UltimateRecyclerview_recyclerviewClipToPadding, false);
            this.f12369O = obtainStyledAttributes.getResourceId(C4183g.UltimateRecyclerview_recyclerviewEmptyView, 0);
            this.f12373S = obtainStyledAttributes.getResourceId(C4183g.UltimateRecyclerview_recyclerviewFloatingActionView, 0);
            this.f12384ga = obtainStyledAttributes.getInt(C4183g.UltimateRecyclerview_recyclerviewScrollbars, 0);
            int resourceId = obtainStyledAttributes.getResourceId(C4183g.UltimateRecyclerview_recyclerviewDefaultSwipeColor, 0);
            if (resourceId != 0) {
                this.f12374T = getResources().getIntArray(resourceId);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo11746b() {
        ViewStub viewStub = this.f12367M;
        if (viewStub == null || this.f12368N == null) {
            Log.d("View", "there is no such empty view");
        } else {
            viewStub.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11747c() {
        this.f12382ea = (LayoutInflater) getContext().getSystemService("layout_inflater");
        View inflate = this.f12382ea.inflate(C4182f.ultimate_recycler_view_layout, this);
        this.f12389j = (RecyclerView) inflate.findViewById(C4171e.ultimate_list);
        this.f12376V = (VerticalSwipeRefreshLayout) inflate.findViewById(C4171e.swipe_refresh_layout);
        mo11749e();
        this.f12376V.setEnabled(false);
        RecyclerView recyclerView = this.f12389j;
        if (recyclerView != null) {
            recyclerView.setClipToPadding(this.f12405v);
            int i = this.f12400q;
            if (((float) i) != -1.1f) {
                this.f12389j.setPadding(i, i, i, i);
            } else {
                this.f12389j.setPadding(this.f12403t, this.f12401r, this.f12404u, this.f12402s);
            }
        }
        this.f12391k = (C4202b) inflate.findViewById(C4171e.defaultFloatingActionButton);
        mo11748d();
        this.f12367M = (ViewStub) inflate.findViewById(C4171e.emptyview);
        int i2 = this.f12369O;
        if (i2 != 0) {
            this.f12367M.setLayoutResource(i2);
            this.f12368N = this.f12367M.inflate();
            this.f12367M.setVisibility(8);
        }
        this.f12371Q = (ViewStub) inflate.findViewById(C4171e.floatingActionViewStub);
        this.f12371Q.setLayoutResource(this.f12373S);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11748d() {
        this.f12389j.mo3655b(this.f12397n);
        this.f12397n = new C4189l(this);
        this.f12389j.mo3636a(this.f12397n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo11749e() {
        int i;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        int i2 = this.f12384ga;
        if (i2 == 1) {
            this.f12376V.removeView(this.f12389j);
            i = C4182f.vertical_recycler_view;
        } else if (i2 == 2) {
            this.f12376V.removeView(this.f12389j);
            i = C4182f.horizontal_recycler_view;
        } else {
            return;
        }
        this.f12389j = (RecyclerView) layoutInflater.inflate(i, this.f12376V, true).findViewById(C4171e.ultimate_list);
    }

    /* renamed from: f */
    public boolean mo11750f() {
        C4195q qVar;
        if (this.f12367M == null || this.f12368N == null || (qVar = this.f12406w) == null) {
            Log.d("View", "it is unable to show empty view");
            return false;
        } else if (qVar.mo11870g() != f12348a && this.f12406w.mo11870g() != f12350c) {
            return true;
        } else {
            this.f12367M.setVisibility(0);
            C4200a aVar = this.f12370P;
            if (aVar == null) {
                return true;
            }
            aVar.mo11909a(this.f12368N);
            return true;
        }
    }

    public RecyclerView.C0748a getAdapter() {
        return this.f12389j.getAdapter();
    }

    public int getCurrentScrollY() {
        return this.f12356B;
    }

    public View getCustomFloatingActionView() {
        return this.f12372R;
    }

    public C4202b getDefaultFloatingActionButton() {
        return this.f12391k;
    }

    public View getEmptyView() {
        return this.f12368N;
    }

    public RecyclerView.C0753f getItemAnimator() {
        return this.f12389j.getItemAnimator();
    }

    public RecyclerView.C0759i getLayoutManager() {
        return this.f12389j.getLayoutManager();
    }

    public float getScrollMultiplier() {
        return this.f12396ma;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f12359E != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f12361G = true;
                this.f12360F = true;
                this.f12359E.mo11789a();
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.f12362H = false;
                this.f12361G = false;
                this.f12359E.mo11791a(this.f12358D);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedStateScrolling savedStateScrolling = (SavedStateScrolling) parcelable;
        this.f12407x = savedStateScrolling.f12527b;
        this.f12408y = savedStateScrolling.f12528c;
        this.f12409z = savedStateScrolling.f12529d;
        this.f12355A = savedStateScrolling.f12530e;
        this.f12356B = savedStateScrolling.f12531f;
        this.f12357C = savedStateScrolling.f12532g;
        RecyclerView.C0759i layoutManager = getLayoutManager();
        if (layoutManager != null) {
            int e = layoutManager.mo3903e();
            int i = this.f12355A;
            if (i != -1 && i < e) {
                layoutManager.mo3521h(i);
            }
        }
        super.onRestoreInstanceState(savedStateScrolling.mo11927a());
    }

    public Parcelable onSaveInstanceState() {
        SavedStateScrolling savedStateScrolling = new SavedStateScrolling(super.onSaveInstanceState());
        savedStateScrolling.f12527b = this.f12407x;
        savedStateScrolling.f12528c = this.f12408y;
        savedStateScrolling.f12529d = this.f12409z;
        savedStateScrolling.f12530e = this.f12355A;
        savedStateScrolling.f12531f = this.f12356B;
        savedStateScrolling.f12532g = this.f12357C;
        return savedStateScrolling;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0 != 3) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ev---"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.marshalchen.ultimaterecyclerview.C4186i.m16671a((java.lang.String) r0)
            com.marshalchen.ultimaterecyclerview.b r0 = r8.f12359E
            if (r0 == 0) goto L_0x00a8
            int r0 = r9.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x009d
            r3 = 2
            if (r0 == r3) goto L_0x0028
            r1 = 3
            if (r0 == r1) goto L_0x009d
            goto L_0x00a8
        L_0x0028:
            android.view.MotionEvent r0 = r8.f12364J
            if (r0 != 0) goto L_0x002e
            r8.f12364J = r9
        L_0x002e:
            float r0 = r9.getY()
            android.view.MotionEvent r3 = r8.f12364J
            float r3 = r3.getY()
            float r0 = r0 - r3
            android.view.MotionEvent r3 = android.view.MotionEvent.obtainNoHistory(r9)
            r8.f12364J = r3
            int r3 = r8.getCurrentScrollY()
            float r3 = (float) r3
            float r3 = r3 - r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00a8
            boolean r3 = r8.f12362H
            if (r3 == 0) goto L_0x004f
            return r2
        L_0x004f:
            android.view.ViewGroup r3 = r8.f12365K
            if (r3 != 0) goto L_0x0059
            android.view.ViewParent r3 = r8.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0059:
            r4 = r0
            r5 = r4
            r0 = r8
        L_0x005c:
            if (r0 == 0) goto L_0x007d
            if (r0 == r3) goto L_0x007d
            int r6 = r0.getLeft()
            int r7 = r0.getScrollX()
            int r6 = r6 - r7
            float r6 = (float) r6
            float r4 = r4 + r6
            int r6 = r0.getTop()
            int r7 = r0.getScrollY()
            int r6 = r6 - r7
            float r6 = (float) r6
            float r5 = r5 + r6
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L_0x005c
        L_0x007d:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r9)
            r0.offsetLocation(r4, r5)
            boolean r4 = r3.onInterceptTouchEvent(r0)
            if (r4 == 0) goto L_0x0098
            r8.f12362H = r1
            r0.setAction(r2)
            com.marshalchen.ultimaterecyclerview.n r9 = new com.marshalchen.ultimaterecyclerview.n
            r9.<init>(r8, r3, r0)
            r8.post(r9)
            return r2
        L_0x0098:
            boolean r9 = super.onTouchEvent(r9)
            return r9
        L_0x009d:
            r8.f12362H = r2
            r8.f12361G = r2
            com.marshalchen.ultimaterecyclerview.b r0 = r8.f12359E
            com.marshalchen.ultimaterecyclerview.a r1 = r8.f12358D
            r0.mo11791a(r1)
        L_0x00a8:
            boolean r9 = super.onTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marshalchen.ultimaterecyclerview.UltimateRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAdapter(C4195q qVar) {
        this.f12389j.setAdapter(qVar);
        setAdapterInternal(qVar);
    }

    public void setDefaultFloatingActionButton(C4202b bVar) {
        this.f12391k = bVar;
    }

    public void setDefaultOnRefreshListener(SwipeRefreshLayout.C0531b bVar) {
        this.f12376V.setEnabled(true);
        int[] iArr = this.f12374T;
        if (iArr == null || iArr.length <= 0) {
            this.f12376V.setColorSchemeResources(17170459, 17170452, 17170456, 17170454);
        } else {
            this.f12376V.setColorSchemeColors(iArr);
        }
        this.f12376V.setOnRefreshListener(bVar);
    }

    public void setDefaultSwipeToRefreshColorScheme(int... iArr) {
        this.f12376V.setColorSchemeColors(iArr);
    }

    public void setHasFixedSize(boolean z) {
        this.f12389j.setHasFixedSize(z);
    }

    public void setInflater(LayoutInflater layoutInflater) {
        this.f12382ea = layoutInflater;
    }

    public void setItemAnimator(RecyclerView.C0753f fVar) {
        this.f12389j.setItemAnimator(fVar);
    }

    public void setItemViewCacheSize(int i) {
        this.f12389j.setItemViewCacheSize(i);
    }

    public void setLayoutManager(RecyclerView.C0759i iVar) {
        this.f12389j.setLayoutManager(iVar);
    }

    public void setLoadMoreView(int i) {
        if (i > 0) {
            this.f12366L = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
        } else {
            Log.d("View", "Layout Resource Id is not found for load more view for ulitmaterecyclerview");
        }
    }

    public void setLoadMoreView(View view) {
        if (this.f12366L != null) {
            Log.d("View", "The loading more layout has already been initiated.");
        } else if (view == null) {
            this.f12366L = LayoutInflater.from(getContext()).inflate(C4182f.bottom_progressbar, (ViewGroup) null);
            Log.d("View", "Layout Resource view is null. This system will use the default loading view instead.");
        } else {
            this.f12366L = view;
        }
    }

    public void setNormalHeader(View view) {
        setParallaxHeader(view);
        f12354g = false;
    }

    public void setOnLoadMoreListener(C4160c cVar) {
        this.f12393l = cVar;
    }

    public void setOnParallaxScroll(C4161d dVar) {
        this.f12381da = dVar;
        this.f12381da.mo11788a(0.0f, 0.0f, this.f12378aa);
    }

    public void setOnScrollListener(RecyclerView.C0766n nVar) {
        this.f12389j.setOnScrollListener(nVar);
    }

    public void setParallaxHeader(int i) {
        setParallaxHeader(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    public void setParallaxHeader(View view) {
        this.f12378aa = new C4158a(view.getContext());
        this.f12378aa.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f12378aa.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        f12354g = true;
    }

    public void setRecylerViewBackgroundColor(int i) {
        this.f12389j.setBackgroundColor(i);
    }

    public void setRefreshing(boolean z) {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = this.f12376V;
        if (verticalSwipeRefreshLayout != null) {
            verticalSwipeRefreshLayout.setRefreshing(z);
        }
    }

    public void setScrollMultiplier(float f) {
        this.f12396ma = f;
    }

    public void setScrollViewCallbacks(C4165b bVar) {
        this.f12359E = bVar;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.f12365K = viewGroup;
        m16608h();
    }
}
