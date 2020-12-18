package p208e.p221b.p228e.p233e.p234a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6247e;
import p208e.p221b.C6417h;
import p208e.p221b.C6439r;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6401d;
import p250g.p262c.C6583a;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.n */
public final class C6316n<T> extends C6284a<T, T> {

    /* renamed from: c */
    final C6439r f17473c;

    /* renamed from: d */
    final boolean f17474d;

    /* renamed from: e.b.e.e.a.n$a */
    static final class C6317a<T> extends AtomicReference<Thread> implements C6417h<T>, C6585c, Runnable {

        /* renamed from: a */
        final C6584b<? super T> f17475a;

        /* renamed from: b */
        final C6439r.C6442c f17476b;

        /* renamed from: c */
        final AtomicReference<C6585c> f17477c = new AtomicReference<>();

        /* renamed from: d */
        final AtomicLong f17478d = new AtomicLong();

        /* renamed from: e */
        final boolean f17479e;

        /* renamed from: f */
        C6583a<T> f17480f;

        /* renamed from: e.b.e.e.a.n$a$a */
        static final class C6318a implements Runnable {

            /* renamed from: a */
            private final C6585c f17481a;

            /* renamed from: b */
            private final long f17482b;

            C6318a(C6585c cVar, long j) {
                this.f17481a = cVar;
                this.f17482b = j;
            }

            public void run() {
                this.f17481a.request(this.f17482b);
            }
        }

        C6317a(C6584b<? super T> bVar, C6439r.C6442c cVar, C6583a<T> aVar, boolean z) {
            this.f17475a = bVar;
            this.f17476b = cVar;
            this.f17480f = aVar;
            this.f17479e = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16403a(long j, C6585c cVar) {
            if (this.f17479e || Thread.currentThread() == get()) {
                cVar.request(j);
            } else {
                this.f17476b.mo16457a((Runnable) new C6318a(cVar, j));
            }
        }

        /* renamed from: a */
        public void mo13388a(C6585c cVar) {
            if (C6397c.m23931a(this.f17477c, cVar)) {
                long andSet = this.f17478d.getAndSet(0);
                if (andSet != 0) {
                    mo16403a(andSet, cVar);
                }
            }
        }

        /* renamed from: a */
        public void mo13389a(T t) {
            this.f17475a.mo13389a(t);
        }

        /* renamed from: a */
        public void mo13390a(Throwable th) {
            this.f17475a.mo13390a(th);
            this.f17476b.mo15709a();
        }

        /* renamed from: c */
        public void mo13391c() {
            this.f17475a.mo13391c();
            this.f17476b.mo15709a();
        }

        public void cancel() {
            C6397c.m23930a(this.f17477c);
            this.f17476b.mo15709a();
        }

        public void request(long j) {
            if (C6397c.m23928a(j)) {
                C6585c cVar = this.f17477c.get();
                if (cVar != null) {
                    mo16403a(j, cVar);
                    return;
                }
                C6401d.m23940a(this.f17478d, j);
                C6585c cVar2 = this.f17477c.get();
                if (cVar2 != null) {
                    long andSet = this.f17478d.getAndSet(0);
                    if (andSet != 0) {
                        mo16403a(andSet, cVar2);
                    }
                }
            }
        }

        public void run() {
            lazySet(Thread.currentThread());
            C6583a<T> aVar = this.f17480f;
            this.f17480f = null;
            aVar.mo16350a(this);
        }
    }

    public C6316n(C6247e<T> eVar, C6439r rVar, boolean z) {
        super(eVar);
        this.f17473c = rVar;
        this.f17474d = z;
    }

    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        C6439r.C6442c a = this.f17473c.mo16319a();
        C6317a aVar = new C6317a(bVar, a, this.f17388b, this.f17474d);
        bVar.mo13388a((C6585c) aVar);
        a.mo16457a((Runnable) aVar);
    }
}
