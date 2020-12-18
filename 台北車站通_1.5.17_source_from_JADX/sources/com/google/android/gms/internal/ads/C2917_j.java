package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads._j */
public final class C2917_j extends C2577Om<C2917_j, C2918a> implements C3556vn {
    private static volatile C2293En<C2917_j> zzakh;
    /* access modifiers changed from: private */
    public static final C2917_j zzdiy = new C2917_j();
    private int zzdit;

    /* renamed from: com.google.android.gms.internal.ads._j$a */
    public static final class C2918a extends C2577Om.C2578a<C2917_j, C2918a> implements C3556vn {
        private C2918a() {
            super(C2917_j.zzdiy);
        }

        /* synthetic */ C2918a(C2948ak akVar) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2917_j.class, zzdiy);
    }

    private C2917_j() {
    }

    /* renamed from: m */
    public static C2917_j m11847m() {
        return zzdiy;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads._j>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2917_j> en;
        switch (C2948ak.f8912a[i - 1]) {
            case 1:
                return new C2917_j();
            case 2:
                return new C2918a((C2948ak) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdiy, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzdit"});
            case 4:
                return zzdiy;
            case 5:
                C2293En<C2917_j> en2 = zzakh;
                C2293En<C2917_j> en3 = en2;
                if (en2 == null) {
                    synchronized (C2917_j.class) {
                        C2293En<C2917_j> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdiy);
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
    public final int mo9166l() {
        return this.zzdit;
    }
}
