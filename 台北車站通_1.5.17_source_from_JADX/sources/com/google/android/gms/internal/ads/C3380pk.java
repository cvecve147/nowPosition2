package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.pk */
public final class C3380pk extends C2577Om<C3380pk, C3381a> implements C3556vn {
    private static volatile C2293En<C3380pk> zzakh;
    /* access modifiers changed from: private */
    public static final C3380pk zzdjq = new C3380pk();
    private int zzdih;
    private C3150hm zzdip = C3150hm.f9434a;
    private C3437rk zzdjp;

    /* renamed from: com.google.android.gms.internal.ads.pk$a */
    public static final class C3381a extends C2577Om.C2578a<C3380pk, C3381a> implements C3556vn {
        private C3381a() {
            super(C3380pk.zzdjq);
        }

        /* synthetic */ C3381a(C3409qk qkVar) {
            this();
        }

        /* renamed from: a */
        public final C3381a mo9893a(int i) {
            mo8628j();
            ((C3380pk) this.f8044b).m13425b(0);
            return this;
        }

        /* renamed from: a */
        public final C3381a mo9894a(C3150hm hmVar) {
            mo8628j();
            ((C3380pk) this.f8044b).m13426b(hmVar);
            return this;
        }

        /* renamed from: a */
        public final C3381a mo9895a(C3437rk rkVar) {
            mo8628j();
            ((C3380pk) this.f8044b).m13424a(rkVar);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C3380pk.class, zzdjq);
    }

    private C3380pk() {
    }

    /* renamed from: a */
    public static C3380pk m13420a(C3150hm hmVar) {
        return (C3380pk) C2577Om.m10796a(zzdjq, hmVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13424a(C3437rk rkVar) {
        if (rkVar != null) {
            this.zzdjp = rkVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m13425b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m13426b(C3150hm hmVar) {
        if (hmVar != null) {
            this.zzdip = hmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: o */
    public static C3381a m13427o() {
        return (C3381a) zzdjq.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.pk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3380pk> en;
        switch (C3409qk.f10080a[i - 1]) {
            case 1:
                return new C3380pk();
            case 2:
                return new C3381a((C3409qk) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdjq, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzdih", "zzdjp", "zzdip"});
            case 4:
                return zzdjq;
            case 5:
                C2293En<C3380pk> en2 = zzakh;
                C2293En<C3380pk> en3 = en2;
                if (en2 == null) {
                    synchronized (C3380pk.class) {
                        C2293En<C3380pk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdjq);
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
    public final int mo9890l() {
        return this.zzdih;
    }

    /* renamed from: m */
    public final C3150hm mo9891m() {
        return this.zzdip;
    }

    /* renamed from: n */
    public final C3437rk mo9892n() {
        C3437rk rkVar = this.zzdjp;
        return rkVar == null ? C3437rk.m13652q() : rkVar;
    }
}
