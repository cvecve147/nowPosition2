package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import p013b.p018b.p028h.p031b.p032a.C1026a;

/* renamed from: android.support.design.widget.w */
class C0167w {

    /* renamed from: a */
    static final Interpolator f890a = C0145a.f818c;

    /* renamed from: b */
    static final int[] f891b = {16842919, 16842910};

    /* renamed from: c */
    static final int[] f892c = {16842908, 16842910};

    /* renamed from: d */
    static final int[] f893d = {16842910};

    /* renamed from: e */
    static final int[] f894e = new int[0];

    /* renamed from: f */
    int f895f = 0;

    /* renamed from: g */
    private final C0112F f896g;

    /* renamed from: h */
    C0100C f897h;

    /* renamed from: i */
    private float f898i;

    /* renamed from: j */
    Drawable f899j;

    /* renamed from: k */
    Drawable f900k;

    /* renamed from: l */
    C0156l f901l;

    /* renamed from: m */
    Drawable f902m;

    /* renamed from: n */
    float f903n;

    /* renamed from: o */
    float f904o;

    /* renamed from: p */
    final C0144X f905p;

    /* renamed from: q */
    final C0110D f906q;

    /* renamed from: r */
    private final Rect f907r = new Rect();

    /* renamed from: s */
    private ViewTreeObserver.OnPreDrawListener f908s;

    /* renamed from: android.support.design.widget.w$a */
    private class C0168a extends C0172e {
        C0168a() {
            super(C0167w.this, (C0164t) null);
        }
    }

    /* renamed from: android.support.design.widget.w$b */
    private class C0169b extends C0172e {
        C0169b() {
            super(C0167w.this, (C0164t) null);
        }
    }

    /* renamed from: android.support.design.widget.w$c */
    interface C0170c {
        /* renamed from: a */
        void mo892a();

        /* renamed from: b */
        void mo893b();
    }

    /* renamed from: android.support.design.widget.w$d */
    private class C0171d extends C0172e {
        C0171d() {
            super(C0167w.this, (C0164t) null);
        }
    }

    /* renamed from: android.support.design.widget.w$e */
    private abstract class C0172e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f912a;

        /* renamed from: b */
        private float f913b;

        /* renamed from: c */
        private float f914c;

        private C0172e() {
        }

        /* synthetic */ C0172e(C0167w wVar, C0164t tVar) {
            this();
        }

        public void onAnimationEnd(Animator animator) {
            C0167w.this.f897h.mo454b(this.f914c);
            throw null;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f912a) {
                C0167w.this.f897h.mo453b();
                throw null;
            }
            C0100C c = C0167w.this.f897h;
            float f = this.f913b;
            c.mo454b(f + ((this.f914c - f) * valueAnimator.getAnimatedFraction()));
            throw null;
        }
    }

    C0167w(C0144X x, C0110D d) {
        this.f905p = x;
        this.f906q = d;
        this.f896g = new C0112F();
        this.f896g.mo623a(f891b, m848a((C0172e) new C0169b()));
        this.f896g.mo623a(f892c, m848a((C0172e) new C0169b()));
        this.f896g.mo623a(f893d, m848a((C0172e) new C0171d()));
        this.f896g.mo623a(f894e, m848a((C0172e) new C0168a()));
        this.f898i = this.f905p.getRotation();
    }

    /* renamed from: a */
    private ValueAnimator m848a(C0172e eVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f890a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(eVar);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: b */
    private static ColorStateList m849b(int i) {
        return new ColorStateList(new int[][]{f892c, f891b, new int[0]}, new int[]{i, i, 0});
    }

    /* renamed from: l */
    private void m850l() {
        if (this.f908s == null) {
            this.f908s = new C0166v(this);
        }
    }

    /* renamed from: m */
    private boolean m851m() {
        return C0487v.m2309y(this.f905p) && !this.f905p.isInEditMode();
    }

    /* renamed from: n */
    private void m852n() {
        int i;
        C0144X x;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f898i % 90.0f != 0.0f) {
                i = 1;
                if (this.f905p.getLayerType() != 1) {
                    x = this.f905p;
                }
            } else if (this.f905p.getLayerType() != 0) {
                x = this.f905p;
                i = 0;
            }
            x.setLayerType(i, (Paint) null);
        }
        C0100C c = this.f897h;
        if (c == null) {
            C0156l lVar = this.f901l;
            if (lVar != null) {
                lVar.mo857a(-this.f898i);
                throw null;
            }
            return;
        }
        c.mo451a(-this.f898i);
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo900a() {
        return this.f902m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo901a(float f) {
        if (this.f903n != f) {
            this.f903n = f;
            mo902a(f, this.f904o);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo902a(float f, float f2) {
        C0100C c = this.f897h;
        if (c != null) {
            c.mo452a(f, this.f904o + f);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo903a(int i) {
        Drawable drawable = this.f900k;
        if (drawable != null) {
            C1026a.m5447a(drawable, m849b(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo904a(ColorStateList colorStateList) {
        Drawable drawable = this.f899j;
        if (drawable != null) {
            C1026a.m5447a(drawable, colorStateList);
        }
        C0156l lVar = this.f901l;
        if (lVar != null) {
            lVar.mo858a(colorStateList);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo905a(PorterDuff.Mode mode) {
        Drawable drawable = this.f899j;
        if (drawable != null) {
            C1026a.m5450a(drawable, mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo906a(Rect rect) {
        this.f897h.getPadding(rect);
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo907a(C0170c cVar, boolean z) {
        if (!mo912c()) {
            this.f905p.animate().cancel();
            if (m851m()) {
                this.f895f = 1;
                this.f905p.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(C0145a.f818c).setListener(new C0164t(this, z, cVar));
                return;
            }
            this.f905p.mo839a(z ? 8 : 4, z);
            if (cVar != null) {
                cVar.mo893b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo908a(int[] iArr) {
        this.f896g.mo622a(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo909b() {
        return this.f903n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo910b(Rect rect) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo911b(C0170c cVar, boolean z) {
        if (!mo913d()) {
            this.f905p.animate().cancel();
            if (m851m()) {
                this.f895f = 2;
                if (this.f905p.getVisibility() != 0) {
                    this.f905p.setAlpha(0.0f);
                    this.f905p.setScaleY(0.0f);
                    this.f905p.setScaleX(0.0f);
                }
                this.f905p.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(C0145a.f819d).setListener(new C0165u(this, z, cVar));
                return;
            }
            this.f905p.mo839a(0, z);
            this.f905p.setAlpha(1.0f);
            this.f905p.setScaleY(1.0f);
            this.f905p.setScaleX(1.0f);
            if (cVar != null) {
                cVar.mo892a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo912c() {
        return this.f905p.getVisibility() == 0 ? this.f895f == 1 : this.f895f != 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo913d() {
        return this.f905p.getVisibility() != 0 ? this.f895f == 2 : this.f895f != 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo914e() {
        this.f896g.mo621a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo915f() {
        if (mo919j()) {
            m850l();
            this.f905p.getViewTreeObserver().addOnPreDrawListener(this.f908s);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo916g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo917h() {
        if (this.f908s != null) {
            this.f905p.getViewTreeObserver().removeOnPreDrawListener(this.f908s);
            this.f908s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo918i() {
        float rotation = this.f905p.getRotation();
        if (this.f898i != rotation) {
            this.f898i = rotation;
            m852n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo919j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo920k() {
        Rect rect = this.f907r;
        mo906a(rect);
        mo910b(rect);
        this.f906q.mo616a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
