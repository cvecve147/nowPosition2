package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Rf */
final /* synthetic */ class C2660Rf implements Runnable {

    /* renamed from: a */
    private final C3116gg f8202a;

    /* renamed from: b */
    private final C2804Wf f8203b;

    /* renamed from: c */
    private final Class f8204c;

    /* renamed from: d */
    private final C2341Gf f8205d;

    /* renamed from: e */
    private final Executor f8206e;

    C2660Rf(C3116gg ggVar, C2804Wf wf, Class cls, C2341Gf gf, Executor executor) {
        this.f8202a = ggVar;
        this.f8203b = wf;
        this.f8204c = cls;
        this.f8205d = gf;
        this.f8206e = executor;
    }

    public final void run() {
        C2483Lf.m10506a(this.f8202a, this.f8203b, this.f8204c, this.f8205d, this.f8206e);
    }
}
