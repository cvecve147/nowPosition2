package p208e.p221b.p228e.p237g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6222a;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.g.l */
public final class C6384l extends C6439r {

    /* renamed from: b */
    static final C6377g f17714b = new C6377g("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: c */
    static final ScheduledExecutorService f17715c = Executors.newScheduledThreadPool(0);

    /* renamed from: d */
    final ThreadFactory f17716d;

    /* renamed from: e */
    final AtomicReference<ScheduledExecutorService> f17717e;

    /* renamed from: e.b.e.g.l$a */
    static final class C6385a extends C6439r.C6442c {

        /* renamed from: a */
        final ScheduledExecutorService f17718a;

        /* renamed from: b */
        final C6222a f17719b = new C6222a();

        /* renamed from: c */
        volatile boolean f17720c;

        C6385a(ScheduledExecutorService scheduledExecutorService) {
            this.f17718a = scheduledExecutorService;
        }

        /* renamed from: a */
        public C6223b mo16320a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f17720c) {
                return C6250c.INSTANCE;
            }
            C6381j jVar = new C6381j(C6416a.m23984a(runnable), this.f17719b);
            this.f17719b.mo16325b(jVar);
            if (j <= 0) {
                try {
                    future = this.f17718a.submit(jVar);
                } catch (RejectedExecutionException e) {
                    mo15709a();
                    C6416a.m23988b((Throwable) e);
                    return C6250c.INSTANCE;
                }
            } else {
                future = this.f17718a.schedule(jVar, j, timeUnit);
            }
            jVar.mo16477a(future);
            return jVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            if (!this.f17720c) {
                this.f17720c = true;
                this.f17719b.mo15709a();
            }
        }
    }

    static {
        f17715c.shutdown();
    }

    public C6384l() {
        this(f17714b);
    }

    public C6384l(ThreadFactory threadFactory) {
        this.f17717e = new AtomicReference<>();
        this.f17716d = threadFactory;
        this.f17717e.lazySet(m23885a(threadFactory));
    }

    /* renamed from: a */
    static ScheduledExecutorService m23885a(ThreadFactory threadFactory) {
        return C6382k.m23883a(threadFactory);
    }

    /* renamed from: a */
    public C6223b mo16455a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C6379h hVar = new C6379h(C6416a.m23984a(runnable));
        try {
            hVar.mo16454a(this.f17717e.get().scheduleAtFixedRate(hVar, j, j2, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e) {
            C6416a.m23988b((Throwable) e);
            return C6250c.INSTANCE;
        }
    }

    /* renamed from: a */
    public C6223b mo16318a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C6380i iVar = new C6380i(C6416a.m23984a(runnable));
        if (j <= 0) {
            try {
                future = this.f17717e.get().submit(iVar);
            } catch (RejectedExecutionException e) {
                C6416a.m23988b((Throwable) e);
                return C6250c.INSTANCE;
            }
        } else {
            future = this.f17717e.get().schedule(iVar, j, timeUnit);
        }
        iVar.mo16454a(future);
        return iVar;
    }

    /* renamed from: a */
    public C6439r.C6442c mo16319a() {
        return new C6385a(this.f17717e.get());
    }
}
