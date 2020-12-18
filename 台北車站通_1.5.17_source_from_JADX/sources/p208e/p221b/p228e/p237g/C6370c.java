package p208e.p221b.p228e.p237g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6222a;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6250c;

/* renamed from: e.b.e.g.c */
public final class C6370c extends C6439r {

    /* renamed from: b */
    static final C6377g f17682b;

    /* renamed from: c */
    static final C6377g f17683c;

    /* renamed from: d */
    private static final TimeUnit f17684d = TimeUnit.SECONDS;

    /* renamed from: e */
    static final C6373c f17685e = new C6373c(new C6377g("RxCachedThreadSchedulerShutdown"));

    /* renamed from: f */
    static final C6371a f17686f = new C6371a(0, (TimeUnit) null, f17682b);

    /* renamed from: g */
    final ThreadFactory f17687g;

    /* renamed from: h */
    final AtomicReference<C6371a> f17688h;

    /* renamed from: e.b.e.g.c$a */
    static final class C6371a implements Runnable {

        /* renamed from: a */
        private final long f17689a;

        /* renamed from: b */
        private final ConcurrentLinkedQueue<C6373c> f17690b;

        /* renamed from: c */
        final C6222a f17691c;

        /* renamed from: d */
        private final ScheduledExecutorService f17692d;

        /* renamed from: e */
        private final Future<?> f17693e;

        /* renamed from: f */
        private final ThreadFactory f17694f;

        C6371a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.f17689a = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f17690b = new ConcurrentLinkedQueue<>();
            this.f17691c = new C6222a();
            this.f17694f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C6370c.f17683c);
                long j2 = this.f17689a;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f17692d = scheduledExecutorService;
            this.f17693e = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16461a() {
            if (!this.f17690b.isEmpty()) {
                long c = mo16464c();
                Iterator<C6373c> it = this.f17690b.iterator();
                while (it.hasNext()) {
                    C6373c next = it.next();
                    if (next.mo16468c() > c) {
                        return;
                    }
                    if (this.f17690b.remove(next)) {
                        this.f17691c.mo16323a((C6223b) next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16462a(C6373c cVar) {
            cVar.mo16467a(mo16464c() + this.f17689a);
            this.f17690b.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6373c mo16463b() {
            if (this.f17691c.mo16324b()) {
                return C6370c.f17685e;
            }
            while (!this.f17690b.isEmpty()) {
                C6373c poll = this.f17690b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C6373c cVar = new C6373c(this.f17694f);
            this.f17691c.mo16325b(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo16464c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16465d() {
            this.f17691c.mo15709a();
            Future<?> future = this.f17693e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f17692d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo16461a();
        }
    }

    /* renamed from: e.b.e.g.c$b */
    static final class C6372b extends C6439r.C6442c {

        /* renamed from: a */
        private final C6222a f17695a;

        /* renamed from: b */
        private final C6371a f17696b;

        /* renamed from: c */
        private final C6373c f17697c;

        /* renamed from: d */
        final AtomicBoolean f17698d = new AtomicBoolean();

        C6372b(C6371a aVar) {
            this.f17696b = aVar;
            this.f17695a = new C6222a();
            this.f17697c = aVar.mo16463b();
        }

        /* renamed from: a */
        public C6223b mo16320a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f17695a.mo16324b()) {
                return C6250c.INSTANCE;
            }
            return this.f17697c.mo16469a(runnable, j, timeUnit, this.f17695a);
        }

        /* renamed from: a */
        public void mo15709a() {
            if (this.f17698d.compareAndSet(false, true)) {
                this.f17695a.mo15709a();
                this.f17696b.mo16462a(this.f17697c);
            }
        }
    }

    /* renamed from: e.b.e.g.c$c */
    static final class C6373c extends C6375e {

        /* renamed from: c */
        private long f17699c = 0;

        C6373c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public void mo16467a(long j) {
            this.f17699c = j;
        }

        /* renamed from: c */
        public long mo16468c() {
            return this.f17699c;
        }
    }

    static {
        f17685e.mo15709a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f17682b = new C6377g("RxCachedThreadScheduler", max);
        f17683c = new C6377g("RxCachedWorkerPoolEvictor", max);
        f17686f.mo16465d();
    }

    public C6370c() {
        this(f17682b);
    }

    public C6370c(ThreadFactory threadFactory) {
        this.f17687g = threadFactory;
        this.f17688h = new AtomicReference<>(f17686f);
        mo16460b();
    }

    /* renamed from: a */
    public C6439r.C6442c mo16319a() {
        return new C6372b(this.f17688h.get());
    }

    /* renamed from: b */
    public void mo16460b() {
        C6371a aVar = new C6371a(60, f17684d, this.f17687g);
        if (!this.f17688h.compareAndSet(f17686f, aVar)) {
            aVar.mo16465d();
        }
    }
}
