package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Nj */
public final class C2545Nj extends C2577Om<C2545Nj, C2546a> implements C3556vn {
    private static volatile C2293En<C2545Nj> zzakh;
    /* access modifiers changed from: private */
    public static final C2545Nj zzdin = new C2545Nj();
    private C2664Rj zzdil;
    private C2232Ck zzdim;

    /* renamed from: com.google.android.gms.internal.ads.Nj$a */
    public static final class C2546a extends C2577Om.C2578a<C2545Nj, C2546a> implements C3556vn {
        private C2546a() {
            super(C2545Nj.zzdin);
        }

        /* synthetic */ C2546a(C2574Oj oj) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2545Nj.class, zzdin);
    }

    private C2545Nj() {
    }

    /* renamed from: a */
    public static C2545Nj m10651a(C3150hm hmVar) {
        return (C2545Nj) C2577Om.m10796a(zzdin, hmVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Nj>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2545Nj> en;
        switch (C2574Oj.f8041a[i - 1]) {
            case 1:
                return new C2545Nj();
            case 2:
                return new C2546a((C2574Oj) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdin, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzdil", "zzdim"});
            case 4:
                return zzdin;
            case 5:
                C2293En<C2545Nj> en2 = zzakh;
                C2293En<C2545Nj> en3 = en2;
                if (en2 == null) {
                    synchronized (C2545Nj.class) {
                        C2293En<C2545Nj> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdin);
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
    public final C2664Rj mo8567l() {
        C2664Rj rj = this.zzdil;
        return rj == null ? C2664Rj.m11053n() : rj;
    }

    /* renamed from: m */
    public final C2232Ck mo8568m() {
        C2232Ck ck = this.zzdim;
        return ck == null ? C2232Ck.m9546n() : ck;
    }
}
