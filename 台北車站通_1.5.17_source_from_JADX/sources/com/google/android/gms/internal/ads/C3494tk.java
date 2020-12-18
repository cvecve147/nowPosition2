package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.tk */
public final class C3494tk extends C2577Om<C3494tk, C3495a> implements C3556vn {
    private static volatile C2293En<C3494tk> zzakh;
    /* access modifiers changed from: private */
    public static final C3494tk zzdjx = new C3494tk();
    private int zzdju;
    private int zzdjv;
    private C3150hm zzdjw = C3150hm.f9434a;

    /* renamed from: com.google.android.gms.internal.ads.tk$a */
    public static final class C3495a extends C2577Om.C2578a<C3494tk, C3495a> implements C3556vn {
        private C3495a() {
            super(C3494tk.zzdjx);
        }

        /* synthetic */ C3495a(C3523uk ukVar) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C3494tk.class, zzdjx);
    }

    private C3494tk() {
    }

    /* renamed from: o */
    public static C3494tk m13882o() {
        return zzdjx;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.tk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3494tk> en;
        switch (C3523uk.f10301a[i - 1]) {
            case 1:
                return new C3494tk();
            case 2:
                return new C3495a((C3523uk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdjx, "\u0000\u0003\u0000\u0000\u0001\u000b\u000b\f\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzdju", "zzdjv", "zzdjw"});
            case 4:
                return zzdjx;
            case 5:
                C2293En<C3494tk> en2 = zzakh;
                C2293En<C3494tk> en3 = en2;
                if (en2 == null) {
                    synchronized (C3494tk.class) {
                        C2293En<C3494tk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdjx);
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
    public final C3553vk mo10052l() {
        C3553vk a = C3553vk.m14283a(this.zzdju);
        return a == null ? C3553vk.UNRECOGNIZED : a;
    }

    /* renamed from: m */
    public final C3637yk mo10053m() {
        C3637yk a = C3637yk.m14591a(this.zzdjv);
        return a == null ? C3637yk.UNRECOGNIZED : a;
    }

    /* renamed from: n */
    public final C3150hm mo10054n() {
        return this.zzdjw;
    }
}
