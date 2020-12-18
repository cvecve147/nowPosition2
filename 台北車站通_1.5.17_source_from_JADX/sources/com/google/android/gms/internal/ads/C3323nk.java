package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.nk */
public final class C3323nk extends C2577Om<C3323nk, C3324a> implements C3556vn {
    private static volatile C2293En<C3323nk> zzakh;
    /* access modifiers changed from: private */
    public static final C3323nk zzdjo = new C3323nk();
    private C3494tk zzdjl;
    private C3205jk zzdjm;
    private int zzdjn;

    /* renamed from: com.google.android.gms.internal.ads.nk$a */
    public static final class C3324a extends C2577Om.C2578a<C3323nk, C3324a> implements C3556vn {
        private C3324a() {
            super(C3323nk.zzdjo);
        }

        /* synthetic */ C3324a(C3352ok okVar) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C3323nk.class, zzdjo);
    }

    private C3323nk() {
    }

    /* renamed from: o */
    public static C3323nk m13154o() {
        return zzdjo;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.nk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3323nk> en;
        switch (C3352ok.f9960a[i - 1]) {
            case 1:
                return new C3323nk();
            case 2:
                return new C3324a((C3352ok) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdjo, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzdjl", "zzdjm", "zzdjn"});
            case 4:
                return zzdjo;
            case 5:
                C2293En<C3323nk> en2 = zzakh;
                C2293En<C3323nk> en3 = en2;
                if (en2 == null) {
                    synchronized (C3323nk.class) {
                        C2293En<C3323nk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdjo);
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
    public final C3494tk mo9789l() {
        C3494tk tkVar = this.zzdjl;
        return tkVar == null ? C3494tk.m13882o() : tkVar;
    }

    /* renamed from: m */
    public final C3205jk mo9790m() {
        C3205jk jkVar = this.zzdjm;
        return jkVar == null ? C3205jk.m12714m() : jkVar;
    }

    /* renamed from: n */
    public final C3148hk mo9791n() {
        C3148hk a = C3148hk.m12533a(this.zzdjn);
        return a == null ? C3148hk.UNRECOGNIZED : a;
    }
}
