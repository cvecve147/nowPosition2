package p208e.p221b.p228e.p237g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6222a;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p228e.p229a.C6251d;

/* renamed from: e.b.e.g.b */
public final class C6366b extends C6439r {

    /* renamed from: b */
    static final C6368b f17668b = new C6368b(0, f17669c);

    /* renamed from: c */
    static final C6377g f17669c = new C6377g("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);

    /* renamed from: d */
    static final int f17670d = m23852a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: e */
    static final C6369c f17671e = new C6369c(new C6377g("RxComputationShutdown"));

    /* renamed from: f */
    final ThreadFactory f17672f;

    /* renamed from: g */
    final AtomicReference<C6368b> f17673g;

    /* renamed from: e.b.e.g.b$a */
    static final class C6367a extends C6439r.C6442c {

        /* renamed from: a */
        private final C6251d f17674a = new C6251d();

        /* renamed from: b */
        private final C6222a f17675b = new C6222a();

        /* renamed from: c */
        private final C6251d f17676c = new C6251d();

        /* renamed from: d */
        private final C6369c f17677d;

        /* renamed from: e */
        volatile boolean f17678e;

        C6367a(C6369c cVar) {
            this.f17677d = cVar;
            this.f17676c.mo16325b(this.f17674a);
            this.f17676c.mo16325b(this.f17675b);
        }

        /* renamed from: a */
        public C6223b mo16457a(Runnable runnable) {
            if (this.f17678e) {
                return C6250c.INSTANCE;
            }
            return this.f17677d.mo16469a(runnable, 0, TimeUnit.MILLISECONDS, this.f17674a);
        }

        /* renamed from: a */
        public C6223b mo16320a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f17678e) {
                return C6250c.INSTANCE;
            }
            return this.f17677d.mo16469a(runnable, j, timeUnit, this.f17675b);
        }

        /* renamed from: a */
        public void mo15709a() {
            if (!this.f17678e) {
                this.f17678e = true;
                this.f17676c.mo15709a();
            }
        }
    }

    /* renamed from: e.b.e.g.b$b */
    static final class C6368b {

        /* renamed from: a */
        final int f17679a;

        /* renamed from: b */
        final C6369c[] f17680b;

        /* renamed from: c */
        long f17681c;

        C6368b(int i, ThreadFactory threadFactory) {
            this.f17679a = i;
            this.f17680b = new C6369c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f17680b[i2] = new C6369c(threadFactory);
            }
        }

        /* renamed from: a */
        public C6369c mo16458a() {
            int i = this.f17679a;
            if (i == 0) {
                return C6366b.f17671e;
            }
            C6369c[] cVarArr = this.f17680b;
            long j = this.f17681c;
            this.f17681c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo16459b() {
            for (C6369c a : this.f17680b) {
                a.mo15709a();
            }
        }
    }

    /* renamed from: e.b.e.g.b$c */
    static final class C6369c extends C6375e {
        C6369c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        f17671e.mo15709a();
        f17668b.mo16459b();
    }

    public C6366b() {
        this(f17669c);
    }

    public C6366b(ThreadFactory threadFactory) {
        this.f17672f = threadFactory;
        this.f17673g = new AtomicReference<>(f17668b);
        mo16456b();
    }

    /* renamed from: a */
    static int m23852a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public C6223b mo16455a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f17673g.get().mo16458a().mo16470b(runnable, j, j2, timeUnit);
    }

    /* renamed from: a */
    public C6223b mo16318a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f17673g.get().mo16458a().mo16471b(runnable, j, timeUnit);
    }

    /* renamed from: a */
    public C6439r.C6442c mo16319a() {
        return new C6367a(this.f17673g.get().mo16458a());
    }

    /* renamed from: b */
    public void mo16456b() {
        C6368b bVar = new C6368b(f17670d, this.f17672f);
        if (!this.f17673g.compareAndSet(f17668b, bVar)) {
            bVar.mo16459b();
        }
    }
}
