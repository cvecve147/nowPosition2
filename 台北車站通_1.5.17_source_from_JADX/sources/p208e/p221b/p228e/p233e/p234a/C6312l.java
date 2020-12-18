package p208e.p221b.p228e.p233e.p234a;

import java.util.concurrent.atomic.AtomicLong;
import p208e.p221b.C6247e;
import p208e.p221b.C6417h;
import p208e.p221b.p226c.C6234c;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6401d;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.l */
public final class C6312l<T> extends C6284a<T, T> {

    /* renamed from: e.b.e.e.a.l$a */
    static final class C6313a<T> extends AtomicLong implements C6417h<T>, C6585c {

        /* renamed from: a */
        final C6584b<? super T> f17463a;

        /* renamed from: b */
        C6585c f17464b;

        /* renamed from: c */
        boolean f17465c;

        C6313a(C6584b<? super T> bVar) {
            this.f17463a = bVar;
        }

        /* renamed from: a */
        public void mo13388a(C6585c cVar) {
            if (C6397c.m23929a(this.f17464b, cVar)) {
                this.f17464b = cVar;
                this.f17463a.mo13388a((C6585c) this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        public void mo13389a(T t) {
            if (!this.f17465c) {
                if (get() != 0) {
                    this.f17463a.mo13389a(t);
                    C6401d.m23941b(this, 1);
                    return;
                }
                mo13390a((Throwable) new C6234c("could not emit value due to lack of requests"));
            }
        }

        /* renamed from: a */
        public void mo13390a(Throwable th) {
            if (this.f17465c) {
                C6416a.m23988b(th);
                return;
            }
            this.f17465c = true;
            this.f17463a.mo13390a(th);
        }

        /* renamed from: c */
        public void mo13391c() {
            if (!this.f17465c) {
                this.f17465c = true;
                this.f17463a.mo13391c();
            }
        }

        public void cancel() {
            this.f17464b.cancel();
        }

        public void request(long j) {
            if (C6397c.m23928a(j)) {
                C6401d.m23940a((AtomicLong) this, j);
            }
        }
    }

    public C6312l(C6247e<T> eVar) {
        super(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        this.f17388b.mo16349a(new C6313a(bVar));
    }
}
