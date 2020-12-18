package android.support.p007v4.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.p010b.C0454b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p013b.p018b.p028h.p039h.C1100q;

/* renamed from: android.support.v4.widget.f */
public class C0540f extends Drawable implements Animatable {

    /* renamed from: a */
    private static final Interpolator f2018a = new LinearInterpolator();

    /* renamed from: b */
    private static final Interpolator f2019b = new C0454b();

    /* renamed from: c */
    private static final int[] f2020c = {-16777216};

    /* renamed from: d */
    private final C0541a f2021d = new C0541a();

    /* renamed from: e */
    private float f2022e;

    /* renamed from: f */
    private Resources f2023f;

    /* renamed from: g */
    private Animator f2024g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f2025h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f2026i;

    /* renamed from: android.support.v4.widget.f$a */
    private static class C0541a {

        /* renamed from: a */
        final RectF f2027a = new RectF();

        /* renamed from: b */
        final Paint f2028b = new Paint();

        /* renamed from: c */
        final Paint f2029c = new Paint();

        /* renamed from: d */
        final Paint f2030d = new Paint();

        /* renamed from: e */
        float f2031e = 0.0f;

        /* renamed from: f */
        float f2032f = 0.0f;

        /* renamed from: g */
        float f2033g = 0.0f;

        /* renamed from: h */
        float f2034h = 5.0f;

        /* renamed from: i */
        int[] f2035i;

        /* renamed from: j */
        int f2036j;

        /* renamed from: k */
        float f2037k;

        /* renamed from: l */
        float f2038l;

        /* renamed from: m */
        float f2039m;

        /* renamed from: n */
        boolean f2040n;

        /* renamed from: o */
        Path f2041o;

        /* renamed from: p */
        float f2042p = 1.0f;

        /* renamed from: q */
        float f2043q;

        /* renamed from: r */
        int f2044r;

        /* renamed from: s */
        int f2045s;

        /* renamed from: t */
        int f2046t = 255;

        /* renamed from: u */
        int f2047u;

        C0541a() {
            this.f2028b.setStrokeCap(Paint.Cap.SQUARE);
            this.f2028b.setAntiAlias(true);
            this.f2028b.setStyle(Paint.Style.STROKE);
            this.f2029c.setStyle(Paint.Style.FILL);
            this.f2029c.setAntiAlias(true);
            this.f2030d.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2319a() {
            return this.f2046t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2320a(float f) {
            if (f != this.f2042p) {
                this.f2042p = f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2321a(float f, float f2) {
            this.f2044r = (int) f;
            this.f2045s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2322a(int i) {
            this.f2046t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2323a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f2040n) {
                Path path = this.f2041o;
                if (path == null) {
                    this.f2041o = new Path();
                    this.f2041o.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f2041o.moveTo(0.0f, 0.0f);
                this.f2041o.lineTo(((float) this.f2044r) * this.f2042p, 0.0f);
                Path path2 = this.f2041o;
                float f3 = this.f2042p;
                path2.lineTo((((float) this.f2044r) * f3) / 2.0f, ((float) this.f2045s) * f3);
                this.f2041o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f2044r) * this.f2042p) / 2.0f), rectF.centerY() + (this.f2034h / 2.0f));
                this.f2041o.close();
                this.f2029c.setColor(this.f2047u);
                this.f2029c.setAlpha(this.f2046t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f2041o, this.f2029c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2324a(Canvas canvas, Rect rect) {
            RectF rectF = this.f2027a;
            float f = this.f2043q;
            float f2 = (this.f2034h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f2044r) * this.f2042p) / 2.0f, this.f2034h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f2031e;
            float f4 = this.f2033g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f2032f + f4) * 360.0f) - f5;
            this.f2028b.setColor(this.f2047u);
            this.f2028b.setAlpha(this.f2046t);
            float f7 = this.f2034h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f2030d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f2028b);
            mo2323a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2325a(ColorFilter colorFilter) {
            this.f2028b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2326a(boolean z) {
            if (this.f2040n != z) {
                this.f2040n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2327a(int[] iArr) {
            this.f2035i = iArr;
            mo2333c(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo2328b() {
            return this.f2032f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2329b(float f) {
            this.f2043q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2330b(int i) {
            this.f2047u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo2331c() {
            return this.f2035i[mo2334d()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2332c(float f) {
            this.f2032f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2333c(int i) {
            this.f2036j = i;
            this.f2047u = this.f2035i[this.f2036j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo2334d() {
            return (this.f2036j + 1) % this.f2035i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2335d(float f) {
            this.f2033g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public float mo2336e() {
            return this.f2031e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2337e(float f) {
            this.f2031e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo2338f() {
            return this.f2035i[this.f2036j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2339f(float f) {
            this.f2034h = f;
            this.f2028b.setStrokeWidth(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo2340g() {
            return this.f2038l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public float mo2341h() {
            return this.f2039m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public float mo2342i() {
            return this.f2037k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2343j() {
            mo2333c(mo2334d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo2344k() {
            this.f2037k = 0.0f;
            this.f2038l = 0.0f;
            this.f2039m = 0.0f;
            mo2337e(0.0f);
            mo2332c(0.0f);
            mo2335d(0.0f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo2345l() {
            this.f2037k = this.f2031e;
            this.f2038l = this.f2032f;
            this.f2039m = this.f2033g;
        }
    }

    public C0540f(Context context) {
        C1100q.m5687a(context);
        this.f2023f = context.getResources();
        this.f2021d.mo2327a(f2020c);
        mo2310c(2.5f);
        m2664a();
    }

    /* renamed from: a */
    private int m2663a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m2664a() {
        C0541a aVar = this.f2021d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0538d(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f2018a);
        ofFloat.addListener(new C0539e(this, aVar));
        this.f2024g = ofFloat;
    }

    /* renamed from: a */
    private void m2665a(float f, float f2, float f3, float f4) {
        C0541a aVar = this.f2021d;
        float f5 = this.f2023f.getDisplayMetrics().density;
        aVar.mo2339f(f2 * f5);
        aVar.mo2329b(f * f5);
        aVar.mo2333c(0);
        aVar.mo2321a(f3 * f5, f4 * f5);
    }

    /* renamed from: a */
    private void m2666a(float f, C0541a aVar) {
        m2671b(f, aVar);
        aVar.mo2337e(aVar.mo2342i() + (((aVar.mo2340g() - 0.01f) - aVar.mo2342i()) * f));
        aVar.mo2332c(aVar.mo2340g());
        aVar.mo2335d(aVar.mo2341h() + ((((float) (Math.floor((double) (aVar.mo2341h() / 0.8f)) + 1.0d)) - aVar.mo2341h()) * f));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2667a(float f, C0541a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f2026i) {
            m2666a(f, aVar);
        } else if (f != 1.0f || z) {
            float h = aVar.mo2341h();
            if (f < 0.5f) {
                float i = aVar.mo2342i();
                float f4 = i;
                f2 = (f2019b.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + i;
                f3 = f4;
            } else {
                f2 = aVar.mo2342i() + 0.79f;
                f3 = f2 - (((1.0f - f2019b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            aVar.mo2337e(f3);
            aVar.mo2332c(f2);
            aVar.mo2335d(h + (0.20999998f * f));
            m2673d((f + this.f2025h) * 216.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2671b(float f, C0541a aVar) {
        aVar.mo2330b(f > 0.75f ? m2663a((f - 0.75f) / 0.25f, aVar.mo2338f(), aVar.mo2331c()) : aVar.mo2338f());
    }

    /* renamed from: d */
    private void m2673d(float f) {
        this.f2022e = f;
    }

    /* renamed from: a */
    public void mo2304a(float f) {
        this.f2021d.mo2320a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2305a(float f, float f2) {
        this.f2021d.mo2337e(f);
        this.f2021d.mo2332c(f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2306a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f4 = 3.0f;
            f3 = 12.0f;
            f2 = 6.0f;
        } else {
            f = 7.5f;
            f4 = 2.5f;
            f3 = 10.0f;
            f2 = 5.0f;
        }
        m2665a(f, f4, f3, f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2307a(boolean z) {
        this.f2021d.mo2326a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2308a(int... iArr) {
        this.f2021d.mo2327a(iArr);
        this.f2021d.mo2333c(0);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo2309b(float f) {
        this.f2021d.mo2335d(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo2310c(float f) {
        this.f2021d.mo2339f(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f2022e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f2021d.mo2324a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f2021d.mo2319a();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f2024g.isRunning();
    }

    public void setAlpha(int i) {
        this.f2021d.mo2322a(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2021d.mo2325a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator;
        this.f2024g.cancel();
        this.f2021d.mo2345l();
        if (this.f2021d.mo2328b() != this.f2021d.mo2336e()) {
            this.f2026i = true;
            animator = this.f2024g;
            j = 666;
        } else {
            this.f2021d.mo2333c(0);
            this.f2021d.mo2344k();
            animator = this.f2024g;
            j = 1332;
        }
        animator.setDuration(j);
        this.f2024g.start();
    }

    public void stop() {
        this.f2024g.cancel();
        m2673d(0.0f);
        this.f2021d.mo2326a(false);
        this.f2021d.mo2333c(0);
        this.f2021d.mo2344k();
        invalidateSelf();
    }
}
