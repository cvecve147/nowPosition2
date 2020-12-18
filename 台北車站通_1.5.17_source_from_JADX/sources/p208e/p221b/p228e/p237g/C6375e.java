package p208e.p221b.p228e.p237g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6248a;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.g.e */
public class C6375e extends C6439r.C6442c implements C6223b {

    /* renamed from: a */
    private final ScheduledExecutorService f17702a;

    /* renamed from: b */
    volatile boolean f17703b;

    public C6375e(ThreadFactory threadFactory) {
        this.f17702a = C6382k.m23883a(threadFactory);
    }

    /* renamed from: a */
    public C6223b mo16457a(Runnable runnable) {
        return mo16320a(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: a */
    public C6223b mo16320a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f17703b ? C6250c.INSTANCE : mo16469a(runnable, j, timeUnit, (C6248a) null);
    }

    /* renamed from: a */
    public C6381j mo16469a(Runnable runnable, long j, TimeUnit timeUnit, C6248a aVar) {
        Future future;
        C6381j jVar = new C6381j(C6416a.m23984a(runnable), aVar);
        if (aVar != null && !aVar.mo16325b(jVar)) {
            return jVar;
        }
        if (j <= 0) {
            try {
                future = this.f17702a.submit(jVar);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo16323a(jVar);
                }
                C6416a.m23988b((Throwable) e);
            }
        } else {
            future = this.f17702a.schedule(jVar, j, timeUnit);
        }
        jVar.mo16477a(future);
        return jVar;
    }

    /* renamed from: a */
    public void mo15709a() {
        if (!this.f17703b) {
            this.f17703b = true;
            this.f17702a.shutdownNow();
        }
    }

    /* renamed from: b */
    public C6223b mo16470b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C6379h hVar = new C6379h(C6416a.m23984a(runnable));
        try {
            hVar.mo16454a(this.f17702a.scheduleAtFixedRate(hVar, j, j2, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e) {
            C6416a.m23988b((Throwable) e);
            return C6250c.INSTANCE;
        }
    }

    /* renamed from: b */
    public C6223b mo16471b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C6380i iVar = new C6380i(C6416a.m23984a(runnable));
        if (j <= 0) {
            try {
                future = this.f17702a.submit(iVar);
            } catch (RejectedExecutionException e) {
                C6416a.m23988b((Throwable) e);
                return C6250c.INSTANCE;
            }
        } else {
            future = this.f17702a.schedule(iVar, j, timeUnit);
        }
        iVar.mo16454a(future);
        return iVar;
    }

    /* renamed from: b */
    public void mo16472b() {
        if (!this.f17703b) {
            this.f17703b = true;
            this.f17702a.shutdown();
        }
    }
}
