package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.fk */
public final class C3091fk extends C2577Om<C3091fk, C3092a> implements C3556vn {
    private static volatile C2293En<C3091fk> zzakh;
    /* access modifiers changed from: private */
    public static final C3091fk zzdjb = new C3091fk();
    private int zzdih;
    private C3150hm zzdip = C3150hm.f9434a;

    /* renamed from: com.google.android.gms.internal.ads.fk$a */
    public static final class C3092a extends C2577Om.C2578a<C3091fk, C3092a> implements C3556vn {
        private C3092a() {
            super(C3091fk.zzdjb);
        }

        /* synthetic */ C3092a(C3120gk gkVar) {
            this();
        }

        /* renamed from: a */
        public final C3092a mo9427a(int i) {
            mo8628j();
            ((C3091fk) this.f8044b).m12333b(0);
            return this;
        }

        /* renamed from: a */
        public final C3092a mo9428a(C3150hm hmVar) {
            mo8628j();
            ((C3091fk) this.f8044b).m12334b(hmVar);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C3091fk.class, zzdjb);
    }

    private C3091fk() {
    }

    /* renamed from: a */
    public static C3091fk m12330a(C3150hm hmVar) {
        return (C3091fk) C2577Om.m10796a(zzdjb, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12333b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12334b(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdip = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: n */
    public static C3092a m12335n() {
        return (C3092a) zzdjb.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.fk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3091fk> en;
        switch (C3120gk.f9377a[i - 1]) {
            case 1:
                return new C3091fk();
            case 2:
                return new C3092a((C3120gk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdjb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzdih", "zzdip"});
            case 4:
                return zzdjb;
            case 5:
                C2293En<C3091fk> en2 = zzakh;
                C2293En<C3091fk> en3 = en2;
                if (en2 == null) {
                    synchronized (C3091fk.class) {
                        C2293En<C3091fk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdjb);
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
    public final int mo9425l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C3150hm mo9426m() {
        return this.zzdip;
    }
}
