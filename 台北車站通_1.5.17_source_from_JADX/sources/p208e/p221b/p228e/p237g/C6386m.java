package p208e.p221b.p228e.p237g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p225b.C6224c;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.g.m */
public final class C6386m extends C6439r {

    /* renamed from: b */
    private static final C6386m f17721b = new C6386m();

    /* renamed from: e.b.e.g.m$a */
    static final class C6387a implements Runnable {

        /* renamed from: a */
        private final Runnable f17722a;

        /* renamed from: b */
        private final C6389c f17723b;

        /* renamed from: c */
        private final long f17724c;

        C6387a(Runnable runnable, C6389c cVar, long j) {
            this.f17722a = runnable;
            this.f17723b = cVar;
            this.f17724c = j;
        }

        public void run() {
            if (!this.f17723b.f17732d) {
                long a = this.f17723b.mo16551a(TimeUnit.MILLISECONDS);
                long j = this.f17724c;
                if (j > a) {
                    long j2 = j - a;
                    if (j2 > 0) {
                        try {
                            Thread.sleep(j2);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            C6416a.m23988b((Throwable) e);
                            return;
                        }
                    }
                }
                if (!this.f17723b.f17732d) {
                    this.f17722a.run();
                }
            }
        }
    }

    /* renamed from: e.b.e.g.m$b */
    static final class C6388b implements Comparable<C6388b> {

        /* renamed from: a */
        final Runnable f17725a;

        /* renamed from: b */
        final long f17726b;

        /* renamed from: c */
        final int f17727c;

        /* renamed from: d */
        volatile boolean f17728d;

        C6388b(Runnable runnable, Long l, int i) {
            this.f17725a = runnable;
            this.f17726b = l.longValue();
            this.f17727c = i;
        }

        /* renamed from: a */
        public int compareTo(C6388b bVar) {
            int a = C6268b.m23589a(this.f17726b, bVar.f17726b);
            return a == 0 ? C6268b.m23587a(this.f17727c, bVar.f17727c) : a;
        }
    }

    /* renamed from: e.b.e.g.m$c */
    static final class C6389c extends C6439r.C6442c implements C6223b {

        /* renamed from: a */
        final PriorityBlockingQueue<C6388b> f17729a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        private final AtomicInteger f17730b = new AtomicInteger();

        /* renamed from: c */
        final AtomicInteger f17731c = new AtomicInteger();

        /* renamed from: d */
        volatile boolean f17732d;

        /* renamed from: e.b.e.g.m$c$a */
        final class C6390a implements Runnable {

            /* renamed from: a */
            final C6388b f17733a;

            C6390a(C6388b bVar) {
                this.f17733a = bVar;
            }

            public void run() {
                C6388b bVar = this.f17733a;
                bVar.f17728d = true;
                C6389c.this.f17729a.remove(bVar);
            }
        }

        C6389c() {
        }

        /* renamed from: a */
        public C6223b mo16457a(Runnable runnable) {
            return mo16485a(runnable, mo16551a(TimeUnit.MILLISECONDS));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6223b mo16485a(Runnable runnable, long j) {
            if (this.f17732d) {
                return C6250c.INSTANCE;
            }
            C6388b bVar = new C6388b(runnable, Long.valueOf(j), this.f17731c.incrementAndGet());
            this.f17729a.add(bVar);
            if (this.f17730b.getAndIncrement() != 0) {
                return C6224c.m23514a(new C6390a(bVar));
            }
            int i = 1;
            while (true) {
                C6388b poll = this.f17729a.poll();
                if (poll == null) {
                    i = this.f17730b.addAndGet(-i);
                    if (i == 0) {
                        return C6250c.INSTANCE;
                    }
                } else if (!poll.f17728d) {
                    poll.f17725a.run();
                }
            }
        }

        /* renamed from: a */
        public C6223b mo16320a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo16551a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo16485a(new C6387a(runnable, this, a), a);
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17732d = true;
        }
    }

    C6386m() {
    }

    /* renamed from: b */
    public static C6386m m23891b() {
        return f17721b;
    }

    /* renamed from: a */
    public C6223b mo16481a(Runnable runnable) {
        runnable.run();
        return C6250c.INSTANCE;
    }

    /* renamed from: a */
    public C6223b mo16318a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C6416a.m23988b((Throwable) e);
        }
        return C6250c.INSTANCE;
    }

    /* renamed from: a */
    public C6439r.C6442c mo16319a() {
        return new C6389c();
    }
}
