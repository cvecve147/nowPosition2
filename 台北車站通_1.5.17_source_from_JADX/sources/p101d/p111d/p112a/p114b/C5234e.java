package p101d.p111d.p112a.p114b;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import p101d.p111d.p112a.C5244e;
import p101d.p111d.p112a.C5246f;
import p101d.p111d.p112a.p116c.C5240b;
import p101d.p111d.p112a.p116c.C5241c;

/* renamed from: d.d.a.b.e */
public class C5234e {

    /* renamed from: a */
    private static final Matrix f14781a = new Matrix();

    /* renamed from: b */
    private static final float[] f14782b = new float[2];

    /* renamed from: c */
    private static final Rect f14783c = new Rect();

    /* renamed from: d */
    private static final RectF f14784d = new RectF();

    /* renamed from: e */
    private final RectF f14785e = new RectF();

    /* renamed from: f */
    private float f14786f;

    /* renamed from: g */
    private float f14787g;

    /* renamed from: h */
    private float f14788h;

    /* renamed from: a */
    public void mo14492a(float f, float f2) {
        float[] fArr = f14782b;
        fArr[0] = f;
        fArr[1] = f2;
        float f3 = this.f14786f;
        if (f3 != 0.0f) {
            f14781a.setRotate(-f3, this.f14787g, this.f14788h);
            f14781a.mapPoints(f14782b);
        }
        RectF rectF = this.f14785e;
        float[] fArr2 = f14782b;
        rectF.union(fArr2[0], fArr2[1]);
    }

    /* renamed from: a */
    public void mo14493a(float f, float f2, float f3, float f4, PointF pointF) {
        float[] fArr = f14782b;
        fArr[0] = f;
        fArr[1] = f2;
        float f5 = this.f14786f;
        if (f5 != 0.0f) {
            f14781a.setRotate(-f5, this.f14787g, this.f14788h);
            f14781a.mapPoints(f14782b);
        }
        float[] fArr2 = f14782b;
        float f6 = fArr2[0];
        RectF rectF = this.f14785e;
        fArr2[0] = C5241c.m20241b(f6, rectF.left - f3, rectF.right + f3);
        float[] fArr3 = f14782b;
        float f7 = fArr3[1];
        RectF rectF2 = this.f14785e;
        fArr3[1] = C5241c.m20241b(f7, rectF2.top - f4, rectF2.bottom + f4);
        float f8 = this.f14786f;
        if (f8 != 0.0f) {
            f14781a.setRotate(f8, this.f14787g, this.f14788h);
            f14781a.mapPoints(f14782b);
        }
        float[] fArr4 = f14782b;
        pointF.set(fArr4[0], fArr4[1]);
    }

    /* renamed from: a */
    public void mo14494a(float f, float f2, PointF pointF) {
        mo14493a(f, f2, 0.0f, 0.0f, pointF);
    }

    /* renamed from: a */
    public void mo14495a(RectF rectF) {
        float f = this.f14786f;
        if (f == 0.0f) {
            rectF.set(this.f14785e);
            return;
        }
        f14781a.setRotate(f, this.f14787g, this.f14788h);
        f14781a.mapRect(rectF, this.f14785e);
    }

    /* renamed from: a */
    public void mo14496a(C5246f fVar, C5244e eVar) {
        RectF rectF = f14784d;
        C5240b.m20236a(eVar, f14783c);
        rectF.set(f14783c);
        Rect rect = f14783c;
        if (eVar.mo14524e() == C5244e.C5245a.OUTSIDE) {
            this.f14786f = fVar.mo14551b();
            this.f14787g = rectF.centerX();
            this.f14788h = rectF.centerY();
            fVar.mo14549a(f14781a);
            f14781a.postRotate(-this.f14786f, this.f14787g, this.f14788h);
            C5240b.m20234a(f14781a, eVar, rect);
            f14781a.setRotate(-this.f14786f, this.f14787g, this.f14788h);
            f14781a.mapRect(rectF);
        } else {
            this.f14786f = 0.0f;
            this.f14788h = 0.0f;
            this.f14787g = 0.0f;
            C5240b.m20237a(fVar, eVar, rect);
        }
        if (rectF.width() < ((float) rect.width())) {
            this.f14785e.left = rectF.left - (((float) rect.width()) - rectF.width());
            this.f14785e.right = rectF.left;
        } else {
            RectF rectF2 = this.f14785e;
            float f = (float) rect.left;
            rectF2.right = f;
            rectF2.left = f;
        }
        if (rectF.height() < ((float) rect.height())) {
            this.f14785e.top = rectF.top - (((float) rect.height()) - rectF.height());
            this.f14785e.bottom = rectF.top;
        } else {
            RectF rectF3 = this.f14785e;
            float f2 = (float) rect.top;
            rectF3.bottom = f2;
            rectF3.top = f2;
        }
        if (eVar.mo14524e() != C5244e.C5245a.OUTSIDE) {
            fVar.mo14549a(f14781a);
            RectF rectF4 = f14784d;
            rectF4.set(0.0f, 0.0f, (float) eVar.mo14527h(), (float) eVar.mo14526g());
            f14781a.mapRect(rectF4);
            float[] fArr = f14782b;
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            f14781a.mapPoints(fArr);
            RectF rectF5 = this.f14785e;
            float[] fArr2 = f14782b;
            rectF5.offset(fArr2[0] - rectF4.left, fArr2[1] - rectF4.top);
        }
    }
}
