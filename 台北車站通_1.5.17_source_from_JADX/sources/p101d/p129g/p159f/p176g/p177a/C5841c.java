package p101d.p129g.p159f.p176g.p177a;

import p101d.p129g.p159f.C5919o;

/* renamed from: d.g.f.g.a.c */
public final class C5841c {

    /* renamed from: a */
    private final int f16153a;

    /* renamed from: b */
    private final int[] f16154b;

    /* renamed from: c */
    private final C5919o[] f16155c;

    public C5841c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f16153a = i;
        this.f16154b = iArr;
        float f = (float) i4;
        this.f16155c = new C5919o[]{new C5919o((float) i2, f), new C5919o((float) i3, f)};
    }

    /* renamed from: a */
    public C5919o[] mo15544a() {
        return this.f16155c;
    }

    /* renamed from: b */
    public int[] mo15545b() {
        return this.f16154b;
    }

    /* renamed from: c */
    public int mo15546c() {
        return this.f16153a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5841c) && this.f16153a == ((C5841c) obj).f16153a;
    }

    public int hashCode() {
        return this.f16153a;
    }
}
