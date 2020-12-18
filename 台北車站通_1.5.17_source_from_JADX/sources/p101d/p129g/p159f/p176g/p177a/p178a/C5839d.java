package p101d.p129g.p159f.p176g.p177a.p178a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5772a;
import p101d.p129g.p159f.p176g.C5854k;
import p101d.p129g.p159f.p176g.p177a.C5815a;
import p101d.p129g.p159f.p176g.p177a.C5840b;
import p101d.p129g.p159f.p176g.p177a.C5841c;
import p101d.p129g.p159f.p176g.p177a.C5844f;
import p101d.p129g.p159f.p176g.p177a.p178a.p179a.C5826j;

/* renamed from: d.g.f.g.a.a.d */
public final class C5839d extends C5815a {

    /* renamed from: g */
    private static final int[] f16141g = {7, 5, 4, 3, 1};

    /* renamed from: h */
    private static final int[] f16142h = {4, 20, 52, 104, HttpStatus.SC_NO_CONTENT};

    /* renamed from: i */
    private static final int[] f16143i = {0, 348, 1388, 2948, 3988};

    /* renamed from: j */
    private static final int[][] f16144j = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: k */
    private static final int[][] f16145k = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, HttpStatus.SC_RESET_CONTENT}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 187, 139, HttpStatus.SC_PARTIAL_CONTENT, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, HttpStatus.SC_OK, 178, 112, 125, 164}, new int[]{70, 210, 208, HttpStatus.SC_ACCEPTED, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, HttpStatus.SC_NO_CONTENT, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, HttpStatus.SC_MULTI_STATUS, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: l */
    private static final int[][] f16146l = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: m */
    private final List<C5837b> f16147m = new ArrayList(11);

    /* renamed from: n */
    private final List<C5838c> f16148n = new ArrayList();

    /* renamed from: o */
    private final int[] f16149o = new int[2];

    /* renamed from: p */
    private boolean f16150p;

    /* renamed from: a */
    private static int m22046a(C5772a aVar, int i) {
        return aVar.mo15369a(i) ? aVar.mo15371b(aVar.mo15372c(i)) : aVar.mo15372c(aVar.mo15371b(i));
    }

    /* renamed from: a */
    private C5841c m22047a(C5772a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f16149o[0] - 1;
            while (i5 >= 0 && !aVar.mo15369a(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f16149o;
            i3 = iArr[1];
            i4 = i6;
            i2 = iArr[0] - i6;
        } else {
            int[] iArr2 = this.f16149o;
            int i7 = iArr2[0];
            int c = aVar.mo15372c(iArr2[1] + 1);
            i2 = c - this.f16149o[1];
            i3 = c;
            i4 = i7;
        }
        int[] b = mo15487b();
        System.arraycopy(b, 0, b, 1, b.length - 1);
        b[0] = i2;
        try {
            return new C5841c(C5815a.m21963a(b, f16144j), new int[]{i4, i3}, i4, i3, i);
        } catch (C5882i unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C5917m m22048a(List<C5837b> list) {
        String c = C5826j.m21992a(C5816a.m21973a(list)).mo15494c();
        C5919o[] a = list.get(0).mo15523a().mo15544a();
        C5919o[] a2 = list.get(list.size() - 1).mo15523a().mo15544a();
        return new C5917m(c, (byte[]) null, new C5919o[]{a[0], a[1], a2[0], a2[1]}, C5743a.RSS_EXPANDED);
    }

    /* renamed from: a */
    private List<C5837b> m22049a(List<C5838c> list, int i) {
        while (i < this.f16148n.size()) {
            C5838c cVar = this.f16148n.get(i);
            this.f16147m.clear();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f16147m.addAll(list.get(i2).mo15530a());
            }
            this.f16147m.addAll(cVar.mo15530a());
            if (m22057b(this.f16147m)) {
                if (m22059g()) {
                    return this.f16147m;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return m22049a((List<C5838c>) arrayList, i + 1);
                } catch (C5882i unused) {
                }
            }
            i++;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private List<C5837b> m22050a(boolean z) {
        List<C5837b> list = null;
        if (this.f16148n.size() > 25) {
            this.f16148n.clear();
            return null;
        }
        this.f16147m.clear();
        if (z) {
            Collections.reverse(this.f16148n);
        }
        try {
            list = m22049a((List<C5838c>) new ArrayList(), 0);
        } catch (C5882i unused) {
        }
        if (z) {
            Collections.reverse(this.f16148n);
        }
        return list;
    }

    /* renamed from: a */
    private void m22051a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int a = C5815a.m21962a(mo15490e());
        int a2 = C5815a.m21962a(mo15488c());
        int i2 = (a + a2) - i;
        boolean z4 = false;
        boolean z5 = (a & 1) == 1;
        boolean z6 = (a2 & 1) == 0;
        if (a > 13) {
            z2 = false;
            z = true;
        } else if (a < 4) {
            z = false;
            z2 = true;
        } else {
            z2 = false;
            z = false;
        }
        if (a2 > 13) {
            z3 = true;
        } else if (a2 < 4) {
            z3 = false;
            z4 = true;
        } else {
            z3 = false;
        }
        if (i2 == 1) {
            if (z5) {
                if (!z6) {
                    z = true;
                } else {
                    throw C5882i.m22303a();
                }
            } else if (z6) {
                z3 = true;
            } else {
                throw C5882i.m22303a();
            }
        } else if (i2 == -1) {
            if (z5) {
                if (!z6) {
                    z2 = true;
                } else {
                    throw C5882i.m22303a();
                }
            } else if (z6) {
                z4 = true;
            } else {
                throw C5882i.m22303a();
            }
        } else if (i2 != 0) {
            throw C5882i.m22303a();
        } else if (z5) {
            if (!z6) {
                throw C5882i.m22303a();
            } else if (a < a2) {
                z3 = true;
                z2 = true;
            } else {
                z4 = true;
                z = true;
            }
        } else if (z6) {
            throw C5882i.m22303a();
        }
        if (z2) {
            if (!z) {
                C5815a.m21965b(mo15490e(), mo15491f());
            } else {
                throw C5882i.m22303a();
            }
        }
        if (z) {
            C5815a.m21964a(mo15490e(), mo15491f());
        }
        if (z4) {
            if (!z3) {
                C5815a.m21965b(mo15488c(), mo15491f());
            } else {
                throw C5882i.m22303a();
            }
        }
        if (z3) {
            C5815a.m21964a(mo15488c(), mo15489d());
        }
    }

    /* renamed from: a */
    private void m22052a(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f16148n.size()) {
                break;
            }
            C5838c cVar = this.f16148n.get(i2);
            if (cVar.mo15532b() > i) {
                z2 = cVar.mo15531a(this.f16147m);
                break;
            } else {
                z3 = cVar.mo15531a(this.f16147m);
                i2++;
            }
        }
        if (!z2 && !z3 && !m22055a((Iterable<C5837b>) this.f16147m, (Iterable<C5838c>) this.f16148n)) {
            this.f16148n.add(i2, new C5838c(this.f16147m, i, z));
            m22053a(this.f16147m, this.f16148n);
        }
    }

    /* renamed from: a */
    private static void m22053a(List<C5837b> list, List<C5838c> list2) {
        boolean z;
        Iterator<C5838c> it = list2.iterator();
        while (it.hasNext()) {
            C5838c next = it.next();
            if (next.mo15530a().size() != list.size()) {
                Iterator<C5837b> it2 = next.mo15530a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    C5837b next2 = it2.next();
                    Iterator<C5837b> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m22054a(C5841c cVar, boolean z, boolean z2) {
        return cVar.mo15546c() != 0 || !z || !z2;
    }

    /* renamed from: a */
    private static boolean m22055a(Iterable<C5837b> iterable, Iterable<C5838c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C5838c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C5838c next = it.next();
                Iterator<C5837b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C5837b next2 = it2.next();
                    Iterator<C5837b> it3 = next.mo15530a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: b */
    private void m22056b(C5772a aVar, List<C5837b> list, int i) {
        int[] b = mo15487b();
        b[0] = 0;
        b[1] = 0;
        b[2] = 0;
        b[3] = 0;
        int f = aVar.mo15378f();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).mo15523a().mo15545b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f16150p) {
            z = !z;
        }
        boolean z2 = false;
        while (i < f) {
            z2 = !aVar.mo15369a(i);
            if (!z2) {
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
                if (i3 == 3) {
                    if (z) {
                        m22058c(b);
                    }
                    if (C5815a.m21966b(b)) {
                        int[] iArr = this.f16149o;
                        iArr[0] = i2;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m22058c(b);
                    }
                    i2 += b[0] + b[1];
                    b[0] = b[2];
                    b[1] = b[3];
                    b[2] = 0;
                    b[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                b[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: b */
    private static boolean m22057b(List<C5837b> list) {
        boolean z;
        for (int[] iArr : f16146l) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo15523a().mo15546c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private static void m22058c(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: g */
    private boolean m22059g() {
        C5837b bVar = this.f16147m.get(0);
        C5840b b = bVar.mo15524b();
        C5840b c = bVar.mo15525c();
        if (c == null) {
            return false;
        }
        int i = 2;
        int a = c.mo15539a();
        for (int i2 = 1; i2 < this.f16147m.size(); i2++) {
            C5837b bVar2 = this.f16147m.get(i2);
            a += bVar2.mo15524b().mo15539a();
            i++;
            C5840b c2 = bVar2.mo15525c();
            if (c2 != null) {
                a += c2.mo15539a();
                i++;
            }
        }
        return ((i + -4) * 211) + (a % 211) == b.mo15540b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5837b mo15536a(C5772a aVar, List<C5837b> list, int i) {
        C5841c a;
        C5840b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f16150p) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m22056b(aVar, list, i2);
            a = m22047a(aVar, i, z);
            if (a == null) {
                i2 = m22046a(aVar, this.f16149o[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C5840b a2 = mo15537a(aVar, a, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo15526d()) {
            try {
                bVar = mo15537a(aVar, a, z, false);
            } catch (C5882i unused) {
                bVar = null;
            }
            return new C5837b(a2, bVar, a, true);
        }
        throw C5882i.m22303a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5840b mo15537a(C5772a aVar, C5841c cVar, boolean z, boolean z2) {
        C5772a aVar2 = aVar;
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
            C5854k.m22117a(aVar2, cVar.mo15545b()[1], a);
            int i = 0;
            for (int length = a.length - 1; i < length; length--) {
                int i2 = a[i];
                a[i] = a[length];
                a[length] = i2;
                i++;
            }
        }
        float a2 = ((float) C5815a.m21962a(a)) / ((float) 17);
        float f = ((float) (cVar.mo15545b()[1] - cVar.mo15545b()[0])) / 15.0f;
        if (Math.abs(a2 - f) / f <= 0.3f) {
            int[] e = mo15490e();
            int[] c = mo15488c();
            float[] f2 = mo15491f();
            float[] d = mo15489d();
            for (int i3 = 0; i3 < a.length; i3++) {
                float f3 = (((float) a[i3]) * 1.0f) / a2;
                int i4 = (int) (0.5f + f3);
                if (i4 < 1) {
                    if (f3 >= 0.3f) {
                        i4 = 1;
                    } else {
                        throw C5882i.m22303a();
                    }
                } else if (i4 > 8) {
                    if (f3 <= 8.7f) {
                        i4 = 8;
                    } else {
                        throw C5882i.m22303a();
                    }
                }
                int i5 = i3 / 2;
                if ((i3 & 1) == 0) {
                    e[i5] = i4;
                    f2[i5] = f3 - ((float) i4);
                } else {
                    c[i5] = i4;
                    d[i5] = f3 - ((float) i4);
                }
            }
            m22051a(17);
            int c2 = (((cVar.mo15546c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i6 = 0;
            int i7 = 0;
            for (int length2 = e.length - 1; length2 >= 0; length2--) {
                if (m22054a(cVar, z, z2)) {
                    i6 += e[length2] * f16145k[c2][length2 * 2];
                }
                i7 += e[length2];
            }
            int i8 = 0;
            for (int length3 = c.length - 1; length3 >= 0; length3--) {
                if (m22054a(cVar, z, z2)) {
                    i8 += c[length3] * f16145k[c2][(length3 * 2) + 1];
                }
            }
            int i9 = i6 + i8;
            if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
                throw C5882i.m22303a();
            }
            int i10 = (13 - i7) / 2;
            int i11 = f16141g[i10];
            return new C5840b((C5844f.m22082a(e, i11, true) * f16142h[i10]) + C5844f.m22082a(c, 9 - i11, false) + f16143i[i10], i9);
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        this.f16147m.clear();
        this.f16150p = false;
        try {
            return m22048a(mo15538a(i, aVar));
        } catch (C5882i unused) {
            this.f16147m.clear();
            this.f16150p = true;
            return m22048a(mo15538a(i, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C5837b> mo15538a(int i, C5772a aVar) {
        while (true) {
            try {
                this.f16147m.add(mo15536a(aVar, this.f16147m, i));
            } catch (C5882i e) {
                if (this.f16147m.isEmpty()) {
                    throw e;
                } else if (m22059g()) {
                    return this.f16147m;
                } else {
                    boolean z = !this.f16148n.isEmpty();
                    m22052a(i, false);
                    if (z) {
                        List<C5837b> a = m22050a(false);
                        if (a != null) {
                            return a;
                        }
                        List<C5837b> a2 = m22050a(true);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                    throw C5882i.m22303a();
                }
            }
        }
    }

    public void reset() {
        this.f16147m.clear();
        this.f16148n.clear();
    }
}
