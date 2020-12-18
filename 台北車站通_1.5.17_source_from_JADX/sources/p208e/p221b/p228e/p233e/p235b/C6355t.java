package p208e.p221b.p228e.p233e.p235b;

import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6249b;

/* renamed from: e.b.e.e.b.t */
public final class C6355t<T> extends C6319a<T, T> {

    /* renamed from: b */
    final C6439r f17623b;

    /* renamed from: e.b.e.e.b.t$a */
    static final class C6356a<T> extends AtomicReference<C6223b> implements C6438q<T>, C6223b {

        /* renamed from: a */
        final C6438q<? super T> f17624a;

        /* renamed from: b */
        final AtomicReference<C6223b> f17625b = new AtomicReference<>();

        C6356a(C6438q<? super T> qVar) {
            this.f17624a = qVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            C6249b.m23558a(this.f17625b);
            C6249b.m23558a((AtomicReference<C6223b>) this);
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            C6249b.m23562c(this.f17625b, bVar);
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            this.f17624a.mo13341a(t);
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            this.f17624a.mo13342a(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16436b(C6223b bVar) {
            C6249b.m23562c(this, bVar);
        }

        /* renamed from: c */
        public void mo13343c() {
            this.f17624a.mo13343c();
        }
    }

    /* renamed from: e.b.e.e.b.t$b */
    final class C6357b implements Runnable {

        /* renamed from: a */
        private final C6356a<T> f17626a;

        C6357b(C6356a<T> aVar) {
            this.f17626a = aVar;
        }

        public void run() {
            C6355t.this.f17483a.mo16542a(this.f17626a);
        }
    }

    public C6355t(C6436o<T> oVar, C6439r rVar) {
        super(oVar);
        this.f17623b = rVar;
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        C6356a aVar = new C6356a(qVar);
        qVar.mo13383a((C6223b) aVar);
        aVar.mo16436b(this.f17623b.mo16481a(new C6357b(aVar)));
    }
}
