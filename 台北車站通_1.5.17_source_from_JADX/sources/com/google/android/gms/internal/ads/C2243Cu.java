package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.Cu */
public final class C2243Cu extends Thread {

    /* renamed from: a */
    private final BlockingQueue<C2216Bw<?>> f6835a;

    /* renamed from: b */
    private final C3305mu f6836b;

    /* renamed from: c */
    private final C2893Zl f6837c;

    /* renamed from: d */
    private final C2964b f6838d;

    /* renamed from: e */
    private volatile boolean f6839e = false;

    public C2243Cu(BlockingQueue<C2216Bw<?>> blockingQueue, C3305mu muVar, C2893Zl zl, C2964b bVar) {
        this.f6835a = blockingQueue;
        this.f6836b = muVar;
        this.f6837c = zl;
        this.f6838d = bVar;
    }

    /* renamed from: b */
    private final void m9573b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C2216Bw take = this.f6835a.take();
        try {
            take.mo7906a("network-queue-take");
            take.mo7911k();
            TrafficStats.setThreadStatsTag(take.mo7912l());
            C2272Dv a = this.f6836b.mo8398a(take);
            take.mo7906a("network-http-complete");
            if (!a.f6923e || !take.mo7919s()) {
                C3652yz a2 = take.mo7900a(a);
                take.mo7906a("network-parse-complete");
                if (take.mo7915o() && a2.f10633b != null) {
                    this.f6837c.mo9024a(take.mo7909c(), a2.f10633b);
                    take.mo7906a("network-cache-written");
                }
                take.mo7918r();
                this.f6838d.mo9204a((C2216Bw<?>) take, (C3652yz<?>) a2);
                take.mo7904a((C3652yz<?>) a2);
                return;
            }
            take.mo7908b("not-modified");
            take.mo7920t();
        } catch (C3024db e) {
            e.mo9305a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f6838d.mo9203a((C2216Bw<?>) take, e);
            take.mo7920t();
        } catch (Exception e2) {
            C3656zb.m14680a(e2, "Unhandled exception %s", e2.toString());
            C3024db dbVar = new C3024db((Throwable) e2);
            dbVar.mo9305a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f6838d.mo9203a((C2216Bw<?>) take, dbVar);
            take.mo7920t();
        }
    }

    /* renamed from: a */
    public final void mo7953a() {
        this.f6839e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m9573b();
            } catch (InterruptedException unused) {
                if (this.f6839e) {
                    return;
                }
            }
        }
    }
}
