package p208e.p221b;

import java.util.concurrent.TimeUnit;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p228e.p229a.C6252e;
import p208e.p221b.p228e.p237g.C6375e;
import p208e.p221b.p228e.p240j.C6404g;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.r */
public abstract class C6439r {

    /* renamed from: a */
    static final long f17818a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: e.b.r$a */
    static final class C6440a implements Runnable, C6223b {

        /* renamed from: a */
        final Runnable f17819a;

        /* renamed from: b */
        final C6442c f17820b;

        /* renamed from: c */
        Thread f17821c;

        C6440a(Runnable runnable, C6442c cVar) {
            this.f17819a = runnable;
            this.f17820b = cVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            if (this.f17821c == Thread.currentThread()) {
                C6442c cVar = this.f17820b;
                if (cVar instanceof C6375e) {
                    ((C6375e) cVar).mo16472b();
                    return;
                }
            }
            this.f17820b.mo15709a();
        }

        public void run() {
            this.f17821c = Thread.currentThread();
            try {
                this.f17819a.run();
            } finally {
                mo15709a();
                this.f17821c = null;
            }
        }
    }

    /* renamed from: e.b.r$b */
    static class C6441b implements Runnable, C6223b {

        /* renamed from: a */
        final Runnable f17822a;

        /* renamed from: b */
        final C6442c f17823b;

        /* renamed from: c */
        volatile boolean f17824c;

        C6441b(Runnable runnable, C6442c cVar) {
            this.f17822a = runnable;
            this.f17823b = cVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17824c = true;
            this.f17823b.mo15709a();
        }

        public void run() {
            if (!this.f17824c) {
                try {
                    this.f17822a.run();
                } catch (Throwable th) {
                    C6233b.m23529b(th);
                    this.f17823b.mo15709a();
                    throw C6404g.m23945a(th);
                }
            }
        }
    }

    /* renamed from: e.b.r$c */
    public static abstract class C6442c implements C6223b {

        /* renamed from: e.b.r$c$a */
        final class C6443a implements Runnable {

            /* renamed from: a */
            final Runnable f17825a;

            /* renamed from: b */
            final C6252e f17826b;

            /* renamed from: c */
            final long f17827c;

            /* renamed from: d */
            long f17828d;

            /* renamed from: e */
            long f17829e;

            /* renamed from: f */
            long f17830f;

            C6443a(long j, Runnable runnable, long j2, C6252e eVar, long j3) {
                this.f17825a = runnable;
                this.f17826b = eVar;
                this.f17827c = j3;
                this.f17829e = j2;
                this.f17830f = j;
            }

            public void run() {
                long j;
                this.f17825a.run();
                if (!this.f17826b.mo16364b()) {
                    long a = C6442c.this.mo16551a(TimeUnit.NANOSECONDS);
                    long j2 = C6439r.f17818a;
                    long j3 = this.f17829e;
                    if (a + j2 >= j3) {
                        long j4 = this.f17827c;
                        if (a < j3 + j4 + j2) {
                            long j5 = this.f17830f;
                            long j6 = this.f17828d + 1;
                            this.f17828d = j6;
                            j = j5 + (j6 * j4);
                            this.f17829e = a;
                            this.f17826b.mo16363a(C6442c.this.mo16320a(this, j - a, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j7 = this.f17827c;
                    long j8 = a + j7;
                    long j9 = this.f17828d + 1;
                    this.f17828d = j9;
                    this.f17830f = j8 - (j7 * j9);
                    j = j8;
                    this.f17829e = a;
                    this.f17826b.mo16363a(C6442c.this.mo16320a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }
        }

        /* renamed from: a */
        public long mo16551a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: a */
        public C6223b mo16457a(Runnable runnable) {
            return mo16320a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public C6223b mo16552a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C6252e eVar = new C6252e();
            C6252e eVar2 = new C6252e(eVar);
            Runnable a = C6416a.m23984a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = mo16551a(TimeUnit.NANOSECONDS);
            C6252e eVar3 = eVar;
            C6443a aVar = r0;
            C6443a aVar2 = new C6443a(a2 + timeUnit2.toNanos(j3), a, a2, eVar2, nanos);
            C6223b a3 = mo16320a(aVar, j3, timeUnit2);
            if (a3 == C6250c.INSTANCE) {
                return a3;
            }
            eVar3.mo16363a(a3);
            return eVar2;
        }

        /* renamed from: a */
        public abstract C6223b mo16320a(Runnable runnable, long j, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public C6223b mo16481a(Runnable runnable) {
        return mo16318a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public C6223b mo16455a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C6442c a = mo16319a();
        C6441b bVar = new C6441b(C6416a.m23984a(runnable), a);
        C6223b a2 = a.mo16552a(bVar, j, j2, timeUnit);
        return a2 == C6250c.INSTANCE ? a2 : bVar;
    }

    /* renamed from: a */
    public C6223b mo16318a(Runnable runnable, long j, TimeUnit timeUnit) {
        C6442c a = mo16319a();
        C6440a aVar = new C6440a(C6416a.m23984a(runnable), a);
        a.mo16320a(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: a */
    public abstract C6442c mo16319a();
}
