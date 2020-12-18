package p101d.p129g.p159f.p184i.p186b;

import java.util.Map;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.C5920p;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5784g;
import p101d.p129g.p159f.p167c.C5786i;
import p101d.p129g.p159f.p167c.C5788k;
import p101d.p129g.p159f.p167c.p168a.C5773a;
import p101d.p129g.p159f.p184i.p185a.C5902k;

/* renamed from: d.g.f.i.b.c */
public class C5907c {

    /* renamed from: a */
    private final C5775b f16333a;

    /* renamed from: b */
    private C5920p f16334b;

    public C5907c(C5775b bVar) {
        this.f16333a = bVar;
    }

    /* renamed from: a */
    private float m22370a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        C5907c cVar;
        boolean z2;
        boolean z3 = true;
        boolean z4 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z4) {
            i5 = i;
            i7 = i2;
            i6 = i3;
            i8 = i4;
        } else {
            i7 = i;
            i5 = i2;
            i8 = i3;
            i6 = i4;
        }
        int abs = Math.abs(i8 - i7);
        int abs2 = Math.abs(i6 - i5);
        int i11 = 2;
        int i12 = (-abs) / 2;
        int i13 = -1;
        int i14 = i7 < i8 ? 1 : -1;
        if (i5 < i6) {
            i13 = 1;
        }
        int i15 = i8 + i14;
        int i16 = i5;
        int i17 = i12;
        int i18 = 0;
        int i19 = i7;
        while (true) {
            if (i19 == i15) {
                i9 = i15;
                i10 = i11;
                break;
            }
            int i20 = z4 ? i16 : i19;
            int i21 = z4 ? i19 : i16;
            if (i18 == z3) {
                z = z4;
                i9 = i15;
                z2 = z3;
                cVar = this;
            } else {
                cVar = this;
                z = z4;
                i9 = i15;
                z2 = false;
            }
            if (z2 == cVar.f16333a.mo15389b(i20, i21)) {
                if (i18 == 2) {
                    return C5773a.m21795a(i19, i16, i7, i5);
                }
                i18++;
            }
            i17 += abs2;
            if (i17 > 0) {
                if (i16 == i6) {
                    i10 = 2;
                    break;
                }
                i16 += i13;
                i17 -= abs;
            }
            i19 += i14;
            i15 = i9;
            z4 = z;
            z3 = true;
            i11 = 2;
        }
        if (i18 == i10) {
            return C5773a.m21795a(i9, i6, i7, i5);
        }
        return Float.NaN;
    }

    /* renamed from: a */
    private float m22371a(C5919o oVar, C5919o oVar2) {
        float b = m22375b((int) oVar.mo15702a(), (int) oVar.mo15703b(), (int) oVar2.mo15702a(), (int) oVar2.mo15703b());
        float b2 = m22375b((int) oVar2.mo15702a(), (int) oVar2.mo15703b(), (int) oVar.mo15702a(), (int) oVar.mo15703b());
        return Float.isNaN(b) ? b2 / 7.0f : Float.isNaN(b2) ? b / 7.0f : (b + b2) / 14.0f;
    }

    /* renamed from: a */
    private static int m22372a(C5919o oVar, C5919o oVar2, C5919o oVar3, float f) {
        int a = ((C5773a.m21796a(C5919o.m22413a(oVar, oVar2) / f) + C5773a.m21796a(C5919o.m22413a(oVar, oVar3) / f)) / 2) + 7;
        int i = a & 3;
        if (i == 0) {
            return a + 1;
        }
        if (i == 2) {
            return a - 1;
        }
        if (i != 3) {
            return a;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private static C5775b m22373a(C5775b bVar, C5788k kVar, int i) {
        return C5786i.m21861a().mo15437a(bVar, i, i, kVar);
    }

    /* renamed from: a */
    private static C5788k m22374a(C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (oVar4 != null) {
            f2 = oVar4.mo15702a();
            f = oVar4.mo15703b();
            f3 = f4 - 3.0f;
        } else {
            f2 = (oVar2.mo15702a() - oVar.mo15702a()) + oVar3.mo15702a();
            f = (oVar2.mo15703b() - oVar.mo15703b()) + oVar3.mo15703b();
            f3 = f4;
        }
        return C5788k.m21871a(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, oVar.mo15702a(), oVar.mo15703b(), oVar2.mo15702a(), oVar2.mo15703b(), f2, f, oVar3.mo15702a(), oVar3.mo15703b());
    }

    /* renamed from: b */
    private float m22375b(int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float a = m22370a(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i5 = 0;
        } else if (i6 >= this.f16333a.mo15397h()) {
            f = ((float) ((this.f16333a.mo15397h() - 1) - i)) / ((float) (i6 - i));
            i5 = this.f16333a.mo15397h() - 1;
        } else {
            i5 = i6;
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f16333a.mo15395f()) {
            f2 = ((float) ((this.f16333a.mo15395f() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f16333a.mo15395f() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (a + m22370a(i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo15675a(C5919o oVar, C5919o oVar2, C5919o oVar3) {
        return (m22371a(oVar, oVar2) + m22371a(oVar, oVar3)) / 2.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C5784g mo15676a(C5913g gVar) {
        C5919o[] oVarArr;
        C5908d b = gVar.mo15690b();
        C5908d c = gVar.mo15691c();
        C5908d a = gVar.mo15689a();
        float a2 = mo15675a((C5919o) b, (C5919o) c, (C5919o) a);
        if (a2 >= 1.0f) {
            int a3 = m22372a((C5919o) b, (C5919o) c, (C5919o) a, a2);
            C5902k b2 = C5902k.m22350b(a3);
            int c2 = b2.mo15664c() - 7;
            C5905a aVar = null;
            if (b2.mo15663b().length > 0) {
                float a4 = (c.mo15702a() - b.mo15702a()) + a.mo15702a();
                float b3 = (c.mo15703b() - b.mo15703b()) + a.mo15703b();
                float f = 1.0f - (3.0f / ((float) c2));
                int a5 = (int) (b.mo15702a() + ((a4 - b.mo15702a()) * f));
                int b4 = (int) (b.mo15703b() + (f * (b3 - b.mo15703b())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = mo15678a(a2, a5, b4, (float) i);
                        break;
                    } catch (C5882i unused) {
                        i <<= 1;
                    }
                }
            }
            C5775b a6 = m22373a(this.f16333a, m22374a(b, c, a, aVar, a3), a3);
            if (aVar == null) {
                oVarArr = new C5919o[]{a, b, c};
            } else {
                oVarArr = new C5919o[]{a, b, c, aVar};
            }
            return new C5784g(a6, oVarArr);
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    public final C5784g mo15677a(Map<C5806e, ?> map) {
        this.f16334b = map == null ? null : (C5920p) map.get(C5806e.NEED_RESULT_POINT_CALLBACK);
        return mo15676a(new C5910f(this.f16333a, this.f16334b).mo15683a(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C5905a mo15678a(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f16333a.mo15397h() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f16333a.mo15395f() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C5906b(this.f16333a, max, max2, min, min2, f, this.f16334b).mo15674a();
            }
            throw C5882i.m22303a();
        }
        throw C5882i.m22303a();
    }
}
