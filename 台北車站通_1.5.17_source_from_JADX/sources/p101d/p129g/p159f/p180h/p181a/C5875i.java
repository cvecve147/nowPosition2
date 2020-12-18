package p101d.p129g.p159f.p180h.p181a;

import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.C5919o;

/* renamed from: d.g.f.h.a.i */
final class C5875i extends C5874h {

    /* renamed from: c */
    private final boolean f16263c;

    C5875i(C5868c cVar, boolean z) {
        super(cVar);
        this.f16263c = z;
    }

    /* renamed from: a */
    private void m22248a(C5869d[] dVarArr, C5863a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C5869d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo15611e() % 30;
                int c = dVar.mo15609c();
                if (c > aVar.mo15569c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f16263c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo15567a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo15568b() || e % 3 != aVar.mo15570d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo15571e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15632a(C5863a aVar) {
        C5869d[] b = mo15629b();
        mo15637f();
        m22248a(b, aVar);
        C5868c a = mo15625a();
        C5919o g = this.f16263c ? a.mo15603g() : a.mo15604h();
        C5919o a2 = this.f16263c ? a.mo15597a() : a.mo15598b();
        int c = mo15630c((int) g.mo15703b());
        int c2 = mo15630c((int) a2.mo15703b());
        float c3 = ((float) (c2 - c)) / ((float) aVar.mo15569c());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (c < c2) {
            if (b[c] != null) {
                C5869d dVar = b[c];
                int c4 = dVar.mo15609c() - i;
                if (c4 == 0) {
                    i2++;
                } else {
                    if (c4 == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.mo15609c();
                    } else if (c4 < 0 || dVar.mo15609c() >= aVar.mo15569c() || c4 > c) {
                        b[c] = null;
                    } else {
                        if (i3 > 2) {
                            c4 *= i3 - 2;
                        }
                        boolean z = c4 >= c;
                        for (int i4 = 1; i4 <= c4 && !z; i4++) {
                            z = b[c - i4] != null;
                        }
                        if (z) {
                            b[c] = null;
                        } else {
                            i = dVar.mo15609c();
                        }
                    }
                    i2 = 1;
                }
            }
            c++;
        }
        return (int) (((double) c3) + 0.5d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15633b(C5863a aVar) {
        C5868c a = mo15625a();
        C5919o g = this.f16263c ? a.mo15603g() : a.mo15604h();
        C5919o a2 = this.f16263c ? a.mo15597a() : a.mo15598b();
        int c = mo15630c((int) g.mo15703b());
        int c2 = mo15630c((int) a2.mo15703b());
        float c3 = ((float) (c2 - c)) / ((float) aVar.mo15569c());
        C5869d[] b = mo15629b();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (c < c2) {
            if (b[c] != null) {
                C5869d dVar = b[c];
                dVar.mo15614h();
                int c4 = dVar.mo15609c() - i;
                if (c4 == 0) {
                    i2++;
                } else {
                    if (c4 == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.mo15609c();
                    } else if (dVar.mo15609c() >= aVar.mo15569c()) {
                        b[c] = null;
                    } else {
                        i = dVar.mo15609c();
                    }
                    i2 = 1;
                }
            }
            c++;
        }
        return (int) (((double) c3) + 0.5d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5863a mo15634c() {
        C5869d[] b = mo15629b();
        C5867b bVar = new C5867b();
        C5867b bVar2 = new C5867b();
        C5867b bVar3 = new C5867b();
        C5867b bVar4 = new C5867b();
        for (C5869d dVar : b) {
            if (dVar != null) {
                dVar.mo15614h();
                int e = dVar.mo15611e() % 30;
                int c = dVar.mo15609c();
                if (!this.f16263c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo15594a((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo15594a(e / 3);
                    bVar3.mo15594a(e % 3);
                } else if (i == 2) {
                    bVar.mo15594a(e + 1);
                }
            }
        }
        if (bVar.mo15595a().length == 0 || bVar2.mo15595a().length == 0 || bVar3.mo15595a().length == 0 || bVar4.mo15595a().length == 0 || bVar.mo15595a()[0] < 1 || bVar2.mo15595a()[0] + bVar3.mo15595a()[0] < 3 || bVar2.mo15595a()[0] + bVar3.mo15595a()[0] > 90) {
            return null;
        }
        C5863a aVar = new C5863a(bVar.mo15595a()[0], bVar2.mo15595a()[0], bVar3.mo15595a()[0], bVar4.mo15595a()[0]);
        m22248a(b, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int[] mo15635d() {
        C5863a c = mo15634c();
        if (c == null) {
            return null;
        }
        mo15633b(c);
        int[] iArr = new int[c.mo15569c()];
        for (C5869d dVar : mo15629b()) {
            if (dVar != null) {
                int c2 = dVar.mo15609c();
                if (c2 < iArr.length) {
                    iArr[c2] = iArr[c2] + 1;
                } else {
                    throw C5811f.m21947a();
                }
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo15636e() {
        return this.f16263c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15637f() {
        for (C5869d dVar : mo15629b()) {
            if (dVar != null) {
                dVar.mo15614h();
            }
        }
    }

    public String toString() {
        return "IsLeft: " + this.f16263c + 10 + super.toString();
    }
}
