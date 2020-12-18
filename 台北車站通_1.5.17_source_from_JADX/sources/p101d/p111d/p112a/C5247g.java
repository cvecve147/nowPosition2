package p101d.p111d.p112a;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import p101d.p111d.p112a.p114b.C5234e;
import p101d.p111d.p112a.p114b.C5237h;
import p101d.p111d.p112a.p116c.C5240b;

/* renamed from: d.d.a.g */
public class C5247g {

    /* renamed from: a */
    private static final C5246f f14855a = new C5246f();

    /* renamed from: b */
    private static final Rect f14856b = new Rect();

    /* renamed from: c */
    private static final RectF f14857c = new RectF();

    /* renamed from: d */
    private static final Point f14858d = new Point();

    /* renamed from: e */
    private static final PointF f14859e = new PointF();

    /* renamed from: f */
    private final C5244e f14860f;

    /* renamed from: g */
    private final C5237h f14861g = new C5237h();

    /* renamed from: h */
    private final C5234e f14862h = new C5234e();

    /* renamed from: i */
    private boolean f14863i = true;

    /* renamed from: j */
    private float f14864j;

    /* renamed from: k */
    private float f14865k;

    C5247g(C5244e eVar) {
        this.f14860f = eVar;
    }

    /* renamed from: a */
    private float m20317a(float f, float f2, float f3) {
        float f4;
        if (f3 == 1.0f) {
            return f;
        }
        float f5 = this.f14864j;
        float f6 = f5 / f3;
        float f7 = this.f14865k * f3;
        if (f >= f5 || f >= f2) {
            float f8 = this.f14865k;
            f4 = (f <= f8 || f <= f2) ? 0.0f : (f - f8) / (f7 - f8);
        } else {
            f4 = (f5 - f) / (f5 - f6);
        }
        return f4 == 0.0f ? f : f + (((float) Math.sqrt((double) f4)) * (f2 - f));
    }

    /* renamed from: a */
    private float m20318a(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return f;
        }
        float f6 = (f + f2) * 0.5f;
        float f7 = (f6 >= f3 || f >= f2) ? (f6 <= f4 || f <= f2) ? 0.0f : (f6 - f4) / f5 : (f3 - f6) / f5;
        if (f7 == 0.0f) {
            return f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        return f - (((float) Math.sqrt((double) f7)) * (f - f2));
    }

    /* renamed from: c */
    private C5234e m20319c(C5246f fVar) {
        this.f14862h.mo14496a(fVar, this.f14860f);
        return this.f14862h;
    }

    /* renamed from: d */
    private C5237h m20320d(C5246f fVar) {
        this.f14861g.mo14499a(fVar, this.f14860f);
        this.f14864j = this.f14861g.mo14500b();
        this.f14865k = this.f14861g.mo14497a();
        return this.f14861g;
    }

    /* renamed from: a */
    public float mo14564a(C5246f fVar) {
        return m20320d(fVar).mo14500b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5246f mo14565a(C5246f fVar, float f, float f2) {
        C5237h d = m20320d(fVar);
        float b = d.mo14500b();
        float d2 = this.f14860f.mo14523d() > 0.0f ? this.f14860f.mo14523d() : d.mo14497a();
        if (fVar.mo14560e() >= (b + d2) * 0.5f) {
            d2 = b;
        }
        C5246f a = fVar.mo14546a();
        a.mo14559d(d2, f, f2);
        return a;
    }

    /* renamed from: a */
    public void mo14566a(C5246f fVar, RectF rectF) {
        m20319c(fVar).mo14495a(rectF);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14567a(C5246f fVar, C5246f fVar2, float f, float f2, boolean z, boolean z2, boolean z3) {
        float f3;
        float f4;
        boolean z4;
        float f5;
        float f6;
        C5246f fVar3 = fVar;
        boolean z5 = false;
        if (!this.f14860f.mo14544y()) {
            return false;
        }
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            C5240b.m20235a(this.f14860f, f14858d);
            Point point = f14858d;
            f3 = (float) point.x;
            f4 = (float) point.y;
        } else {
            f3 = f;
            f4 = f2;
        }
        if (z3 && this.f14860f.mo14545z()) {
            float round = ((float) Math.round(fVar.mo14551b() / 90.0f)) * 90.0f;
            if (!C5246f.m20301b(round, fVar.mo14551b())) {
                fVar3.mo14552b(round, f3, f4);
                z5 = true;
            }
        }
        C5237h d = m20320d(fVar);
        float b = d.mo14500b();
        float n = z2 ? this.f14860f.mo14533n() : 1.0f;
        float a = d.mo14498a(fVar.mo14560e(), n);
        if (fVar2 != null) {
            a = m20317a(a, fVar2.mo14560e(), n);
        }
        if (!C5246f.m20301b(a, fVar.mo14560e())) {
            fVar3.mo14559d(a, f3, f4);
            z4 = true;
        } else {
            z4 = z5;
        }
        C5234e c = m20319c(fVar);
        float f7 = 0.0f;
        float l = z ? this.f14860f.mo14531l() : 0.0f;
        if (z) {
            f7 = this.f14860f.mo14532m();
        }
        float f8 = f7;
        c.mo14493a(fVar.mo14554c(), fVar.mo14557d(), l, f8, f14859e);
        PointF pointF = f14859e;
        float f9 = pointF.x;
        float f10 = pointF.y;
        if (a < b) {
            float sqrt = (float) Math.sqrt((double) ((((a * n) / b) - 1.0f) / (n - 1.0f)));
            c.mo14494a(f9, f10, f14859e);
            PointF pointF2 = f14859e;
            float f11 = pointF2.x;
            float f12 = pointF2.y;
            f5 = f12 + (sqrt * (f10 - f12));
            f6 = f11 + ((f9 - f11) * sqrt);
        } else {
            f5 = f10;
            f6 = f9;
        }
        if (fVar2 != null) {
            c.mo14495a(f14857c);
            float c2 = fVar2.mo14554c();
            RectF rectF = f14857c;
            f6 = m20318a(f6, c2, rectF.left, rectF.right, l);
            float d2 = fVar2.mo14557d();
            RectF rectF2 = f14857c;
            f5 = m20318a(f5, d2, rectF2.top, rectF2.bottom, f8);
        }
        if (C5246f.m20301b(f6, fVar.mo14554c()) && C5246f.m20301b(f5, fVar.mo14557d())) {
            return z4;
        }
        fVar3.mo14558d(f6, f5);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5246f mo14568b(C5246f fVar, C5246f fVar2, float f, float f2, boolean z, boolean z2, boolean z3) {
        C5246f fVar3 = fVar;
        f14855a.mo14550a(fVar);
        if (mo14567a(f14855a, fVar2, f, f2, z, z2, z3)) {
            return f14855a.mo14546a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo14569b(C5246f fVar) {
        if (this.f14863i) {
            fVar.mo14548a(0.0f, 0.0f, 1.0f, 0.0f);
            C5237h d = m20320d(fVar);
            this.f14863i = !d.mo14501c();
            fVar.mo14548a(0.0f, 0.0f, d.mo14500b(), 0.0f);
            C5240b.m20237a(fVar, this.f14860f, f14856b);
            Rect rect = f14856b;
            fVar.mo14558d((float) rect.left, (float) rect.top);
            return !this.f14863i;
        }
        mo14567a(fVar, fVar, Float.NaN, Float.NaN, false, false, true);
        return false;
    }
}
