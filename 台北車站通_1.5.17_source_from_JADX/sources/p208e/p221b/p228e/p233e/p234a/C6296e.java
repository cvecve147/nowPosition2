package p208e.p221b.p228e.p233e.p234a;

import p208e.p221b.C6247e;
import p208e.p221b.C6417h;
import p208e.p221b.p227d.C6246h;
import p208e.p221b.p228e.p231c.C6270a;
import p208e.p221b.p228e.p231c.C6276g;
import p208e.p221b.p228e.p238h.C6391a;
import p208e.p221b.p228e.p238h.C6392b;
import p250g.p262c.C6584b;

/* renamed from: e.b.e.e.a.e */
public final class C6296e<T> extends C6284a<T, T> {

    /* renamed from: c */
    final C6246h<? super T> f17410c;

    /* renamed from: e.b.e.e.a.e$a */
    static final class C6297a<T> extends C6391a<T, T> {

        /* renamed from: f */
        final C6246h<? super T> f17411f;

        C6297a(C6270a<? super T> aVar, C6246h<? super T> hVar) {
            super(aVar);
            this.f17411f = hVar;
        }

        /* renamed from: a */
        public int mo16357a(int i) {
            return mo16488b(i);
        }

        /* renamed from: a */
        public void mo13389a(T t) {
            if (!mo16378b(t)) {
                this.f17736b.request(1);
            }
        }

        /* renamed from: b */
        public boolean mo16378b(T t) {
            if (this.f17738d) {
                return false;
            }
            if (this.f17739e != 0) {
                return this.f17735a.mo16378b(null);
            }
            try {
                return this.f17411f.test(t) && this.f17735a.mo16378b(t);
            } catch (Throwable th) {
                mo16489b(th);
                return true;
            }
        }

        public T poll() {
            C6276g<T> gVar = this.f17737c;
            C6246h<? super T> hVar = this.f17411f;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (hVar.test(poll)) {
                    return poll;
                }
                if (this.f17739e == 2) {
                    gVar.request(1);
                }
            }
        }
    }

    /* renamed from: e.b.e.e.a.e$b */
    static final class C6298b<T> extends C6392b<T, T> implements C6270a<T> {

        /* renamed from: f */
        final C6246h<? super T> f17412f;

        C6298b(C6584b<? super T> bVar, C6246h<? super T> hVar) {
            super(bVar);
            this.f17412f = hVar;
        }

        /* renamed from: a */
        public int mo16357a(int i) {
            return mo16492b(i);
        }

        /* renamed from: a */
        public void mo13389a(T t) {
            if (!mo16378b(t)) {
                this.f17741b.request(1);
            }
        }

        /* renamed from: b */
        public boolean mo16378b(T t) {
            if (this.f17743d) {
                return false;
            }
            if (this.f17744e != 0) {
                this.f17740a.mo13389a(null);
                return true;
            }
            try {
                boolean test = this.f17412f.test(t);
                if (test) {
                    this.f17740a.mo13389a(t);
                }
                return test;
            } catch (Throwable th) {
                mo16493b(th);
                return true;
            }
        }

        public T poll() {
            C6276g<T> gVar = this.f17742c;
            C6246h<? super T> hVar = this.f17412f;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (hVar.test(poll)) {
                    return poll;
                }
                if (this.f17744e == 2) {
                    gVar.request(1);
                }
            }
        }
    }

    public C6296e(C6247e<T> eVar, C6246h<? super T> hVar) {
        super(eVar);
        this.f17410c = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        C6417h hVar;
        C6247e<T> eVar;
        if (bVar instanceof C6270a) {
            eVar = this.f17388b;
            hVar = new C6297a((C6270a) bVar, this.f17410c);
        } else {
            eVar = this.f17388b;
            hVar = new C6298b(bVar, this.f17410c);
        }
        eVar.mo16349a((C6417h<? super T>) hVar);
    }
}
