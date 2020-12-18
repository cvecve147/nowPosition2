package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Vj */
public final class C2779Vj extends C2577Om<C2779Vj, C2780a> implements C3556vn {
    private static volatile C2293En<C2779Vj> zzakh;
    /* access modifiers changed from: private */
    public static final C2779Vj zzdiw = new C2779Vj();
    private int zzdih;
    private C3150hm zzdip = C3150hm.f9434a;
    private C2917_j zzdiv;

    /* renamed from: com.google.android.gms.internal.ads.Vj$a */
    public static final class C2780a extends C2577Om.C2578a<C2779Vj, C2780a> implements C3556vn {
        private C2780a() {
            super(C2779Vj.zzdiw);
        }

        /* synthetic */ C2780a(C2808Wj wj) {
            this();
        }

        /* renamed from: a */
        public final C2780a mo8960a(int i) {
            mo8628j();
            ((C2779Vj) this.f8044b).m11425b(0);
            return this;
        }

        /* renamed from: a */
        public final C2780a mo8961a(C2917_j _jVar) {
            mo8628j();
            ((C2779Vj) this.f8044b).m11424a(_jVar);
            return this;
        }

        /* renamed from: a */
        public final C2780a mo8962a(C3150hm hmVar) {
            mo8628j();
            ((C2779Vj) this.f8044b).m11426b(hmVar);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C2779Vj.class, zzdiw);
    }

    private C2779Vj() {
    }

    /* renamed from: a */
    public static C2779Vj m11420a(C3150hm hmVar) {
        return (C2779Vj) C2577Om.m10796a(zzdiw, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11424a(C2917_j _jVar) {
        if (_jVar != null) {
            this.zzdiv = _jVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11425b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11426b(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdip = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: o */
    public static C2780a m11427o() {
        return (C2780a) zzdiw.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Vj>, com.google.android.gms.internal.ads.Om$b] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2779Vj> en;
        switch (C2808Wj.f8535a[i - 1]) {
            case 1:
                return new C2779Vj();
            case 2:
                return new C2780a((C2808Wj) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdiw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzdih", "zzdiv", "zzdip"});
            case 4:
                return zzdiw;
            case 5:
                C2293En<C2779Vj> en2 = zzakh;
                C2293En<C2779Vj> en3 = en2;
                if (en2 == null) {
                    synchronized (C2779Vj.class) {
                        C2293En<C2779Vj> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdiw);
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
    public final int mo8957l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C3150hm mo8958m() {
        return this.zzdip;
    }

    /* renamed from: n */
    public final C2917_j mo8959n() {
        C2917_j _jVar = this.zzdiv;
        return _jVar == null ? C2917_j.m11847m() : _jVar;
    }
}
