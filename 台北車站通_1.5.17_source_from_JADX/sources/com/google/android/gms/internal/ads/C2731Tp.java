package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.Tp */
public final class C2731Tp extends Thread {

    /* renamed from: a */
    private static final boolean f8351a = C3656zb.f10640b;

    /* renamed from: b */
    private final BlockingQueue<C2216Bw<?>> f8352b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<C2216Bw<?>> f8353c;

    /* renamed from: d */
    private final C2893Zl f8354d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2964b f8355e;

    /* renamed from: f */
    private volatile boolean f8356f = false;

    /* renamed from: g */
    private final C2759Uq f8357g;

    public C2731Tp(BlockingQueue<C2216Bw<?>> blockingQueue, BlockingQueue<C2216Bw<?>> blockingQueue2, C2893Zl zl, C2964b bVar) {
        this.f8352b = blockingQueue;
        this.f8353c = blockingQueue2;
        this.f8354d = zl;
        this.f8355e = bVar;
        this.f8357g = new C2759Uq(this);
    }

    /* renamed from: b */
    private final void m11300b() {
        C2216Bw take = this.f8352b.take();
        take.mo7906a("cache-queue-take");
        take.mo7911k();
        C3471sp b = this.f8354d.mo9025b(take.mo7909c());
        if (b == null) {
            take.mo7906a("cache-miss");
            if (!this.f8357g.m11362b(take)) {
                this.f8353c.put(take);
            }
        } else if (b.mo10022a()) {
            take.mo7906a("cache-hit-expired");
            take.mo7898a(b);
            if (!this.f8357g.m11362b(take)) {
                this.f8353c.put(take);
            }
        } else {
            take.mo7906a("cache-hit");
            C3652yz a = take.mo7900a(new C2272Dv(b.f10218a, b.f10224g));
            take.mo7906a("cache-hit-parsed");
            if (b.f10223f < System.currentTimeMillis()) {
                take.mo7906a("cache-hit-refresh-needed");
                take.mo7898a(b);
                a.f10635d = true;
                if (!this.f8357g.m11362b(take)) {
                    this.f8355e.mo9205a(take, a, new C3501tq(this, take));
                    return;
                }
            }
            this.f8355e.mo9204a((C2216Bw<?>) take, (C3652yz<?>) a);
        }
    }

    /* renamed from: a */
    public final void mo8908a() {
        this.f8356f = true;
        interrupt();
    }

    public final void run() {
        if (f8351a) {
            C3656zb.m14682c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f8354d.mo9023G();
        while (true) {
            try {
                m11300b();
            } catch (InterruptedException unused) {
                if (this.f8356f) {
                    return;
                }
            }
        }
    }
}
