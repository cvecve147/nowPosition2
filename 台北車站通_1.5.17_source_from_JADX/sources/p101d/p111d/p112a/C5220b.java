package p101d.p111d.p112a;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.List;
import p101d.p111d.p112a.p114b.C5227a;
import p101d.p111d.p112a.p114b.C5231b;
import p101d.p111d.p112a.p114b.C5234e;
import p101d.p111d.p112a.p114b.p115a.C5228a;
import p101d.p111d.p112a.p114b.p115a.C5230b;
import p101d.p111d.p112a.p116c.C5239a;
import p101d.p111d.p112a.p116c.C5241c;

/* renamed from: d.d.a.b */
public class C5220b implements View.OnTouchListener {

    /* renamed from: a */
    private static final PointF f14712a = new PointF();

    /* renamed from: A */
    private final C5244e f14713A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C5246f f14714B = new C5246f();

    /* renamed from: C */
    private final C5246f f14715C = new C5246f();

    /* renamed from: D */
    private final C5247g f14716D;

    /* renamed from: E */
    private final C5231b f14717E;

    /* renamed from: b */
    private final int f14718b;

    /* renamed from: c */
    private final int f14719c;

    /* renamed from: d */
    private final int f14720d;

    /* renamed from: e */
    private C5223c f14721e;

    /* renamed from: f */
    private C5225e f14722f;

    /* renamed from: g */
    private final List<C5224d> f14723g = new ArrayList();

    /* renamed from: h */
    private final C5227a f14724h;

    /* renamed from: i */
    private final GestureDetector f14725i;

    /* renamed from: j */
    private final ScaleGestureDetector f14726j;

    /* renamed from: k */
    private final C5228a f14727k;

    /* renamed from: l */
    private boolean f14728l;

    /* renamed from: m */
    private boolean f14729m;

    /* renamed from: n */
    private boolean f14730n;

    /* renamed from: o */
    private float f14731o = Float.NaN;

    /* renamed from: p */
    private float f14732p = Float.NaN;

    /* renamed from: q */
    private boolean f14733q;

    /* renamed from: r */
    private boolean f14734r;

    /* renamed from: s */
    private boolean f14735s;

    /* renamed from: t */
    private boolean f14736t;

    /* renamed from: u */
    private C5226f f14737u = C5226f.NONE;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final OverScroller f14738v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C5239a f14739w;

    /* renamed from: x */
    private final C5234e f14740x = new C5234e();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C5246f f14741y = new C5246f();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C5246f f14742z = new C5246f();

    /* renamed from: d.d.a.b$a */
    private class C5221a implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, C5228a.C5229a {
        private C5221a() {
        }

        /* renamed from: a */
        public boolean mo14446a(C5228a aVar) {
            return C5220b.this.mo14419a(aVar);
        }

        /* renamed from: b */
        public boolean mo14447b(C5228a aVar) {
            return C5220b.this.mo14427b(aVar);
        }

        /* renamed from: c */
        public void mo14448c(C5228a aVar) {
            C5220b.this.mo14431c(aVar);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return C5220b.this.mo14416a(motionEvent);
        }

        public boolean onDown(MotionEvent motionEvent) {
            return C5220b.this.mo14424b(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return C5220b.this.mo14417a(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            C5220b.this.mo14429c(motionEvent);
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return C5220b.this.mo14418a(scaleGestureDetector);
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return C5220b.this.mo14426b(scaleGestureDetector);
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C5220b.this.mo14430c(scaleGestureDetector);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return C5220b.this.mo14425b(motionEvent, motionEvent2, f, f2);
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return C5220b.this.mo14433d(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return C5220b.this.mo14435e(motionEvent);
        }
    }

    /* renamed from: d.d.a.b$b */
    private class C5222b extends C5227a {
        C5222b(View view) {
            super(view);
        }

        /* renamed from: a */
        public boolean mo14461a() {
            boolean z;
            if (C5220b.this.mo14437f()) {
                int currX = C5220b.this.f14738v.getCurrX();
                int currY = C5220b.this.f14738v.getCurrY();
                if (C5220b.this.f14738v.computeScrollOffset()) {
                    if (!C5220b.this.mo14415a(C5220b.this.f14738v.getCurrX() - currX, C5220b.this.f14738v.getCurrY() - currY)) {
                        C5220b.this.mo14442k();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!C5220b.this.mo14437f()) {
                    C5220b.this.mo14413a(false);
                }
            } else {
                z = false;
            }
            if (C5220b.this.mo14438g()) {
                C5220b.this.f14739w.mo14505a();
                C5241c.m20240a(C5220b.this.f14714B, C5220b.this.f14741y, C5220b.this.f14742z, C5220b.this.f14739w.mo14507c());
                if (!C5220b.this.mo14438g()) {
                    C5220b.this.mo14423b(false);
                }
                z = true;
            }
            if (z) {
                C5220b.this.mo14440i();
            }
            return z;
        }
    }

    /* renamed from: d.d.a.b$c */
    public interface C5223c {
        /* renamed from: a */
        void mo14462a(MotionEvent motionEvent);

        boolean onDoubleTap(MotionEvent motionEvent);

        void onDown(MotionEvent motionEvent);

        void onLongPress(MotionEvent motionEvent);

        boolean onSingleTapConfirmed(MotionEvent motionEvent);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    /* renamed from: d.d.a.b$d */
    public interface C5224d {
        /* renamed from: a */
        void mo14468a(C5246f fVar);

        /* renamed from: a */
        void mo14469a(C5246f fVar, C5246f fVar2);
    }

    /* renamed from: d.d.a.b$e */
    public interface C5225e {
        /* renamed from: a */
        void mo14470a(C5226f fVar);
    }

    /* renamed from: d.d.a.b$f */
    public enum C5226f {
        NONE,
        USER,
        ANIMATION
    }

    public C5220b(View view) {
        Context context = view.getContext();
        this.f14713A = new C5244e();
        this.f14716D = new C5247g(this.f14713A);
        this.f14724h = new C5222b(view);
        C5221a aVar = new C5221a();
        this.f14725i = new GestureDetector(context, aVar);
        this.f14725i.setIsLongpressEnabled(false);
        this.f14726j = new C5230b(context, aVar);
        this.f14727k = new C5228a(context, aVar);
        this.f14717E = new C5231b(view, this);
        this.f14738v = new OverScroller(context);
        this.f14739w = new C5239a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14718b = viewConfiguration.getScaledTouchSlop();
        this.f14719c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f14720d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    private int m20129a(float f) {
        if (Math.abs(f) < ((float) this.f14719c)) {
            return 0;
        }
        return Math.abs(f) >= ((float) this.f14720d) ? ((int) Math.signum(f)) * this.f14720d : Math.round(f);
    }

    /* renamed from: a */
    private boolean m20131a(C5246f fVar, boolean z) {
        if (fVar == null) {
            return false;
        }
        C5246f fVar2 = null;
        if (z) {
            fVar2 = this.f14716D.mo14568b(fVar, this.f14715C, this.f14731o, this.f14732p, false, false, true);
        }
        if (fVar2 != null) {
            fVar = fVar2;
        }
        if (fVar.equals(this.f14714B)) {
            return false;
        }
        mo14441j();
        this.f14736t = z;
        this.f14741y.mo14550a(this.f14714B);
        this.f14742z.mo14550a(fVar);
        this.f14739w.mo14504a(this.f14713A.mo14521c());
        this.f14739w.mo14503a(0.0f, 1.0f);
        this.f14724h.mo14471b();
        m20136n();
        return true;
    }

    /* renamed from: n */
    private void m20136n() {
        C5226f fVar = C5226f.NONE;
        if (mo14434e()) {
            fVar = C5226f.ANIMATION;
        } else if (this.f14728l || this.f14729m || this.f14730n) {
            fVar = C5226f.USER;
        }
        if (this.f14737u != fVar) {
            this.f14737u = fVar;
            C5225e eVar = this.f14722f;
            if (eVar != null) {
                eVar.mo14470a(fVar);
            }
        }
    }

    /* renamed from: a */
    public void mo14412a(C5224d dVar) {
        this.f14723g.add(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14413a(boolean z) {
        if (!z) {
            mo14414a();
        }
        m20136n();
    }

    /* renamed from: a */
    public boolean mo14414a() {
        return m20131a(this.f14714B, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14415a(int i, int i2) {
        float c = this.f14714B.mo14554c();
        float d = this.f14714B.mo14557d();
        float f = ((float) i) + c;
        float f2 = ((float) i2) + d;
        if (this.f14713A.mo14544y()) {
            this.f14740x.mo14494a(f, f2, f14712a);
            PointF pointF = f14712a;
            float f3 = pointF.x;
            f2 = pointF.y;
            f = f3;
        }
        this.f14714B.mo14558d(f, f2);
        return !C5246f.m20301b(c, f) || !C5246f.m20301b(d, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14416a(MotionEvent motionEvent) {
        if (!this.f14713A.mo14538s() || motionEvent.getActionMasked() != 1 || this.f14729m) {
            return false;
        }
        C5223c cVar = this.f14721e;
        if (cVar != null && cVar.onDoubleTap(motionEvent)) {
            return true;
        }
        mo14420a(this.f14716D.mo14565a(this.f14714B, motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14417a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f14713A.mo14543x() || mo14438g()) {
            return false;
        }
        if (this.f14717E.mo14481b()) {
            return true;
        }
        mo14442k();
        this.f14740x.mo14496a(this.f14714B, this.f14713A);
        this.f14740x.mo14492a(this.f14714B.mo14554c(), this.f14714B.mo14557d());
        this.f14738v.fling(Math.round(this.f14714B.mo14554c()), Math.round(this.f14714B.mo14557d()), m20129a(f * 0.9f), m20129a(f2 * 0.9f), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.f14724h.mo14471b();
        m20136n();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14418a(ScaleGestureDetector scaleGestureDetector) {
        if (!this.f14713A.mo14512B() || mo14438g()) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (this.f14717E.mo14480a(scaleFactor)) {
            return true;
        }
        this.f14731o = scaleGestureDetector.getFocusX();
        this.f14732p = scaleGestureDetector.getFocusY();
        this.f14714B.mo14556c(scaleFactor, this.f14731o, this.f14732p);
        this.f14733q = true;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14419a(C5228a aVar) {
        if (!this.f14713A.mo14511A() || mo14438g()) {
            return false;
        }
        if (this.f14717E.mo14483c()) {
            return true;
        }
        this.f14731o = aVar.mo14473a();
        this.f14732p = aVar.mo14475b();
        this.f14714B.mo14547a(aVar.mo14476c(), this.f14731o, this.f14732p);
        this.f14733q = true;
        return true;
    }

    /* renamed from: a */
    public boolean mo14420a(C5246f fVar) {
        return m20131a(fVar, true);
    }

    /* renamed from: b */
    public C5244e mo14421b() {
        return this.f14713A;
    }

    /* renamed from: b */
    public void mo14422b(C5224d dVar) {
        this.f14723g.remove(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14423b(boolean z) {
        this.f14736t = false;
        m20136n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14424b(MotionEvent motionEvent) {
        mo14442k();
        C5223c cVar = this.f14721e;
        if (cVar != null) {
            cVar.onDown(motionEvent);
        }
        return this.f14713A.mo14539t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14425b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (!this.f14713A.mo14543x() || mo14438g()) {
            return false;
        }
        float f3 = -f2;
        if (this.f14717E.mo14482b(f3)) {
            return true;
        }
        if (!this.f14728l) {
            this.f14728l = Math.abs(motionEvent2.getX() - motionEvent.getX()) > ((float) this.f14718b) || Math.abs(motionEvent2.getY() - motionEvent.getY()) > ((float) this.f14718b);
            if (this.f14728l) {
                return true;
            }
        }
        if (this.f14728l) {
            if (C5246f.m20299a(this.f14714B.mo14560e(), this.f14716D.mo14564a(this.f14714B)) < 0) {
                z = true;
            }
            if (!z || !this.f14713A.mo14544y()) {
                this.f14714B.mo14555c(-f, f3);
                this.f14733q = true;
            }
        }
        return this.f14728l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14426b(ScaleGestureDetector scaleGestureDetector) {
        this.f14729m = this.f14713A.mo14512B();
        if (this.f14729m) {
            this.f14717E.mo14486f();
        }
        return this.f14729m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14427b(C5228a aVar) {
        this.f14730n = this.f14713A.mo14511A();
        if (this.f14730n) {
            this.f14717E.mo14484d();
        }
        return this.f14730n;
    }

    /* renamed from: c */
    public C5246f mo14428c() {
        return this.f14714B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14429c(MotionEvent motionEvent) {
        C5223c cVar = this.f14721e;
        if (cVar != null) {
            cVar.onLongPress(motionEvent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14430c(ScaleGestureDetector scaleGestureDetector) {
        if (this.f14729m) {
            this.f14717E.mo14487g();
        }
        this.f14729m = false;
        this.f14734r = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14431c(C5228a aVar) {
        if (this.f14730n) {
            this.f14717E.mo14485e();
        }
        this.f14730n = false;
        this.f14735s = true;
    }

    /* renamed from: d */
    public C5247g mo14432d() {
        return this.f14716D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo14433d(MotionEvent motionEvent) {
        C5223c cVar = this.f14721e;
        return cVar != null && cVar.onSingleTapConfirmed(motionEvent);
    }

    /* renamed from: e */
    public boolean mo14434e() {
        return mo14438g() || mo14437f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo14435e(MotionEvent motionEvent) {
        C5223c cVar = this.f14721e;
        return cVar != null && cVar.onSingleTapUp(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo14436f(MotionEvent motionEvent) {
        this.f14728l = false;
        this.f14729m = false;
        this.f14730n = false;
        this.f14717E.mo14488h();
        if (!mo14437f() && !this.f14736t) {
            mo14414a();
        }
        C5223c cVar = this.f14721e;
        if (cVar != null) {
            cVar.mo14462a(motionEvent);
        }
    }

    /* renamed from: f */
    public boolean mo14437f() {
        return !this.f14738v.isFinished();
    }

    /* renamed from: g */
    public boolean mo14438g() {
        return !this.f14739w.mo14508d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo14439h() {
        for (C5224d a : this.f14723g) {
            a.mo14469a(this.f14715C, this.f14714B);
        }
        mo14440i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo14440i() {
        this.f14715C.mo14550a(this.f14714B);
        for (C5224d a : this.f14723g) {
            a.mo14468a(this.f14714B);
        }
    }

    /* renamed from: j */
    public void mo14441j() {
        mo14443l();
        mo14442k();
    }

    /* renamed from: k */
    public void mo14442k() {
        if (mo14437f()) {
            this.f14738v.forceFinished(true);
            mo14413a(true);
        }
    }

    /* renamed from: l */
    public void mo14443l() {
        if (mo14438g()) {
            this.f14739w.mo14506b();
            mo14423b(true);
        }
    }

    /* renamed from: m */
    public void mo14444m() {
        if (this.f14716D.mo14569b(this.f14714B)) {
            mo14439h();
        } else {
            mo14440i();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (-view.getPaddingLeft()), (float) (-view.getPaddingTop()));
        boolean onTouchEvent = this.f14725i.onTouchEvent(obtain) | this.f14726j.onTouchEvent(obtain) | this.f14727k.mo14474a(obtain);
        m20136n();
        if (this.f14717E.mo14479a() && !this.f14714B.equals(this.f14715C)) {
            mo14440i();
        }
        if (this.f14733q) {
            this.f14733q = false;
            this.f14716D.mo14567a(this.f14714B, this.f14715C, this.f14731o, this.f14732p, true, true, false);
            if (!this.f14714B.equals(this.f14715C)) {
                mo14440i();
            }
        }
        if (this.f14734r || this.f14735s) {
            this.f14734r = false;
            this.f14735s = false;
            if (!this.f14717E.mo14479a()) {
                m20131a(this.f14716D.mo14568b(this.f14714B, this.f14715C, this.f14731o, this.f14732p, true, false, true), false);
            }
        }
        if (obtain.getActionMasked() == 1 || obtain.getActionMasked() == 3) {
            mo14436f(obtain);
            m20136n();
        }
        obtain.recycle();
        return onTouchEvent;
    }
}
