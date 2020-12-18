package p101d.p111d.p112a.p114b;

import android.graphics.Matrix;
import android.graphics.RectF;
import p101d.p111d.p112a.C5244e;
import p101d.p111d.p112a.C5246f;
import p101d.p111d.p112a.p116c.C5241c;

/* renamed from: d.d.a.b.h */
public class C5237h {

    /* renamed from: a */
    private static final Matrix f14790a = new Matrix();

    /* renamed from: b */
    private static final RectF f14791b = new RectF();

    /* renamed from: c */
    private boolean f14792c;

    /* renamed from: d */
    private float f14793d;

    /* renamed from: e */
    private float f14794e;

    /* renamed from: b */
    private void m20221b(C5246f fVar, C5244e eVar) {
        this.f14794e = eVar.mo14528i();
        float h = (float) eVar.mo14527h();
        float g = (float) eVar.mo14526g();
        float k = (float) eVar.mo14530k();
        float j = (float) eVar.mo14529j();
        float b = fVar.mo14551b();
        if (eVar.mo14524e() == C5244e.C5245a.OUTSIDE) {
            f14790a.setRotate(-b);
            f14791b.set(0.0f, 0.0f, k, j);
            f14790a.mapRect(f14791b);
            k = f14791b.width();
            j = f14791b.height();
        } else {
            f14790a.setRotate(b);
            f14791b.set(0.0f, 0.0f, h, g);
            f14790a.mapRect(f14791b);
            h = f14791b.width();
            g = f14791b.height();
        }
        int i = C5236g.f14789a[eVar.mo14524e().ordinal()];
        float min = i != 1 ? i != 2 ? i != 3 ? Math.min(k / h, j / g) : Math.max(k / h, j / g) : j / g : k / h;
        if (min > this.f14794e) {
            if (eVar.mo14541v()) {
                this.f14794e = min;
            } else {
                min = this.f14794e;
            }
            this.f14793d = min;
            return;
        }
        this.f14793d = min;
        if (!eVar.mo14512B()) {
            this.f14794e = this.f14793d;
        }
    }

    /* renamed from: a */
    public float mo14497a() {
        return this.f14794e;
    }

    /* renamed from: a */
    public float mo14498a(float f, float f2) {
        return C5241c.m20241b(f, this.f14793d / f2, this.f14794e * f2);
    }

    /* renamed from: a */
    public void mo14499a(C5246f fVar, C5244e eVar) {
        this.f14792c = eVar.mo14536q() && eVar.mo14537r();
        if (this.f14792c) {
            m20221b(fVar, eVar);
            return;
        }
        this.f14794e = 1.0f;
        this.f14793d = 1.0f;
    }

    /* renamed from: b */
    public float mo14500b() {
        return this.f14793d;
    }

    /* renamed from: c */
    public boolean mo14501c() {
        return this.f14792c;
    }
}
