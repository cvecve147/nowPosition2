package p208e.p221b.p228e.p233e.p234a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6247e;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6234c;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6401d;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.h */
public final class C6302h extends C6247e<Long> {

    /* renamed from: b */
    final C6439r f17418b;

    /* renamed from: c */
    final long f17419c;

    /* renamed from: d */
    final long f17420d;

    /* renamed from: e */
    final TimeUnit f17421e;

    /* renamed from: e.b.e.e.a.h$a */
    static final class C6303a extends AtomicLong implements C6585c, Runnable {

        /* renamed from: a */
        final C6584b<? super Long> f17422a;

        /* renamed from: b */
        long f17423b;

        /* renamed from: c */
        final AtomicReference<C6223b> f17424c = new AtomicReference<>();

        C6303a(C6584b<? super Long> bVar) {
            this.f17422a = bVar;
        }

        /* renamed from: a */
        public void mo16391a(C6223b bVar) {
            C6249b.m23562c(this.f17424c, bVar);
        }

        public void cancel() {
            C6249b.m23558a(this.f17424c);
        }

        public void request(long j) {
            if (C6397c.m23928a(j)) {
                C6401d.m23940a((AtomicLong) this, j);
            }
        }

        public void run() {
            if (this.f17424c.get() == C6249b.DISPOSED) {
                return;
            }
            if (get() != 0) {
                C6584b<? super Long> bVar = this.f17422a;
                long j = this.f17423b;
                this.f17423b = j + 1;
                bVar.mo13389a(Long.valueOf(j));
                C6401d.m23941b(this, 1);
                return;
            }
            C6584b<? super Long> bVar2 = this.f17422a;
            bVar2.mo13390a((Throwable) new C6234c("Can't deliver value " + this.f17423b + " due to lack of requests"));
            C6249b.m23558a(this.f17424c);
        }
    }

    public C6302h(long j, long j2, TimeUnit timeUnit, C6439r rVar) {
        this.f17419c = j;
        this.f17420d = j2;
        this.f17421e = timeUnit;
        this.f17418b = rVar;
    }

    /* renamed from: b */
    public void mo16354b(C6584b<? super Long> bVar) {
        C6303a aVar = new C6303a(bVar);
        bVar.mo13388a((C6585c) aVar);
        aVar.mo16391a(this.f17418b.mo16455a(aVar, this.f17419c, this.f17420d, this.f17421e));
    }
}
