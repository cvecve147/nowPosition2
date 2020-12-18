package p101d.p119e.p120a;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: d.e.a.j */
public class C5277j extends Thread {

    /* renamed from: a */
    private final BlockingQueue<C5284q<?>> f14925a;

    /* renamed from: b */
    private final C5276i f14926b;

    /* renamed from: c */
    private final C5267b f14927c;

    /* renamed from: d */
    private final C5291t f14928d;

    /* renamed from: e */
    private volatile boolean f14929e = false;

    public C5277j(BlockingQueue<C5284q<?>> blockingQueue, C5276i iVar, C5267b bVar, C5291t tVar) {
        this.f14925a = blockingQueue;
        this.f14926b = iVar;
        this.f14927c = bVar;
        this.f14928d = tVar;
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m20408a(C5284q<?> qVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(qVar.mo14646w());
        }
    }

    /* renamed from: a */
    private void m20409a(C5284q<?> qVar, C5295x xVar) {
        qVar.mo14629b(xVar);
        this.f14928d.mo14614a(qVar, xVar);
    }

    /* renamed from: a */
    public void mo14616a() {
        this.f14929e = true;
        interrupt();
    }

    public void run() {
        String str;
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                C5284q take = this.f14925a.take();
                try {
                    take.mo14626a("network-queue-take");
                    if (take.mo14649z()) {
                        str = "network-discard-cancelled";
                    } else {
                        m20408a(take);
                        C5279l a = this.f14926b.mo14571a(take);
                        take.mo14626a("network-http-complete");
                        if (!a.f14933d || !take.mo14648y()) {
                            C5288s a2 = take.mo14590a(a);
                            take.mo14626a("network-parse-complete");
                            if (take.mo14620C() && a2.f14971b != null) {
                                this.f14927c.mo14578a(take.mo14635k(), a2.f14971b);
                                take.mo14626a("network-cache-written");
                            }
                            take.mo14619A();
                            this.f14928d.mo14612a((C5284q<?>) take, (C5288s<?>) a2);
                        } else {
                            str = "not-modified";
                        }
                    }
                    take.mo14630b(str);
                } catch (C5295x e) {
                    e.mo14657a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    m20409a(take, e);
                } catch (Exception e2) {
                    C5296y.m20470a(e2, "Unhandled exception %s", e2.toString());
                    C5295x xVar = new C5295x((Throwable) e2);
                    xVar.mo14657a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f14928d.mo14614a((C5284q<?>) take, xVar);
                }
            } catch (InterruptedException unused) {
                if (this.f14929e) {
                    return;
                }
            }
        }
    }
}
