package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Rj */
public final class C2664Rj extends C2577Om<C2664Rj, C2665a> implements C3556vn {
    private static volatile C2293En<C2664Rj> zzakh;
    /* access modifiers changed from: private */
    public static final C2664Rj zzdis = new C2664Rj();
    private C2723Tj zzdio;
    private int zzdir;

    /* renamed from: com.google.android.gms.internal.ads.Rj$a */
    public static final class C2665a extends C2577Om.C2578a<C2664Rj, C2665a> implements C3556vn {
        private C2665a() {
            super(C2664Rj.zzdis);
        }

        /* synthetic */ C2665a(C2695Sj sj) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2664Rj.class, zzdis);
    }

    private C2664Rj() {
    }

    /* renamed from: a */
    public static C2664Rj m11052a(C3150hm hmVar) {
        return (C2664Rj) C2577Om.m10796a(zzdis, hmVar);
    }

    /* renamed from: n */
    public static C2664Rj m11053n() {
        return zzdis;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Rj>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2664Rj> en;
        switch (C2695Sj.f8276a[i - 1]) {
            case 1:
                return new C2664Rj();
            case 2:
                return new C2665a((C2695Sj) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdis, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzdio", "zzdir"});
            case 4:
                return zzdis;
            case 5:
                C2293En<C2664Rj> en2 = zzakh;
                C2293En<C2664Rj> en3 = en2;
                if (en2 == null) {
                    synchronized (C2664Rj.class) {
                        C2293En<C2664Rj> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdis);
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
    public final int mo8784l() {
        return this.zzdir;
    }

    /* renamed from: m */
    public final C2723Tj mo8785m() {
        C2723Tj tj = this.zzdio;
        return tj == null ? C2723Tj.m11275m() : tj;
    }
}
