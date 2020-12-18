package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Rk */
public final class C2666Rk extends C2577Om<C2666Rk, C2667a> implements C3556vn {
    private static volatile C2293En<C2666Rk> zzakh;
    /* access modifiers changed from: private */
    public static final C2666Rk zzdlz = new C2666Rk();
    private int zzdlq;
    private int zzdlr;
    private C2728Tm<C2668b> zzdly = C2577Om.m10805k();

    /* renamed from: com.google.android.gms.internal.ads.Rk$a */
    public static final class C2667a extends C2577Om.C2578a<C2666Rk, C2667a> implements C3556vn {
        private C2667a() {
            super(C2666Rk.zzdlz);
        }

        /* synthetic */ C2667a(C2696Sk sk) {
            this();
        }

        /* renamed from: a */
        public final C2667a mo8786a(int i) {
            mo8628j();
            ((C2666Rk) this.f8044b).m11061b(i);
            return this;
        }

        /* renamed from: a */
        public final C2667a mo8787a(C2668b bVar) {
            mo8628j();
            ((C2666Rk) this.f8044b).m11058a(bVar);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.Rk$b */
    public static final class C2668b extends C2577Om<C2668b, C2669a> implements C3556vn {
        private static volatile C2293En<C2668b> zzakh;
        /* access modifiers changed from: private */
        public static final C2668b zzdma = new C2668b();
        private String zzdks = "";
        private int zzdlj;
        private int zzdlv;
        private int zzdlw;

        /* renamed from: com.google.android.gms.internal.ads.Rk$b$a */
        public static final class C2669a extends C2577Om.C2578a<C2668b, C2669a> implements C3556vn {
            private C2669a() {
                super(C2668b.zzdma);
            }

            /* synthetic */ C2669a(C2696Sk sk) {
                this();
            }

            /* renamed from: a */
            public final C2669a mo8788a(int i) {
                mo8628j();
                ((C2668b) this.f8044b).m11074b(i);
                return this;
            }

            /* renamed from: a */
            public final C2669a mo8789a(C2432Jk jk) {
                mo8628j();
                ((C2668b) this.f8044b).m11067a(jk);
                return this;
            }

            /* renamed from: a */
            public final C2669a mo8790a(C2978bl blVar) {
                mo8628j();
                ((C2668b) this.f8044b).m11072a(blVar);
                return this;
            }

            /* renamed from: a */
            public final C2669a mo8791a(String str) {
                mo8628j();
                ((C2668b) this.f8044b).m11073a(str);
                return this;
            }
        }

        static {
            C2577Om.m10803a(C2668b.class, zzdma);
        }

        private C2668b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m11067a(C2432Jk jk) {
            if (jk != null) {
                this.zzdlv = jk.mo8218d();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m11072a(C2978bl blVar) {
            if (blVar != null) {
                this.zzdlj = blVar.mo8218d();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m11073a(String str) {
            if (str != null) {
                this.zzdks = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m11074b(int i) {
            this.zzdlw = i;
        }

        /* renamed from: l */
        public static C2669a m11075l() {
            return (C2669a) zzdma.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
        }

        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Rk$b>] */
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo7821a(int i, Object obj, Object obj2) {
            C2293En<C2668b> en;
            switch (C2696Sk.f8277a[i - 1]) {
                case 1:
                    return new C2668b();
                case 2:
                    return new C2669a((C2696Sk) null);
                case 3:
                    return C2577Om.m10801a((C3498tn) zzdma, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzdks", "zzdlv", "zzdlw", "zzdlj"});
                case 4:
                    return zzdma;
                case 5:
                    C2293En<C2668b> en2 = zzakh;
                    C2293En<C2668b> en3 = en2;
                    if (en2 == null) {
                        synchronized (C2668b.class) {
                            C2293En<C2668b> en4 = zzakh;
                            en = en4;
                            if (en4 == null) {
                                ? bVar = new C2577Om.C2579b(zzdma);
                                zzakh = bVar;
                                en = bVar;
                            }
                        }
                        en3 = en;
                    }
                    return en3;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        C2577Om.m10803a(C2666Rk.class, zzdlz);
    }

    private C2666Rk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11058a(C2668b bVar) {
        if (bVar != null) {
            if (!this.zzdly.mo8904l()) {
                C2728Tm<C2668b> tm = this.zzdly;
                int size = tm.size();
                this.zzdly = tm.mo8232a(size == 0 ? 10 : size << 1);
            }
            this.zzdly.add(bVar);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11061b(int i) {
        this.zzdlr = i;
    }

    /* renamed from: l */
    public static C2667a m11062l() {
        return (C2667a) zzdlz.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Rk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2666Rk> en;
        switch (C2696Sk.f8277a[i - 1]) {
            case 1:
                return new C2666Rk();
            case 2:
                return new C2667a((C2696Sk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdlz, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzdlq", "zzdlr", "zzdly", C2668b.class});
            case 4:
                return zzdlz;
            case 5:
                C2293En<C2666Rk> en2 = zzakh;
                C2293En<C2666Rk> en3 = en2;
                if (en2 == null) {
                    synchronized (C2666Rk.class) {
                        C2293En<C2666Rk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdlz);
                            zzakh = bVar;
                            en = bVar;
                        }
                    }
                    en3 = en;
                }
                return en3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
