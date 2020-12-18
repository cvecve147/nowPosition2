package p208e.p221b.p228e.p233e.p235b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6249b;

/* renamed from: e.b.e.e.b.n */
public final class C6345n extends C6433l<Long> {

    /* renamed from: a */
    final C6439r f17595a;

    /* renamed from: b */
    final long f17596b;

    /* renamed from: c */
    final long f17597c;

    /* renamed from: d */
    final TimeUnit f17598d;

    /* renamed from: e.b.e.e.b.n$a */
    static final class C6346a extends AtomicReference<C6223b> implements C6223b, Runnable {

        /* renamed from: a */
        final C6438q<? super Long> f17599a;

        /* renamed from: b */
        long f17600b;

        C6346a(C6438q<? super Long> qVar) {
            this.f17599a = qVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            C6249b.m23558a((AtomicReference<C6223b>) this);
        }

        /* renamed from: a */
        public void mo16428a(C6223b bVar) {
            C6249b.m23562c(this, bVar);
        }

        public void run() {
            if (get() != C6249b.DISPOSED) {
                C6438q<? super Long> qVar = this.f17599a;
                long j = this.f17600b;
                this.f17600b = 1 + j;
                qVar.mo13341a(Long.valueOf(j));
            }
        }
    }

    public C6345n(long j, long j2, TimeUnit timeUnit, C6439r rVar) {
        this.f17596b = j;
        this.f17597c = j2;
        this.f17598d = timeUnit;
        this.f17595a = rVar;
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super Long> qVar) {
        C6346a aVar = new C6346a(qVar);
        qVar.mo13383a((C6223b) aVar);
        aVar.mo16428a(this.f17595a.mo16455a(aVar, this.f17596b, this.f17597c, this.f17598d));
    }
}
