package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Yj */
public final class C2863Yj extends C2577Om<C2863Yj, C2864a> implements C3556vn {
    private static volatile C2293En<C2863Yj> zzakh;
    /* access modifiers changed from: private */
    public static final C2863Yj zzdix = new C2863Yj();
    private int zzdir;
    private C2917_j zzdiv;

    /* renamed from: com.google.android.gms.internal.ads.Yj$a */
    public static final class C2864a extends C2577Om.C2578a<C2863Yj, C2864a> implements C3556vn {
        private C2864a() {
            super(C2863Yj.zzdix);
        }

        /* synthetic */ C2864a(C2891Zj zj) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2863Yj.class, zzdix);
    }

    private C2863Yj() {
    }

    /* renamed from: a */
    public static C2863Yj m11625a(C3150hm hmVar) {
        return (C2863Yj) C2577Om.m10796a(zzdix, hmVar);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Yj>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2863Yj> en;
        switch (C2891Zj.f8690a[i - 1]) {
            case 1:
                return new C2863Yj();
            case 2:
                return new C2864a((C2891Zj) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdix, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzdiv", "zzdir"});
            case 4:
                return zzdix;
            case 5:
                C2293En<C2863Yj> en2 = zzakh;
                C2293En<C2863Yj> en3 = en2;
                if (en2 == null) {
                    synchronized (C2863Yj.class) {
                        C2293En<C2863Yj> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdix);
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
    public final int mo9072l() {
        return this.zzdir;
    }

    /* renamed from: m */
    public final C2917_j mo9073m() {
        C2917_j _jVar = this.zzdiv;
        return _jVar == null ? C2917_j.m11847m() : _jVar;
    }
}
