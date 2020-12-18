package p101d.p129g.p159f.p180h.p181a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import p101d.p129g.p159f.C5790d;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5782e;
import p101d.p129g.p159f.p180h.C5862a;
import p101d.p129g.p159f.p180h.p181a.p182a.C5864a;

/* renamed from: d.g.f.h.a.k */
public final class C5877k {

    /* renamed from: a */
    private static final C5864a f16265a = new C5864a();

    /* renamed from: a */
    private static int m22260a(C5775b bVar, int i, int i2, boolean z, int i3, int i4) {
        boolean z2 = z;
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (((!z2 || i6 < i) && (z2 || i6 >= i2)) || z2 != bVar.mo15389b(i6, i4)) {
                    i5 = -i5;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z2 = !z2;
        }
        return i6;
    }

    /* renamed from: a */
    private static int m22261a(C5873g gVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C5869d dVar = null;
        int i4 = i - i3;
        if (m22274a(gVar, i4)) {
            dVar = gVar.mo15617a(i4).mo15626a(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo15607b() : dVar.mo15610d();
        }
        C5869d b = gVar.mo15617a(i).mo15628b(i2);
        if (b != null) {
            return z ? b.mo15610d() : b.mo15607b();
        }
        if (m22274a(gVar, i4)) {
            b = gVar.mo15617a(i4).mo15628b(i2);
        }
        if (b != null) {
            return z ? b.mo15607b() : b.mo15610d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (!m22274a(gVar, i)) {
                return z ? gVar.mo15622d().mo15601e() : gVar.mo15622d().mo15599c();
            }
            for (C5869d dVar2 : gVar.mo15617a(i).mo15629b()) {
                if (dVar2 != null) {
                    return (z ? dVar2.mo15607b() : dVar2.mo15610d()) + (i3 * i5 * (dVar2.mo15607b() - dVar2.mo15610d()));
                }
            }
            i5++;
        }
    }

    /* renamed from: a */
    private static int m22262a(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: a */
    private static int m22263a(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f16265a.mo15572a(iArr, i, iArr2);
        }
        throw C5790d.m21877a();
    }

    /* renamed from: a */
    private static C5782e m22264a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int[] iArr5 = new int[iArr3.length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < iArr5.length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m22266a(iArr, i, iArr2);
                } catch (C5790d unused) {
                    if (iArr5.length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= iArr5.length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != iArr5.length - 1) {
                                    i5++;
                                } else {
                                    throw C5790d.m21877a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C5790d.m21877a();
                    }
                }
            } else {
                throw C5790d.m21877a();
            }
        }
    }

    /* renamed from: a */
    public static C5782e m22265a(C5775b bVar, C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4, int i, int i2) {
        C5875i iVar;
        C5874h hVar;
        int i3;
        int i4;
        int i5;
        int i6;
        C5875i iVar2 = null;
        C5873g gVar = null;
        C5875i iVar3 = null;
        int i7 = 0;
        C5868c cVar = new C5868c(bVar, oVar, oVar2, oVar3, oVar4);
        while (true) {
            if (i7 >= 2) {
                iVar = iVar2;
                break;
            }
            if (oVar != null) {
                iVar2 = m22270a(bVar, cVar, oVar, true, i, i2);
            }
            iVar = iVar2;
            if (oVar3 != null) {
                iVar3 = m22270a(bVar, cVar, oVar3, false, i, i2);
            }
            gVar = m22280b(iVar, iVar3);
            if (gVar == null) {
                throw C5882i.m22303a();
            } else if (i7 != 0 || gVar.mo15622d() == null || (gVar.mo15622d().mo15602f() >= cVar.mo15602f() && gVar.mo15622d().mo15600d() <= cVar.mo15600d())) {
                gVar.mo15619a(cVar);
            } else {
                cVar = gVar.mo15622d();
                i7++;
                iVar2 = iVar;
            }
        }
        int a = gVar.mo15616a() + 1;
        gVar.mo15618a(0, (C5874h) iVar);
        gVar.mo15618a(a, (C5874h) iVar3);
        boolean z = iVar != null;
        int i8 = i;
        int i9 = i2;
        for (int i10 = 1; i10 <= a; i10++) {
            int i11 = z ? i10 : a - i10;
            if (gVar.mo15617a(i11) == null) {
                if (i11 == 0 || i11 == a) {
                    hVar = new C5875i(cVar, i11 == 0);
                } else {
                    hVar = new C5874h(cVar);
                }
                gVar.mo15618a(i11, hVar);
                int i12 = -1;
                int i13 = i9;
                int i14 = -1;
                int i15 = i8;
                int f = cVar.mo15602f();
                while (f <= cVar.mo15600d()) {
                    int a2 = m22261a(gVar, i11, f, z);
                    if (a2 >= 0 && a2 <= cVar.mo15599c()) {
                        i6 = a2;
                    } else if (i14 == i12) {
                        i4 = i14;
                        i5 = i13;
                        i3 = i12;
                        i13 = i5;
                        i14 = i4;
                        f++;
                        i12 = i3;
                    } else {
                        i6 = i14;
                    }
                    i4 = i14;
                    int i16 = i13;
                    i3 = i12;
                    C5869d a3 = m22269a(bVar, cVar.mo15601e(), cVar.mo15599c(), z, i6, f, i15, i16);
                    if (a3 != null) {
                        hVar.mo15627a(f, a3);
                        i15 = Math.min(i15, a3.mo15612f());
                        i13 = Math.max(i16, a3.mo15612f());
                        i14 = i6;
                        f++;
                        i12 = i3;
                    } else {
                        i5 = i16;
                        i13 = i5;
                        i14 = i4;
                        f++;
                        i12 = i3;
                    }
                }
                i8 = i15;
                i9 = i13;
            }
        }
        return m22279b(gVar);
    }

    /* renamed from: a */
    private static C5782e m22266a(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int a = m22263a(iArr, iArr2, i2);
            m22272a(iArr, i2);
            C5782e a2 = C5871f.m22221a(iArr, String.valueOf(i));
            a2.mo15429b(Integer.valueOf(a));
            a2.mo15426a(Integer.valueOf(iArr2.length));
            return a2;
        }
        throw C5811f.m21947a();
    }

    /* renamed from: a */
    private static C5863a m22267a(C5875i iVar, C5875i iVar2) {
        C5863a c;
        C5863a c2;
        if (iVar == null || (c = iVar.mo15634c()) == null) {
            if (iVar2 == null) {
                return null;
            }
            return iVar2.mo15634c();
        } else if (iVar2 == null || (c2 = iVar2.mo15634c()) == null || c.mo15567a() == c2.mo15567a() || c.mo15568b() == c2.mo15568b() || c.mo15569c() == c2.mo15569c()) {
            return c;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private static C5868c m22268a(C5875i iVar) {
        int[] d;
        if (iVar == null || (d = iVar.mo15635d()) == null) {
            return null;
        }
        int b = m22278b(d);
        int i = 0;
        int i2 = 0;
        for (int i3 : d) {
            i2 += b - i3;
            if (i3 > 0) {
                break;
            }
        }
        C5869d[] b2 = iVar.mo15629b();
        int i4 = 0;
        while (i2 > 0 && b2[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = d.length - 1; length >= 0; length--) {
            i += b - d[length];
            if (d[length] > 0) {
                break;
            }
        }
        int length2 = b2.length - 1;
        while (i > 0 && b2[length2] == null) {
            i--;
            length2--;
        }
        return iVar.mo15625a().mo15596a(i2, i, iVar.mo15636e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = p101d.p129g.p159f.p180h.p181a.C5876j.m22255a(r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p101d.p129g.p159f.p180h.p181a.C5869d m22269a(p101d.p129g.p159f.p167c.C5775b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m22260a((p101d.p129g.p159f.p167c.C5775b) r7, (int) r8, (int) r9, (boolean) r10, (int) r11, (int) r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m22281b(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = p101d.p129g.p159f.p180h.C5862a.m22163a((int[]) r7)
            if (r10 == 0) goto L_0x001e
            int r10 = r11 + r9
            r6 = r11
            r11 = r10
            r10 = r6
            goto L_0x0039
        L_0x001e:
            r10 = 0
        L_0x001f:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0037
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001f
        L_0x0037:
            int r10 = r11 - r9
        L_0x0039:
            boolean r9 = m22273a((int) r9, (int) r13, (int) r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = p101d.p129g.p159f.p180h.p181a.C5876j.m22255a(r7)
            int r9 = p101d.p129g.p159f.p180h.C5862a.m22162a((int) r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            d.g.f.h.a.d r8 = new d.g.f.h.a.d
            int r7 = m22277b((int) r7)
            r8.<init>(r10, r11, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p180h.p181a.C5877k.m22269a(d.g.f.c.b, int, int, boolean, int, int, int, int):d.g.f.h.a.d");
    }

    /* renamed from: a */
    private static C5875i m22270a(C5775b bVar, C5868c cVar, C5919o oVar, boolean z, int i, int i2) {
        boolean z2 = z;
        C5875i iVar = new C5875i(cVar, z2);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int a = (int) oVar.mo15702a();
            int b = (int) oVar.mo15703b();
            while (b <= cVar.mo15600d() && b >= cVar.mo15602f()) {
                C5869d a2 = m22269a(bVar, 0, bVar.mo15397h(), z, a, b, i, i2);
                if (a2 != null) {
                    iVar.mo15627a(b, a2);
                    a = z2 ? a2.mo15610d() : a2.mo15607b();
                }
                b += i4;
            }
            i3++;
        }
        return iVar;
    }

    /* renamed from: a */
    private static void m22271a(C5873g gVar, C5867b[][] bVarArr) {
        C5867b bVar;
        int[] a = bVarArr[0][1].mo15595a();
        int a2 = (gVar.mo15616a() * gVar.mo15621c()) - m22282c(gVar.mo15620b());
        if (a.length == 0) {
            if (a2 < 1 || a2 > 928) {
                throw C5882i.m22303a();
            }
            bVar = bVarArr[0][1];
        } else if (a[0] != a2) {
            bVar = bVarArr[0][1];
        } else {
            return;
        }
        bVar.mo15594a(a2);
    }

    /* renamed from: a */
    private static void m22272a(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw C5811f.m21947a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw C5811f.m21947a();
            }
        } else {
            throw C5811f.m21947a();
        }
    }

    /* renamed from: a */
    private static boolean m22273a(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: a */
    private static boolean m22274a(C5873g gVar, int i) {
        return i >= 0 && i <= gVar.mo15616a() + 1;
    }

    /* renamed from: a */
    private static int[] m22275a(int i) {
        int[] iArr = new int[8];
        int length = iArr.length - 1;
        int i2 = 0;
        while (true) {
            int i3 = i & 1;
            if (i3 != i2) {
                length--;
                if (length < 0) {
                    return iArr;
                }
                i2 = i3;
            }
            iArr[length] = iArr[length] + 1;
            i >>= 1;
        }
    }

    /* renamed from: a */
    private static C5867b[][] m22276a(C5873g gVar) {
        int c;
        C5867b[][] bVarArr = (C5867b[][]) Array.newInstance(C5867b.class, new int[]{gVar.mo15621c(), gVar.mo15616a() + 2});
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C5867b();
            }
        }
        int i3 = 0;
        for (C5874h hVar : gVar.mo15623e()) {
            if (hVar != null) {
                for (C5869d dVar : hVar.mo15629b()) {
                    if (dVar != null && (c = dVar.mo15609c()) >= 0) {
                        if (c < bVarArr.length) {
                            bVarArr[c][i3].mo15594a(dVar.mo15611e());
                        } else {
                            throw C5811f.m21947a();
                        }
                    }
                }
                continue;
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: b */
    private static int m22277b(int i) {
        return m22262a(m22275a(i));
    }

    /* renamed from: b */
    private static int m22278b(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: b */
    private static C5782e m22279b(C5873g gVar) {
        C5867b[][] a = m22276a(gVar);
        m22271a(gVar, a);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(gVar.mo15621c() * gVar.mo15616a())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < gVar.mo15621c(); i++) {
            int i2 = 0;
            while (i2 < gVar.mo15616a()) {
                int i3 = i2 + 1;
                int[] a2 = a[i][i3].mo15595a();
                int a3 = (gVar.mo15616a() * i) + i2;
                if (a2.length == 0) {
                    arrayList.add(Integer.valueOf(a3));
                } else if (a2.length == 1) {
                    iArr[a3] = a2[0];
                } else {
                    arrayList3.add(Integer.valueOf(a3));
                    arrayList2.add(a2);
                }
                i2 = i3;
            }
        }
        int[][] iArr2 = new int[arrayList2.size()][];
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m22264a(gVar.mo15620b(), iArr, C5862a.m22164a((Collection<Integer>) arrayList), C5862a.m22164a((Collection<Integer>) arrayList3), iArr2);
    }

    /* renamed from: b */
    private static C5873g m22280b(C5875i iVar, C5875i iVar2) {
        C5863a a;
        if ((iVar == null && iVar2 == null) || (a = m22267a(iVar, iVar2)) == null) {
            return null;
        }
        return new C5873g(a, C5868c.m22196a(m22268a(iVar), m22268a(iVar2)));
    }

    /* renamed from: b */
    private static int[] m22281b(C5775b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        boolean z2 = z;
        int i6 = 0;
        while (true) {
            if (((z && i3 < i2) || (!z && i3 >= i)) && i6 < iArr.length) {
                if (bVar.mo15389b(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            }
        }
        if (i6 == iArr.length || (((z && i3 == i2) || (!z && i3 == i)) && i6 == iArr.length - 1)) {
            return iArr;
        }
        return null;
    }

    /* renamed from: c */
    private static int m22282c(int i) {
        return 2 << i;
    }
}
