package p284in.srain.cube.views.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import org.apache.http.HttpStatus;
import p284in.srain.cube.views.ptr.p285a.C6779a;
import p284in.srain.cube.views.ptr.p286b.C6781a;

/* renamed from: in.srain.cube.views.ptr.PtrFrameLayout */
public class PtrFrameLayout extends ViewGroup {

    /* renamed from: a */
    public static boolean f18784a = false;

    /* renamed from: b */
    private static int f18785b = 1;

    /* renamed from: c */
    private static byte f18786c = 2;

    /* renamed from: d */
    private static byte f18787d = 4;

    /* renamed from: e */
    private static byte f18788e = 8;

    /* renamed from: f */
    private static byte f18789f = 3;

    /* renamed from: A */
    private int f18790A;

    /* renamed from: B */
    private long f18791B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C6779a f18792C;

    /* renamed from: D */
    private boolean f18793D;

    /* renamed from: E */
    private Runnable f18794E;

    /* renamed from: g */
    private byte f18795g;

    /* renamed from: h */
    protected final String f18796h;

    /* renamed from: i */
    protected View f18797i;

    /* renamed from: j */
    private int f18798j;

    /* renamed from: k */
    private int f18799k;

    /* renamed from: l */
    private int f18800l;

    /* renamed from: m */
    private int f18801m;

    /* renamed from: n */
    private boolean f18802n;

    /* renamed from: o */
    private boolean f18803o;

    /* renamed from: p */
    private View f18804p;

    /* renamed from: q */
    private C6784e f18805q;

    /* renamed from: r */
    private C6782c f18806r;

    /* renamed from: s */
    private C6777b f18807s;

    /* renamed from: t */
    private int f18808t;

    /* renamed from: u */
    private int f18809u;

    /* renamed from: v */
    private boolean f18810v;

    /* renamed from: w */
    private int f18811w;

    /* renamed from: x */
    private boolean f18812x;

    /* renamed from: y */
    private MotionEvent f18813y;

    /* renamed from: z */
    private C6785f f18814z;

    /* renamed from: in.srain.cube.views.ptr.PtrFrameLayout$a */
    public static class C6776a extends ViewGroup.MarginLayoutParams {
        public C6776a(int i, int i2) {
            super(i, i2);
        }

        public C6776a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C6776a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: in.srain.cube.views.ptr.PtrFrameLayout$b */
    class C6777b implements Runnable {

        /* renamed from: a */
        private int f18815a;

        /* renamed from: b */
        private Scroller f18816b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f18817c = false;

        /* renamed from: d */
        private int f18818d;

        /* renamed from: e */
        private int f18819e;

        public C6777b() {
            this.f18816b = new Scroller(PtrFrameLayout.this.getContext());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m25647b() {
            m25650d();
            if (!this.f18816b.isFinished()) {
                this.f18816b.forceFinished(true);
            }
        }

        /* renamed from: c */
        private void m25649c() {
            if (PtrFrameLayout.f18784a) {
                PtrFrameLayout ptrFrameLayout = PtrFrameLayout.this;
                C6781a.m25694c(ptrFrameLayout.f18796h, "finish, currentPos:%s", Integer.valueOf(ptrFrameLayout.f18792C.mo17315b()));
            }
            m25650d();
            PtrFrameLayout.this.mo17271e();
        }

        /* renamed from: d */
        private void m25650d() {
            this.f18817c = false;
            this.f18815a = 0;
            PtrFrameLayout.this.removeCallbacks(this);
        }

        /* renamed from: a */
        public void mo17304a() {
            if (this.f18817c) {
                if (!this.f18816b.isFinished()) {
                    this.f18816b.forceFinished(true);
                }
                PtrFrameLayout.this.mo17269d();
                m25650d();
            }
        }

        /* renamed from: a */
        public void mo17305a(int i, int i2) {
            if (!PtrFrameLayout.this.f18792C.mo17314a(i)) {
                this.f18818d = PtrFrameLayout.this.f18792C.mo17315b();
                this.f18819e = i;
                int i3 = this.f18818d;
                int i4 = i - i3;
                if (PtrFrameLayout.f18784a) {
                    C6781a.m25690a(PtrFrameLayout.this.f18796h, "tryToScrollTo: start: %s, distance:%s, to:%s", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i));
                }
                PtrFrameLayout.this.removeCallbacks(this);
                this.f18815a = 0;
                if (!this.f18816b.isFinished()) {
                    this.f18816b.forceFinished(true);
                }
                this.f18816b.startScroll(0, 0, 0, i4, i2);
                PtrFrameLayout.this.post(this);
                this.f18817c = true;
            }
        }

        public void run() {
            boolean z = !this.f18816b.computeScrollOffset() || this.f18816b.isFinished();
            int currY = this.f18816b.getCurrY();
            int i = currY - this.f18815a;
            if (PtrFrameLayout.f18784a && i != 0) {
                C6781a.m25694c(PtrFrameLayout.this.f18796h, "scroll: %s, start: %s, to: %s, currentPos: %s, current :%s, last: %s, delta: %s", Boolean.valueOf(z), Integer.valueOf(this.f18818d), Integer.valueOf(this.f18819e), Integer.valueOf(PtrFrameLayout.this.f18792C.mo17315b()), Integer.valueOf(currY), Integer.valueOf(this.f18815a), Integer.valueOf(i));
            }
            if (!z) {
                this.f18815a = currY;
                PtrFrameLayout.this.m25617a((float) i);
                PtrFrameLayout.this.post(this);
                return;
            }
            m25649c();
        }
    }

    public PtrFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public PtrFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PtrFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18795g = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("ptr-frame-");
        int i2 = f18785b + 1;
        f18785b = i2;
        sb.append(i2);
        this.f18796h = sb.toString();
        this.f18798j = 0;
        this.f18799k = 0;
        this.f18800l = HttpStatus.SC_OK;
        this.f18801m = 1000;
        this.f18802n = true;
        this.f18803o = false;
        this.f18805q = C6784e.m25702a();
        this.f18810v = false;
        this.f18811w = 0;
        this.f18812x = false;
        this.f18790A = HttpStatus.SC_INTERNAL_SERVER_ERROR;
        this.f18791B = 0;
        this.f18793D = false;
        this.f18794E = new C6778a(this);
        this.f18792C = new C6779a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6786g.PtrFrameLayout, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f18798j = obtainStyledAttributes.getResourceId(C6786g.PtrFrameLayout_ptr_header, this.f18798j);
            this.f18799k = obtainStyledAttributes.getResourceId(C6786g.PtrFrameLayout_ptr_content, this.f18799k);
            C6779a aVar = this.f18792C;
            aVar.mo17316b(obtainStyledAttributes.getFloat(C6786g.PtrFrameLayout_ptr_resistance, aVar.mo17330i()));
            this.f18800l = obtainStyledAttributes.getInt(C6786g.PtrFrameLayout_ptr_duration_to_close, this.f18800l);
            this.f18801m = obtainStyledAttributes.getInt(C6786g.PtrFrameLayout_ptr_duration_to_close_header, this.f18801m);
            this.f18792C.mo17308a(obtainStyledAttributes.getFloat(C6786g.PtrFrameLayout_ptr_ratio_of_header_height_to_refresh, this.f18792C.mo17329h()));
            this.f18802n = obtainStyledAttributes.getBoolean(C6786g.PtrFrameLayout_ptr_keep_header_when_refresh, this.f18802n);
            this.f18803o = obtainStyledAttributes.getBoolean(C6786g.PtrFrameLayout_ptr_pull_to_fresh, this.f18803o);
            obtainStyledAttributes.recycle();
        }
        this.f18807s = new C6777b();
        this.f18808t = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25617a(float f) {
        if (f >= 0.0f || !this.f18792C.mo17337p()) {
            int b = ((int) f) + this.f18792C.mo17315b();
            if (this.f18792C.mo17327f(b)) {
                if (f18784a) {
                    C6781a.m25691b(this.f18796h, String.format("over top", new Object[0]));
                }
                b = 0;
            }
            this.f18792C.mo17318b(b);
            m25618a(b - this.f18792C.mo17319c());
        } else if (f18784a) {
            C6781a.m25691b(this.f18796h, String.format("has reached the top", new Object[0]));
        }
    }

    /* renamed from: a */
    private void m25618a(int i) {
        if (i != 0) {
            boolean s = this.f18792C.mo17340s();
            if (s && !this.f18793D && this.f18792C.mo17336o()) {
                this.f18793D = true;
                m25631k();
            }
            if ((this.f18792C.mo17333l() && this.f18795g == 1) || (this.f18792C.mo17331j() && this.f18795g == 4 && mo17266b())) {
                this.f18795g = 2;
                this.f18805q.mo17349b(this);
                if (f18784a) {
                    C6781a.m25692b(this.f18796h, "PtrUIHandler: onUIRefreshPrepare, mFlag %s", Integer.valueOf(this.f18811w));
                }
            }
            if (this.f18792C.mo17332k()) {
                m25637q();
                if (s) {
                    m25632l();
                }
            }
            if (this.f18795g == 2) {
                if (s && !mo17264a() && this.f18803o && this.f18792C.mo17313a()) {
                    m25638r();
                }
                if (m25628h() && this.f18792C.mo17334m()) {
                    m25638r();
                }
            }
            if (f18784a) {
                C6781a.m25694c(this.f18796h, "updatePos: change: %s, current: %s last: %s, top: %s, headerHeight: %s", Integer.valueOf(i), Integer.valueOf(this.f18792C.mo17315b()), Integer.valueOf(this.f18792C.mo17319c()), Integer.valueOf(this.f18797i.getTop()), Integer.valueOf(this.f18809u));
            }
            this.f18804p.offsetTopAndBottom(i);
            if (!mo17267c()) {
                this.f18797i.offsetTopAndBottom(i);
            }
            invalidate();
            if (this.f18805q.mo17352b()) {
                this.f18805q.mo17348a(this, s, this.f18795g, this.f18792C);
            }
            mo17263a(s, this.f18795g, this.f18792C);
        }
    }

    /* renamed from: a */
    private void m25619a(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin, marginLayoutParams.height));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25623a(boolean z) {
        if (!this.f18792C.mo17335n() || z || this.f18814z == null) {
            if (this.f18805q.mo17352b()) {
                if (f18784a) {
                    C6781a.m25693c(this.f18796h, "PtrUIHandler: onUIRefreshComplete");
                }
                this.f18805q.mo17347a(this);
            }
            this.f18792C.mo17342u();
            m25635o();
            m25637q();
            return;
        }
        if (f18784a) {
            C6781a.m25689a(this.f18796h, "notifyUIRefreshComplete mRefreshCompleteHook run.");
        }
        this.f18814z.mo17353a();
    }

    /* renamed from: b */
    private void m25625b(boolean z) {
        m25638r();
        byte b = this.f18795g;
        if (b == 3) {
            if (!this.f18802n) {
                m25636p();
            } else if (this.f18792C.mo17338q() && !z) {
                this.f18807s.mo17305a(this.f18792C.mo17322d(), this.f18800l);
            }
        } else if (b == 4) {
            m25623a(false);
        } else {
            m25634n();
        }
    }

    /* renamed from: f */
    private void m25626f() {
        this.f18811w &= ~f18789f;
    }

    /* renamed from: g */
    private void m25627g() {
        int b = this.f18792C.mo17315b();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        View view = this.f18804p;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i = marginLayoutParams.leftMargin + paddingLeft;
            int i2 = ((marginLayoutParams.topMargin + paddingTop) + b) - this.f18809u;
            int measuredWidth = this.f18804p.getMeasuredWidth() + i;
            int measuredHeight = this.f18804p.getMeasuredHeight() + i2;
            this.f18804p.layout(i, i2, measuredWidth, measuredHeight);
            if (f18784a) {
                C6781a.m25690a(this.f18796h, "onLayout header: %s %s %s %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
            }
        }
        if (this.f18797i != null) {
            if (mo17267c()) {
                b = 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f18797i.getLayoutParams();
            int i3 = paddingLeft + marginLayoutParams2.leftMargin;
            int i4 = paddingTop + marginLayoutParams2.topMargin + b;
            int measuredWidth2 = this.f18797i.getMeasuredWidth() + i3;
            int measuredHeight2 = this.f18797i.getMeasuredHeight() + i4;
            if (f18784a) {
                C6781a.m25690a(this.f18796h, "onLayout content: %s %s %s %s", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(measuredWidth2), Integer.valueOf(measuredHeight2));
            }
            this.f18797i.layout(i3, i4, measuredWidth2, measuredHeight2);
        }
    }

    /* renamed from: h */
    private boolean m25628h() {
        return (this.f18811w & f18789f) == f18786c;
    }

    /* renamed from: i */
    private void m25629i() {
        this.f18791B = System.currentTimeMillis();
        if (this.f18805q.mo17352b()) {
            this.f18805q.mo17350c(this);
            if (f18784a) {
                C6781a.m25693c(this.f18796h, "PtrUIHandler: onUIRefreshBegin");
            }
        }
        C6782c cVar = this.f18806r;
        if (cVar != null) {
            cVar.mo17345a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m25630j() {
        this.f18795g = 4;
        if (!this.f18807s.f18817c || !mo17264a()) {
            m25623a(false);
        } else if (f18784a) {
            C6781a.m25690a(this.f18796h, "performRefreshComplete do nothing, scrolling: %s, auto refresh: %s", Boolean.valueOf(this.f18807s.f18817c), Integer.valueOf(this.f18811w));
        }
    }

    /* renamed from: k */
    private void m25631k() {
        if (f18784a) {
            C6781a.m25689a(this.f18796h, "send cancel event");
        }
        MotionEvent motionEvent = this.f18813y;
        if (motionEvent != null) {
            mo17265a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ((long) ViewConfiguration.getLongPressTimeout()), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    /* renamed from: l */
    private void m25632l() {
        if (f18784a) {
            C6781a.m25689a(this.f18796h, "send down event");
        }
        MotionEvent motionEvent = this.f18813y;
        mo17265a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    /* renamed from: m */
    private void m25633m() {
        if (!this.f18792C.mo17340s()) {
            this.f18807s.mo17305a(0, this.f18801m);
        }
    }

    /* renamed from: n */
    private void m25634n() {
        m25633m();
    }

    /* renamed from: o */
    private void m25635o() {
        m25633m();
    }

    /* renamed from: p */
    private void m25636p() {
        m25633m();
    }

    /* renamed from: q */
    private boolean m25637q() {
        byte b = this.f18795g;
        if ((b != 4 && b != 2) || !this.f18792C.mo17337p()) {
            return false;
        }
        if (this.f18805q.mo17352b()) {
            this.f18805q.mo17351d(this);
            if (f18784a) {
                C6781a.m25693c(this.f18796h, "PtrUIHandler: onUIReset");
            }
        }
        this.f18795g = 1;
        m25626f();
        return true;
    }

    /* renamed from: r */
    private boolean m25638r() {
        if (this.f18795g != 2) {
            return false;
        }
        if ((this.f18792C.mo17338q() && mo17264a()) || this.f18792C.mo17339r()) {
            this.f18795g = 3;
            m25629i();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17263a(boolean z, byte b, C6779a aVar) {
    }

    /* renamed from: a */
    public boolean mo17264a() {
        return (this.f18811w & f18789f) > 0;
    }

    /* renamed from: a */
    public boolean mo17265a(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public boolean mo17266b() {
        return (this.f18811w & f18787d) > 0;
    }

    /* renamed from: c */
    public boolean mo17267c() {
        return (this.f18811w & f18788e) > 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6776a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo17269d() {
        if (this.f18792C.mo17335n() && mo17264a()) {
            if (f18784a) {
                C6781a.m25689a(this.f18796h, "call onRelease after scroll abort");
            }
            m25625b(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != 3) goto L_0x00e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.isEnabled()
            if (r0 == 0) goto L_0x0139
            android.view.View r0 = r12.f18797i
            if (r0 == 0) goto L_0x0139
            android.view.View r0 = r12.f18804p
            if (r0 != 0) goto L_0x0010
            goto L_0x0139
        L_0x0010:
            int r0 = r13.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x011f
            if (r0 == r2) goto L_0x00ee
            r3 = 3
            r4 = 2
            if (r0 == r4) goto L_0x0022
            if (r0 == r3) goto L_0x00ee
            goto L_0x00e9
        L_0x0022:
            r12.f18813y = r13
            in.srain.cube.views.ptr.a.a r0 = r12.f18792C
            float r5 = r13.getX()
            float r6 = r13.getY()
            r0.mo17309a((float) r5, (float) r6)
            in.srain.cube.views.ptr.a.a r0 = r12.f18792C
            float r0 = r0.mo17326f()
            in.srain.cube.views.ptr.a.a r5 = r12.f18792C
            float r5 = r5.mo17328g()
            boolean r6 = r12.f18810v
            if (r6 == 0) goto L_0x0066
            boolean r6 = r12.f18812x
            if (r6 != 0) goto L_0x0066
            float r6 = java.lang.Math.abs(r0)
            int r7 = r12.f18808t
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0066
            float r0 = java.lang.Math.abs(r0)
            float r6 = java.lang.Math.abs(r5)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            in.srain.cube.views.ptr.a.a r0 = r12.f18792C
            boolean r0 = r0.mo17337p()
            if (r0 == 0) goto L_0x0066
            r12.f18812x = r2
        L_0x0066:
            boolean r0 = r12.f18812x
            if (r0 == 0) goto L_0x006f
            boolean r13 = r12.mo17265a((android.view.MotionEvent) r13)
            return r13
        L_0x006f:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            r0 = r2
            goto L_0x0077
        L_0x0076:
            r0 = r1
        L_0x0077:
            r6 = r0 ^ 1
            in.srain.cube.views.ptr.a.a r7 = r12.f18792C
            boolean r7 = r7.mo17335n()
            boolean r8 = f18784a
            if (r8 == 0) goto L_0x00ca
            in.srain.cube.views.ptr.c r8 = r12.f18806r
            if (r8 == 0) goto L_0x0093
            android.view.View r9 = r12.f18797i
            android.view.View r10 = r12.f18804p
            boolean r8 = r8.mo17346a(r12, r9, r10)
            if (r8 == 0) goto L_0x0093
            r8 = r2
            goto L_0x0094
        L_0x0093:
            r8 = r1
        L_0x0094:
            java.lang.String r9 = r12.f18796h
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Float r11 = java.lang.Float.valueOf(r5)
            r10[r1] = r11
            in.srain.cube.views.ptr.a.a r1 = r12.f18792C
            int r1 = r1.mo17315b()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10[r2] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r10[r4] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r10[r3] = r1
            r1 = 4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r10[r1] = r3
            r1 = 5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r10[r1] = r3
            java.lang.String r1 = "ACTION_MOVE: offsetY:%s, currentPos: %s, moveUp: %s, canMoveUp: %s, moveDown: %s: canMoveDown: %s"
            p284in.srain.cube.views.ptr.p286b.C6781a.m25694c(r9, r1, r10)
        L_0x00ca:
            if (r0 == 0) goto L_0x00df
            in.srain.cube.views.ptr.c r1 = r12.f18806r
            if (r1 == 0) goto L_0x00df
            android.view.View r3 = r12.f18797i
            android.view.View r4 = r12.f18804p
            boolean r1 = r1.mo17346a(r12, r3, r4)
            if (r1 != 0) goto L_0x00df
            boolean r13 = r12.mo17265a((android.view.MotionEvent) r13)
            return r13
        L_0x00df:
            if (r6 == 0) goto L_0x00e3
            if (r7 != 0) goto L_0x00e5
        L_0x00e3:
            if (r0 == 0) goto L_0x00e9
        L_0x00e5:
            r12.m25617a((float) r5)
            return r2
        L_0x00e9:
            boolean r13 = r12.mo17265a((android.view.MotionEvent) r13)
            return r13
        L_0x00ee:
            in.srain.cube.views.ptr.a.a r0 = r12.f18792C
            r0.mo17341t()
            in.srain.cube.views.ptr.a.a r0 = r12.f18792C
            boolean r0 = r0.mo17335n()
            if (r0 == 0) goto L_0x011a
            boolean r0 = f18784a
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = r12.f18796h
            java.lang.String r3 = "call onRelease when user release"
            p284in.srain.cube.views.ptr.p286b.C6781a.m25689a(r0, r3)
        L_0x0106:
            r12.m25625b((boolean) r1)
            in.srain.cube.views.ptr.a.a r0 = r12.f18792C
            boolean r0 = r0.mo17336o()
            if (r0 == 0) goto L_0x0115
            r12.m25631k()
            return r2
        L_0x0115:
            boolean r13 = r12.mo17265a((android.view.MotionEvent) r13)
            return r13
        L_0x011a:
            boolean r13 = r12.mo17265a((android.view.MotionEvent) r13)
            return r13
        L_0x011f:
            r12.f18793D = r1
            in.srain.cube.views.ptr.a.a r0 = r12.f18792C
            float r3 = r13.getX()
            float r4 = r13.getY()
            r0.mo17317b(r3, r4)
            in.srain.cube.views.ptr.PtrFrameLayout$b r0 = r12.f18807s
            r0.mo17304a()
            r12.f18812x = r1
            r12.mo17265a((android.view.MotionEvent) r13)
            return r2
        L_0x0139:
            boolean r13 = r12.mo17265a((android.view.MotionEvent) r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p284in.srain.cube.views.ptr.PtrFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo17271e() {
        if (this.f18792C.mo17335n() && mo17264a()) {
            if (f18784a) {
                C6781a.m25689a(this.f18796h, "call onRelease after scroll finish");
            }
            m25625b(true);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C6776a(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C6776a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C6776a(layoutParams);
    }

    public View getContentView() {
        return this.f18797i;
    }

    public float getDurationToClose() {
        return (float) this.f18800l;
    }

    public long getDurationToCloseHeader() {
        return (long) this.f18801m;
    }

    public int getHeaderHeight() {
        return this.f18809u;
    }

    public View getHeaderView() {
        return this.f18804p;
    }

    public int getOffsetToKeepHeaderWhileLoading() {
        return this.f18792C.mo17322d();
    }

    public int getOffsetToRefresh() {
        return this.f18792C.mo17324e();
    }

    public float getRatioOfHeaderToHeightRefresh() {
        return this.f18792C.mo17329h();
    }

    public float getResistance() {
        return this.f18792C.mo17330i();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6777b bVar = this.f18807s;
        if (bVar != null) {
            bVar.m25647b();
        }
        Runnable runnable = this.f18794E;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinishInflate() {
        /*
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 2
            if (r0 > r1) goto L_0x009c
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0060
            int r0 = r4.f18798j
            if (r0 == 0) goto L_0x0019
            android.view.View r1 = r4.f18804p
            if (r1 != 0) goto L_0x0019
            android.view.View r0 = r4.findViewById(r0)
            r4.f18804p = r0
        L_0x0019:
            int r0 = r4.f18799k
            if (r0 == 0) goto L_0x0027
            android.view.View r1 = r4.f18797i
            if (r1 != 0) goto L_0x0027
            android.view.View r0 = r4.findViewById(r0)
            r4.f18797i = r0
        L_0x0027:
            android.view.View r0 = r4.f18797i
            if (r0 == 0) goto L_0x002f
            android.view.View r0 = r4.f18804p
            if (r0 != 0) goto L_0x0091
        L_0x002f:
            android.view.View r0 = r4.getChildAt(r2)
            android.view.View r1 = r4.getChildAt(r3)
            boolean r2 = r0 instanceof p284in.srain.cube.views.ptr.C6783d
            if (r2 == 0) goto L_0x0040
        L_0x003b:
            r4.f18804p = r0
            r4.f18797i = r1
            goto L_0x0091
        L_0x0040:
            boolean r2 = r1 instanceof p284in.srain.cube.views.ptr.C6783d
            if (r2 == 0) goto L_0x0047
            r4.f18804p = r1
            goto L_0x0066
        L_0x0047:
            android.view.View r2 = r4.f18797i
            if (r2 != 0) goto L_0x0050
            android.view.View r2 = r4.f18804p
            if (r2 != 0) goto L_0x0050
            goto L_0x003b
        L_0x0050:
            android.view.View r2 = r4.f18804p
            if (r2 != 0) goto L_0x005c
            android.view.View r2 = r4.f18797i
            if (r2 != r0) goto L_0x0059
            r0 = r1
        L_0x0059:
            r4.f18804p = r0
            goto L_0x0091
        L_0x005c:
            if (r2 != r0) goto L_0x0066
            r0 = r1
            goto L_0x0066
        L_0x0060:
            if (r0 != r3) goto L_0x0069
            android.view.View r0 = r4.getChildAt(r2)
        L_0x0066:
            r4.f18797i = r0
            goto L_0x0091
        L_0x0069:
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r0.setClickable(r3)
            r1 = -39424(0xffffffffffff6600, float:NaN)
            r0.setTextColor(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.setTextSize(r1)
            java.lang.String r1 = "The content view in PtrFrameLayout is empty. Do you forget to specify its id in xml layout file?"
            r0.setText(r1)
            r4.f18797i = r0
            android.view.View r0 = r4.f18797i
            r4.addView(r0)
        L_0x0091:
            android.view.View r0 = r4.f18804p
            if (r0 == 0) goto L_0x0098
            r0.bringToFront()
        L_0x0098:
            super.onFinishInflate()
            return
        L_0x009c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "PtrFrameLayout only can host 2 elements"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p284in.srain.cube.views.ptr.PtrFrameLayout.onFinishInflate():void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m25627g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (f18784a) {
            C6781a.m25690a(this.f18796h, "onMeasure frame: width: %s, height: %s, padding: %s %s %s %s", Integer.valueOf(getMeasuredHeight()), Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingRight()), Integer.valueOf(getPaddingTop()), Integer.valueOf(getPaddingBottom()));
        }
        View view = this.f18804p;
        if (view != null) {
            measureChildWithMargins(view, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f18804p.getLayoutParams();
            this.f18809u = this.f18804p.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            this.f18792C.mo17321c(this.f18809u);
        }
        View view2 = this.f18797i;
        if (view2 != null) {
            int i3 = i;
            m25619a(view2, i, i2);
            if (f18784a) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f18797i.getLayoutParams();
                C6781a.m25690a(this.f18796h, "onMeasure content, width: %s, height: %s, margin: %s %s %s %s", Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()), Integer.valueOf(marginLayoutParams2.leftMargin), Integer.valueOf(marginLayoutParams2.topMargin), Integer.valueOf(marginLayoutParams2.rightMargin), Integer.valueOf(marginLayoutParams2.bottomMargin));
                C6781a.m25690a(this.f18796h, "onMeasure, currentPos: %s, lastPos: %s, top: %s", Integer.valueOf(this.f18792C.mo17315b()), Integer.valueOf(this.f18792C.mo17319c()), Integer.valueOf(this.f18797i.getTop()));
            }
        }
    }

    public void setDurationToClose(int i) {
        this.f18800l = i;
    }

    public void setDurationToCloseHeader(int i) {
        this.f18801m = i;
    }

    public void setEnabledNextPtrAtOnce(boolean z) {
        this.f18811w = z ? this.f18811w | f18787d : this.f18811w & (~f18787d);
    }

    public void setHeaderView(View view) {
        View view2 = this.f18804p;
        if (!(view2 == null || view == null || view2 == view)) {
            removeView(view2);
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new C6776a(-1, -2));
        }
        this.f18804p = view;
        addView(view);
    }

    @Deprecated
    public void setInterceptEventWhileWorking(boolean z) {
    }

    public void setKeepHeaderWhenRefresh(boolean z) {
        this.f18802n = z;
    }

    public void setLoadingMinTime(int i) {
        this.f18790A = i;
    }

    public void setOffsetToKeepHeaderWhileLoading(int i) {
        this.f18792C.mo17323d(i);
    }

    public void setOffsetToRefresh(int i) {
        this.f18792C.mo17325e(i);
    }

    public void setPinContent(boolean z) {
        this.f18811w = z ? this.f18811w | f18788e : this.f18811w & (~f18788e);
    }

    public void setPtrHandler(C6782c cVar) {
        this.f18806r = cVar;
    }

    public void setPtrIndicator(C6779a aVar) {
        C6779a aVar2 = this.f18792C;
        if (!(aVar2 == null || aVar2 == aVar)) {
            aVar.mo17312a(aVar2);
        }
        this.f18792C = aVar;
    }

    public void setPullToRefresh(boolean z) {
        this.f18803o = z;
    }

    public void setRatioOfHeaderHeightToRefresh(float f) {
        this.f18792C.mo17308a(f);
    }

    public void setRefreshCompleteHook(C6785f fVar) {
        this.f18814z = fVar;
        fVar.mo17354a(new C6780b(this));
    }

    public void setResistance(float f) {
        this.f18792C.mo17316b(f);
    }
}
