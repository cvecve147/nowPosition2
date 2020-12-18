package p208e.p221b.p228e.p233e.p235b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6244f;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p229a.C6252e;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p231c.C6274e;
import p208e.p221b.p228e.p231c.C6279j;
import p208e.p221b.p228e.p236f.C6364b;
import p208e.p221b.p228e.p240j.C6400c;
import p208e.p221b.p228e.p240j.C6403f;
import p208e.p221b.p241f.C6414b;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.e.b.c */
public final class C6323c<T, U> extends C6319a<T, U> {

    /* renamed from: b */
    final C6244f<? super T, ? extends C6436o<? extends U>> f17500b;

    /* renamed from: c */
    final int f17501c;

    /* renamed from: d */
    final C6403f f17502d;

    /* renamed from: e.b.e.e.b.c$a */
    static final class C6324a<T, R> extends AtomicInteger implements C6438q<T>, C6223b {

        /* renamed from: a */
        final C6438q<? super R> f17503a;

        /* renamed from: b */
        final C6244f<? super T, ? extends C6436o<? extends R>> f17504b;

        /* renamed from: c */
        final int f17505c;

        /* renamed from: d */
        final C6400c f17506d = new C6400c();

        /* renamed from: e */
        final C6325a<R> f17507e;

        /* renamed from: f */
        final C6252e f17508f;

        /* renamed from: g */
        final boolean f17509g;

        /* renamed from: h */
        C6279j<T> f17510h;

        /* renamed from: i */
        C6223b f17511i;

        /* renamed from: j */
        volatile boolean f17512j;

        /* renamed from: k */
        volatile boolean f17513k;

        /* renamed from: l */
        volatile boolean f17514l;

        /* renamed from: m */
        int f17515m;

        /* renamed from: e.b.e.e.b.c$a$a */
        static final class C6325a<R> implements C6438q<R> {

            /* renamed from: a */
            final C6438q<? super R> f17516a;

            /* renamed from: b */
            final C6324a<?, R> f17517b;

            C6325a(C6438q<? super R> qVar, C6324a<?, R> aVar) {
                this.f17516a = qVar;
                this.f17517b = aVar;
            }

            /* renamed from: a */
            public void mo13383a(C6223b bVar) {
                this.f17517b.f17508f.mo16363a(bVar);
            }

            /* renamed from: a */
            public void mo13341a(R r) {
                this.f17516a.mo13341a(r);
            }

            /* renamed from: a */
            public void mo13342a(Throwable th) {
                C6324a<?, R> aVar = this.f17517b;
                if (aVar.f17506d.mo16502a(th)) {
                    if (!aVar.f17509g) {
                        aVar.f17511i.mo15709a();
                    }
                    aVar.f17512j = false;
                    aVar.mo16407b();
                    return;
                }
                C6416a.m23988b(th);
            }

            /* renamed from: c */
            public void mo13343c() {
                C6324a<?, R> aVar = this.f17517b;
                aVar.f17512j = false;
                aVar.mo16407b();
            }
        }

        C6324a(C6438q<? super R> qVar, C6244f<? super T, ? extends C6436o<? extends R>> fVar, int i, boolean z) {
            this.f17503a = qVar;
            this.f17504b = fVar;
            this.f17505c = i;
            this.f17509g = z;
            this.f17507e = new C6325a<>(qVar, this);
            this.f17508f = new C6252e();
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17514l = true;
            this.f17511i.mo15709a();
            this.f17508f.mo15709a();
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23557a(this.f17511i, bVar)) {
                this.f17511i = bVar;
                if (bVar instanceof C6274e) {
                    C6274e eVar = (C6274e) bVar;
                    int a = eVar.mo16357a(3);
                    if (a == 1) {
                        this.f17515m = a;
                        this.f17510h = eVar;
                        this.f17513k = true;
                        this.f17503a.mo13383a((C6223b) this);
                        mo16407b();
                        return;
                    } else if (a == 2) {
                        this.f17515m = a;
                        this.f17510h = eVar;
                        this.f17503a.mo13383a((C6223b) this);
                        return;
                    }
                }
                this.f17510h = new C6364b(this.f17505c);
                this.f17503a.mo13383a((C6223b) this);
            }
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            if (this.f17515m == 0) {
                this.f17510h.offer(t);
            }
            mo16407b();
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            if (this.f17506d.mo16502a(th)) {
                this.f17513k = true;
                mo16407b();
                return;
            }
            C6416a.m23988b(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16407b() {
            if (getAndIncrement() == 0) {
                C6438q<? super R> qVar = this.f17503a;
                C6279j<T> jVar = this.f17510h;
                C6400c cVar = this.f17506d;
                while (true) {
                    if (!this.f17512j) {
                        if (!this.f17514l) {
                            if (!this.f17509g && ((Throwable) cVar.get()) != null) {
                                jVar.clear();
                                break;
                            }
                            boolean z = this.f17513k;
                            try {
                                T poll = jVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    Throwable a = cVar.mo16501a();
                                    if (a != null) {
                                        qVar.mo13342a(a);
                                        return;
                                    } else {
                                        qVar.mo13343c();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        Object apply = this.f17504b.apply(poll);
                                        C6268b.m23590a(apply, "The mapper returned a null ObservableSource");
                                        C6436o oVar = (C6436o) apply;
                                        if (oVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) oVar).call();
                                                if (call != null && !this.f17514l) {
                                                    qVar.mo13341a(call);
                                                }
                                            } catch (Throwable th) {
                                                C6233b.m23529b(th);
                                                cVar.mo16502a(th);
                                            }
                                        } else {
                                            this.f17512j = true;
                                            oVar.mo16542a(this.f17507e);
                                        }
                                    } catch (Throwable th2) {
                                        C6233b.m23529b(th2);
                                        this.f17511i.mo15709a();
                                        jVar.clear();
                                        cVar.mo16502a(th2);
                                    }
                                }
                            } catch (Throwable th3) {
                                C6233b.m23529b(th3);
                                this.f17511i.mo15709a();
                                cVar.mo16502a(th3);
                            }
                        } else {
                            jVar.clear();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                qVar.mo13342a(cVar.mo16501a());
            }
        }

        /* renamed from: c */
        public void mo13343c() {
            this.f17513k = true;
            mo16407b();
        }
    }

    /* renamed from: e.b.e.e.b.c$b */
    static final class C6326b<T, U> extends AtomicInteger implements C6438q<T>, C6223b {

        /* renamed from: a */
        final C6438q<? super U> f17518a;

        /* renamed from: b */
        final C6252e f17519b = new C6252e();

        /* renamed from: c */
        final C6244f<? super T, ? extends C6436o<? extends U>> f17520c;

        /* renamed from: d */
        final C6438q<U> f17521d;

        /* renamed from: e */
        final int f17522e;

        /* renamed from: f */
        C6279j<T> f17523f;

        /* renamed from: g */
        C6223b f17524g;

        /* renamed from: h */
        volatile boolean f17525h;

        /* renamed from: i */
        volatile boolean f17526i;

        /* renamed from: j */
        volatile boolean f17527j;

        /* renamed from: k */
        int f17528k;

        /* renamed from: e.b.e.e.b.c$b$a */
        static final class C6327a<U> implements C6438q<U> {

            /* renamed from: a */
            final C6438q<? super U> f17529a;

            /* renamed from: b */
            final C6326b<?, ?> f17530b;

            C6327a(C6438q<? super U> qVar, C6326b<?, ?> bVar) {
                this.f17529a = qVar;
                this.f17530b = bVar;
            }

            /* renamed from: a */
            public void mo13383a(C6223b bVar) {
                this.f17530b.mo16409b(bVar);
            }

            /* renamed from: a */
            public void mo13341a(U u) {
                this.f17529a.mo13341a(u);
            }

            /* renamed from: a */
            public void mo13342a(Throwable th) {
                this.f17530b.mo15709a();
                this.f17529a.mo13342a(th);
            }

            /* renamed from: c */
            public void mo13343c() {
                this.f17530b.mo16410d();
            }
        }

        C6326b(C6438q<? super U> qVar, C6244f<? super T, ? extends C6436o<? extends U>> fVar, int i) {
            this.f17518a = qVar;
            this.f17520c = fVar;
            this.f17522e = i;
            this.f17521d = new C6327a(qVar, this);
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17526i = true;
            this.f17519b.mo15709a();
            this.f17524g.mo15709a();
            if (getAndIncrement() == 0) {
                this.f17523f.clear();
            }
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23557a(this.f17524g, bVar)) {
                this.f17524g = bVar;
                if (bVar instanceof C6274e) {
                    C6274e eVar = (C6274e) bVar;
                    int a = eVar.mo16357a(3);
                    if (a == 1) {
                        this.f17528k = a;
                        this.f17523f = eVar;
                        this.f17527j = true;
                        this.f17518a.mo13383a((C6223b) this);
                        mo16408b();
                        return;
                    } else if (a == 2) {
                        this.f17528k = a;
                        this.f17523f = eVar;
                        this.f17518a.mo13383a((C6223b) this);
                        return;
                    }
                }
                this.f17523f = new C6364b(this.f17522e);
                this.f17518a.mo13383a((C6223b) this);
            }
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            if (!this.f17527j) {
                if (this.f17528k == 0) {
                    this.f17523f.offer(t);
                }
                mo16408b();
            }
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            if (this.f17527j) {
                C6416a.m23988b(th);
                return;
            }
            this.f17527j = true;
            mo15709a();
            this.f17518a.mo13342a(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16408b() {
            if (getAndIncrement() == 0) {
                while (!this.f17526i) {
                    if (!this.f17525h) {
                        boolean z = this.f17527j;
                        try {
                            T poll = this.f17523f.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f17518a.mo13343c();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.f17520c.apply(poll);
                                    C6268b.m23590a(apply, "The mapper returned a null ObservableSource");
                                    C6436o oVar = (C6436o) apply;
                                    this.f17525h = true;
                                    oVar.mo16542a(this.f17521d);
                                } catch (Throwable th) {
                                    C6233b.m23529b(th);
                                    mo15709a();
                                    this.f17523f.clear();
                                    this.f17518a.mo13342a(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C6233b.m23529b(th2);
                            mo15709a();
                            this.f17523f.clear();
                            this.f17518a.mo13342a(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f17523f.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16409b(C6223b bVar) {
            this.f17519b.mo16365b(bVar);
        }

        /* renamed from: c */
        public void mo13343c() {
            if (!this.f17527j) {
                this.f17527j = true;
                mo16408b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16410d() {
            this.f17525h = false;
            mo16408b();
        }
    }

    public C6323c(C6436o<T> oVar, C6244f<? super T, ? extends C6436o<? extends U>> fVar, int i, C6403f fVar2) {
        super(oVar);
        this.f17500b = fVar;
        this.f17502d = fVar2;
        this.f17501c = Math.max(8, i);
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super U> qVar) {
        if (!C6350q.m23800a(this.f17483a, qVar, this.f17500b)) {
            C6403f fVar = this.f17502d;
            if (fVar == C6403f.IMMEDIATE) {
                this.f17483a.mo16542a(new C6326b(new C6414b(qVar), this.f17500b, this.f17501c));
            } else {
                this.f17483a.mo16542a(new C6324a(qVar, this.f17500b, this.f17501c, fVar == C6403f.END));
            }
        }
    }
}
