package p208e.p221b.p228e.p233e.p235b;

import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6433l;
import p208e.p221b.C6434m;
import p208e.p221b.C6435n;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.e.b.d */
public final class C6328d<T> extends C6433l<T> {

    /* renamed from: a */
    final C6435n<T> f17531a;

    /* renamed from: e.b.e.e.b.d$a */
    static final class C6329a<T> extends AtomicReference<C6223b> implements C6434m<T>, C6223b {

        /* renamed from: a */
        final C6438q<? super T> f17532a;

        C6329a(C6438q<? super T> qVar) {
            this.f17532a = qVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            C6249b.m23558a((AtomicReference<C6223b>) this);
        }

        /* renamed from: a */
        public void mo16339a(T t) {
            if (t == null) {
                mo16411a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!mo16412b()) {
                this.f17532a.mo13341a(t);
            }
        }

        /* renamed from: a */
        public void mo16411a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!mo16412b()) {
                try {
                    this.f17532a.mo13342a(th);
                } finally {
                    mo15709a();
                }
            } else {
                C6416a.m23988b(th);
            }
        }

        /* renamed from: b */
        public boolean mo16412b() {
            return C6249b.m23556a((C6223b) get());
        }

        /* renamed from: c */
        public void mo16340c() {
            if (!mo16412b()) {
                try {
                    this.f17532a.mo13343c();
                } finally {
                    mo15709a();
                }
            }
        }
    }

    public C6328d(C6435n<T> nVar) {
        this.f17531a = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        C6329a aVar = new C6329a(qVar);
        qVar.mo13383a((C6223b) aVar);
        try {
            this.f17531a.mo12848a(aVar);
        } catch (Throwable th) {
            C6233b.m23529b(th);
            aVar.mo16411a(th);
        }
    }
}
