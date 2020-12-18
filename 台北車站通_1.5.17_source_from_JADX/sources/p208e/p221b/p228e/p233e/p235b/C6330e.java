package p208e.p221b.p228e.p233e.p235b;

import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p231c.C6274e;
import p208e.p221b.p228e.p232d.C6280a;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.e.b.e */
public final class C6330e<T> extends C6319a<T, T> {

    /* renamed from: b */
    final C6239a f17533b;

    /* renamed from: e.b.e.e.b.e$a */
    static final class C6331a<T> extends C6280a<T> implements C6438q<T> {

        /* renamed from: a */
        final C6438q<? super T> f17534a;

        /* renamed from: b */
        final C6239a f17535b;

        /* renamed from: c */
        C6223b f17536c;

        /* renamed from: d */
        C6274e<T> f17537d;

        /* renamed from: e */
        boolean f17538e;

        C6331a(C6438q<? super T> qVar, C6239a aVar) {
            this.f17534a = qVar;
            this.f17535b = aVar;
        }

        /* renamed from: a */
        public int mo16357a(int i) {
            C6274e<T> eVar = this.f17537d;
            if (eVar == null || (i & 4) != 0) {
                return 0;
            }
            int a = eVar.mo16357a(i);
            if (a != 0) {
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.f17538e = z;
            }
            return a;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17536c.mo15709a();
            mo16413b();
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23557a(this.f17536c, bVar)) {
                this.f17536c = bVar;
                if (bVar instanceof C6274e) {
                    this.f17537d = (C6274e) bVar;
                }
                this.f17534a.mo13383a((C6223b) this);
            }
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            this.f17534a.mo13341a(t);
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            this.f17534a.mo13342a(th);
            mo16413b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16413b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f17535b.run();
                } catch (Throwable th) {
                    C6233b.m23529b(th);
                    C6416a.m23988b(th);
                }
            }
        }

        /* renamed from: c */
        public void mo13343c() {
            this.f17534a.mo13343c();
            mo16413b();
        }

        public void clear() {
            this.f17537d.clear();
        }

        public boolean isEmpty() {
            return this.f17537d.isEmpty();
        }

        public T poll() {
            T poll = this.f17537d.poll();
            if (poll == null && this.f17538e) {
                mo16413b();
            }
            return poll;
        }
    }

    public C6330e(C6436o<T> oVar, C6239a aVar) {
        super(oVar);
        this.f17533b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        this.f17483a.mo16542a(new C6331a(qVar, this.f17533b));
    }
}
