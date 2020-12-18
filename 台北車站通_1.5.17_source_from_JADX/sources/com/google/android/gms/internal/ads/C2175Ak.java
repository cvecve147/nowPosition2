package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Ak */
public final class C2175Ak extends C2577Om<C2175Ak, C2176a> implements C3556vn {
    private static volatile C2293En<C2175Ak> zzakh;
    /* access modifiers changed from: private */
    public static final C2175Ak zzdkn = new C2175Ak();
    private int zzdih;
    private C3150hm zzdip = C3150hm.f9434a;
    private C2289Ek zzdkm;

    /* renamed from: com.google.android.gms.internal.ads.Ak$a */
    public static final class C2176a extends C2577Om.C2578a<C2175Ak, C2176a> implements C3556vn {
        private C2176a() {
            super(C2175Ak.zzdkn);
        }

        /* synthetic */ C2176a(C2204Bk bk) {
            this();
        }

        /* renamed from: a */
        public final C2176a mo7825a(int i) {
            mo8628j();
            ((C2175Ak) this.f8044b).m9349b(0);
            return this;
        }

        /* renamed from: a */
        public final C2176a mo7826a(C2289Ek ek) {
            mo8628j();
            ((C2175Ak) this.f8044b).m9348a(ek);
            return this;
        }

        /* renamed from: a */
        public final C2176a mo7827a(C3150hm hmVar) {
            mo8628j();
            ((C2175Ak) this.f8044b).m9350b(hmVar);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C2175Ak.class, zzdkn);
    }

    private C2175Ak() {
    }

    /* renamed from: a */
    public static C2175Ak m9344a(C3150hm hmVar) {
        return (C2175Ak) C2577Om.m10796a(zzdkn, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9348a(C2289Ek ek) {
        if (ek != null) {
            this.zzdkm = ek;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m9349b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m9350b(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdip = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: o */
    public static C2176a m9351o() {
        return (C2176a) zzdkn.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* renamed from: p */
    public static C2175Ak m9352p() {
        return zzdkn;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Ak>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2175Ak> en;
        switch (C2204Bk.f6741a[i - 1]) {
            case 1:
                return new C2175Ak();
            case 2:
                return new C2176a((C2204Bk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdkn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzdih", "zzdkm", "zzdip"});
            case 4:
                return zzdkn;
            case 5:
                C2293En<C2175Ak> en2 = zzakh;
                C2293En<C2175Ak> en3 = en2;
                if (en2 == null) {
                    synchronized (C2175Ak.class) {
                        C2293En<C2175Ak> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdkn);
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
    public final int mo7822l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C3150hm mo7823m() {
        return this.zzdip;
    }

    /* renamed from: n */
    public final C2289Ek mo7824n() {
        C2289Ek ek = this.zzdkm;
        return ek == null ? C2289Ek.m9703n() : ek;
    }
}
