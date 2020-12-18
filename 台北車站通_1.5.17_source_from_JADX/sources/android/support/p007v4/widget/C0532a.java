package android.support.p007v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p007v4.view.C0487v;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import org.apache.http.HttpStatus;

/* renamed from: android.support.v4.widget.a */
public abstract class C0532a implements View.OnTouchListener {

    /* renamed from: a */
    private static final int f1978a = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    final C0533a f1979b = new C0533a();

    /* renamed from: c */
    private final Interpolator f1980c = new AccelerateInterpolator();

    /* renamed from: d */
    final View f1981d;

    /* renamed from: e */
    private Runnable f1982e;

    /* renamed from: f */
    private float[] f1983f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f1984g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h */
    private int f1985h;

    /* renamed from: i */
    private int f1986i;

    /* renamed from: j */
    private float[] f1987j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f1988k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f1989l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m */
    private boolean f1990m;

    /* renamed from: n */
    boolean f1991n;

    /* renamed from: o */
    boolean f1992o;

    /* renamed from: p */
    boolean f1993p;

    /* renamed from: q */
    private boolean f1994q;

    /* renamed from: r */
    private boolean f1995r;

    /* renamed from: android.support.v4.widget.a$a */
    private static class C0533a {

        /* renamed from: a */
        private int f1996a;

        /* renamed from: b */
        private int f1997b;

        /* renamed from: c */
        private float f1998c;

        /* renamed from: d */
        private float f1999d;

        /* renamed from: e */
        private long f2000e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2001f = 0;

        /* renamed from: g */
        private int f2002g = 0;

        /* renamed from: h */
        private int f2003h = 0;

        /* renamed from: i */
        private long f2004i = -1;

        /* renamed from: j */
        private float f2005j;

        /* renamed from: k */
        private int f2006k;

        C0533a() {
        }

        /* renamed from: a */
        private float m2645a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m2646a(long j) {
            if (j < this.f2000e) {
                return 0.0f;
            }
            long j2 = this.f2004i;
            if (j2 < 0 || j < j2) {
                return C0532a.m2623a(((float) (j - this.f2000e)) / ((float) this.f1996a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f2005j;
            return (1.0f - f) + (f * C0532a.m2623a(((float) j3) / ((float) this.f2006k), 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void mo2280a() {
            if (this.f2001f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m2645a(m2646a(currentAnimationTimeMillis));
                this.f2001f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f2001f)) * a;
                this.f2002g = (int) (this.f1998c * f);
                this.f2003h = (int) (f * this.f1999d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo2281a(float f, float f2) {
            this.f1998c = f;
            this.f1999d = f2;
        }

        /* renamed from: a */
        public void mo2282a(int i) {
            this.f1997b = i;
        }

        /* renamed from: b */
        public int mo2283b() {
            return this.f2002g;
        }

        /* renamed from: b */
        public void mo2284b(int i) {
            this.f1996a = i;
        }

        /* renamed from: c */
        public int mo2285c() {
            return this.f2003h;
        }

        /* renamed from: d */
        public int mo2286d() {
            float f = this.f1998c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int mo2287e() {
            float f = this.f1999d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean mo2288f() {
            return this.f2004i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2004i + ((long) this.f2006k);
        }

        /* renamed from: g */
        public void mo2289g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2006k = C0532a.m2626a((int) (currentAnimationTimeMillis - this.f2000e), 0, this.f1997b);
            this.f2005j = m2646a(currentAnimationTimeMillis);
            this.f2004i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void mo2290h() {
            this.f2000e = AnimationUtils.currentAnimationTimeMillis();
            this.f2004i = -1;
            this.f2001f = this.f2000e;
            this.f2005j = 0.5f;
            this.f2002g = 0;
            this.f2003h = 0;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C0534b implements Runnable {
        C0534b() {
        }

        public void run() {
            C0532a aVar = C0532a.this;
            if (aVar.f1993p) {
                if (aVar.f1991n) {
                    aVar.f1991n = false;
                    aVar.f1979b.mo2290h();
                }
                C0533a aVar2 = C0532a.this.f1979b;
                if (aVar2.mo2288f() || !C0532a.this.mo2270b()) {
                    C0532a.this.f1993p = false;
                    return;
                }
                C0532a aVar3 = C0532a.this;
                if (aVar3.f1992o) {
                    aVar3.f1992o = false;
                    aVar3.mo2266a();
                }
                aVar2.mo2280a();
                C0532a.this.mo2267a(aVar2.mo2283b(), aVar2.mo2285c());
                C0487v.m2277a(C0532a.this.f1981d, (Runnable) this);
            }
        }
    }

    public C0532a(View view) {
        this.f1981d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo2269b(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo2272c(f3, f3);
        mo2275d(1);
        mo2264a(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2274d(0.2f, 0.2f);
        mo2276e(1.0f, 1.0f);
        mo2273c(f1978a);
        mo2278f(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        mo2277e(HttpStatus.SC_INTERNAL_SERVER_ERROR);
    }

    /* renamed from: a */
    static float m2623a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m2624a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m2623a(f * f2, 0.0f, f3);
        float f6 = m2629f(f2 - f4, a) - m2629f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1980c.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1980c.getInterpolation(f6);
        }
        return m2623a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m2625a(int i, float f, float f2, float f3) {
        float a = m2624a(this.f1983f[i], f2, this.f1984g[i], f);
        int i2 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f1987j[i];
        float f5 = this.f1988k[i];
        float f6 = this.f1989l[i];
        float f7 = f4 * f3;
        return i2 > 0 ? m2623a(a * f7, f5, f6) : -m2623a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m2626a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m2627c() {
        if (this.f1991n) {
            this.f1993p = false;
        } else {
            this.f1979b.mo2289g();
        }
    }

    /* renamed from: d */
    private void m2628d() {
        int i;
        if (this.f1982e == null) {
            this.f1982e = new C0534b();
        }
        this.f1993p = true;
        this.f1991n = true;
        if (this.f1990m || (i = this.f1986i) <= 0) {
            this.f1982e.run();
        } else {
            C0487v.m2278a(this.f1981d, this.f1982e, (long) i);
        }
        this.f1990m = true;
    }

    /* renamed from: f */
    private float m2629f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1985h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f1993p || this.f1985h != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: a */
    public C0532a mo2264a(float f, float f2) {
        float[] fArr = this.f1984g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    public C0532a mo2265a(boolean z) {
        if (this.f1994q && !z) {
            m2627c();
        }
        this.f1994q = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2266a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1981d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public abstract void mo2267a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo2268a(int i);

    /* renamed from: b */
    public C0532a mo2269b(float f, float f2) {
        float[] fArr = this.f1989l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2270b() {
        C0533a aVar = this.f1979b;
        int e = aVar.mo2287e();
        int d = aVar.mo2286d();
        return (e != 0 && mo2271b(e)) || (d != 0 && mo2268a(d));
    }

    /* renamed from: b */
    public abstract boolean mo2271b(int i);

    /* renamed from: c */
    public C0532a mo2272c(float f, float f2) {
        float[] fArr = this.f1988k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0532a mo2273c(int i) {
        this.f1986i = i;
        return this;
    }

    /* renamed from: d */
    public C0532a mo2274d(float f, float f2) {
        float[] fArr = this.f1983f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: d */
    public C0532a mo2275d(int i) {
        this.f1985h = i;
        return this;
    }

    /* renamed from: e */
    public C0532a mo2276e(float f, float f2) {
        float[] fArr = this.f1987j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: e */
    public C0532a mo2277e(int i) {
        this.f1979b.mo2282a(i);
        return this;
    }

    /* renamed from: f */
    public C0532a mo2278f(int i) {
        this.f1979b.mo2284b(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1994q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m2627c()
            goto L_0x0058
        L_0x001a:
            r5.f1992o = r2
            r5.f1990m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1981d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2625a((int) r1, (float) r0, (float) r3, (float) r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1981d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2625a((int) r2, (float) r7, (float) r6, (float) r3)
            android.support.v4.widget.a$a r7 = r5.f1979b
            r7.mo2281a(r0, r6)
            boolean r6 = r5.f1993p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo2270b()
            if (r6 == 0) goto L_0x0058
            r5.m2628d()
        L_0x0058:
            boolean r6 = r5.f1995r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f1993p
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.widget.C0532a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
