package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Lk */
public final class C2489Lk extends C2577Om<C2489Lk, C2490a> implements C3556vn {
    private static volatile C2293En<C2489Lk> zzakh;
    /* access modifiers changed from: private */
    public static final C2489Lk zzdlk = new C2489Lk();
    private String zzdks = "";
    private C3150hm zzdkt = C3150hm.f9434a;
    private int zzdlj;

    /* renamed from: com.google.android.gms.internal.ads.Lk$a */
    public static final class C2490a extends C2577Om.C2578a<C2489Lk, C2490a> implements C3556vn {
        private C2490a() {
            super(C2489Lk.zzdlk);
        }

        /* synthetic */ C2490a(C2518Mk mk) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2489Lk.class, zzdlk);
    }

    private C2489Lk() {
    }

    /* renamed from: n */
    public static C2489Lk m10533n() {
        return zzdlk;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Lk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2489Lk> en;
        switch (C2518Mk.f7583a[i - 1]) {
            case 1:
                return new C2489Lk();
            case 2:
                return new C2490a((C2518Mk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdlk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzdks", "zzdkt", "zzdlj"});
            case 4:
                return zzdlk;
            case 5:
                C2293En<C2489Lk> en2 = zzakh;
                C2293En<C2489Lk> en3 = en2;
                if (en2 == null) {
                    synchronized (C2489Lk.class) {
                        C2293En<C2489Lk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdlk);
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
    public final String mo8493l() {
        return this.zzdks;
    }

    /* renamed from: m */
    public final C3150hm mo8494m() {
        return this.zzdkt;
    }
}
