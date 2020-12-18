package p208e.p221b.p228e.p233e.p235b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p229a.C6250c;

/* renamed from: e.b.e.e.b.u */
public final class C6358u extends C6433l<Long> {

    /* renamed from: a */
    final C6439r f17628a;

    /* renamed from: b */
    final long f17629b;

    /* renamed from: c */
    final TimeUnit f17630c;

    /* renamed from: e.b.e.e.b.u$a */
    static final class C6359a extends AtomicReference<C6223b> implements C6223b, Runnable {

        /* renamed from: a */
        final C6438q<? super Long> f17631a;

        C6359a(C6438q<? super Long> qVar) {
            this.f17631a = qVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            C6249b.m23558a((AtomicReference<C6223b>) this);
        }

        /* renamed from: a */
        public void mo16438a(C6223b bVar) {
            C6249b.m23563d(this, bVar);
        }

        /* renamed from: b */
        public boolean mo16439b() {
            return get() == C6249b.DISPOSED;
        }

        public void run() {
            if (!mo16439b()) {
                this.f17631a.mo13341a(0L);
                lazySet(C6250c.INSTANCE);
                this.f17631a.mo13343c();
            }
        }
    }

    public C6358u(long j, TimeUnit timeUnit, C6439r rVar) {
        this.f17629b = j;
        this.f17630c = timeUnit;
        this.f17628a = rVar;
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super Long> qVar) {
        C6359a aVar = new C6359a(qVar);
        qVar.mo13383a((C6223b) aVar);
        aVar.mo16438a(this.f17628a.mo16318a(aVar, this.f17629b, this.f17630c));
    }
}
