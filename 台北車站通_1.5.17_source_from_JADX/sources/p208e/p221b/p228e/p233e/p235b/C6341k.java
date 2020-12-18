package p208e.p221b.p228e.p233e.p235b;

import java.util.Iterator;
import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p232d.C6281b;

/* renamed from: e.b.e.e.b.k */
public final class C6341k<T> extends C6433l<T> {

    /* renamed from: a */
    final Iterable<? extends T> f17586a;

    /* renamed from: e.b.e.e.b.k$a */
    static final class C6342a<T> extends C6281b<T> {

        /* renamed from: a */
        final C6438q<? super T> f17587a;

        /* renamed from: b */
        final Iterator<? extends T> f17588b;

        /* renamed from: c */
        volatile boolean f17589c;

        /* renamed from: d */
        boolean f17590d;

        /* renamed from: e */
        boolean f17591e;

        /* renamed from: f */
        boolean f17592f;

        C6342a(C6438q<? super T> qVar, Iterator<? extends T> it) {
            this.f17587a = qVar;
            this.f17588b = it;
        }

        /* renamed from: a */
        public int mo16357a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f17590d = true;
            return 1;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17589c = true;
        }

        /* renamed from: b */
        public boolean mo16426b() {
            return this.f17589c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo16427c() {
            while (!mo16426b()) {
                try {
                    Object next = this.f17588b.next();
                    C6268b.m23590a(next, "The iterator returned a null value");
                    this.f17587a.mo13341a(next);
                    if (!mo16426b()) {
                        if (!this.f17588b.hasNext()) {
                            if (!mo16426b()) {
                                this.f17587a.mo13343c();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    C6233b.m23529b(th);
                    this.f17587a.mo13342a(th);
                    return;
                }
            }
        }

        public void clear() {
            this.f17591e = true;
        }

        public boolean isEmpty() {
            return this.f17591e;
        }

        public T poll() {
            if (this.f17591e) {
                return null;
            }
            if (!this.f17592f) {
                this.f17592f = true;
            } else if (!this.f17588b.hasNext()) {
                this.f17591e = true;
                return null;
            }
            T next = this.f17588b.next();
            C6268b.m23590a(next, "The iterator returned a null value");
            return next;
        }
    }

    public C6341k(Iterable<? extends T> iterable) {
        this.f17586a = iterable;
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        try {
            Iterator<? extends T> it = this.f17586a.iterator();
            if (!it.hasNext()) {
                C6250c.m23565a((C6438q<?>) qVar);
                return;
            }
            C6342a aVar = new C6342a(qVar, it);
            qVar.mo13383a((C6223b) aVar);
            if (!aVar.f17590d) {
                aVar.mo16427c();
            }
        } catch (Throwable th) {
            C6233b.m23529b(th);
            C6250c.m23566a(th, qVar);
        }
    }
}
