package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.lk */
public final class C3266lk extends C2577Om<C3266lk, C3267a> implements C3556vn {
    private static volatile C2293En<C3266lk> zzakh;
    /* access modifiers changed from: private */
    public static final C3266lk zzdjk = new C3266lk();
    private C3323nk zzdjj;

    /* renamed from: com.google.android.gms.internal.ads.lk$a */
    public static final class C3267a extends C2577Om.C2578a<C3266lk, C3267a> implements C3556vn {
        private C3267a() {
            super(C3266lk.zzdjk);
        }

        /* synthetic */ C3267a(C3295mk mkVar) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C3266lk.class, zzdjk);
    }

    private C3266lk() {
    }

    /* renamed from: a */
    public static C3266lk m12979a(C3150hm hmVar) {
        return (C3266lk) C2577Om.m10796a(zzdjk, hmVar);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.lk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3266lk> en;
        switch (C3295mk.f9795a[i - 1]) {
            case 1:
                return new C3266lk();
            case 2:
                return new C3267a((C3295mk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdjk, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\t", new Object[]{"zzdjj"});
            case 4:
                return zzdjk;
            case 5:
                C2293En<C3266lk> en2 = zzakh;
                C2293En<C3266lk> en3 = en2;
                if (en2 == null) {
                    synchronized (C3266lk.class) {
                        C2293En<C3266lk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdjk);
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
    public final C3323nk mo9683l() {
        C3323nk nkVar = this.zzdjj;
        return nkVar == null ? C3323nk.m13154o() : nkVar;
    }
}
