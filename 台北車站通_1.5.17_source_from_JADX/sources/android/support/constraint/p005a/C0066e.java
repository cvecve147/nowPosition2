package android.support.constraint.p005a;

import android.support.constraint.p005a.C0069h;
import android.support.constraint.p005a.p006a.C0048b;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.a.e */
public class C0066e {

    /* renamed from: a */
    private static int f364a = 1000;

    /* renamed from: b */
    int f365b = 0;

    /* renamed from: c */
    private HashMap<String, C0069h> f366c = null;

    /* renamed from: d */
    private C0065d f367d = new C0065d();

    /* renamed from: e */
    private int f368e = 32;

    /* renamed from: f */
    private int f369f;

    /* renamed from: g */
    private C0063b[] f370g;

    /* renamed from: h */
    private boolean[] f371h;

    /* renamed from: i */
    int f372i;

    /* renamed from: j */
    private int f373j;

    /* renamed from: k */
    private int f374k;

    /* renamed from: l */
    final C0064c f375l;

    /* renamed from: m */
    private C0069h[] f376m;

    /* renamed from: n */
    private int f377n;

    /* renamed from: o */
    private C0063b[] f378o;

    public C0066e() {
        int i = this.f368e;
        this.f369f = i;
        this.f370g = null;
        this.f371h = new boolean[i];
        this.f372i = 1;
        this.f373j = 0;
        this.f374k = i;
        this.f376m = new C0069h[f364a];
        this.f377n = 0;
        this.f378o = new C0063b[i];
        this.f370g = new C0063b[i];
        m307i();
        this.f375l = new C0064c();
    }

    /* renamed from: a */
    public static C0063b m294a(C0066e eVar, C0069h hVar, C0069h hVar2, int i, float f, C0069h hVar3, C0069h hVar4, int i2, boolean z) {
        C0063b b = eVar.mo252b();
        b.mo223a(hVar, hVar2, i, f, hVar3, hVar4, i2);
        if (z) {
            C0069h a = eVar.mo245a();
            C0069h a2 = eVar.mo245a();
            a.f384d = 4;
            a2.f384d = 4;
            b.mo221a(a, a2);
        }
        return b;
    }

    /* renamed from: a */
    public static C0063b m295a(C0066e eVar, C0069h hVar, C0069h hVar2, int i, boolean z) {
        C0063b b = eVar.mo252b();
        b.mo222a(hVar, hVar2, i);
        if (z) {
            eVar.m298a(b, 1);
        }
        return b;
    }

    /* renamed from: a */
    public static C0063b m296a(C0066e eVar, C0069h hVar, C0069h hVar2, C0069h hVar3, float f, boolean z) {
        C0063b b = eVar.mo252b();
        if (z) {
            eVar.m301b(b);
        }
        b.mo224a(hVar, hVar2, hVar3, f);
        return b;
    }

    /* renamed from: a */
    private C0069h m297a(C0069h.C0070a aVar) {
        C0069h a = this.f375l.f361b.mo259a();
        if (a == null) {
            a = new C0069h(aVar);
        } else {
            a.mo265b();
            a.mo264a(aVar);
        }
        int i = this.f377n;
        int i2 = f364a;
        if (i >= i2) {
            f364a = i2 * 2;
            this.f376m = (C0069h[]) Arrays.copyOf(this.f376m, f364a);
        }
        C0069h[] hVarArr = this.f376m;
        int i3 = this.f377n;
        this.f377n = i3 + 1;
        hVarArr[i3] = a;
        return a;
    }

    /* renamed from: a */
    private void m298a(C0063b bVar, int i) {
        bVar.mo220a(mo245a(), i);
    }

    /* renamed from: b */
    private int m299b(C0065d dVar) {
        boolean z;
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f373j) {
                z = false;
                break;
            }
            C0063b[] bVarArr = this.f370g;
            if (bVarArr[i2].f355a.f387g != C0069h.C0070a.UNRESTRICTED && bVarArr[i2].f356b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            i = 0;
            while (!z2) {
                i++;
                float f = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f373j; i6++) {
                    C0063b bVar = this.f370g[i6];
                    if (bVar.f355a.f387g != C0069h.C0070a.UNRESTRICTED && bVar.f356b < 0.0f) {
                        int i7 = i5;
                        float f2 = f;
                        int i8 = i4;
                        int i9 = i3;
                        for (int i10 = 1; i10 < this.f372i; i10++) {
                            C0069h hVar = this.f375l.f362c[i10];
                            float b = bVar.f358d.mo108b(hVar);
                            if (b > 0.0f) {
                                int i11 = i7;
                                float f3 = f2;
                                int i12 = i8;
                                int i13 = i9;
                                for (int i14 = 0; i14 < 6; i14++) {
                                    float f4 = hVar.f386f[i14] / b;
                                    if ((f4 < f3 && i14 == i11) || i14 > i11) {
                                        f3 = f4;
                                        i13 = i6;
                                        i12 = i10;
                                        i11 = i14;
                                    }
                                }
                                i9 = i13;
                                i8 = i12;
                                f2 = f3;
                                i7 = i11;
                            }
                        }
                        i3 = i9;
                        i4 = i8;
                        f = f2;
                        i5 = i7;
                    }
                }
                if (i3 != -1) {
                    C0063b bVar2 = this.f370g[i3];
                    bVar2.f355a.f383c = -1;
                    bVar2.mo232b(this.f375l.f362c[i4]);
                    bVar2.f355a.f383c = i3;
                    for (int i15 = 0; i15 < this.f373j; i15++) {
                        this.f370g[i15].mo228a(bVar2);
                    }
                    dVar.mo241a(this);
                } else {
                    C0065d dVar2 = dVar;
                    z2 = true;
                }
            }
        } else {
            i = 0;
        }
        for (int i16 = 0; i16 < this.f373j; i16++) {
            C0063b[] bVarArr2 = this.f370g;
            if (bVarArr2[i16].f355a.f387g != C0069h.C0070a.UNRESTRICTED && bVarArr2[i16].f356b < 0.0f) {
                break;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C0063b m300b(C0066e eVar, C0069h hVar, C0069h hVar2, int i, boolean z) {
        C0069h c = eVar.mo254c();
        C0063b b = eVar.mo252b();
        b.mo225a(hVar, hVar2, c, i);
        if (z) {
            eVar.m298a(b, (int) (b.f358d.mo108b(c) * -1.0f));
        }
        return b;
    }

    /* renamed from: b */
    private void m301b(C0063b bVar) {
        bVar.mo221a(mo245a(), mo245a());
    }

    /* renamed from: c */
    private int m302c(C0065d dVar) {
        for (int i = 0; i < this.f372i; i++) {
            this.f371h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            i2++;
            C0069h a = dVar.mo240a();
            if (a != null) {
                boolean[] zArr = this.f371h;
                int i4 = a.f382b;
                if (zArr[i4]) {
                    a = null;
                } else {
                    zArr[i4] = true;
                    i3++;
                    if (i3 >= this.f372i) {
                        z = true;
                    }
                }
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f373j; i6++) {
                    C0063b bVar = this.f370g[i6];
                    if (bVar.f355a.f387g != C0069h.C0070a.UNRESTRICTED && bVar.mo229a(a)) {
                        float b = bVar.f358d.mo108b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f356b) / b;
                            if (f2 < f) {
                                i5 = i6;
                                f = f2;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    C0063b bVar2 = this.f370g[i5];
                    bVar2.f355a.f383c = -1;
                    bVar2.mo232b(a);
                    bVar2.f355a.f383c = i5;
                    for (int i7 = 0; i7 < this.f373j; i7++) {
                        this.f370g[i7].mo228a(bVar2);
                    }
                    dVar.mo241a(this);
                    try {
                        m299b(dVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            z = true;
        }
        return i2;
    }

    /* renamed from: c */
    public static C0063b m303c(C0066e eVar, C0069h hVar, C0069h hVar2, int i, boolean z) {
        C0069h c = eVar.mo254c();
        C0063b b = eVar.mo252b();
        b.mo231b(hVar, hVar2, c, i);
        if (z) {
            eVar.m298a(b, (int) (b.f358d.mo108b(c) * -1.0f));
        }
        return b;
    }

    /* renamed from: c */
    private void m304c(C0063b bVar) {
        if (this.f373j > 0) {
            bVar.f358d.mo104a(bVar, this.f370g);
            if (bVar.f358d.f203a == 0) {
                bVar.f359e = true;
            }
        }
    }

    /* renamed from: g */
    private void m305g() {
        for (int i = 0; i < this.f373j; i++) {
            C0063b bVar = this.f370g[i];
            bVar.f355a.f385e = bVar.f356b;
        }
    }

    /* renamed from: h */
    private void m306h() {
        this.f368e *= 2;
        this.f370g = (C0063b[]) Arrays.copyOf(this.f370g, this.f368e);
        C0064c cVar = this.f375l;
        cVar.f362c = (C0069h[]) Arrays.copyOf(cVar.f362c, this.f368e);
        int i = this.f368e;
        this.f371h = new boolean[i];
        this.f369f = i;
        this.f374k = i;
        this.f367d.f363a.clear();
    }

    /* renamed from: i */
    private void m307i() {
        int i = 0;
        while (true) {
            C0063b[] bVarArr = this.f370g;
            if (i < bVarArr.length) {
                C0063b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f375l.f360a.mo261a(bVar);
                }
                this.f370g[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0063b mo243a(int i) {
        return this.f370g[i];
    }

    /* renamed from: a */
    public C0063b mo244a(C0069h hVar, C0069h hVar2, int i, int i2) {
        C0063b b = mo252b();
        b.mo222a(hVar, hVar2, i);
        C0069h a = mo245a();
        C0069h a2 = mo245a();
        a.f384d = i2;
        a2.f384d = i2;
        b.mo221a(a, a2);
        mo247a(b);
        return b;
    }

    /* renamed from: a */
    public C0069h mo245a() {
        if (this.f372i + 1 >= this.f369f) {
            m306h();
        }
        C0069h a = m297a(C0069h.C0070a.ERROR);
        this.f365b++;
        this.f372i++;
        int i = this.f365b;
        a.f382b = i;
        this.f375l.f362c[i] = a;
        return a;
    }

    /* renamed from: a */
    public C0069h mo246a(Object obj) {
        C0069h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f372i + 1 >= this.f369f) {
            m306h();
        }
        if (obj instanceof C0048b) {
            C0048b bVar = (C0048b) obj;
            hVar = bVar.mo123e();
            if (hVar == null) {
                bVar.mo116a(this.f375l);
                hVar = bVar.mo123e();
            }
            int i = hVar.f382b;
            if (i == -1 || i > this.f365b || this.f375l.f362c[i] == null) {
                if (hVar.f382b != -1) {
                    hVar.mo265b();
                }
                this.f365b++;
                this.f372i++;
                int i2 = this.f365b;
                hVar.f382b = i2;
                hVar.f387g = C0069h.C0070a.UNRESTRICTED;
                this.f375l.f362c[i2] = hVar;
            }
        }
        return hVar;
    }

    /* renamed from: a */
    public void mo247a(C0063b bVar) {
        C0063b[] bVarArr;
        if (bVar != null) {
            if (this.f373j + 1 >= this.f374k || this.f372i + 1 >= this.f369f) {
                m306h();
            }
            if (!bVar.f359e) {
                m304c(bVar);
                bVar.mo227a();
                bVar.mo235c();
                if (!bVar.mo233b()) {
                    return;
                }
            }
            C0063b[] bVarArr2 = this.f370g;
            int i = this.f373j;
            if (bVarArr2[i] != null) {
                this.f375l.f360a.mo261a(bVarArr2[i]);
            }
            if (!bVar.f359e) {
                bVar.mo238f();
            }
            C0063b[] bVarArr3 = this.f370g;
            int i2 = this.f373j;
            bVarArr3[i2] = bVar;
            C0069h hVar = bVar.f355a;
            hVar.f383c = i2;
            this.f373j = i2 + 1;
            int i3 = hVar.f389i;
            if (i3 > 0) {
                while (true) {
                    bVarArr = this.f378o;
                    if (bVarArr.length >= i3) {
                        break;
                    }
                    this.f378o = new C0063b[(bVarArr.length * 2)];
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    bVarArr[i4] = bVar.f355a.f388h[i4];
                }
                for (int i5 = 0; i5 < i3; i5++) {
                    C0063b bVar2 = bVarArr[i5];
                    if (bVar2 != bVar) {
                        bVar2.f358d.mo103a(bVar2, bVar);
                        bVar2.mo238f();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo248a(C0065d dVar) {
        dVar.mo241a(this);
        m299b(dVar);
        m302c(dVar);
        m305g();
    }

    /* renamed from: a */
    public void mo249a(C0069h hVar, int i) {
        C0063b bVar;
        int i2 = hVar.f383c;
        if (i2 != -1) {
            C0063b bVar2 = this.f370g[i2];
            if (bVar2.f359e) {
                bVar2.f356b = (float) i;
                return;
            } else {
                bVar = mo252b();
                bVar.mo234c(hVar, i);
            }
        } else {
            bVar = mo252b();
            bVar.mo230b(hVar, i);
        }
        mo247a(bVar);
    }

    /* renamed from: a */
    public void mo250a(C0069h hVar, C0069h hVar2, int i, float f, C0069h hVar3, C0069h hVar4, int i2, int i3) {
        int i4 = i3;
        C0063b b = mo252b();
        b.mo223a(hVar, hVar2, i, f, hVar3, hVar4, i2);
        C0069h a = mo245a();
        C0069h a2 = mo245a();
        a.f384d = i4;
        a2.f384d = i4;
        b.mo221a(a, a2);
        mo247a(b);
    }

    /* renamed from: b */
    public int mo251b(Object obj) {
        C0069h e = ((C0048b) obj).mo123e();
        if (e != null) {
            return (int) (e.f385e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    public C0063b mo252b() {
        C0063b a = this.f375l.f360a.mo259a();
        if (a == null) {
            return new C0063b(this.f375l);
        }
        a.mo236d();
        return a;
    }

    /* renamed from: b */
    public void mo253b(C0069h hVar, C0069h hVar2, int i, int i2) {
        C0063b b = mo252b();
        C0069h c = mo254c();
        c.f384d = i2;
        b.mo225a(hVar, hVar2, c, i);
        mo247a(b);
    }

    /* renamed from: c */
    public C0069h mo254c() {
        if (this.f372i + 1 >= this.f369f) {
            m306h();
        }
        C0069h a = m297a(C0069h.C0070a.SLACK);
        this.f365b++;
        this.f372i++;
        int i = this.f365b;
        a.f382b = i;
        this.f375l.f362c[i] = a;
        return a;
    }

    /* renamed from: c */
    public void mo255c(C0069h hVar, C0069h hVar2, int i, int i2) {
        C0063b b = mo252b();
        C0069h c = mo254c();
        c.f384d = i2;
        b.mo231b(hVar, hVar2, c, i);
        mo247a(b);
    }

    /* renamed from: d */
    public C0064c mo256d() {
        return this.f375l;
    }

    /* renamed from: e */
    public void mo257e() {
        mo248a(this.f367d);
    }

    /* renamed from: f */
    public void mo258f() {
        C0064c cVar;
        int i = 0;
        while (true) {
            cVar = this.f375l;
            C0069h[] hVarArr = cVar.f362c;
            if (i >= hVarArr.length) {
                break;
            }
            C0069h hVar = hVarArr[i];
            if (hVar != null) {
                hVar.mo265b();
            }
            i++;
        }
        cVar.f361b.mo260a(this.f376m, this.f377n);
        this.f377n = 0;
        Arrays.fill(this.f375l.f362c, (Object) null);
        HashMap<String, C0069h> hashMap = this.f366c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f365b = 0;
        this.f367d.f363a.clear();
        this.f372i = 1;
        for (int i2 = 0; i2 < this.f373j; i2++) {
            this.f370g[i2].f357c = false;
        }
        m307i();
        this.f373j = 0;
    }
}
