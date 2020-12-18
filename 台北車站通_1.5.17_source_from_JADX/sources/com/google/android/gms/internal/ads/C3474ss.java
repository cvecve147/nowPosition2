package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ss */
public final class C3474ss implements C2964b {

    /* renamed from: a */
    private final Executor f10228a;

    public C3474ss(Handler handler) {
        this.f10228a = new C2734Ts(this, handler);
    }

    /* renamed from: a */
    public final void mo9203a(C2216Bw<?> bw, C3024db dbVar) {
        bw.mo7906a("post-error");
        this.f10228a.execute(new C3333nt(this, bw, C3652yz.m14675a(dbVar), (Runnable) null));
    }

    /* renamed from: a */
    public final void mo9204a(C2216Bw<?> bw, C3652yz<?> yzVar) {
        mo9205a(bw, yzVar, (Runnable) null);
    }

    /* renamed from: a */
    public final void mo9205a(C2216Bw<?> bw, C3652yz<?> yzVar, Runnable runnable) {
        bw.mo7918r();
        bw.mo7906a("post-response");
        this.f10228a.execute(new C3333nt(this, bw, yzVar, runnable));
    }
}
