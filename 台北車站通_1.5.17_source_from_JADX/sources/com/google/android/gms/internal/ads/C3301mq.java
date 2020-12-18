package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.mq */
public final class C3301mq implements Callable {

    /* renamed from: a */
    private final C2701Sp f9806a;

    /* renamed from: b */
    private final C2921_l f9807b;

    public C3301mq(C2701Sp sp, C2921_l _lVar) {
        this.f9806a = sp;
        this.f9807b = _lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.f9806a.mo8847l() != null) {
            this.f9806a.mo8847l().get();
        }
        C2921_l k = this.f9806a.mo8846k();
        if (k == null) {
            return null;
        }
        try {
            synchronized (this.f9807b) {
                C2408Io.m10308a(this.f9807b, C2408Io.m10310a((C2408Io) k));
            }
            return null;
        } catch (C2380Ho unused) {
            return null;
        }
    }
}
