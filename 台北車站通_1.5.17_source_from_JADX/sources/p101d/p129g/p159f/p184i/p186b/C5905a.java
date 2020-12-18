package p101d.p129g.p159f.p184i.p186b;

import p101d.p129g.p159f.C5919o;

/* renamed from: d.g.f.i.b.a */
public final class C5905a extends C5919o {

    /* renamed from: c */
    private final float f16323c;

    C5905a(float f, float f2, float f3) {
        super(f, f2);
        this.f16323c = f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15672a(float f, float f2, float f3) {
        if (Math.abs(f2 - mo15703b()) > f || Math.abs(f3 - mo15702a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f16323c);
        return abs <= 1.0f || abs <= this.f16323c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5905a mo15673b(float f, float f2, float f3) {
        return new C5905a((mo15702a() + f2) / 2.0f, (mo15703b() + f) / 2.0f, (this.f16323c + f3) / 2.0f);
    }
}
