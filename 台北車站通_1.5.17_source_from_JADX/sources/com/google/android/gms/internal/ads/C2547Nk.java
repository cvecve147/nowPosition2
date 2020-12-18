package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Nk */
public final class C2547Nk extends C2577Om<C2547Nk, C2548a> implements C3556vn {
    private static volatile C2293En<C2547Nk> zzakh;
    /* access modifiers changed from: private */
    public static final C2547Nk zzdlp = new C2547Nk();
    private String zzdks = "";
    private String zzdll = "";
    private int zzdlm;
    private boolean zzdln;
    private String zzdlo = "";

    /* renamed from: com.google.android.gms.internal.ads.Nk$a */
    public static final class C2548a extends C2577Om.C2578a<C2547Nk, C2548a> implements C3556vn {
        private C2548a() {
            super(C2547Nk.zzdlp);
        }

        /* synthetic */ C2548a(C2575Ok ok) {
            this();
        }

        /* renamed from: a */
        public final C2548a mo8574a(int i) {
            mo8628j();
            ((C2547Nk) this.f8044b).m10661b(0);
            return this;
        }

        /* renamed from: a */
        public final C2548a mo8575a(String str) {
            mo8628j();
            ((C2547Nk) this.f8044b).m10663b(str);
            return this;
        }

        /* renamed from: a */
        public final C2548a mo8576a(boolean z) {
            mo8628j();
            ((C2547Nk) this.f8044b).m10660a(true);
            return this;
        }

        /* renamed from: b */
        public final C2548a mo8577b(String str) {
            mo8628j();
            ((C2547Nk) this.f8044b).m10659a(str);
            return this;
        }

        /* renamed from: c */
        public final C2548a mo8578c(String str) {
            mo8628j();
            ((C2547Nk) this.f8044b).m10665c(str);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C2547Nk.class, zzdlp);
    }

    private C2547Nk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10659a(String str) {
        if (str != null) {
            this.zzdks = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10660a(boolean z) {
        this.zzdln = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10661b(int i) {
        this.zzdlm = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10663b(String str) {
        if (str != null) {
            this.zzdll = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m10665c(String str) {
        if (str != null) {
            this.zzdlo = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: q */
    public static C2548a m10666q() {
        return (C2548a) zzdlp.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.Nk>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C2547Nk> en;
        switch (C2575Ok.f8042a[i - 1]) {
            case 1:
                return new C2547Nk();
            case 2:
                return new C2548a((C2575Ok) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdlp, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzdll", "zzdks", "zzdlm", "zzdln", "zzdlo"});
            case 4:
                return zzdlp;
            case 5:
                C2293En<C2547Nk> en2 = zzakh;
                C2293En<C2547Nk> en3 = en2;
                if (en2 == null) {
                    synchronized (C2547Nk.class) {
                        C2293En<C2547Nk> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdlp);
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
    public final String mo8569l() {
        return this.zzdks;
    }

    /* renamed from: m */
    public final String mo8570m() {
        return this.zzdll;
    }

    /* renamed from: n */
    public final int mo8571n() {
        return this.zzdlm;
    }

    /* renamed from: o */
    public final boolean mo8572o() {
        return this.zzdln;
    }

    /* renamed from: p */
    public final String mo8573p() {
        return this.zzdlo;
    }
}
