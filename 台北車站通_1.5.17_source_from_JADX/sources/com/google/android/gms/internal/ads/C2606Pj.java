package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Pj */
public final class C2606Pj extends C2577Om<C2606Pj, C2607a> implements C3556vn {
    private static volatile C2293En<C2606Pj> zzakh;
    /* access modifiers changed from: private */
    public static final C2606Pj zzdiq = new C2606Pj();
    private int zzdih;
    private C2723Tj zzdio;
    private C3150hm zzdip = C3150hm.f9434a;

    /* renamed from: com.google.android.gms.internal.ads.Pj$a */
    public static final class C2607a extends C2577Om.C2578a<C2606Pj, C2607a> implements C3556vn {
        private C2607a() {
            super(C2606Pj.zzdiq);
        }

        /* synthetic */ C2607a(C2637Qj qj) {
            this();
        }

        /* renamed from: a */
        public final C2607a mo8676a(int i) {
            mo8628j();
            ((C2606Pj) this.f8044b).m10891b(0);
            return this;
        }

        /* renamed from: a */
        public final C2607a mo8677a(C2723Tj tj) {
            mo8628j();
            ((C2606Pj) this.f8044b).m10890a(tj);
            return this;
        }

        /* renamed from: a */
        public final C2607a mo8678a(C3150hm hmVar) {
            mo8628j();
            ((C2606Pj) this.f8044b).m10892b(hmVar);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C2606Pj.class, zzdiq);
    }

    private C2606Pj() {
    }

    /* renamed from: a */
    public static C2606Pj m10886a(C3150hm hmVar) {
        return (C2606Pj) C2577Om.m10796a(zzdiq, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10890a(C2723Tj tj) {
        if (tj != null) {
            this.zzdio = tj;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10891b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10892b(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdip = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: o */
    public static C2607a m10893o() {
        return (C2607a) zzdiq.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* renamed from: p */
    public static C2606Pj m10894p() {
        return zzdiq;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Pj>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2606Pj> en;
        switch (C2637Qj.f8141a[i - 1]) {
            case 1:
                return new C2606Pj();
            case 2:
                return new C2607a((C2637Qj) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdiq, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzdih", "zzdio", "zzdip"});
            case 4:
                return zzdiq;
            case 5:
                C2293En<C2606Pj> en2 = zzakh;
                C2293En<C2606Pj> en3 = en2;
                if (en2 == null) {
                    synchronized (C2606Pj.class) {
                        C2293En<C2606Pj> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdiq);
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
    public final int mo8673l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C2723Tj mo8674m() {
        C2723Tj tj = this.zzdio;
        return tj == null ? C2723Tj.m11275m() : tj;
    }

    /* renamed from: n */
    public final C3150hm mo8675n() {
        return this.zzdip;
    }
}
