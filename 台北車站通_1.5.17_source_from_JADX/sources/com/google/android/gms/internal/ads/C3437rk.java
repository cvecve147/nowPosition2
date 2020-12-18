package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.rk */
public final class C3437rk extends C2577Om<C3437rk, C3438a> implements C3556vn {
    private static volatile C2293En<C3437rk> zzakh;
    /* access modifiers changed from: private */
    public static final C3437rk zzdjt = new C3437rk();
    private int zzdih;
    private C3323nk zzdjj;
    private C3150hm zzdjr;
    private C3150hm zzdjs;

    /* renamed from: com.google.android.gms.internal.ads.rk$a */
    public static final class C3438a extends C2577Om.C2578a<C3437rk, C3438a> implements C3556vn {
        private C3438a() {
            super(C3437rk.zzdjt);
        }

        /* synthetic */ C3438a(C3466sk skVar) {
            this();
        }

        /* renamed from: a */
        public final C3438a mo9983a(int i) {
            mo8628j();
            ((C3437rk) this.f8044b).m13647b(0);
            return this;
        }

        /* renamed from: a */
        public final C3438a mo9984a(C3150hm hmVar) {
            mo8628j();
            ((C3437rk) this.f8044b).m13650c(hmVar);
            return this;
        }

        /* renamed from: a */
        public final C3438a mo9985a(C3323nk nkVar) {
            mo8628j();
            ((C3437rk) this.f8044b).m13643a(nkVar);
            return this;
        }

        /* renamed from: b */
        public final C3438a mo9986b(C3150hm hmVar) {
            mo8628j();
            ((C3437rk) this.f8044b).m13648b(hmVar);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C3437rk.class, zzdjt);
    }

    private C3437rk() {
        C3150hm hmVar = C3150hm.f9434a;
        this.zzdjr = hmVar;
        this.zzdjs = hmVar;
    }

    /* renamed from: a */
    public static C3437rk m13642a(C3150hm hmVar) {
        return (C3437rk) C2577Om.m10796a(zzdjt, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13643a(C3323nk nkVar) {
        if (nkVar != null) {
            this.zzdjj = nkVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m13647b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m13648b(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdjs = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m13650c(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdjr = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: p */
    public static C3438a m13651p() {
        return (C3438a) zzdjt.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* renamed from: q */
    public static C3437rk m13652q() {
        return zzdjt;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.rk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3437rk> en;
        switch (C3466sk.f10207a[i - 1]) {
            case 1:
                return new C3437rk();
            case 2:
                return new C3438a((C3466sk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdjt, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzdih", "zzdjj", "zzdjr", "zzdjs"});
            case 4:
                return zzdjt;
            case 5:
                C2293En<C3437rk> en2 = zzakh;
                C2293En<C3437rk> en3 = en2;
                if (en2 == null) {
                    synchronized (C3437rk.class) {
                        C2293En<C3437rk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdjt);
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
    public final int mo9979l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C3323nk mo9980m() {
        C3323nk nkVar = this.zzdjj;
        return nkVar == null ? C3323nk.m13154o() : nkVar;
    }

    /* renamed from: n */
    public final C3150hm mo9981n() {
        return this.zzdjr;
    }

    /* renamed from: o */
    public final C3150hm mo9982o() {
        return this.zzdjs;
    }
}
