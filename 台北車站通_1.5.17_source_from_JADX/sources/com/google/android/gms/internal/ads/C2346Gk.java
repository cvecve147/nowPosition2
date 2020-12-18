package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Gk */
public final class C2346Gk extends C2577Om<C2346Gk, C2347a> implements C3556vn {
    private static volatile C2293En<C2346Gk> zzakh;
    /* access modifiers changed from: private */
    public static final C2346Gk zzdkv = new C2346Gk();
    private String zzdks = "";
    private C3150hm zzdkt = C3150hm.f9434a;
    private int zzdku;

    /* renamed from: com.google.android.gms.internal.ads.Gk$a */
    public static final class C2347a extends C2577Om.C2578a<C2346Gk, C2347a> implements C3556vn {
        private C2347a() {
            super(C2346Gk.zzdkv);
        }

        /* synthetic */ C2347a(C2376Hk hk) {
            this();
        }

        /* renamed from: a */
        public final C2347a mo8215a(C2348b bVar) {
            mo8628j();
            ((C2346Gk) this.f8044b).m9953a(bVar);
            return this;
        }

        /* renamed from: a */
        public final C2347a mo8216a(C3150hm hmVar) {
            mo8628j();
            ((C2346Gk) this.f8044b).m9957a(hmVar);
            return this;
        }

        /* renamed from: a */
        public final C2347a mo8217a(String str) {
            mo8628j();
            ((C2346Gk) this.f8044b).m9958a(str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.Gk$b */
    public enum C2348b implements C2671Rm {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: g */
        private static final C2698Sm<C2348b> f7077g = null;

        /* renamed from: i */
        private final int f7079i;

        static {
            f7077g = new C2404Ik();
        }

        private C2348b(int i) {
            this.f7079i = i;
        }

        /* renamed from: a */
        public static C2348b m9969a(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        /* renamed from: d */
        public final int mo8218d() {
            if (this != UNRECOGNIZED) {
                return this.f7079i;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C2577Om.m10803a(C2346Gk.class, zzdkv);
    }

    private C2346Gk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9953a(C2348b bVar) {
        if (bVar != null) {
            this.zzdku = bVar.mo8218d();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9957a(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdkt = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9958a(String str) {
        if (str != null) {
            this.zzdks = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: o */
    public static C2347a m9959o() {
        return (C2347a) zzdkv.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* renamed from: p */
    public static C2346Gk m9960p() {
        return zzdkv;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Gk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2346Gk> en;
        switch (C2376Hk.f7182a[i - 1]) {
            case 1:
                return new C2346Gk();
            case 2:
                return new C2347a((C2376Hk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdkv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzdks", "zzdkt", "zzdku"});
            case 4:
                return zzdkv;
            case 5:
                C2293En<C2346Gk> en2 = zzakh;
                C2293En<C2346Gk> en3 = en2;
                if (en2 == null) {
                    synchronized (C2346Gk.class) {
                        C2293En<C2346Gk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdkv);
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

    /* renamed from: l */
    public final String mo8212l() {
        return this.zzdks;
    }

    /* renamed from: m */
    public final C3150hm mo8213m() {
        return this.zzdkt;
    }

    /* renamed from: n */
    public final C2348b mo8214n() {
        C2348b a = C2348b.m9969a(this.zzdku);
        return a == null ? C2348b.UNRECOGNIZED : a;
    }
}
