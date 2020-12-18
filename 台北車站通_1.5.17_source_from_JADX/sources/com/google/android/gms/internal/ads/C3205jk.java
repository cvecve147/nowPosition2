package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.jk */
public final class C3205jk extends C2577Om<C3205jk, C3206a> implements C3556vn {
    private static volatile C2293En<C3205jk> zzakh;
    /* access modifiers changed from: private */
    public static final C3205jk zzdji = new C3205jk();
    private C2489Lk zzdjh;

    /* renamed from: com.google.android.gms.internal.ads.jk$a */
    public static final class C3206a extends C2577Om.C2578a<C3205jk, C3206a> implements C3556vn {
        private C3206a() {
            super(C3205jk.zzdji);
        }

        /* synthetic */ C3206a(C3238kk kkVar) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C3205jk.class, zzdji);
    }

    private C3205jk() {
    }

    /* renamed from: m */
    public static C3205jk m12714m() {
        return zzdji;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.jk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3205jk> en;
        switch (C3238kk.f9697a[i - 1]) {
            case 1:
                return new C3205jk();
            case 2:
                return new C3206a((C3238kk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdji, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0003\u0000\u0000\u0000\u0002\t", new Object[]{"zzdjh"});
            case 4:
                return zzdji;
            case 5:
                C2293En<C3205jk> en2 = zzakh;
                C2293En<C3205jk> en3 = en2;
                if (en2 == null) {
                    synchronized (C3205jk.class) {
                        C2293En<C3205jk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdji);
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
    public final C2489Lk mo9595l() {
        C2489Lk lk = this.zzdjh;
        return lk == null ? C2489Lk.m10533n() : lk;
    }
}
