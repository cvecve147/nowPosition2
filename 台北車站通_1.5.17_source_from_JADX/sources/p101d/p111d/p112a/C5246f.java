package p101d.p111d.p112a;

import android.graphics.Matrix;

/* renamed from: d.d.a.f */
public class C5246f {

    /* renamed from: a */
    private final Matrix f14849a = new Matrix();

    /* renamed from: b */
    private final float[] f14850b = new float[9];

    /* renamed from: c */
    private float f14851c;

    /* renamed from: d */
    private float f14852d;

    /* renamed from: e */
    private float f14853e = 1.0f;

    /* renamed from: f */
    private float f14854f;

    /* renamed from: a */
    public static int m20299a(float f, float f2) {
        if (f > f2 + 0.001f) {
            return 1;
        }
        return f < f2 - 0.001f ? -1 : 0;
    }

    /* renamed from: a */
    private void m20300a(boolean z, boolean z2) {
        this.f14849a.getValues(this.f14850b);
        float[] fArr = this.f14850b;
        this.f14851c = fArr[2];
        this.f14852d = fArr[5];
        if (z) {
            this.f14853e = (float) Math.hypot((double) fArr[1], (double) fArr[4]);
        }
        if (z2) {
            float[] fArr2 = this.f14850b;
            this.f14854f = (float) Math.toDegrees(Math.atan2((double) fArr2[3], (double) fArr2[4]));
        }
    }

    /* renamed from: b */
    public static boolean m20301b(float f, float f2) {
        return f >= f2 - 0.001f && f <= f2 + 0.001f;
    }

    /* renamed from: a */
    public C5246f mo14546a() {
        C5246f fVar = new C5246f();
        fVar.mo14550a(this);
        return fVar;
    }

    /* renamed from: a */
    public void mo14547a(float f, float f2, float f3) {
        this.f14849a.postRotate(f, f2, f3);
        m20300a(false, true);
    }

    /* renamed from: a */
    public void mo14548a(float f, float f2, float f3, float f4) {
        while (f4 < -180.0f) {
            f4 += 360.0f;
        }
        while (f4 > 180.0f) {
            f4 -= 360.0f;
        }
        this.f14851c = f;
        this.f14852d = f2;
        this.f14853e = f3;
        this.f14854f = f4;
        this.f14849a.reset();
        if (f3 != 1.0f) {
            this.f14849a.postScale(f3, f3);
        }
        if (f4 != 0.0f) {
            this.f14849a.postRotate(f4);
        }
        this.f14849a.postTranslate(f, f2);
    }

    /* renamed from: a */
    public void mo14549a(Matrix matrix) {
        matrix.set(this.f14849a);
    }

    /* renamed from: a */
    public void mo14550a(C5246f fVar) {
        this.f14851c = fVar.f14851c;
        this.f14852d = fVar.f14852d;
        this.f14853e = fVar.f14853e;
        this.f14854f = fVar.f14854f;
        this.f14849a.set(fVar.f14849a);
    }

    /* renamed from: b */
    public float mo14551b() {
        return this.f14854f;
    }

    /* renamed from: b */
    public void mo14552b(float f, float f2, float f3) {
        this.f14849a.postRotate((-this.f14854f) + f, f2, f3);
        m20300a(false, true);
    }

    /* renamed from: b */
    public void mo14553b(Matrix matrix) {
        this.f14849a.set(matrix);
        m20300a(true, true);
    }

    /* renamed from: c */
    public float mo14554c() {
        return this.f14851c;
    }

    /* renamed from: c */
    public void mo14555c(float f, float f2) {
        this.f14849a.postTranslate(f, f2);
        m20300a(false, false);
    }

    /* renamed from: c */
    public void mo14556c(float f, float f2, float f3) {
        this.f14849a.postScale(f, f, f2, f3);
        m20300a(true, false);
    }

    /* renamed from: d */
    public float mo14557d() {
        return this.f14852d;
    }

    /* renamed from: d */
    public void mo14558d(float f, float f2) {
        this.f14849a.postTranslate((-this.f14851c) + f, (-this.f14852d) + f2);
        m20300a(false, false);
    }

    /* renamed from: d */
    public void mo14559d(float f, float f2, float f3) {
        Matrix matrix = this.f14849a;
        float f4 = this.f14853e;
        matrix.postScale(f / f4, f / f4, f2, f3);
        m20300a(true, false);
    }

    /* renamed from: e */
    public float mo14560e() {
        return this.f14853e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5246f.class != obj.getClass()) {
            return false;
        }
        C5246f fVar = (C5246f) obj;
        return m20301b(fVar.f14851c, this.f14851c) && m20301b(fVar.f14852d, this.f14852d) && m20301b(fVar.f14853e, this.f14853e) && m20301b(fVar.f14854f, this.f14854f);
    }

    public int hashCode() {
        float f = this.f14851c;
        int i = 0;
        int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.f14852d;
        int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.f14853e;
        int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.f14854f;
        if (f4 != 0.0f) {
            i = Float.floatToIntBits(f4);
        }
        return floatToIntBits3 + i;
    }

    public String toString() {
        return "{x=" + this.f14851c + ",y=" + this.f14852d + ",zoom=" + this.f14853e + ",rotation=" + this.f14854f + "}";
    }
}
