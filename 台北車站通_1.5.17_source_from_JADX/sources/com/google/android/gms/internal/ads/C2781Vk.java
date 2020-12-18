package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Vk */
public final class C2781Vk extends C2577Om<C2781Vk, C2782a> implements C3556vn {
    private static volatile C2293En<C2781Vk> zzakh;
    /* access modifiers changed from: private */
    public static final C2781Vk zzdme = new C2781Vk();
    private String zzdmd = "";

    /* renamed from: com.google.android.gms.internal.ads.Vk$a */
    public static final class C2782a extends C2577Om.C2578a<C2781Vk, C2782a> implements C3556vn {
        private C2782a() {
            super(C2781Vk.zzdme);
        }

        /* synthetic */ C2782a(C2809Wk wk) {
            this();
        }
    }

    static {
        C2577Om.m10803a(C2781Vk.class, zzdme);
    }

    private C2781Vk() {
    }

    /* renamed from: a */
    public static C2781Vk m11436a(C3150hm hmVar) {
        return (C2781Vk) C2577Om.m10796a(zzdme, hmVar);
    }

    /* renamed from: m */
    public static C2781Vk m11437m() {
        return zzdme;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Vk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2781Vk> en;
        switch (C2809Wk.f8536a[i - 1]) {
            case 1:
                return new C2781Vk();
            case 2:
                return new C2782a((C2809Wk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdme, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzdmd"});
            case 4:
                return zzdme;
            case 5:
                C2293En<C2781Vk> en2 = zzakh;
                C2293En<C2781Vk> en3 = en2;
                if (en2 == null) {
                    synchronized (C2781Vk.class) {
                        C2293En<C2781Vk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdme);
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
    public final String mo8963l() {
        return this.zzdmd;
    }
}
