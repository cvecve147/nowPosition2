package p101d.p129g.p159f.p176g.p177a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.C5920p;
import p101d.p129g.p159f.p167c.C5772a;
import p101d.p129g.p159f.p176g.C5854k;

/* renamed from: d.g.f.g.a.e */
public final class C5843e extends C5815a {

    /* renamed from: g */
    private static final int[] f16158g = {1, 10, 34, 70, 126};

    /* renamed from: h */
    private static final int[] f16159h = {4, 20, 48, 81};

    /* renamed from: i */
    private static final int[] f16160i = {0, 161, 961, 2015, 2715};

    /* renamed from: j */
    private static final int[] f16161j = {0, 336, 1036, 1516};

    /* renamed from: k */
    private static final int[] f16162k = {8, 6, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f16163l = {2, 4, 6, 8};

    /* renamed from: m */
    private static final int[][] f16164m = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: n */
    private final List<C5842d> f16165n = new ArrayList();

    /* renamed from: o */
    private final List<C5842d> f16166o = new ArrayList();

    /* renamed from: a */
    private C5840b m22072a(C5772a aVar, C5841c cVar, boolean z) {
        C5772a aVar2 = aVar;
        boolean z2 = z;
        int[] a = mo15486a();
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        a[3] = 0;
        a[4] = 0;
        a[5] = 0;
        a[6] = 0;
        a[7] = 0;
        if (z2) {
            C5854k.m22119b(aVar2, cVar.mo15545b()[0], a);
        } else {
            C5854k.m22117a(aVar2, cVar.mo15545b()[1] + 1, a);
            int i = 0;
            for (int length = a.length - 1; i < length; length--) {
                int i2 = a[i];
                a[i] = a[length];
                a[length] = i2;
                i++;
            }
        }
        int i3 = z2 ? 16 : 15;
        float a2 = ((float) C5815a.m21962a(a)) / ((float) i3);
        int[] e = mo15490e();
        int[] c = mo15488c();
        float[] f = mo15491f();
        float[] d = mo15489d();
        for (int i4 = 0; i4 < a.length; i4++) {
            float f2 = ((float) a[i4]) / a2;
            int i5 = (int) (0.5f + f2);
            if (i5 < 1) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                e[i6] = i5;
                f[i6] = f2 - ((float) i5);
            } else {
                c[i6] = i5;
                d[i6] = f2 - ((float) i5);
            }
        }
        m22076a(z2, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = e.length - 1; length2 >= 0; length2--) {
            i7 = (i7 * 9) + e[length2];
            i8 += e[length2];
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = c.length - 1; length3 >= 0; length3--) {
            i9 = (i9 * 9) + c[length3];
            i10 += c[length3];
        }
        int i11 = i7 + (i9 * 3);
        if (z2) {
            if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
                throw C5882i.m22303a();
            }
            int i12 = (12 - i8) / 2;
            int i13 = f16162k[i12];
            return new C5840b((C5844f.m22082a(e, i13, false) * f16158g[i12]) + C5844f.m22082a(c, 9 - i13, true) + f16160i[i12], i11);
        } else if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
            throw C5882i.m22303a();
        } else {
            int i14 = (10 - i10) / 2;
            int i15 = f16163l[i14];
            return new C5840b((C5844f.m22082a(c, 9 - i15, false) * f16159h[i14]) + C5844f.m22082a(e, i15, true) + f16161j[i14], i11);
        }
    }

    /* renamed from: a */
    private C5841c m22073a(C5772a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean a = aVar.mo15369a(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (aVar.mo15369a(i4) ^ a)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] b = mo15487b();
        System.arraycopy(b, 0, b, 1, b.length - 1);
        b[0] = iArr[0] - i5;
        int a2 = C5815a.m21963a(b, f16164m);
        int i6 = iArr[1];
        if (z) {
            i2 = (aVar.mo15378f() - 1) - i6;
            i3 = (aVar.mo15378f() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C5841c(a2, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* renamed from: a */
    private C5842d m22074a(C5772a aVar, boolean z, int i, Map<C5806e, ?> map) {
        try {
            int[] a = m22078a(aVar, 0, z);
            C5841c a2 = m22073a(aVar, i, z, a);
            C5920p pVar = map == null ? null : (C5920p) map.get(C5806e.NEED_RESULT_POINT_CALLBACK);
            if (pVar != null) {
                float f = ((float) (a[0] + a[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo15378f() - 1)) - f;
                }
                pVar.mo11732a(new C5919o(f, (float) i));
            }
            C5840b a3 = m22072a(aVar, a2, true);
            C5840b a4 = m22072a(aVar, a2, false);
            return new C5842d((a3.mo15540b() * 1597) + a4.mo15540b(), a3.mo15539a() + (a4.mo15539a() * 4), a2);
        } catch (C5882i unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m22075a(Collection<C5842d> collection, C5842d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C5842d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5842d next = it.next();
                if (next.mo15540b() == dVar.mo15540b()) {
                    next.mo15551e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* renamed from: a */
    private void m22076a(boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int a = C5815a.m21962a(mo15490e());
        int a2 = C5815a.m21962a(mo15488c());
        int i2 = (a + a2) - i;
        boolean z7 = false;
        boolean z8 = (a & true) == z;
        boolean z9 = (a2 & 1) == 1;
        if (z) {
            if (a > 12) {
                z6 = false;
                z5 = true;
            } else if (a < 4) {
                z5 = false;
                z6 = true;
            } else {
                z6 = false;
                z5 = false;
            }
            if (a2 > 12) {
                z4 = true;
            } else if (a2 < 4) {
                z4 = false;
                z7 = true;
            } else {
                z4 = false;
            }
            z2 = z6;
            z3 = z5;
        } else {
            if (a > 11) {
                z2 = false;
                z3 = true;
            } else if (a < 5) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (a2 > 10) {
                z4 = true;
            } else if (a2 < 4) {
                z4 = false;
                z7 = true;
            } else {
                z4 = false;
            }
        }
        if (i2 == 1) {
            if (z8) {
                if (!z9) {
                    z3 = true;
                } else {
                    throw C5882i.m22303a();
                }
            } else if (z9) {
                z4 = true;
            } else {
                throw C5882i.m22303a();
            }
        } else if (i2 == -1) {
            if (z8) {
                if (!z9) {
                    z2 = true;
                } else {
                    throw C5882i.m22303a();
                }
            } else if (z9) {
                z7 = true;
            } else {
                throw C5882i.m22303a();
            }
        } else if (i2 != 0) {
            throw C5882i.m22303a();
        } else if (z8) {
            if (!z9) {
                throw C5882i.m22303a();
            } else if (a < a2) {
                z2 = true;
                z4 = true;
            } else {
                z7 = true;
                z3 = true;
            }
        } else if (z9) {
            throw C5882i.m22303a();
        }
        if (z2) {
            if (!z3) {
                C5815a.m21965b(mo15490e(), mo15491f());
            } else {
                throw C5882i.m22303a();
            }
        }
        if (z3) {
            C5815a.m21964a(mo15490e(), mo15491f());
        }
        if (z7) {
            if (!z4) {
                C5815a.m21965b(mo15488c(), mo15491f());
            } else {
                throw C5882i.m22303a();
            }
        }
        if (z4) {
            C5815a.m21964a(mo15488c(), mo15489d());
        }
    }

    /* renamed from: a */
    private static boolean m22077a(C5842d dVar, C5842d dVar2) {
        int a = (dVar.mo15539a() + (dVar2.mo15539a() * 16)) % 79;
        int c = (dVar.mo15550d().mo15546c() * 9) + dVar2.mo15550d().mo15546c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: a */
    private int[] m22078a(C5772a aVar, int i, boolean z) {
        int[] b = mo15487b();
        b[0] = 0;
        b[1] = 0;
        b[2] = 0;
        b[3] = 0;
        int f = aVar.mo15378f();
        boolean z2 = false;
        while (i < f) {
            z2 = !aVar.mo15369a(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < f) {
            if (aVar.mo15369a(i) ^ z2) {
                b[i3] = b[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (C5815a.m21966b(b)) {
                    return new int[]{i2, i};
                } else {
                    i2 += b[0] + b[1];
                    b[0] = b[2];
                    b[1] = b[3];
                    b[2] = 0;
                    b[3] = 0;
                    i3--;
                }
                b[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: b */
    private static C5917m m22079b(C5842d dVar, C5842d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo15540b()) * 4537077) + ((long) dVar2.mo15540b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C5919o[] a = dVar.mo15550d().mo15544a();
        C5919o[] a2 = dVar2.mo15550d().mo15544a();
        return new C5917m(String.valueOf(sb.toString()), (byte[]) null, new C5919o[]{a[0], a[1], a2[0], a2[1]}, C5743a.RSS_14);
    }

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        m22075a((Collection<C5842d>) this.f16165n, m22074a(aVar, false, i, map));
        aVar.mo15379g();
        m22075a((Collection<C5842d>) this.f16166o, m22074a(aVar, true, i, map));
        aVar.mo15379g();
        int size = this.f16165n.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5842d dVar = this.f16165n.get(i2);
            if (dVar.mo15549c() > 1) {
                int size2 = this.f16166o.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C5842d dVar2 = this.f16166o.get(i3);
                    if (dVar2.mo15549c() > 1 && m22077a(dVar, dVar2)) {
                        return m22079b(dVar, dVar2);
                    }
                }
                continue;
            }
        }
        throw C5882i.m22303a();
    }

    public void reset() {
        this.f16165n.clear();
        this.f16166o.clear();
    }
}
