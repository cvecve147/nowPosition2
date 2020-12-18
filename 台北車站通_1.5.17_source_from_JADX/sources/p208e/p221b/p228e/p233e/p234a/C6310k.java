package p208e.p221b.p228e.p233e.p234a;

import java.util.concurrent.atomic.AtomicLong;
import p208e.p221b.C6247e;
import p208e.p221b.C6417h;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6401d;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.k */
public final class C6310k<T> extends C6284a<T, T> implements C6242d<T> {

    /* renamed from: c */
    final C6242d<? super T> f17458c = this;

    /* renamed from: e.b.e.e.a.k$a */
    static final class C6311a<T> extends AtomicLong implements C6417h<T>, C6585c {

        /* renamed from: a */
        final C6584b<? super T> f17459a;

        /* renamed from: b */
        final C6242d<? super T> f17460b;

        /* renamed from: c */
        C6585c f17461c;

        /* renamed from: d */
        boolean f17462d;

        C6311a(C6584b<? super T> bVar, C6242d<? super T> dVar) {
            this.f17459a = bVar;
            this.f17460b = dVar;
        }

        /* renamed from: a */
        public void mo13388a(C6585c cVar) {
            if (C6397c.m23929a(this.f17461c, cVar)) {
                this.f17461c = cVar;
                this.f17459a.mo13388a((C6585c) this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        public void mo13389a(T t) {
            if (!this.f17462d) {
                if (get() != 0) {
                    this.f17459a.mo13389a(t);
                    C6401d.m23941b(this, 1);
                    return;
                }
                try {
                    this.f17460b.accept(t);
                } catch (Throwable th) {
                    C6233b.m23529b(th);
                    cancel();
                    mo13390a(th);
                }
            }
        }

        /* renamed from: a */
        public void mo13390a(Throwable th) {
            if (this.f17462d) {
                C6416a.m23988b(th);
                return;
            }
            this.f17462d = true;
            this.f17459a.mo13390a(th);
        }

        /* renamed from: c */
        public void mo13391c() {
            if (!this.f17462d) {
                this.f17462d = true;
                this.f17459a.mo13391c();
            }
        }

        public void cancel() {
            this.f17461c.cancel();
        }

        public void request(long j) {
            if (C6397c.m23928a(j)) {
                C6401d.m23940a((AtomicLong) this, j);
            }
        }
    }

    public C6310k(C6247e<T> eVar) {
        super(eVar);
    }

    public void accept(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        this.f17388b.mo16349a(new C6311a(bVar, this.f17458c));
    }
}
