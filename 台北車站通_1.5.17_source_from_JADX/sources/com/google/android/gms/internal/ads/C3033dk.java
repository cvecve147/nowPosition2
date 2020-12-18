package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.dk */
public final class C3033dk extends C2577Om<C3033dk, C3034a> implements C3556vn {
    private static volatile C2293En<C3033dk> zzakh;
    /* access modifiers changed from: private */
    public static final C3033dk zzdja = new C3033dk();
    private int zzdir;

    /* renamed from: com.google.android.gms.internal.ads.dk$a */
    public static final class C3034a extends C2577Om.C2578a<C3033dk, C3034a> implements C3556vn {
        private C3034a() {
            super(C3033dk.zzdja);
        }

        /* synthetic */ C3034a(C3063ek ekVar) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C3033dk.class, zzdja);
    }

    private C3033dk() {
    }

    /* renamed from: a */
    public static C3033dk m12158a(C3150hm hmVar) {
        return (C3033dk) C2577Om.m10796a(zzdja, hmVar);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.dk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3033dk> en;
        switch (C3063ek.f9103a[i - 1]) {
            case 1:
                return new C3033dk();
            case 2:
                return new C3034a((C3063ek) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdja, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0003\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzdir"});
            case 4:
                return zzdja;
            case 5:
                C2293En<C3033dk> en2 = zzakh;
                C2293En<C3033dk> en3 = en2;
                if (en2 == null) {
                    synchronized (C3033dk.class) {
                        C2293En<C3033dk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdja);
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
    public final int mo9315l() {
        return this.zzdir;
    }
}
