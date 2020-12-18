package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Xk */
public final class C2836Xk extends C2577Om<C2836Xk, C2837a> implements C3556vn {
    private static volatile C2293En<C2836Xk> zzakh;
    /* access modifiers changed from: private */
    public static final C2836Xk zzdmg = new C2836Xk();
    private int zzdih;
    private C2919_k zzdmf;

    /* renamed from: com.google.android.gms.internal.ads.Xk$a */
    public static final class C2837a extends C2577Om.C2578a<C2836Xk, C2837a> implements C3556vn {
        private C2837a() {
            super(C2836Xk.zzdmg);
        }

        /* synthetic */ C2837a(C2892Zk zk) {
            this();
        }

        /* renamed from: a */
        public final C2837a mo9037a(int i) {
            mo8628j();
            ((C2836Xk) this.f8044b).m11578b(0);
            return this;
        }

        /* renamed from: a */
        public final C2837a mo9038a(C2919_k _kVar) {
            mo8628j();
            ((C2836Xk) this.f8044b).m11577a(_kVar);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C2836Xk.class, zzdmg);
    }

    private C2836Xk() {
    }

    /* renamed from: a */
    public static C2836Xk m11574a(C3150hm hmVar) {
        return (C2836Xk) C2577Om.m10796a(zzdmg, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11577a(C2919_k _kVar) {
        if (_kVar != null) {
            this.zzdmf = _kVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11578b(int i) {
        this.zzdih = i;
    }

    /* renamed from: n */
    public static C2837a m11579n() {
        return (C2837a) zzdmg.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Xk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2836Xk> en;
        switch (C2892Zk.f8691a[i - 1]) {
            case 1:
                return new C2836Xk();
            case 2:
                return new C2837a((C2892Zk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdmg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzdih", "zzdmf"});
            case 4:
                return zzdmg;
            case 5:
                C2293En<C2836Xk> en2 = zzakh;
                C2293En<C2836Xk> en3 = en2;
                if (en2 == null) {
                    synchronized (C2836Xk.class) {
                        C2293En<C2836Xk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdmg);
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
    public final int mo9035l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C2919_k mo9036m() {
        C2919_k _kVar = this.zzdmf;
        return _kVar == null ? C2919_k.m11852n() : _kVar;
    }
}
