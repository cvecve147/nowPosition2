package p101d.p111d.p112a;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.support.p007v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import p101d.p111d.p112a.p114b.p115a.C5228a;

/* renamed from: d.d.a.d */
public class C5242d extends C5220b {

    /* renamed from: F */
    private static final int[] f14807F = new int[2];

    /* renamed from: G */
    private static final Matrix f14808G = new Matrix();

    /* renamed from: H */
    private static final RectF f14809H = new RectF();

    /* renamed from: I */
    private static final View.OnTouchListener f14810I = new C5238c();

    /* renamed from: J */
    private final int f14811J;

    /* renamed from: K */
    private ViewPager f14812K;

    /* renamed from: L */
    private boolean f14813L;

    /* renamed from: M */
    private boolean f14814M;

    /* renamed from: N */
    private boolean f14815N;

    /* renamed from: O */
    private int f14816O;

    /* renamed from: P */
    private float f14817P;

    /* renamed from: Q */
    private boolean f14818Q;

    /* renamed from: R */
    private float f14819R;

    public C5242d(View view) {
        super(view);
        this.f14811J = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    private float m20242a(float f, C5246f fVar, RectF rectF) {
        float m = mo14421b().mo14532m() * 4.0f;
        float d = fVar.mo14557d();
        float f2 = rectF.top;
        float d2 = d < f2 ? (f2 - fVar.mo14557d()) / m : fVar.mo14557d() > rectF.bottom ? (fVar.mo14557d() - rectF.bottom) / m : 0.0f;
        float a = mo14432d().mo14564a(fVar);
        float sqrt = ((float) Math.sqrt((double) Math.max(0.0f, Math.min(Math.max(d2, a == 0.0f ? 0.0f : (fVar.mo14560e() / a) - 1.0f), 1.0f)))) * ((float) this.f14811J) * 15.0f;
        if (this.f14817P * f < 0.0f && this.f14816O == 0) {
            this.f14817P = 0.0f;
        }
        if (m20254o()) {
            this.f14817P = Math.signum((float) this.f14816O) * sqrt;
        }
        if (Math.abs(this.f14817P) < sqrt) {
            float f3 = this.f14817P;
            if (f * f3 >= 0.0f) {
                this.f14817P = f3 + f;
                float max = Math.max(0.0f, Math.abs(this.f14817P) - sqrt) * Math.signum(f);
                this.f14817P -= max;
                return max;
            }
        }
        return f;
    }

    /* renamed from: a */
    private int m20243a(MotionEvent motionEvent, float f) {
        int scrollX = this.f14812K.getScrollX();
        this.f14819R += f;
        m20253j(motionEvent);
        return scrollX - this.f14812K.getScrollX();
    }

    @TargetApi(11)
    /* renamed from: a */
    private static void m20244a(Matrix matrix, View view, ViewPager viewPager) {
        if (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            if (view2 != viewPager) {
                m20244a(matrix, view2, viewPager);
            }
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: a */
    private static void m20246a(MotionEvent motionEvent, View view, ViewPager viewPager) {
        if (Build.VERSION.SDK_INT >= 11) {
            f14808G.reset();
            m20244a(f14808G, view, viewPager);
            motionEvent.transform(f14808G);
            return;
        }
        view.getLocationOnScreen(f14807F);
        int[] iArr = f14807F;
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        viewPager.getLocationOnScreen(f14807F);
        int[] iArr2 = f14807F;
        motionEvent.offsetLocation((float) (-iArr2[0]), (float) (-iArr2[1]));
    }

    /* renamed from: b */
    private float m20247b(float f, C5246f fVar, RectF rectF) {
        if (!mo14421b().mo14543x()) {
            return f;
        }
        float signum = Math.signum(f);
        float abs = Math.abs(f);
        float c = fVar.mo14554c();
        float f2 = signum < 0.0f ? c - rectF.left : rectF.right - c;
        int i = this.f14816O;
        float abs2 = ((float) i) * signum < 0.0f ? (float) Math.abs(i) : 0.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (abs2 < abs) {
            abs = f2 + abs2 >= abs ? abs2 : abs - f2;
        }
        return abs * signum;
    }

    /* renamed from: b */
    private float m20248b(MotionEvent motionEvent, float f) {
        if (this.f14815N || this.f14813L) {
            return f;
        }
        C5246f c = mo14428c();
        mo14432d().mo14566a(c, f14809H);
        float a = m20242a(m20247b(f, c, f14809H), c, f14809H);
        float f2 = f - a;
        boolean z = this.f14818Q && this.f14816O == 0;
        int a2 = m20243a(motionEvent, a);
        this.f14816O += a2;
        return z ? f2 + ((float) (Math.round(a) - a2)) : f2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m20249b(ViewPager viewPager, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            try {
                viewPager.mo1787a();
                if (viewPager.mo1810e()) {
                    viewPager.mo1800c();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    private int m20250g(MotionEvent motionEvent) {
        int scrollX = this.f14812K.getScrollX();
        int width = this.f14812K.getWidth() + this.f14812K.getPageMargin();
        while (scrollX < 0) {
            scrollX += width;
        }
        return (width * ((int) ((((float) scrollX) + motionEvent.getX()) / ((float) width)))) - scrollX;
    }

    /* renamed from: h */
    private void m20251h(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
            this.f14815N = !m20254o();
        }
    }

    /* renamed from: i */
    private static MotionEvent m20252i(MotionEvent motionEvent) {
        return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    /* renamed from: j */
    private void m20253j(MotionEvent motionEvent) {
        if (this.f14812K != null) {
            MotionEvent i = m20252i(motionEvent);
            i.setLocation(this.f14819R, 0.0f);
            if (this.f14818Q) {
                this.f14812K.onTouchEvent(i);
            } else {
                this.f14818Q = this.f14812K.onInterceptTouchEvent(i);
            }
            if (!this.f14818Q && m20254o()) {
                m20249b(this.f14812K, motionEvent);
            }
            try {
                if (this.f14812K != null && this.f14812K.mo1810e()) {
                    this.f14812K.mo1800c();
                }
            } catch (Exception unused) {
            }
            i.recycle();
        }
    }

    /* renamed from: o */
    private boolean m20254o() {
        int i = this.f14816O;
        return i < -1 || i > 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14416a(MotionEvent motionEvent) {
        return !m20254o() && super.mo14416a(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14417a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return !m20254o() && super.mo14417a(motionEvent, motionEvent2, f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14424b(MotionEvent motionEvent) {
        ViewPager viewPager = this.f14812K;
        if (viewPager == null) {
            return super.mo14424b(motionEvent);
        }
        viewPager.requestDisallowInterceptTouchEvent(true);
        this.f14815N = false;
        this.f14818Q = false;
        this.f14814M = false;
        this.f14816O = m20250g(motionEvent);
        this.f14819R = motionEvent.getX();
        this.f14817P = 0.0f;
        m20253j(motionEvent);
        super.mo14424b(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14425b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f14812K == null) {
            return super.mo14425b(motionEvent, motionEvent2, f, f2);
        }
        if (!this.f14814M) {
            this.f14814M = true;
            return true;
        }
        float f3 = -m20248b(motionEvent2, -f);
        if (m20254o()) {
            f2 = 0.0f;
        }
        return super.mo14425b(motionEvent, motionEvent2, f3, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14426b(ScaleGestureDetector scaleGestureDetector) {
        return !m20254o() && super.mo14426b(scaleGestureDetector);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14427b(C5228a aVar) {
        return !m20254o() && super.mo14427b(aVar);
    }

    /* renamed from: c */
    public void mo14509c(boolean z) {
        this.f14813L = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo14436f(MotionEvent motionEvent) {
        m20253j(motionEvent);
        super.mo14436f(motionEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f14812K == null) {
            return super.onTouch(view, motionEvent);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        m20246a(obtain, view, this.f14812K);
        m20251h(obtain);
        boolean onTouch = super.onTouch(view, obtain);
        obtain.recycle();
        return onTouch;
    }
}
