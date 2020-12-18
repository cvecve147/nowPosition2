package p101d.p191i.p192a.p200e;

import android.graphics.PointF;

/* renamed from: d.i.a.e.c */
public class C6019c {

    /* renamed from: a */
    private float f16831a;

    /* renamed from: b */
    private float f16832b;

    /* renamed from: c */
    private int f16833c;

    /* renamed from: d */
    private int f16834d;

    /* renamed from: e */
    private String f16835e = null;

    public C6019c() {
    }

    public C6019c(float f, float f2, int i, int i2) {
        this.f16831a = f;
        this.f16832b = f2;
        this.f16833c = i;
        this.f16834d = i2;
    }

    public C6019c(C6019c cVar) {
        this.f16831a = (float) cVar.mo15920e()[0];
        this.f16832b = (float) cVar.mo15920e()[1];
        this.f16833c = cVar.mo15920e()[2];
        this.f16834d = cVar.mo15920e()[3];
    }

    /* renamed from: a */
    public int mo15913a() {
        return this.f16833c;
    }

    /* renamed from: a */
    public void mo15914a(float f, float f2, int i, int i2) {
        this.f16831a = f;
        this.f16832b = f2;
        this.f16833c = i;
        this.f16834d = i2;
    }

    /* renamed from: a */
    public void mo15915a(String str) {
        this.f16835e = str;
    }

    /* renamed from: a */
    public void mo15916a(int[] iArr) {
        this.f16831a = (float) iArr[0];
        this.f16832b = (float) iArr[1];
        this.f16833c = iArr[2];
        this.f16834d = iArr[3];
    }

    /* renamed from: b */
    public int mo15917b() {
        return (-this.f16833c) - 1;
    }

    /* renamed from: c */
    public String mo15918c() {
        return this.f16835e;
    }

    /* renamed from: d */
    public float[] mo15919d() {
        return new float[]{this.f16831a, this.f16832b};
    }

    /* renamed from: e */
    public int[] mo15920e() {
        return new int[]{(int) this.f16831a, (int) this.f16832b, this.f16833c, this.f16834d};
    }

    /* renamed from: f */
    public PointF mo15921f() {
        return new PointF(this.f16831a, this.f16832b);
    }

    /* renamed from: g */
    public String mo15922g() {
        return new String(this.f16831a + "," + this.f16832b + "," + this.f16833c + "," + this.f16835e);
    }
}
