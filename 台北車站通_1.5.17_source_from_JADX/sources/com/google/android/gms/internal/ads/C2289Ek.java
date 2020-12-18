package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Ek */
public final class C2289Ek extends C2577Om<C2289Ek, C2290a> implements C3556vn {
    private static volatile C2293En<C2289Ek> zzakh;
    /* access modifiers changed from: private */
    public static final C2289Ek zzdkr = new C2289Ek();
    private int zzdkp;
    private int zzdkq;

    /* renamed from: com.google.android.gms.internal.ads.Ek$a */
    public static final class C2290a extends C2577Om.C2578a<C2289Ek, C2290a> implements C3556vn {
        private C2290a() {
            super(C2289Ek.zzdkr);
        }

        /* synthetic */ C2290a(C2318Fk fk) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2289Ek.class, zzdkr);
    }

    private C2289Ek() {
    }

    /* renamed from: n */
    public static C2289Ek m9703n() {
        return zzdkr;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Ek>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2289Ek> en;
        switch (C2318Fk.f6998a[i - 1]) {
            case 1:
                return new C2289Ek();
            case 2:
                return new C2290a((C2318Fk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdkr, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzdkp", "zzdkq"});
            case 4:
                return zzdkr;
            case 5:
                C2293En<C2289Ek> en2 = zzakh;
                C2293En<C2289Ek> en3 = en2;
                if (en2 == null) {
                    synchronized (C2289Ek.class) {
                        C2293En<C2289Ek> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdkr);
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
    public final C3637yk mo8041l() {
        C3637yk a = C3637yk.m14591a(this.zzdkp);
        return a == null ? C3637yk.UNRECOGNIZED : a;
    }

    /* renamed from: m */
    public final int mo8042m() {
        return this.zzdkq;
    }
}
