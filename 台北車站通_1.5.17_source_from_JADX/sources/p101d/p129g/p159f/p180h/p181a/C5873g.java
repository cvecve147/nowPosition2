package p101d.p129g.p159f.p180h.p181a;

import java.util.Formatter;

/* renamed from: d.g.f.h.a.g */
final class C5873g {

    /* renamed from: a */
    private final C5863a f16257a;

    /* renamed from: b */
    private final C5874h[] f16258b = new C5874h[(this.f16260d + 2)];

    /* renamed from: c */
    private C5868c f16259c;

    /* renamed from: d */
    private final int f16260d;

    C5873g(C5863a aVar, C5868c cVar) {
        this.f16257a = aVar;
        this.f16260d = aVar.mo15567a();
        this.f16259c = cVar;
    }

    /* renamed from: a */
    private static int m22225a(int i, int i2, C5869d dVar) {
        if (dVar == null || dVar.mo15613g()) {
            return i2;
        }
        if (!dVar.mo15606a(i)) {
            return i2 + 1;
        }
        dVar.mo15608b(i);
        return 0;
    }

    /* renamed from: a */
    private void m22226a(int i, int i2, C5869d[] dVarArr) {
        C5869d dVar = dVarArr[i2];
        C5869d[] b = this.f16258b[i - 1].mo15629b();
        C5874h[] hVarArr = this.f16258b;
        int i3 = i + 1;
        C5869d[] b2 = hVarArr[i3] != null ? hVarArr[i3].mo15629b() : b;
        C5869d[] dVarArr2 = new C5869d[14];
        dVarArr2[2] = b[i2];
        dVarArr2[3] = b2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = b[i5];
            dVarArr2[5] = b2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = b[i6];
            dVarArr2[11] = b2[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = b[i7];
            dVarArr2[7] = b2[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = b[i8];
            dVarArr2[13] = b2[i8];
        }
        int length = dVarArr2.length;
        while (i4 < length && !m22228a(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: a */
    private void m22227a(C5874h hVar) {
        if (hVar != null) {
            ((C5875i) hVar).mo15632a(this.f16257a);
        }
    }

    /* renamed from: a */
    private static boolean m22228a(C5869d dVar, C5869d dVar2) {
        if (dVar2 == null || !dVar2.mo15613g() || dVar2.mo15605a() != dVar.mo15605a()) {
            return false;
        }
        dVar.mo15608b(dVar2.mo15609c());
        return true;
    }

    /* renamed from: f */
    private int m22229f() {
        int g = m22230g();
        if (g == 0) {
            return 0;
        }
        for (int i = 1; i < this.f16260d + 1; i++) {
            C5869d[] b = this.f16258b[i].mo15629b();
            for (int i2 = 0; i2 < b.length; i2++) {
                if (b[i2] != null && !b[i2].mo15613g()) {
                    m22226a(i, i2, b);
                }
            }
        }
        return g;
    }

    /* renamed from: g */
    private int m22230g() {
        m22231h();
        return m22232i() + m22233j();
    }

    /* renamed from: h */
    private void m22231h() {
        C5874h[] hVarArr = this.f16258b;
        if (hVarArr[0] != null && hVarArr[this.f16260d + 1] != null) {
            C5869d[] b = hVarArr[0].mo15629b();
            C5869d[] b2 = this.f16258b[this.f16260d + 1].mo15629b();
            for (int i = 0; i < b.length; i++) {
                if (!(b[i] == null || b2[i] == null || b[i].mo15609c() != b2[i].mo15609c())) {
                    for (int i2 = 1; i2 <= this.f16260d; i2++) {
                        C5869d dVar = this.f16258b[i2].mo15629b()[i];
                        if (dVar != null) {
                            dVar.mo15608b(b[i].mo15609c());
                            if (!dVar.mo15613g()) {
                                this.f16258b[i2].mo15629b()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private int m22232i() {
        C5874h[] hVarArr = this.f16258b;
        if (hVarArr[0] == null) {
            return 0;
        }
        C5869d[] b = hVarArr[0].mo15629b();
        int i = 0;
        for (int i2 = 0; i2 < b.length; i2++) {
            if (b[i2] != null) {
                int c = b[i2].mo15609c();
                int i3 = 0;
                int i4 = i;
                for (int i5 = 1; i5 < this.f16260d + 1 && i3 < 2; i5++) {
                    C5869d dVar = this.f16258b[i5].mo15629b()[i2];
                    if (dVar != null) {
                        i3 = m22225a(c, i3, dVar);
                        if (!dVar.mo15613g()) {
                            i4++;
                        }
                    }
                }
                i = i4;
            }
        }
        return i;
    }

    /* renamed from: j */
    private int m22233j() {
        C5874h[] hVarArr = this.f16258b;
        int i = this.f16260d;
        if (hVarArr[i + 1] == null) {
            return 0;
        }
        C5869d[] b = hVarArr[i + 1].mo15629b();
        int i2 = 0;
        for (int i3 = 0; i3 < b.length; i3++) {
            if (b[i3] != null) {
                int c = b[i3].mo15609c();
                int i4 = i2;
                int i5 = 0;
                for (int i6 = this.f16260d + 1; i6 > 0 && i5 < 2; i6--) {
                    C5869d dVar = this.f16258b[i6].mo15629b()[i3];
                    if (dVar != null) {
                        i5 = m22225a(c, i5, dVar);
                        if (!dVar.mo15613g()) {
                            i4++;
                        }
                    }
                }
                i2 = i4;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15616a() {
        return this.f16260d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5874h mo15617a(int i) {
        return this.f16258b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15618a(int i, C5874h hVar) {
        this.f16258b[i] = hVar;
    }

    /* renamed from: a */
    public void mo15619a(C5868c cVar) {
        this.f16259c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15620b() {
        return this.f16257a.mo15568b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15621c() {
        return this.f16257a.mo15569c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5868c mo15622d() {
        return this.f16259c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5874h[] mo15623e() {
        m22227a(this.f16258b[0]);
        m22227a(this.f16258b[this.f16260d + 1]);
        int i = 928;
        while (true) {
            int f = m22229f();
            if (f > 0 && f < i) {
                i = f;
            }
        }
        return this.f16258b;
    }

    public String toString() {
        C5869d dVar;
        C5874h[] hVarArr = this.f16258b;
        C5874h hVar = hVarArr[0];
        if (hVar == null) {
            hVar = hVarArr[this.f16260d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < hVar.mo15629b().length; i++) {
            formatter.format("CW %3d:", new Object[]{Integer.valueOf(i)});
            for (int i2 = 0; i2 < this.f16260d + 2; i2++) {
                C5874h[] hVarArr2 = this.f16258b;
                if (hVarArr2[i2] == null || (dVar = hVarArr2[i2].mo15629b()[i]) == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(dVar.mo15609c()), Integer.valueOf(dVar.mo15611e())});
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
