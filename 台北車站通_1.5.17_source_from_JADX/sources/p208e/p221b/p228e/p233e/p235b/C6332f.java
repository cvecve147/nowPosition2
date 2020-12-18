package p208e.p221b.p228e.p233e.p235b;

import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.e.b.f */
public final class C6332f<T> extends C6319a<T, T> {

    /* renamed from: b */
    final C6242d<? super T> f17539b;

    /* renamed from: c */
    final C6242d<? super Throwable> f17540c;

    /* renamed from: d */
    final C6239a f17541d;

    /* renamed from: e */
    final C6239a f17542e;

    /* renamed from: e.b.e.e.b.f$a */
    static final class C6333a<T> implements C6438q<T>, C6223b {

        /* renamed from: a */
        final C6438q<? super T> f17543a;

        /* renamed from: b */
        final C6242d<? super T> f17544b;

        /* renamed from: c */
        final C6242d<? super Throwable> f17545c;

        /* renamed from: d */
        final C6239a f17546d;

        /* renamed from: e */
        final C6239a f17547e;

        /* renamed from: f */
        C6223b f17548f;

        /* renamed from: g */
        boolean f17549g;

        C6333a(C6438q<? super T> qVar, C6242d<? super T> dVar, C6242d<? super Throwable> dVar2, C6239a aVar, C6239a aVar2) {
            this.f17543a = qVar;
            this.f17544b = dVar;
            this.f17545c = dVar2;
            this.f17546d = aVar;
            this.f17547e = aVar2;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17548f.mo15709a();
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23557a(this.f17548f, bVar)) {
                this.f17548f = bVar;
                this.f17543a.mo13383a((C6223b) this);
            }
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            if (!this.f17549g) {
                try {
                    this.f17544b.accept(t);
                    this.f17543a.mo13341a(t);
                } catch (Throwable th) {
                    C6233b.m23529b(th);
                    this.f17548f.mo15709a();
                    mo13342a(th);
                }
            }
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            if (this.f17549g) {
                C6416a.m23988b(th);
                return;
            }
            this.f17549g = true;
            try {
                this.f17545c.accept(th);
            } catch (Throwable th2) {
                C6233b.m23529b(th2);
                th = new C6228a(th, th2);
            }
            this.f17543a.mo13342a(th);
            try {
                this.f17547e.run();
            } catch (Throwable th3) {
                C6233b.m23529b(th3);
                C6416a.m23988b(th3);
            }
        }

        /* renamed from: c */
        public void mo13343c() {
            if (!this.f17549g) {
                try {
                    this.f17546d.run();
                    this.f17549g = true;
                    this.f17543a.mo13343c();
                    try {
                        this.f17547e.run();
                    } catch (Throwable th) {
                        C6233b.m23529b(th);
                        C6416a.m23988b(th);
                    }
                } catch (Throwable th2) {
                    C6233b.m23529b(th2);
                    mo13342a(th2);
                }
            }
        }
    }

    public C6332f(C6436o<T> oVar, C6242d<? super T> dVar, C6242d<? super Throwable> dVar2, C6239a aVar, C6239a aVar2) {
        super(oVar);
        this.f17539b = dVar;
        this.f17540c = dVar2;
        this.f17541d = aVar;
        this.f17542e = aVar2;
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        this.f17483a.mo16542a(new C6333a(qVar, this.f17539b, this.f17540c, this.f17541d, this.f17542e));
    }
}
