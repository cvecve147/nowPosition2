package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Ck */
public final class C2232Ck extends C2577Om<C2232Ck, C2233a> implements C3556vn {
    private static volatile C2293En<C2232Ck> zzakh;
    /* access modifiers changed from: private */
    public static final C2232Ck zzdko = new C2232Ck();
    private int zzdir;
    private C2289Ek zzdkm;

    /* renamed from: com.google.android.gms.internal.ads.Ck$a */
    public static final class C2233a extends C2577Om.C2578a<C2232Ck, C2233a> implements C3556vn {
        private C2233a() {
            super(C2232Ck.zzdko);
        }

        /* synthetic */ C2233a(C2261Dk dk) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2232Ck.class, zzdko);
    }

    private C2232Ck() {
    }

    /* renamed from: a */
    public static C2232Ck m9545a(C3150hm hmVar) {
        return (C2232Ck) C2577Om.m10796a(zzdko, hmVar);
    }

    /* renamed from: n */
    public static C2232Ck m9546n() {
        return zzdko;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Ck>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2232Ck> en;
        switch (C2261Dk.f6903a[i - 1]) {
            case 1:
                return new C2232Ck();
            case 2:
                return new C2233a((C2261Dk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdko, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzdkm", "zzdir"});
            case 4:
                return zzdko;
            case 5:
                C2293En<C2232Ck> en2 = zzakh;
                C2293En<C2232Ck> en3 = en2;
                if (en2 == null) {
                    synchronized (C2232Ck.class) {
                        C2293En<C2232Ck> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdko);
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
    public final int mo7932l() {
        return this.zzdir;
    }

    /* renamed from: m */
    public final C2289Ek mo7933m() {
        C2289Ek ek = this.zzdkm;
        return ek == null ? C2289Ek.m9703n() : ek;
    }
}
