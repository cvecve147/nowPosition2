package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads._k */
public final class C2919_k extends C2577Om<C2919_k, C2920a> implements C3556vn {
    private static volatile C2293En<C2919_k> zzakh;
    /* access modifiers changed from: private */
    public static final C2919_k zzdmj = new C2919_k();
    private String zzdmh = "";
    private C2489Lk zzdmi;

    /* renamed from: com.google.android.gms.internal.ads._k$a */
    public static final class C2920a extends C2577Om.C2578a<C2919_k, C2920a> implements C3556vn {
        private C2920a() {
            super(C2919_k.zzdmj);
        }

        /* synthetic */ C2920a(C2949al alVar) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2919_k.class, zzdmj);
    }

    private C2919_k() {
    }

    /* renamed from: a */
    public static C2919_k m11851a(C3150hm hmVar) {
        return (C2919_k) C2577Om.m10796a(zzdmj, hmVar);
    }

    /* renamed from: n */
    public static C2919_k m11852n() {
        return zzdmj;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads._k>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2919_k> en;
        switch (C2949al.f8913a[i - 1]) {
            case 1:
                return new C2919_k();
            case 2:
                return new C2920a((C2949al) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdmj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzdmh", "zzdmi"});
            case 4:
                return zzdmj;
            case 5:
                C2293En<C2919_k> en2 = zzakh;
                C2293En<C2919_k> en3 = en2;
                if (en2 == null) {
                    synchronized (C2919_k.class) {
                        C2293En<C2919_k> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdmj);
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
    public final String mo9167l() {
        return this.zzdmh;
    }

    /* renamed from: m */
    public final C2489Lk mo9168m() {
        C2489Lk lk = this.zzdmi;
        return lk == null ? C2489Lk.m10533n() : lk;
    }
}
