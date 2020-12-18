package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.bk */
public final class C2976bk extends C2577Om<C2976bk, C2977a> implements C3556vn {
    private static volatile C2293En<C2976bk> zzakh;
    /* access modifiers changed from: private */
    public static final C2976bk zzdiz = new C2976bk();
    private int zzdih;
    private C3150hm zzdip = C3150hm.f9434a;

    /* renamed from: com.google.android.gms.internal.ads.bk$a */
    public static final class C2977a extends C2577Om.C2578a<C2976bk, C2977a> implements C3556vn {
        private C2977a() {
            super(C2976bk.zzdiz);
        }

        /* synthetic */ C2977a(C3005ck ckVar) {
            this();
        }

        /* renamed from: a */
        public final C2977a mo9245a(int i) {
            mo8628j();
            ((C2976bk) this.f8044b).m12007b(0);
            return this;
        }

        /* renamed from: a */
        public final C2977a mo9246a(C3150hm hmVar) {
            mo8628j();
            ((C2976bk) this.f8044b).m12008b(hmVar);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C2976bk.class, zzdiz);
    }

    private C2976bk() {
    }

    /* renamed from: a */
    public static C2976bk m12004a(C3150hm hmVar) {
        return (C2976bk) C2577Om.m10796a(zzdiz, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12007b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12008b(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdip = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: n */
    public static C2977a m12009n() {
        return (C2977a) zzdiz.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.bk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2976bk> en;
        switch (C3005ck.f8996a[i - 1]) {
            case 1:
                return new C2976bk();
            case 2:
                return new C2977a((C3005ck) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdiz, "\u0000\u0002\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzdih", "zzdip"});
            case 4:
                return zzdiz;
            case 5:
                C2293En<C2976bk> en2 = zzakh;
                C2293En<C2976bk> en3 = en2;
                if (en2 == null) {
                    synchronized (C2976bk.class) {
                        C2293En<C2976bk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdiz);
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
    public final int mo9243l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C3150hm mo9244m() {
        return this.zzdip;
    }
}
