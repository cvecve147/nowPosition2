package p101d.p129g.p159f.p167c.p168a;

import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.c.a.b */
public final class C5774b {

    /* renamed from: a */
    private final C5775b f15940a;

    /* renamed from: b */
    private final int f15941b;

    /* renamed from: c */
    private final int f15942c;

    /* renamed from: d */
    private final int f15943d;

    /* renamed from: e */
    private final int f15944e;

    /* renamed from: f */
    private final int f15945f;

    /* renamed from: g */
    private final int f15946g;

    public C5774b(C5775b bVar) {
        this(bVar, 10, bVar.mo15397h() / 2, bVar.mo15395f() / 2);
    }

    public C5774b(C5775b bVar, int i, int i2, int i3) {
        this.f15940a = bVar;
        this.f15941b = bVar.mo15395f();
        this.f15942c = bVar.mo15397h();
        int i4 = i / 2;
        this.f15943d = i2 - i4;
        this.f15944e = i2 + i4;
        this.f15946g = i3 - i4;
        this.f15945f = i3 + i4;
        if (this.f15946g < 0 || this.f15943d < 0 || this.f15945f >= this.f15941b || this.f15944e >= this.f15942c) {
            throw C5882i.m22303a();
        }
    }

    /* renamed from: a */
    private C5919o m21797a(float f, float f2, float f3, float f4) {
        int a = C5773a.m21796a(C5773a.m21794a(f, f2, f3, f4));
        float f5 = (float) a;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < a; i++) {
            float f8 = (float) i;
            int a2 = C5773a.m21796a((f8 * f6) + f);
            int a3 = C5773a.m21796a((f8 * f7) + f2);
            if (this.f15940a.mo15389b(a2, a3)) {
                return new C5919o((float) a2, (float) a3);
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m21798a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f15940a.mo15389b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f15940a.mo15389b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: a */
    private C5919o[] m21799a(C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4) {
        float a = oVar.mo15702a();
        float b = oVar.mo15703b();
        float a2 = oVar2.mo15702a();
        float b2 = oVar2.mo15703b();
        float a3 = oVar3.mo15702a();
        float b3 = oVar3.mo15703b();
        float a4 = oVar4.mo15702a();
        float b4 = oVar4.mo15703b();
        if (a < ((float) this.f15942c) / 2.0f) {
            return new C5919o[]{new C5919o(a4 - 1.0f, b4 + 1.0f), new C5919o(a2 + 1.0f, b2 + 1.0f), new C5919o(a3 - 1.0f, b3 - 1.0f), new C5919o(a + 1.0f, b - 1.0f)};
        }
        return new C5919o[]{new C5919o(a4 + 1.0f, b4 + 1.0f), new C5919o(a2 + 1.0f, b2 - 1.0f), new C5919o(a3 - 1.0f, b3 + 1.0f), new C5919o(a - 1.0f, b - 1.0f)};
    }

    /* renamed from: a */
    public C5919o[] mo15382a() {
        int i = this.f15943d;
        int i2 = this.f15944e;
        int i3 = this.f15946g;
        int i4 = this.f15945f;
        boolean z = false;
        int i5 = i;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (true) {
            if (!z7) {
                break;
            }
            boolean z8 = false;
            boolean z9 = true;
            while (true) {
                if ((z9 || !z2) && i2 < this.f15942c) {
                    z9 = m21798a(i3, i4, i2, false);
                    if (z9) {
                        i2++;
                        z2 = true;
                        z8 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f15942c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z3) && i4 < this.f15941b) {
                    z10 = m21798a(i5, i2, i4, true);
                    if (z10) {
                        i4++;
                        z3 = true;
                        z8 = true;
                    } else if (!z3) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f15941b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z4) && i5 >= 0) {
                    z11 = m21798a(i3, i4, i5, false);
                    if (z11) {
                        i5--;
                        z4 = true;
                        z8 = true;
                    } else if (!z4) {
                        i5--;
                    }
                }
            }
            if (i5 < 0) {
                break;
            }
            boolean z12 = true;
            while (true) {
                if ((z12 || !z6) && i3 >= 0) {
                    z12 = m21798a(i5, i2, i3, true);
                    if (z12) {
                        i3--;
                        z6 = true;
                        z8 = true;
                    } else if (!z6) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            }
            if (z8) {
                z5 = true;
            }
            z7 = z8;
        }
        z = true;
        if (z || !z5) {
            throw C5882i.m22303a();
        }
        int i6 = i2 - i5;
        C5919o oVar = null;
        C5919o oVar2 = null;
        for (int i7 = 1; i7 < i6; i7++) {
            oVar2 = m21797a((float) i5, (float) (i4 - i7), (float) (i5 + i7), (float) i4);
            if (oVar2 != null) {
                break;
            }
        }
        if (oVar2 != null) {
            C5919o oVar3 = null;
            for (int i8 = 1; i8 < i6; i8++) {
                oVar3 = m21797a((float) i5, (float) (i3 + i8), (float) (i5 + i8), (float) i3);
                if (oVar3 != null) {
                    break;
                }
            }
            if (oVar3 != null) {
                C5919o oVar4 = null;
                for (int i9 = 1; i9 < i6; i9++) {
                    oVar4 = m21797a((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                    if (oVar4 != null) {
                        break;
                    }
                }
                if (oVar4 != null) {
                    for (int i10 = 1; i10 < i6; i10++) {
                        oVar = m21797a((float) i2, (float) (i4 - i10), (float) (i2 - i10), (float) i4);
                        if (oVar != null) {
                            break;
                        }
                    }
                    if (oVar != null) {
                        return m21799a(oVar, oVar2, oVar4, oVar3);
                    }
                    throw C5882i.m22303a();
                }
                throw C5882i.m22303a();
            }
            throw C5882i.m22303a();
        }
        throw C5882i.m22303a();
    }
}
