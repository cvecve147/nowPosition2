package p101d.p129g.p159f.p184i.p185a;

import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.i.a.d */
abstract class C5887d {

    /* renamed from: a */
    private static final C5887d[] f16285a = {new C5888a(), new C5889b(), new C5890c(), new C5891d(), new C5892e(), new C5893f(), new C5894g(), new C5895h()};

    /* renamed from: d.g.f.i.a.d$a */
    private static final class C5888a extends C5887d {
        private C5888a() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15653a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    /* renamed from: d.g.f.i.a.d$b */
    private static final class C5889b extends C5887d {
        private C5889b() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15653a(int i, int i2) {
            return (i & 1) == 0;
        }
    }

    /* renamed from: d.g.f.i.a.d$c */
    private static final class C5890c extends C5887d {
        private C5890c() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15653a(int i, int i2) {
            return i2 % 3 == 0;
        }
    }

    /* renamed from: d.g.f.i.a.d$d */
    private static final class C5891d extends C5887d {
        private C5891d() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15653a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    }

    /* renamed from: d.g.f.i.a.d$e */
    private static final class C5892e extends C5887d {
        private C5892e() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15653a(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    }

    /* renamed from: d.g.f.i.a.d$f */
    private static final class C5893f extends C5887d {
        private C5893f() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15653a(int i, int i2) {
            int i3 = i * i2;
            return (i3 & 1) + (i3 % 3) == 0;
        }
    }

    /* renamed from: d.g.f.i.a.d$g */
    private static final class C5894g extends C5887d {
        private C5894g() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15653a(int i, int i2) {
            int i3 = i * i2;
            return (((i3 & 1) + (i3 % 3)) & 1) == 0;
        }
    }

    /* renamed from: d.g.f.i.a.d$h */
    private static final class C5895h extends C5887d {
        private C5895h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15653a(int i, int i2) {
            return ((((i + i2) & 1) + ((i * i2) % 3)) & 1) == 0;
        }
    }

    private C5887d() {
    }

    /* renamed from: a */
    static C5887d m22318a(int i) {
        if (i >= 0 && i <= 7) {
            return f16285a[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15652a(C5775b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo15653a(i2, i3)) {
                    bVar.mo15386a(i3, i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo15653a(int i, int i2);
}
