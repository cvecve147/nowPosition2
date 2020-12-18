package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Tk */
public final class C2725Tk extends C2577Om<C2725Tk, C2726a> implements C3556vn {
    private static volatile C2293En<C2725Tk> zzakh;
    /* access modifiers changed from: private */
    public static final C2725Tk zzdmc = new C2725Tk();
    private int zzdih;
    private C2781Vk zzdmb;

    /* renamed from: com.google.android.gms.internal.ads.Tk$a */
    public static final class C2726a extends C2577Om.C2578a<C2725Tk, C2726a> implements C3556vn {
        private C2726a() {
            super(C2725Tk.zzdmc);
        }

        /* synthetic */ C2726a(C2753Uk uk) {
            this();
        }

        /* renamed from: a */
        public final C2726a mo8899a(int i) {
            mo8628j();
            ((C2725Tk) this.f8044b).m11283b(0);
            return this;
        }

        /* renamed from: a */
        public final C2726a mo8900a(C2781Vk vk) {
            mo8628j();
            ((C2725Tk) this.f8044b).m11282a(vk);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C2725Tk.class, zzdmc);
    }

    private C2725Tk() {
    }

    /* renamed from: a */
    public static C2725Tk m11279a(C3150hm hmVar) {
        return (C2725Tk) C2577Om.m10796a(zzdmc, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11282a(C2781Vk vk) {
        if (vk != null) {
            this.zzdmb = vk;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11283b(int i) {
        this.zzdih = i;
    }

    /* renamed from: o */
    public static C2726a m11285o() {
        return (C2726a) zzdmc.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Tk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2725Tk> en;
        switch (C2753Uk.f8388a[i - 1]) {
            case 1:
                return new C2725Tk();
            case 2:
                return new C2726a((C2753Uk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdmc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzdih", "zzdmb"});
            case 4:
                return zzdmc;
            case 5:
                C2293En<C2725Tk> en2 = zzakh;
                C2293En<C2725Tk> en3 = en2;
                if (en2 == null) {
                    synchronized (C2725Tk.class) {
                        C2293En<C2725Tk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdmc);
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
    public final int mo8897l() {
        return this.zzdih;
    }

    /* renamed from: n */
    public final C2781Vk mo8898n() {
        C2781Vk vk = this.zzdmb;
        return vk == null ? C2781Vk.m11437m() : vk;
    }
}
