package p101d.p129g.p159f.p184i.p185a;

import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.i.a.a */
final class C5884a {

    /* renamed from: a */
    private final C5775b f16279a;

    /* renamed from: b */
    private C5902k f16280b;

    /* renamed from: c */
    private C5899h f16281c;

    /* renamed from: d */
    private boolean f16282d;

    C5884a(C5775b bVar) {
        int f = bVar.mo15395f();
        if (f < 21 || (f & 3) != 1) {
            throw C5811f.m21947a();
        }
        this.f16279a = bVar;
    }

    /* renamed from: a */
    private int m22308a(int i, int i2, int i3) {
        return this.f16282d ? this.f16279a.mo15389b(i2, i) : this.f16279a.mo15389b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15644a() {
        int i = 0;
        while (i < this.f16279a.mo15397h()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f16279a.mo15395f(); i3++) {
                if (this.f16279a.mo15389b(i, i3) != this.f16279a.mo15389b(i3, i)) {
                    this.f16279a.mo15386a(i3, i);
                    this.f16279a.mo15386a(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15645a(boolean z) {
        this.f16280b = null;
        this.f16281c = null;
        this.f16282d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] mo15646b() {
        C5899h c = mo15647c();
        C5902k d = mo15648d();
        C5887d a = C5887d.m22318a(c.mo15655a());
        int f = this.f16279a.mo15395f();
        a.mo15652a(this.f16279a, f);
        C5775b a2 = d.mo15661a();
        byte[] bArr = new byte[d.mo15665d()];
        int i = f - 1;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = i;
        while (i5 > 0) {
            if (i5 == 6) {
                i5--;
            }
            int i6 = i4;
            int i7 = i3;
            int i8 = i2;
            int i9 = 0;
            while (i9 < f) {
                int i10 = z ? i - i9 : i9;
                int i11 = i6;
                int i12 = i7;
                int i13 = i8;
                for (int i14 = 0; i14 < 2; i14++) {
                    int i15 = i5 - i14;
                    if (!a2.mo15389b(i15, i10)) {
                        i12++;
                        int i16 = i11 << 1;
                        int i17 = this.f16279a.mo15389b(i15, i10) ? i16 | 1 : i16;
                        if (i12 == 8) {
                            bArr[i13] = (byte) i17;
                            i13++;
                            i12 = 0;
                            i11 = 0;
                        } else {
                            i11 = i17;
                        }
                    }
                }
                i9++;
                i8 = i13;
                i7 = i12;
                i6 = i11;
            }
            z = !z;
            i5 -= 2;
            i2 = i8;
            i3 = i7;
            i4 = i6;
        }
        if (i2 == d.mo15665d()) {
            return bArr;
        }
        throw C5811f.m21947a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5899h mo15647c() {
        C5899h hVar = this.f16281c;
        if (hVar != null) {
            return hVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m22308a(i3, 8, i2);
        }
        int a = m22308a(8, 7, m22308a(8, 8, m22308a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m22308a(8, i4, a);
        }
        int f = this.f16279a.mo15395f();
        int i5 = f - 7;
        for (int i6 = f - 1; i6 >= i5; i6--) {
            i = m22308a(8, i6, i);
        }
        for (int i7 = f - 8; i7 < f; i7++) {
            i = m22308a(i7, 8, i);
        }
        this.f16281c = C5899h.m22341a(a, i);
        C5899h hVar2 = this.f16281c;
        if (hVar2 != null) {
            return hVar2;
        }
        throw C5811f.m21947a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5902k mo15648d() {
        C5902k kVar = this.f16280b;
        if (kVar != null) {
            return kVar;
        }
        int f = this.f16279a.mo15395f();
        int i = (f - 17) / 4;
        if (i <= 6) {
            return C5902k.m22351c(i);
        }
        int i2 = f - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = f - 9; i6 >= i2; i6--) {
                i4 = m22308a(i6, i5, i4);
            }
        }
        C5902k a = C5902k.m22349a(i4);
        if (a == null || a.mo15664c() != f) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = f - 9; i8 >= i2; i8--) {
                    i3 = m22308a(i7, i8, i3);
                }
            }
            C5902k a2 = C5902k.m22349a(i3);
            if (a2 == null || a2.mo15664c() != f) {
                throw C5811f.m21947a();
            }
            this.f16280b = a2;
            return a2;
        }
        this.f16280b = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo15649e() {
        C5899h hVar = this.f16281c;
        if (hVar != null) {
            C5887d.m22318a(hVar.mo15655a()).mo15652a(this.f16279a, this.f16279a.mo15395f());
        }
    }
}
