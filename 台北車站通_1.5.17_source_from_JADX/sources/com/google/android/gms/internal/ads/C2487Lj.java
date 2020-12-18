package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Lj */
public final class C2487Lj extends C2577Om<C2487Lj, C2488a> implements C3556vn {
    private static volatile C2293En<C2487Lj> zzakh;
    /* access modifiers changed from: private */
    public static final C2487Lj zzdik = new C2487Lj();
    private int zzdih;
    private C2606Pj zzdii;
    private C2175Ak zzdij;

    /* renamed from: com.google.android.gms.internal.ads.Lj$a */
    public static final class C2488a extends C2577Om.C2578a<C2487Lj, C2488a> implements C3556vn {
        private C2488a() {
            super(C2487Lj.zzdik);
        }

        /* synthetic */ C2488a(C2517Mj mj) {
            this();
        }

        /* renamed from: a */
        public final C2488a mo8490a(int i) {
            mo8628j();
            ((C2487Lj) this.f8044b).m10523b(i);
            return this;
        }

        /* renamed from: a */
        public final C2488a mo8491a(C2175Ak ak) {
            mo8628j();
            ((C2487Lj) this.f8044b).m10518a(ak);
            return this;
        }

        /* renamed from: a */
        public final C2488a mo8492a(C2606Pj pj) {
            mo8628j();
            ((C2487Lj) this.f8044b).m10522a(pj);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C2487Lj.class, zzdik);
    }

    private C2487Lj() {
    }

    /* renamed from: a */
    public static C2487Lj m10517a(C3150hm hmVar) {
        return (C2487Lj) C2577Om.m10796a(zzdik, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10518a(C2175Ak ak) {
        if (ak != null) {
            this.zzdij = ak;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10522a(C2606Pj pj) {
        if (pj != null) {
            this.zzdii = pj;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10523b(int i) {
        this.zzdih = i;
    }

    /* renamed from: o */
    public static C2488a m10524o() {
        return (C2488a) zzdik.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Lj>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2487Lj> en;
        switch (C2517Mj.f7582a[i - 1]) {
            case 1:
                return new C2487Lj();
            case 2:
                return new C2488a((C2517Mj) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdik, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzdih", "zzdii", "zzdij"});
            case 4:
                return zzdik;
            case 5:
                C2293En<C2487Lj> en2 = zzakh;
                C2293En<C2487Lj> en3 = en2;
                if (en2 == null) {
                    synchronized (C2487Lj.class) {
                        C2293En<C2487Lj> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdik);
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
    public final int mo8487l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C2606Pj mo8488m() {
        C2606Pj pj = this.zzdii;
        return pj == null ? C2606Pj.m10894p() : pj;
    }

    /* renamed from: n */
    public final C2175Ak mo8489n() {
        C2175Ak ak = this.zzdij;
        return ak == null ? C2175Ak.m9352p() : ak;
    }
}
