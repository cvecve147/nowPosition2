package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dl */
public final class C3035dl extends C2577Om<C3035dl, C3036a> implements C3556vn {
    private static volatile C2293En<C3035dl> zzakh;
    /* access modifiers changed from: private */
    public static final C3035dl zzdmt = new C3035dl();
    private int zzdlq;
    private String zzdmr = "";
    private C2728Tm<C2547Nk> zzdms = C2577Om.m10805k();

    /* renamed from: com.google.android.gms.internal.ads.dl$a */
    public static final class C3036a extends C2577Om.C2578a<C3035dl, C3036a> implements C3556vn {
        private C3036a() {
            super(C3035dl.zzdmt);
        }

        /* synthetic */ C3036a(C3064el elVar) {
            this();
        }

        /* renamed from: a */
        public final C3036a mo9317a(C2547Nk nk) {
            mo8628j();
            ((C3035dl) this.f8044b).m12162a(nk);
            return this;
        }

        /* renamed from: a */
        public final C3036a mo9318a(String str) {
            mo8628j();
            ((C3035dl) this.f8044b).m12165a(str);
            return this;
        }
    }

    static {
        C2577Om.m10803a(C3035dl.class, zzdmt);
    }

    private C3035dl() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12162a(C2547Nk nk) {
        if (nk != null) {
            if (!this.zzdms.mo8904l()) {
                C2728Tm<C2547Nk> tm = this.zzdms;
                int size = tm.size();
                this.zzdms = tm.mo8232a(size == 0 ? 10 : size << 1);
            }
            this.zzdms.add(nk);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12165a(String str) {
        if (str != null) {
            this.zzdmr = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: m */
    public static C3036a m12166m() {
        return (C3036a) zzdmt.mo7821a(C2577Om.C2582e.f8051e, (Object) null, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.Om$b, com.google.android.gms.internal.ads.En<com.google.android.gms.internal.ads.dl>] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo7821a(int i, Object obj, Object obj2) {
        C2293En<C3035dl> en;
        switch (C3064el.f9104a[i - 1]) {
            case 1:
                return new C3035dl();
            case 2:
                return new C3036a((C3064el) null);
            case 3:
                return C2577Om.m10801a((C3498tn) zzdmt, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzdlq", "zzdmr", "zzdms", C2547Nk.class});
            case 4:
                return zzdmt;
            case 5:
                C2293En<C3035dl> en2 = zzakh;
                C2293En<C3035dl> en3 = en2;
                if (en2 == null) {
                    synchronized (C3035dl.class) {
                        C2293En<C3035dl> en4 = zzakh;
                        en = en4;
                        if (en4 == null) {
                            ? bVar = new C2577Om.C2579b(zzdmt);
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
    public final List<C2547Nk> mo9316l() {
        return this.zzdms;
    }
}
