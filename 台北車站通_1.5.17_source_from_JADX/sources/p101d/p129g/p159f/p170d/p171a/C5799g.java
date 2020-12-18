package p101d.p129g.p159f.p170d.p171a;

import p101d.p129g.p159f.C5811f;

/* renamed from: d.g.f.d.a.g */
public final class C5799g {

    /* renamed from: a */
    private static final C5799g[] f16054a = m21907h();

    /* renamed from: b */
    private final int f16055b;

    /* renamed from: c */
    private final int f16056c;

    /* renamed from: d */
    private final int f16057d;

    /* renamed from: e */
    private final int f16058e;

    /* renamed from: f */
    private final int f16059f;

    /* renamed from: g */
    private final C5801b f16060g;

    /* renamed from: h */
    private final int f16061h;

    /* renamed from: d.g.f.d.a.g$a */
    static final class C5800a {

        /* renamed from: a */
        private final int f16062a;

        /* renamed from: b */
        private final int f16063b;

        private C5800a(int i, int i2) {
            this.f16062a = i;
            this.f16063b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo15463a() {
            return this.f16062a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo15464b() {
            return this.f16063b;
        }
    }

    /* renamed from: d.g.f.d.a.g$b */
    static final class C5801b {

        /* renamed from: a */
        private final int f16064a;

        /* renamed from: b */
        private final C5800a[] f16065b;

        private C5801b(int i, C5800a aVar) {
            this.f16064a = i;
            this.f16065b = new C5800a[]{aVar};
        }

        private C5801b(int i, C5800a aVar, C5800a aVar2) {
            this.f16064a = i;
            this.f16065b = new C5800a[]{aVar, aVar2};
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5800a[] mo15465a() {
            return this.f16065b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo15466b() {
            return this.f16064a;
        }
    }

    private C5799g(int i, int i2, int i3, int i4, int i5, C5801b bVar) {
        this.f16055b = i;
        this.f16056c = i2;
        this.f16057d = i3;
        this.f16058e = i4;
        this.f16059f = i5;
        this.f16060g = bVar;
        int b = bVar.mo15466b();
        int i6 = 0;
        for (C5800a aVar : bVar.mo15465a()) {
            i6 += aVar.mo15463a() * (aVar.mo15464b() + b);
        }
        this.f16061h = i6;
    }

    /* renamed from: a */
    public static C5799g m21906a(int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C5799g gVar : f16054a) {
                if (gVar.f16056c == i && gVar.f16057d == i2) {
                    return gVar;
                }
            }
            throw C5811f.m21947a();
        }
        throw C5811f.m21947a();
    }

    /* renamed from: h */
    private static C5799g[] m21907h() {
        return new C5799g[]{new C5799g(1, 10, 10, 8, 8, new C5801b(5, new C5800a(1, 3))), new C5799g(2, 12, 12, 10, 10, new C5801b(7, new C5800a(1, 5))), new C5799g(3, 14, 14, 12, 12, new C5801b(10, new C5800a(1, 8))), new C5799g(4, 16, 16, 14, 14, new C5801b(12, new C5800a(1, 12))), new C5799g(5, 18, 18, 16, 16, new C5801b(14, new C5800a(1, 18))), new C5799g(6, 20, 20, 18, 18, new C5801b(18, new C5800a(1, 22))), new C5799g(7, 22, 22, 20, 20, new C5801b(20, new C5800a(1, 30))), new C5799g(8, 24, 24, 22, 22, new C5801b(24, new C5800a(1, 36))), new C5799g(9, 26, 26, 24, 24, new C5801b(28, new C5800a(1, 44))), new C5799g(10, 32, 32, 14, 14, new C5801b(36, new C5800a(1, 62))), new C5799g(11, 36, 36, 16, 16, new C5801b(42, new C5800a(1, 86))), new C5799g(12, 40, 40, 18, 18, new C5801b(48, new C5800a(1, 114))), new C5799g(13, 44, 44, 20, 20, new C5801b(56, new C5800a(1, 144))), new C5799g(14, 48, 48, 22, 22, new C5801b(68, new C5800a(1, 174))), new C5799g(15, 52, 52, 24, 24, new C5801b(42, new C5800a(2, 102))), new C5799g(16, 64, 64, 14, 14, new C5801b(56, new C5800a(2, 140))), new C5799g(17, 72, 72, 16, 16, new C5801b(36, new C5800a(4, 92))), new C5799g(18, 80, 80, 18, 18, new C5801b(48, new C5800a(4, 114))), new C5799g(19, 88, 88, 20, 20, new C5801b(56, new C5800a(4, 144))), new C5799g(20, 96, 96, 22, 22, new C5801b(68, new C5800a(4, 174))), new C5799g(21, 104, 104, 24, 24, new C5801b(56, new C5800a(6, 136))), new C5799g(22, 120, 120, 18, 18, new C5801b(68, new C5800a(6, 175))), new C5799g(23, 132, 132, 20, 20, new C5801b(62, new C5800a(8, 163))), new C5799g(24, 144, 144, 22, 22, new C5801b(62, new C5800a(8, 156), new C5800a(2, 155))), new C5799g(25, 8, 18, 6, 16, new C5801b(7, new C5800a(1, 5))), new C5799g(26, 8, 32, 6, 14, new C5801b(11, new C5800a(1, 10))), new C5799g(27, 12, 26, 10, 24, new C5801b(14, new C5800a(1, 16))), new C5799g(28, 12, 36, 10, 16, new C5801b(18, new C5800a(1, 22))), new C5799g(29, 16, 36, 14, 16, new C5801b(24, new C5800a(1, 32))), new C5799g(30, 16, 48, 14, 22, new C5801b(28, new C5800a(1, 49)))};
    }

    /* renamed from: a */
    public int mo15455a() {
        return this.f16059f;
    }

    /* renamed from: b */
    public int mo15456b() {
        return this.f16058e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5801b mo15457c() {
        return this.f16060g;
    }

    /* renamed from: d */
    public int mo15458d() {
        return this.f16057d;
    }

    /* renamed from: e */
    public int mo15459e() {
        return this.f16056c;
    }

    /* renamed from: f */
    public int mo15460f() {
        return this.f16061h;
    }

    /* renamed from: g */
    public int mo15461g() {
        return this.f16055b;
    }

    public String toString() {
        return String.valueOf(this.f16055b);
    }
}
