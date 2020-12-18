package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Tj */
public final class C2723Tj extends C2577Om<C2723Tj, C2724a> implements C3556vn {
    private static volatile C2293En<C2723Tj> zzakh;
    /* access modifiers changed from: private */
    public static final C2723Tj zzdiu = new C2723Tj();
    private int zzdit;

    /* renamed from: com.google.android.gms.internal.ads.Tj$a */
    public static final class C2724a extends C2577Om.C2578a<C2723Tj, C2724a> implements C3556vn {
        private C2724a() {
            super(C2723Tj.zzdiu);
        }

        /* synthetic */ C2724a(C2752Uj uj) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2723Tj.class, zzdiu);
    }

    private C2723Tj() {
    }

    /* renamed from: m */
    public static C2723Tj m11275m() {
        return zzdiu;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Tj>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2723Tj> en;
        switch (C2752Uj.f8387a[i - 1]) {
            case 1:
                return new C2723Tj();
            case 2:
                return new C2724a((C2752Uj) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdiu, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzdit"});
            case 4:
                return zzdiu;
            case 5:
                C2293En<C2723Tj> en2 = zzakh;
                C2293En<C2723Tj> en3 = en2;
                if (en2 == null) {
                    synchronized (C2723Tj.class) {
                        C2293En<C2723Tj> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdiu);
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
    public final int mo8896l() {
        return this.zzdit;
    }
}
