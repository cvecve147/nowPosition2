package p101d.p129g.p159f.p170d.p171a;

import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.d.a.a */
final class C5792a {

    /* renamed from: a */
    private final C5775b f16034a;

    /* renamed from: b */
    private final C5775b f16035b;

    /* renamed from: c */
    private final C5799g f16036c;

    C5792a(C5775b bVar) {
        int f = bVar.mo15395f();
        if (f < 8 || f > 144 || (f & 1) != 0) {
            throw C5811f.m21947a();
        }
        this.f16036c = m21882b(bVar);
        this.f16034a = mo15444a(bVar);
        this.f16035b = new C5775b(this.f16034a.mo15397h(), this.f16034a.mo15395f());
    }

    /* renamed from: b */
    private static C5799g m21882b(C5775b bVar) {
        return C5799g.m21906a(bVar.mo15395f(), bVar.mo15397h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15443a(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo15446a(i3, 0, i, i2) ? 1 : 0) << 1;
        if (mo15446a(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo15446a(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo15446a(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (mo15446a(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (mo15446a(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (mo15446a(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return mo15446a(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5775b mo15444a(C5775b bVar) {
        int e = this.f16036c.mo15459e();
        int d = this.f16036c.mo15458d();
        if (bVar.mo15395f() == e) {
            int b = this.f16036c.mo15456b();
            int a = this.f16036c.mo15455a();
            int i = e / b;
            int i2 = d / a;
            C5775b bVar2 = new C5775b(i2 * a, i * b);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * b;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * a;
                    for (int i7 = 0; i7 < b; i7++) {
                        int i8 = ((b + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < a; i10++) {
                            if (bVar.mo15389b(((a + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo15390c(i6 + i10, i9);
                            }
                        }
                        C5775b bVar3 = bVar;
                    }
                    C5775b bVar4 = bVar;
                }
                C5775b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5799g mo15445a() {
        return this.f16036c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15446a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f16035b.mo15390c(i2, i);
        return this.f16034a.mo15389b(i2, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15447b(int i, int i2) {
        int i3 = (mo15446a(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (mo15446a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo15446a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo15446a(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo15446a(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (mo15446a(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (mo15446a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return mo15446a(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15448b(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (mo15446a(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (mo15446a(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (mo15446a(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (mo15446a(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo15446a(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (mo15446a(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (mo15446a(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return mo15446a(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] mo15449b() {
        byte[] bArr = new byte[this.f16036c.mo15460f()];
        int f = this.f16034a.mo15395f();
        int h = this.f16034a.mo15397h();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == f && i == 0 && !z) {
                bArr[i2] = (byte) mo15443a(f, h);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = f - 2;
                if (i3 == i4 && i == 0 && (h & 3) != 0 && !z2) {
                    bArr[i2] = (byte) mo15447b(f, h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == f + 4 && i == 2 && (h & 7) == 0 && !z3) {
                    bArr[i2] = (byte) mo15450c(f, h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (h & 7) == 4 && !z4) {
                    bArr[i2] = (byte) mo15451d(f, h);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < f && i >= 0 && !this.f16035b.mo15389b(i, i3)) {
                            bArr[i2] = (byte) mo15448b(i3, i, f, h);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < h);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < h && !this.f16035b.mo15389b(i6, i5)) {
                            bArr[i2] = (byte) mo15448b(i5, i6, f, h);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= f) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= f && i >= h) {
                break;
            }
        }
        if (i2 == this.f16036c.mo15460f()) {
            return bArr;
        }
        throw C5811f.m21947a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15450c(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo15446a(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (mo15446a(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (mo15446a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (mo15446a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (mo15446a(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (mo15446a(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo15446a(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return mo15446a(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15451d(int i, int i2) {
        int i3 = (mo15446a(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (mo15446a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo15446a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo15446a(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (mo15446a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (mo15446a(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (mo15446a(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return mo15446a(3, i7, i, i2) ? i10 | 1 : i10;
    }
}
