package p101d.p129g.p159f.p184i.p186b;

import p101d.p129g.p159f.C5919o;

/* renamed from: d.g.f.i.b.d */
public final class C5908d extends C5919o {

    /* renamed from: c */
    private final float f16335c;

    /* renamed from: d */
    private final int f16336d;

    C5908d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private C5908d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f16335c = f3;
        this.f16336d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15679a(float f, float f2, float f3) {
        if (Math.abs(f2 - mo15703b()) > f || Math.abs(f3 - mo15702a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f16335c);
        return abs <= 1.0f || abs <= this.f16335c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5908d mo15680b(float f, float f2, float f3) {
        int i = this.f16336d;
        int i2 = i + 1;
        float a = (((float) i) * mo15702a()) + f2;
        float f4 = (float) i2;
        return new C5908d(a / f4, ((((float) this.f16336d) * mo15703b()) + f) / f4, ((((float) this.f16336d) * this.f16335c) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15681c() {
        return this.f16336d;
    }

    /* renamed from: d */
    public float mo15682d() {
        return this.f16335c;
    }
}
