package p208e.p221b.p228e.p233e.p234a;

import p208e.p221b.C6247e;
import p208e.p221b.C6417h;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p227d.C6245g;
import p208e.p221b.p228e.p239i.C6396b;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.d */
public final class C6294d<T> extends C6284a<T, T> {

    /* renamed from: c */
    private final C6242d<? super C6585c> f17402c;

    /* renamed from: d */
    private final C6245g f17403d;

    /* renamed from: e */
    private final C6239a f17404e;

    /* renamed from: e.b.e.e.a.d$a */
    static final class C6295a<T> implements C6417h<T>, C6585c {

        /* renamed from: a */
        final C6584b<? super T> f17405a;

        /* renamed from: b */
        final C6242d<? super C6585c> f17406b;

        /* renamed from: c */
        final C6245g f17407c;

        /* renamed from: d */
        final C6239a f17408d;

        /* renamed from: e */
        C6585c f17409e;

        C6295a(C6584b<? super T> bVar, C6242d<? super C6585c> dVar, C6245g gVar, C6239a aVar) {
            this.f17405a = bVar;
            this.f17406b = dVar;
            this.f17408d = aVar;
            this.f17407c = gVar;
        }

        /* renamed from: a */
        public void mo13388a(C6585c cVar) {
            try {
                this.f17406b.accept(cVar);
                if (C6397c.m23929a(this.f17409e, cVar)) {
                    this.f17409e = cVar;
                    this.f17405a.mo13388a((C6585c) this);
                }
            } catch (Throwable th) {
                C6233b.m23529b(th);
                cVar.cancel();
                this.f17409e = C6397c.CANCELLED;
                C6396b.m23924a(th, this.f17405a);
            }
        }

        /* renamed from: a */
        public void mo13389a(T t) {
            this.f17405a.mo13389a(t);
        }

        /* renamed from: a */
        public void mo13390a(Throwable th) {
            if (this.f17409e != C6397c.CANCELLED) {
                this.f17405a.mo13390a(th);
            } else {
                C6416a.m23988b(th);
            }
        }

        /* renamed from: c */
        public void mo13391c() {
            if (this.f17409e != C6397c.CANCELLED) {
                this.f17405a.mo13391c();
            }
        }

        public void cancel() {
            try {
                this.f17408d.run();
            } catch (Throwable th) {
                C6233b.m23529b(th);
                C6416a.m23988b(th);
            }
            this.f17409e.cancel();
        }

        public void request(long j) {
            try {
                this.f17407c.accept(j);
            } catch (Throwable th) {
                C6233b.m23529b(th);
                C6416a.m23988b(th);
            }
            this.f17409e.request(j);
        }
    }

    public C6294d(C6247e<T> eVar, C6242d<? super C6585c> dVar, C6245g gVar, C6239a aVar) {
        super(eVar);
        this.f17402c = dVar;
        this.f17403d = gVar;
        this.f17404e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        this.f17388b.mo16349a(new C6295a(bVar, this.f17402c, this.f17403d, this.f17404e));
    }
}
